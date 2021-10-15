package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class MusicForm {
    private int id;
    private String name;
    private String singer;
    private MultipartFile music;

    public MusicForm() {
    }

    public MusicForm(int id, String name, String singer, MultipartFile music) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.music = music;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public MultipartFile getMusic() {
        return music;
    }

    public void setMusic(MultipartFile music) {
        this.music = music;
    }
}
