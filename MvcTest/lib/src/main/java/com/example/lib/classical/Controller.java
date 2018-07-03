package com.example.lib.classical;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author my
 * @date 2018/7/3
 */
public class Controller {
    private Model mModel;
    private View mView;

    public Controller(final Model mModel, View mView) {
        this.mModel = mModel;
        this.mView = mView;

        mView.addLoadListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mModel.loadImage();
            }
        });


        mView.addClearListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mModel.clearImage();
            }
        });
    }
}
