package com.yc.mvp.mvp.project.mvp4.base;


/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：
 **/
public abstract class BasePresenter4 {
    private BaseView loginView;

    //绑定
    public void attachView(BaseView loginView) {
        this.loginView = loginView;
    }

    //解绑
    public void detachView() {
        this.loginView = null;
    }

    public BaseView getLoginView() {
        return loginView;
    }
}
