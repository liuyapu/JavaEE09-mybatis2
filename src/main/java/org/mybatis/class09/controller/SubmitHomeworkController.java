package org.mybatis.class09.controller;


import org.apache.ibatis.session.SqlSession;
import org.mybatis.class09.dao.StudentDao;
import org.mybatis.class09.model.StudentHomework;
import org.mybatis.class09.utils.MybatisUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * 学生更新和提交作业请求
 */

@Controller
@RequestMapping(path = "/submit")
public class SubmitHomeworkController {

    @RequestMapping(path = "/homework")
    public ModelAndView submithomework(String studentid,String homeworkid,
                                       String homeworktitle,String homeworkcontent,String homeworktime)throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //使用mybatis获取sqlSessionFactory对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        //新建一个StudentHomework对象,用于存储待提交的作业
        StudentHomework sh = new StudentHomework();
        sh.setStudent_id(Long.parseLong(studentid));
        sh.setHomework_id(Long.parseLong(homeworkid));
        sh.setHomework_title(homeworktitle);
        sh.setHomework_content(homeworkcontent);

        sh.setCreate_time(new Date());
        sh.setUpdate_time(new Date());

        System.out.println("homeid"+sh.getHomework_id());
        System.out.printf("studentid"+sh.getStudent_id());
        //对作业数据进行更新
        int bl = studentDao.updateHomework(sh);
        if(bl > 0 ){
            System.out.println("数据更新成功");
            sqlSession.commit();
            modelAndView.setViewName("/WEB-INF/pages/success");
        }
        else{
            //数据更新失败，即之前并未提交过，将数据插入表内
            System.out.println("数据更新失败");
            sh.setUpdate_time(new Date());
            sh.setCreate_time(new Date());
            if(studentDao.insertStudentHomework(sh) > 0){
                //JOptionPane.showMessageDialog(null, "作业提交成功");
                sqlSession.commit();
                modelAndView.setViewName("/WEB-INF/pages/success");
                System.out.println("数据插入成功");
            }
            else{
                System.out.println("数据插入失败");
                modelAndView.setViewName("/WEB-INF/pages/failed");
            }

        }
        modelAndView.setViewName("/WEB-INF/pages/success");
        return modelAndView;
    }
}
