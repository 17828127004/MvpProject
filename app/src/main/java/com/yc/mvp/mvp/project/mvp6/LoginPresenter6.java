package com.yc.mvp.mvp.project.mvp6;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp6.base.BasePresenter6;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter6 extends BasePresenter6<LoginView6> {
    LoginModel6 loginModel;

    public LoginPresenter6() {
        this.loginModel = new LoginModel6();
    }
    public void login(String userName, int password) {
        loginModel.login(userName, password, new HttpUtils.HttpResultListener() {
            @Override
            public void onResult(String result) {
                if (getLoginView() != null) {
                    getLoginView().loginResult(result);
                }
            }
        });
    }
}
