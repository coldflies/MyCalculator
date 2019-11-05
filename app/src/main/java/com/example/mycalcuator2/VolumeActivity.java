package com.example.mycalcuator2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener{

    private Spinner s1,s2,s3;
    private StringBuilder sb = new StringBuilder();
    private double rate1,rate2,rate3;



    private TextView textview,textview2,textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        //
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button bt0 = findViewById(R.id.button_0);
        Button bt1 = findViewById(R.id.button_1);
        Button bt2 = findViewById(R.id.button_2);
        Button bt3 = findViewById(R.id.button_3);
        Button bt4 = findViewById(R.id.button_4);
        Button bt5 = findViewById(R.id.button_5);
        Button bt6 = findViewById(R.id.button_6);
        Button bt7 = findViewById(R.id.button_7);
        Button bt8 = findViewById(R.id.button_8);
        Button bt9 = findViewById(R.id.button_9);
        Button btce = findViewById(R.id.button_c);
        Button btzf = findViewById(R.id.button_zf);
        Button btdian = findViewById(R.id.button_dian);
        textview = findViewById(R.id.text_view_rate1);
        textview2 = findViewById(R.id.text_view_rate2);
        textview3 = findViewById(R.id.text_view_rate3);

        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btdian.setOnClickListener(this);
        btce.setOnClickListener(this);
        btzf.setOnClickListener(this);


        s1 = findViewById(R.id.volume);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (s1.getSelectedItem().toString()){
                    case"立方米":
                        rate1 = 1;
                        break;
                    case"升":
                        rate1 = 1000;

                        break;
                    case"毫升":
                        rate1 = 1000000	;
                        break;
                    case "苹果":
                        rate1 = 6666.6;
                        break;
                    case"人":
                        rate1 = 16.94;
                        break;
                    case"农夫山泉":
                        rate1 = 1818.18;
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s2 = findViewById(R.id.volume2);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("tiaoshi",s2.getSelectedItem().toString());
                switch (s2.getSelectedItem().toString()){
                    case"立方米":
                        rate2 = 1;

                        break;
                    case"升":
                        rate2 = 1000;

                        break;
                    case"毫升":
                        rate2 = 1000000	;
                        break;
                    case "苹果":
                        rate2 = 6666.6;
                        break;
                    case"人":
                        rate2 = 16.94;
                        break;
                    case"农夫山泉":
                        rate2 = 1818.18;
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s3 = findViewById(R.id.volume3);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("tiaoshi",s3.getSelectedItem().toString());
                switch (s3.getSelectedItem().toString()){
                    case"立方米":
                        rate3 = 1;

                        break;
                    case"升":
                        rate3 = 1000;

                        break;
                    case"毫升":
                        rate3 = 1000000	;
                        break;
                    case "苹果":
                        rate3 = 6666.6;
                        break;
                    case"人":
                        rate3 = 16.94;
                        break;
                    case"农夫山泉":
                        rate3 = 1818.18;
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private boolean input = false;
    private boolean dot = false;
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view){

        double a,b;
        switch (view.getId()){
            case R.id.button_0:

                if(!input){
                    break;
                }
                sb = sb.append("0");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                break;
            case R.id.button_1:

                sb = sb.append("1");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_2:

                sb = sb.append("2");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_3:

                sb = sb.append("3");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_4:

                sb = sb.append("4");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_5:

                sb = sb.append("5");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_6:

                sb = sb.append("6");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_7:

                sb = sb.append("7");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_8:

                sb = sb.append("8");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_9:

                sb = sb.append("9");
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                input = true;
                break;
            case R.id.button_zf:
                if(sb.length() == 0){//如果长度已经为 0，为了不引发程序崩溃，break
                    input = false;
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){//如果删除了一个小数点，小数点标示重置
                    dot = false;
                    sb.deleteCharAt(sb.length()-1);
                    textview.setText(sb.toString());
                    break;
                }
                if(sb.length() == 1){
                    sb.deleteCharAt(sb.length()-1);
                    a = 0;b=0;
                    textview.setText(String.valueOf(a));
                    textview2.setText(String.valueOf(a));
                    textview3.setText(String.valueOf(b));
                    break;
                }
                sb.deleteCharAt(sb.length()-1);
                a = (Double.valueOf(sb.toString()) / rate1)*rate2;
                b = (Double.valueOf(sb.toString()) / rate1)*rate3;
                textview.setText(sb.toString());
                textview2.setText(String.valueOf(a));
                textview3.setText(String.valueOf(b));
                break;
            case R.id.button_dian:
                if(dot){//如果已经有小数点了
                    break;
                }
                if(sb.length() == 0){//如果小数点前面为0或刚输入运算符号，自动补0
                    sb=sb.append("0");sb=sb.append(".");
                    dot=true;
                    textview.setText(sb.toString());
                    break;
                }
                sb = sb.append(".");
                dot=true;
                textview.setText(sb.toString());
                break;
            case R.id.button_c:
                input =false;dot=false;
                sb = sb.delete(0, sb.length());
                textview.setText(sb.toString());
                textview2.setText(sb.toString());
                textview3.setText(sb.toString());
                break;


        }
    }
}
