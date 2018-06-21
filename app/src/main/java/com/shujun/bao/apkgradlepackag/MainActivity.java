package com.shujun.bao.apkgradlepackag;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public String getChanal(){
        String channnel =  "";
        //在application应用<meta-data>元素。
        try {
            ApplicationInfo appInfo = this.getPackageManager()
                    .getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
          channnel =  appInfo.metaData.getString("UMENG_CHANNEL");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return channnel;
    }
}
