package com.yc.mvp.mvp.project.mvp1;

import com.yc.mvp.mvp.project.HttpUtils;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter1 {
    LoginModel1 loginModel;
    LoginView1 loginView;


    public LoginPresenter1(LoginView1 loginView) {
        this.loginModel = new LoginModel1();
        this.loginView = loginView;
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
