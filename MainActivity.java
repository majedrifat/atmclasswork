package com.example.administrator.fregment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void action(View v){



        if(v==findViewById(R.id.bt1)){
            BlankFragment bf=new BlankFragment();
            android.app.FragmentManager fm=getFragmentManager();
            android.app.FragmentTransaction ft= fm.beginTransaction();
            ft.replace(R.id.fr1,bf);
            ft.commit();
        }
        else{
            BlankFragment2 bf1= new BlankFragment2();
            android.app.FragmentManager fm=getFragmentManager();
            android.app.FragmentTransaction ft= fm.beginTransaction();
            ft.replace(R.id.fr1,bf1);
            ft.commit();
        }
    }




}
