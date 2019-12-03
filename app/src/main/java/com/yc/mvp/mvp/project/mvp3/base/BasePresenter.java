package com.yc.mvp.mvp.project.mvp3.base;

import com.yc.mvp.mvp.project.mvp3.LoginView3;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：
 **/
public abstract class BasePresenter {
    private LoginView3 loginView;

    //绑定
    public void attachView(LoginView3 loginView) {
        this.loginView = loginView;
    }

    //解绑
    public void detachView() {
        this.loginView = null;
    }

    public LoginView3 getLoginView() {
        return loginView;
    }
}
