package com.example.my.mvptest;

import java.util.LinkedList;
import java.util.List;

/**
 * @author my
 * @date 2018/7/5
 */
public class ArticleAPIImpl implements ArticleAPI {
    List<Article> mArticles = new LinkedList<>();

    @Override
    public void fetchArticles(DataListener listener) {

        // 网上获取数据，成功
        listener.onComplete(mArticles);
    }
}
