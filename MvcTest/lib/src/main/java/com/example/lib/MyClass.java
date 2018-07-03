package com.example.lib;

import com.example.lib.modern.Controller;
import com.example.lib.modern.Model;
import com.example.lib.modern.View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyClass {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        new Controller(model, view);
    }


    /**
     * 习惯代码示例：
     * 所有逻辑都在一个类
     * */
//    public static void main(String[] args) {
//        // 构造 JFrame 视图容器
//        JFrame container = new JFrame();
//
//        // 构造 JPanel 视图根布局
//        JPanel root = new JPanel();
//        root.setLayout(new BorderLayout());
//
//        // 构造 JLabel 装载图片，并置于视图中心位置
//        final JLabel label = new JLabel();
//        setLabelImage(label);
//        root.add(label, BorderLayout.CENTER);
//
//        // 构造 JPanel 按钮布局
//        JPanel btnLayout = new JPanel();
//        btnLayout.setLayout(new FlowLayout());
//
//        // 构造读取图片的 JButton ，并为其添加点击事件监听器
//        JButton btnLoad = new JButton("Load");
//        btnLoad.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                setLabelImage(label);
//            }
//        });
//        btnLayout.add(btnLoad);
//
//        // 构造清除图片 JButton ，并为去设置事件监听器
//        JButton btnClear = new JButton("Clear");
//        btnClear.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                label.setIcon(new ImageIcon());
//            }
//        });
//        btnLayout.add(btnClear);
//
//        root.add(btnLayout, BorderLayout.SOUTH);
//
//        // 将视图布局装载到视图容器
//        container.setContentPane(root);
//        container.pack();
//        container.setTitle("MVC");
//        container.setVisible(true);
//    }
//
//    private static void setLabelImage(JLabel label) {
//        try {
//            Image image = ImageIO.read(new URL("http://wx2.sinaimg.cn/mw690/ac38503ely1fesz8m0ov6j20qo140dix.jpg"));
//            label.setIcon(new ImageIcon(image));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
}
