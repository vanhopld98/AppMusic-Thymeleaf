package com.codegym.model;

public class Music {
    private int id;
    private String name;
    private String singer;
    private String music;

    public Music() {
    }

    public Music(int id, String name, String singer, String music) {
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

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
