package org.mybatis.class09.model;

public class Teacher {
    private Long teacher_id;
    private String teacher_password;
    private String teacher_name;

    public Teacher() {
    }

    public Teacher(Long teacher_id, String teacher_password, String teacher_name) {
        this.teacher_id = teacher_id;
        this.teacher_password = teacher_password;
        this.teacher_name = teacher_name;
    }

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_password='" + teacher_password + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                '}';
    }
}
