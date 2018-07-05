package com.example.my.mvptest;

import java.util.List;

/**
 * @author my
 * @date 2018/7/5
 */
public interface ArticleViewInterface {

    public void showArticles(List<Article> articles);

    public void showLoading();

    public void hideLoading();
}
