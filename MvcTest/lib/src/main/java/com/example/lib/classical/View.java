package com.example.lib.classical;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author my
 * @date 2018/7/3
 */
public class View extends JFrame implements Model.OnStateChangeListener {

    private JLabel mLabel = new JLabel();
    private JButton mBtnLoad = new JButton("Load");
    private JButton mBtnClear = new JButton("Clear");

    public View(Model model) {
        mLabel.setIcon(new ImageIcon(model.getImage()));

        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout());
        rootPanel.add(mLabel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout());
        btnPanel.add(mBtnLoad);
        btnPanel.add(mBtnClear);

        rootPanel.add(btnPanel, BorderLayout.SOUTH);

        setContentPane(rootPanel);
        pack();
        setTitle("MVC");
        setVisible(true);
    }

    @Override
    public void onStateChanged(Image image) {
        if (null == image) {
            mLabel.setIcon(new ImageIcon());
        } else {
            mLabel.setIcon(new ImageIcon(image));
        }
    }

    public void addLoadListener(ActionListener listener) {
        mBtnLoad.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        mBtnClear.addActionListener(listener);
    }
}
