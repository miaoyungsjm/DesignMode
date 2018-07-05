package com.example.my.mvptest;

import java.util.LinkedList;
import java.util.List;

/**
 * @author my
 * @date 2018/7/5
 */
public class ArticleModelImpl implements ArticleModel {
    List<Article> mCachedArticles = new LinkedList<>();

    @Override
    public void saveArticles(List<Article> articles) {
        mCachedArticles.addAll(articles);
    }

    @Override
    public void loadArticlesFromCache(DataListener listener) {

        // 从数据库读取数据成功
        listener.onComplete(mCachedArticles);
    }
}
