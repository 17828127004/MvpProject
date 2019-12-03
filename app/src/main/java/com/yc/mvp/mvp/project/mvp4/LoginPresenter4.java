package com.yc.mvp.mvp.project.mvp4;

import com.yc.mvp.mvp.project.HttpUtils;
import com.yc.mvp.mvp.project.mvp4.base.BasePresenter4;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：与M、V交互的中介
 **/
public class LoginPresenter4 extends BasePresenter4 {
    LoginModel4 loginModel;

    public LoginPresenter4() {
        this.loginModel = new LoginModel4();
    }
    public void login(String userName, int password) {
        loginModel.login(userName, password, new HttpUtils.HttpResultListener() {
            @Override
            public void onResult(String result) {
                if (getLoginView() != null) {
                    //这里强转
                    LoginView4 view= (LoginView4) getLoginView();
                    view.loginResult(result);
                }
            }
        });
    }
}
