package com.example.c19_composite.demo;

import java.util.Iterator;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/16
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirList.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirList.remove(dir);
    }

    @Override
    public void clear() {
        dirList.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + "(");
        Iterator<Dir> iterator = dirList.iterator();
        while (iterator.hasNext()) {
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return dirList;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
