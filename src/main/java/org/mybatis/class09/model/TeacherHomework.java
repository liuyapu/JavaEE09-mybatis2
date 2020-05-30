package org.mybatis.class09.model;

import java.util.Date;

public class TeacherHomework {
    private Long homework_id;
    private String title;
    private String content;
    private Date create_time;

    public TeacherHomework() {
    }

    public TeacherHomework(Long homework_id, String title, String content, Date create_time) {
        this.homework_id = homework_id;
        this.title = title;
        this.content = content;
        this.create_time = create_time;
    }

    public Long getHomework_id() {
        return homework_id;
    }

    public void setHomework_id(Long homework_id) {
        this.homework_id = homework_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "TeacherHomework{" +
                "homework_id=" + homework_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
