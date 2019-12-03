package com.yc.mvp.mvp.project.mvp5.base;


/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：
 **/
public abstract class BasePresenter5 <V extends BaseView5>{
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
