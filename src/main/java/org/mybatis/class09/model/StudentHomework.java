package org.mybatis.class09.model;

import java.util.Date;

public class StudentHomework {

    private Long student_id;
    private Long homework_id;
    private String homework_content;
    private String homework_title;
    private Date create_time;
    private Date update_time;

    public StudentHomework() {
    }

    public StudentHomework(Long student_id, Long homework_id, String homework_content, String homework_title, Date create_time, Date update_time) {
        this.student_id = student_id;
        this.homework_id = homework_id;
        this.homework_content = homework_content;
        this.homework_title = homework_title;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getHomework_id() {
        return homework_id;
    }

    public void setHomework_id(Long homework_id) {
        this.homework_id = homework_id;
    }

    public String getHomework_content() {
        return homework_content;
    }

    public void setHomework_content(String homework_content) {
        this.homework_content = homework_content;
    }

    public String getHomework_title() {
        return homework_title;
    }

    public void setHomework_title(String homework_title) {
        this.homework_title = homework_title;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "StudentHomework{" +
                "student_id=" + student_id +
                ", homework_id=" + homework_id +
                ", homework_content='" + homework_content + '\'' +
                ", homework_title='" + homework_title + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
