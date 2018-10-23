package com.example.administrator.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    Button btn_wb,btn_depo;
    TextView tv1;
    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_wb = (Button) findViewById(R.id.wd);
        btn_depo = (Button) findViewById(R.id.dep);
        edt1 = (EditText) findViewById(R.id.edt1);
        tv1 = (TextView) findViewById(R.id.tv1);
        mValueOne=0;
        btn_wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueTwo = Float.parseFloat(edt1.getText() + "");

                    if ( mValueOne < mValueTwo){

                        Toast.makeText(getApplicationContext(),"Invalid Entry", Toast.LENGTH_LONG).show();
                    }
                    if ( mValueOne > mValueTwo){
                        tv1.setText(mValueOne + mValueTwo+"");

                    }


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Entry", Toast.LENGTH_LONG).show();


                }


            }
        });





    }
}
