package com.example.prototype.demo;

import java.util.ArrayList;

public class WordDocument implements Cloneable {

    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        // clone 时不会执行构造函数
        System.out.println("------- Constructor --------");
    }

    @Override
    public WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            // 浅拷贝 - 引用
//            doc.mImages = this.mImages;
            // 深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImage(String image) {
        this.mImages.add(image);
    }

    public void showDocument() {
        System.out.println("------- Start --------");

        System.out.println("Text :" + mText);
        System.out.println("Images List :");
        for (String imageName : mImages) {
            System.out.println("Image name :" + imageName);
        }
        System.out.println("-------  End  --------");
    }
}
