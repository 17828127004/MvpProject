package com.yc.mvp.mvp.project.mvp8.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @作者： hyc
 * @时间： 2019/12/3
 * @说明：
 **/
public abstract class BaseActivity8<V extends BaseView8, P extends BasePresenter8<V>> extends AppCompatActivity {
    private P presenter8;
    private V view8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        presenter8 = createPresenter();
        if (presenter8 == null) {
            throw new NullPointerException("presenter8 is null");
        }
        view8 = createView();
        if (view8 == null) {
            throw new NullPointerException("view8 is null");
        }
        presenter8.attachView(view8);

    }

    public P getPresenter8() {
        return presenter8;
    }

    public abstract P createPresenter();

    public abstract V createView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter8 != null) {
            presenter8.detachView();
        }
    }
}
