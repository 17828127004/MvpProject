package com.yc.mvp.mvp.project.mvp8;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp8.base.BasePresenter8;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter8 extends BasePresenter8<LoginView8> {
    LoginModel8 loginModel;

    public LoginPresenter8() {
        this.loginModel = new LoginModel8();
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
