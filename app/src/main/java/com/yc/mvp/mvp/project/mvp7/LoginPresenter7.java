package com.yc.mvp.mvp.project.mvp7;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp7.base.BasePresenter7;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter7 extends BasePresenter7<LoginView7> {
    LoginModel7 loginModel;

    public LoginPresenter7() {
        this.loginModel = new LoginModel7();
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
