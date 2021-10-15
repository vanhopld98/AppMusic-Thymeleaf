package com.codegym.service;

import com.codegym.model.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicService implements IMusicService {
    private List<Music> musicList = new ArrayList<>();

    @Override
    public List<Music> getAll() {
        return musicList;
    }

    @Override
    public int findByIdIndex(int id) {
        int index = -1;
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Music findById(int id) {
        int index = findByIdIndex(id);
        return musicList.get(index);
    }

    @Override
    public void remove(int id) {
        int index = findByIdIndex(id);
        musicList.remove(index);
    }

    @Override
    public void update(int id, Music music) {
        int index = findByIdIndex(id);
        musicList.set(index, music);
    }

    @Override
    public void save(Music music) {
        musicList.add(music);
    }
}
