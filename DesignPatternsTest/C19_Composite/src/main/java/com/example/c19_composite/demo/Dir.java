package com.example.c19_composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/16
 */
public abstract class Dir {
    protected List<Dir> dirList = new ArrayList<>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public abstract List<Dir> getFiles();

    public String getName() {
        return name;
    }
}
