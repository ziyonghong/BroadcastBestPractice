package com.example.broadcastbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline =(Button) findViewById(R.id.force_offline);
        //点击按钮事件里发送一条值为com.example.broadcastbestpractice.FORCE_OFFLINE的广播，通知程序强制用户下线
        //强制下线逻辑不是写在MainActivity里，应该写在接收这条广播的广播接收器里，这样强制下线的功能就不会依附于任何界面
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE ");
                        sendBroadcast(intent);
            }
        });
    }
}
