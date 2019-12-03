package com.yc.mvp.mvp.project;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yc.mvp.mvp.project.mvp8.LoginPresenter8;
import com.yc.mvp.mvp.project.mvp8.LoginView8;
import com.yc.mvp.mvp.project.mvp8.base.BaseActivity8;

public class MainActivity extends BaseActivity8<LoginView8, LoginPresenter8> implements LoginView8 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getPresenter8().login("10000", 123456);
            }
        });
    }

    @Override
    public LoginPresenter8 createPresenter() {
        return new LoginPresenter8();
    }

    @Override
    public LoginView8 createView() {
        return this;
    }

    @Override
    public void loginResult(String result) {
        TextView textView = findViewById(R.id.tv_result);
        textView.setText(result);
    }
}
