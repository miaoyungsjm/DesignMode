package com.example.lib.modern;

import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author my
 * @date 2018/7/3
 */
public class Controller implements Model.OnStateChangeListener {
    private Model mModel;
    private View mView;

    public Controller(final Model model, View view) {
        this.mModel = model;
        model.setOnStateChangeListener(this);

        this.mView = view;
        view.addLoadListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.loadImage();
            }
        });
        view.addClearListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.clearImage();
            }
        });

        view.setImage(model.getImage());
    }

    @Override
    public void onStateChanged(Image image) {
        mView.setImage(image);
    }
}
