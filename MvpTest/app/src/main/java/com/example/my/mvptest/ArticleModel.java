package com.example.my.mvptest;

import java.util.List;

/**
 * @author my
 * @date 2018/7/5
 */
public interface ArticleModel {

    public void saveArticles(List<Article> articles);

    public void loadArticlesFromCache(DataListener listener);
}
