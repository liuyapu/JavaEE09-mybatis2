package org.mybatis.class09.model;

public class Student {
    private Long student_id;
    private String student_password;
    private String student_name;

    public Student() {
    }

    public Student(Long student_id, String student_password, String student_name) {
        this.student_id = student_id;
        this.student_password = student_password;
        this.student_name = student_name;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_password='" + student_password + '\'' +
                ", student_name='" + student_name + '\'' +
                '}';
    }
}
