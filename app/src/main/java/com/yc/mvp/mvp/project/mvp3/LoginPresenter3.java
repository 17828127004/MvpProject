package com.yc.mvp.mvp.project.mvp3;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp3.base.BasePresenter;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter3 extends BasePresenter {
    LoginModel3 loginModel;

    public LoginPresenter3() {
        this.loginModel = new LoginModel3();
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
