package org.mybatis.class09.dao;


import org.apache.ibatis.annotations.Param;
import org.mybatis.class09.model.Student;
import org.mybatis.class09.model.StudentHomework;
import org.mybatis.class09.model.TeacherHomework;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface StudentDao {

    /**
     * 查询所有操作
     * @return
     */
    List<Student> getStudentList();
    List<TeacherHomework> getTeacherHomeworkList();
    int updateHomework(StudentHomework studentHomework);
    int insertStudentHomework(StudentHomework studentHomework);
    Student loginstudent(@Param("student_id") Long student_id, @Param("student_password") String student_password);
}
