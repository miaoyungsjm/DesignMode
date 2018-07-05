package com.example.my.mvptest;

import java.util.List;

/**
 * @author my
 * @date 2018/7/5
 */
public class ArticlePresenter {
    /**
     * ArticleView 接口，代表了 View 接口角色
     */
    private ArticleViewInterface mArticleView;

    /**
     * 文章数据的 Model ，代表 Model 角色
     */
    ArticleModel mArticleModel = new ArticleModelImpl();

    /**
     * 从网络上获取文章的 API
     */
    ArticleAPI mArticleAPI = new ArticleAPIImpl();

    /**
     * 构造函数
     * 绑定 ArticleViewInterface 接口
     */
    public ArticlePresenter(ArticleViewInterface viewInterface) {
        mArticleView = viewInterface;
    }

    /**
     * 获取文章的业务逻辑
     */
    public void fetchArticles() {
        // 显示加载框
        mArticleView.showLoading();

        mArticleAPI.fetchArticles(new DataListener() {
            @Override
            public void onComplete(List<Article> result) {
                // 数据加载完，调用 View 的 showArticles 函数将数据传递给 View 显示
                mArticleView.showArticles(result);
                // 隐藏加载框
                mArticleView.hideLoading();

                // 存储到数据库
                mArticleModel.saveArticles(result);
            }
        });
    }

    /**
     * 从数据库读取文章的逻辑
     */
    public void loadArticlesFromDB() {
        mArticleModel.loadArticlesFromCache(new DataListener() {
            @Override
            public void onComplete(List<Article> result) {
                // 从数据库加载
                mArticleView.showArticles(result);
            }
        });
    }

}
