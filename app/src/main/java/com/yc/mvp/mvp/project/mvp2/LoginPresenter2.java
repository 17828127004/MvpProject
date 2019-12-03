package com.yc.mvp.mvp.project.mvp2;

import com.yc.mvp.mvp.project.HttpUtils;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter2 {
    LoginModel2 loginModel;
    LoginView2 loginView;
    public LoginPresenter2() {
        this.loginModel = new LoginModel2();
    }
    //绑定
    public void attachView(LoginView2 loginView) {
        this.loginView = loginView;
    }
    //解绑
    public void detachView() {
        this.loginView = null;
    }
    public void login(String userName, int password) {
        loginModel.login(userName, password, new HttpUtils.HttpResultListener() {
            @Override
            public void onResult(String result) {
                if (loginView != null) {
                    loginView.loginResult(result);
                }
            }
        });
    }
}
