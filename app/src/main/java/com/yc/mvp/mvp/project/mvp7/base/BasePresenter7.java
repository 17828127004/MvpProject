package com.yc.mvp.mvp.project.mvp7.base;


/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：
 **/
public abstract class BasePresenter7<V extends BaseView7>{
    private V loginView;

    //绑定
    public void attachView(V loginView) {
        this.loginView = loginView;
    }

    //解绑
    public void detachView() {
        this.loginView = null;
    }

    public V getLoginView() {
        return loginView;
    }
}
