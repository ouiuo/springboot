package com.example.anotherone.model;

import javax.persistence.*;

@Entity
public class MusicModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(columnDefinition = "projectname")
    private String projectname;

    @Column(columnDefinition = "title")
    private String title;

    public MusicModel(){}

    public MusicModel(String projectname, String title) {
        this.projectname = projectname;
        this.title = title;
    }

    public MusicModel(long id, String projectname, String title) {
        this.id = id;
        this.projectname = projectname;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
