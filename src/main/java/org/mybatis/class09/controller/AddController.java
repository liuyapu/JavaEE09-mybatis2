package org.mybatis.class09.controller;


import org.apache.ibatis.session.SqlSession;
import org.mybatis.class09.dao.TeacherDao;
import org.mybatis.class09.model.Student;
import org.mybatis.class09.model.TeacherHomework;
import org.mybatis.class09.utils.MybatisUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * 添加学生和作业请求
 * @author asus
 */

@Controller
@RequestMapping(path = "/add")
public class AddController {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
    @RequestMapping(path = "/student")
    public ModelAndView addstudent(String student_id,String student_name){


        ModelAndView modelAndView = new ModelAndView();


        Student s = new Student();

        s.setStudent_id(Long.parseLong(student_id));
        s.setStudent_name(student_name);
        s.setStudent_password(student_id);

        int result = teacherDao.adds(s);   //返回受影响的行数
        System.out.println(result);
        if(result > 0) {
            System.out.println("学生添加成功");
            sqlSession.commit();
           modelAndView.setViewName("/WEB-INF/pages/successadds");
        }else{
            System.out.println("学生添加失败");
            modelAndView.setViewName("/WEB-INF/pages/failedadds");
        }
        return modelAndView;
    }

    @RequestMapping(path = "/homework")
    public ModelAndView addhomework(String homework_id,String title,String content){
        ModelAndView modelAndView = new ModelAndView();

        TeacherHomework th = new TeacherHomework();

        //Spring IoC管理实例
         /**
         * 赋值
         */
        th.setHomework_id(Long.parseLong(homework_id));
        th.setTitle(title);
        th.setContent(content);
        th.setCreate_time(new Date());

        int result = teacherDao.addh(th);
        if(result > 0) {
            System.out.println("作业添加成功");
            sqlSession.commit();
            modelAndView.setViewName("/WEB-INF/pages/successaddh");
        }else{
            System.out.println("作业添加失败");
            modelAndView.setViewName("/WEB-INF/pages/failedaddh");
        }
        return modelAndView;
    }
}
