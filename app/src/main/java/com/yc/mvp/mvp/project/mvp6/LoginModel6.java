package com.yc.mvp.mvp.project.mvp6;

import com.yc.mvp.mvp.project.HttpUtils;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：M层，网络请求
 **/
public class LoginModel6 {

    public void login(String userName, int password, final HttpUtils.HttpResultListener httpResultListener) {
        HttpUtils httpUtils = new HttpUtils(userName, password, new HttpUtils.HttpResultListener() {
            @Override
            public void onResult(String result) {
                httpResultListener.onResult(result);
            }
        });
    }
}
