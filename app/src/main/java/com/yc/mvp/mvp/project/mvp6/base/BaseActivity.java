package com.yc.mvp.mvp.project.mvp6.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.yc.mvp.mvp.project.mvp6.LoginPresenter6;
import com.yc.mvp.mvp.project.mvp6.LoginView6;

/**
 * @作者： hyc
 * @时间： 2019/12/3
 * @说明：
 **/
public abstract class BaseActivity extends AppCompatActivity {
    private LoginPresenter6 presenter6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        presenter6 = createPresenter();
        presenter6.attachView(createView());
    }

    public LoginPresenter6 getPresenter6() {
        return presenter6;
    }

    public abstract LoginPresenter6 createPresenter();

    public abstract LoginView6 createView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter6.detachView();
    }
}
