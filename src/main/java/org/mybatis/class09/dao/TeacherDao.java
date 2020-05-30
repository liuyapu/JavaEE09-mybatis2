package org.mybatis.class09.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.class09.model.Student;
import org.mybatis.class09.model.StudentHomework;
import org.mybatis.class09.model.Teacher;
import org.mybatis.class09.model.TeacherHomework;

import java.util.List;

public interface TeacherDao {

    List<StudentHomework> getStudentHomework();
    Teacher loginTeacher(@Param("teacher_id") Long teacher_id, @Param("teacher_password") String teacher_password);
    int adds(Student student);
    int addh(TeacherHomework teacherHomework);
}
