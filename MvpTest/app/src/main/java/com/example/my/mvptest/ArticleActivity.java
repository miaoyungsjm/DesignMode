package com.example.my.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class ArticleActivity extends AppCompatActivity implements ArticleViewInterface {

    private ArticlePresenter mArticlePresenter;

    private List<Article> mArticles = new ArrayList<>();

    private ProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化控件
        initView();
        // 初始化请求队列
//        RequestQueueMgr.init(getApplicationContext());
        // 构建 ArticlePresent, 与 ArticleActivity 建立关联
        mArticlePresenter = new ArticlePresenter(this);
        // 请求文章数据
        mArticlePresenter.fetchArticles();
    }

    private void initView() {

    }


    @Override
    public void showArticles(List<Article> articles) {
        mArticles.addAll(articles);
        mAdapter.notify();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }


}
