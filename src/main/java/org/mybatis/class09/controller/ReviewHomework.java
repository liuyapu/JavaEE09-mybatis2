package org.mybatis.class09.controller;


import org.apache.ibatis.session.SqlSession;
import org.mybatis.class09.dao.StudentDao;
import org.mybatis.class09.dao.TeacherDao;
import org.mybatis.class09.model.StudentHomework;
import org.mybatis.class09.utils.MybatisUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/submit")
public class ReviewHomework {
    @RequestMapping(path = "/review")
    public ModelAndView reviewh(String studentid,String homeworkid,
                                String homeworktitle,String homeworkcontent,String create_time,int score){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("学生id为："+Long.parseLong(studentid));
        System.out.println("作业id："+Long.parseLong(homeworkid));
        System.out.println("分数为："+score);
        //使用mybatis获取sqlSessionFactory对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherDao techerDao = sqlSession.getMapper(TeacherDao.class);

        StudentHomework sh = new StudentHomework();
        sh.setScore(score);
        sh.setHomework_id(Long.parseLong(homeworkid));
        sh.setStudent_id(Long.parseLong(studentid));
        int bl = techerDao.reviewHomework(sh);
        if(bl>0){
            System.out.println("作业批改成功");
            sqlSession.commit();
            modelAndView.setViewName("/WEB-INF/pages/success");
        }
        else{
            System.out.println("作业批改失败！");
            modelAndView.setViewName("/WEB-INF/pages/failed");
        }
        modelAndView.setViewName("/WEB-INF/pages/success");
        return modelAndView;

    }
}
