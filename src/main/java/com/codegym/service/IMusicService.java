package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> getAll();

    int findByIdIndex(int id);

    Music findById(int id);

    void remove(int id);

    void update(int id, Music music);

    void save(Music music);
}
