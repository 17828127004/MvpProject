package com.yc.mvp.mvp.project.mvp5;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp5.base.BasePresenter5;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter5 extends BasePresenter5<LoginView5> {
    LoginModel5 loginModel;

    public LoginPresenter5() {
        this.loginModel = new LoginModel5();
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
