package com.yc.mvp.mvp.project;

/**
 * @作者： hyc
 * @时间： 2019/12/2
 * @说明：模拟网络请求
 **/
public class HttpUtils {
    HttpResultListener resultListener;

    public HttpUtils(String userName, int password, HttpResultListener resultListener) {
        this.resultListener = resultListener;
        if (userName.equals("10000") && password == 123456) {
            resultListener.onResult("用户:10000   登录成功!");
        } else {
            resultListener.onResult("用户:10000   登录失败");
        }
    }

    public interface HttpResultListener {
        void onResult(String result);
    }
}
