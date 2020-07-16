package com.example.c19_composite;

import com.example.c19_composite.demo.Dir;
import com.example.c19_composite.demo.File;
import com.example.c19_composite.demo.Folder;
import com.example.c19_composite.sample.Component;
import com.example.c19_composite.sample.Composite;
import com.example.c19_composite.sample.Leaf;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("Root");
        Component branch1 = new Composite("Branch");
        Component branch2 = new Composite("Branch2");
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);
        root.addChild(branch1);
        root.addChild(branch2);
        root.doSomething();
        // --------------------
        Dir diskC = new Folder("C");
        diskC.addDir(new File("Logs.txt"));
        Dir dirProgram = new Folder("Program File");
        dirProgram.addDir(new File("explorer.exe"));
        dirProgram.addDir(new File("chrome.exe"));
        Dir dirAndroid = new Folder("Android");
        dirAndroid.addDir(new File("Android Studio.exe"));
        dirProgram.addDir(dirAndroid);
        dirProgram.addDir(new File("QQ.exe"));
        diskC.addDir(dirProgram);
        diskC.addDir(new Folder("User"));
        diskC.print();
    }
}
