package com.yc.mvp.mvp.project.mvp7.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.yc.mvp.mvp.project.mvp7.LoginPresenter7;
import com.yc.mvp.mvp.project.mvp7.LoginView7;

/**
 * @作者： hyc
 * @时间： 2019/12/3
 * @说明：
 **/
public abstract class BaseActivity7 extends AppCompatActivity {
    private BasePresenter7 presenter7;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        presenter7 = createPresenter();
        presenter7.attachView(createView());
    }

    public BasePresenter7 getPresenter7() {
        return presenter7;
    }

    public abstract BasePresenter7 createPresenter();

    public abstract BaseView7 createView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter7.detachView();
    }
}
