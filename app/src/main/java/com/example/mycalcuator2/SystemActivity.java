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
import android.view.View;

public class SystemActivity extends AppCompatActivity  implements View.OnClickListener{
    private Spinner s1,s2,s3;
    private TextView textview,textview2,textview3;
    private StringBuilder sb = new StringBuilder();;

     int sys1=10,sys2 =10,sys3 =10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);

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
        Button bta = findViewById(R.id.A);
        Button btb = findViewById(R.id.B);
        Button btc = findViewById(R.id.C);
        Button btd = findViewById(R.id.D);
        Button bte = findViewById(R.id.E);
        Button btf = findViewById(R.id.F);

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
        btce.setOnClickListener(this);
        btzf.setOnClickListener(this);
        bta.setOnClickListener(this);
        btb.setOnClickListener(this);
        btc.setOnClickListener(this);
        btd.setOnClickListener(this);
        bte.setOnClickListener(this);
        btf.setOnClickListener(this);


        textview = findViewById(R.id.text_view_system1);
        textview2 = findViewById(R.id.text_view_system2);
        textview3 = findViewById(R.id.text_view_system3);
        s1 = findViewById(R.id.system);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (s1.getSelectedItem().toString()){
                    case"十进制":
                        sys1 = 10;
                        textview.setText("你选择了10进制");

                        break;
                    case"二进制":
                        sys1= 2;
                        textview.setText("你选择了二进制");

                        break;
                    case"十六进制":
                        sys1 = 16;
                        textview.setText("你选择了16进制");

                        break;
                    case "八进制":
                        sys1 = 8;
                        textview.setText("你选择了8进制");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s2 = findViewById(R.id.system2);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("tiaoshi",s2.getSelectedItem().toString());
                switch (s2.getSelectedItem().toString()){
                    case"十进制":
                        sys2 = 10;
                        Log.i("tiaoshi",String.valueOf(sys2));
                        break;
                    case"十六进制":
                        sys2 = 16;
                        Log.i("tiaoshi",String.valueOf(sys2));
                        break;
                    case"八进制":
                        sys2 = 8;
                        Log.i("tiaoshi",String.valueOf(sys2));
                        break;
                    case "二进制":
                        sys2 = 2;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s3 = findViewById(R.id.system3);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (s3.getSelectedItem().toString()){
                    case"十进制":
                        sys3 = 10;
                        break;
                    case"十六进制":
                        sys3 = 16;
                        break;
                    case"八进制":
                        sys3 = 8;
                        break;
                    case"二进制":
                        sys3 = 2;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private boolean input = false;
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view){
        int a;
        switch (view.getId()){
            case R.id.button_0:
                if(input ==false){
                    break;
                }
                sb = sb.append("0");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));

                break;
            case R.id.button_1:
                sb = sb.append("1");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_2:
                if(sys1 == 2) break;
                sb = sb.append("2");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_3:
                if(sys1 == 2) break;
                sb = sb.append("3");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_4:
                if(sys1 == 2) break;
                sb = sb.append("4");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_5:
                if(sys1 == 2) break;
                sb = sb.append("5");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_6:
                if(sys1 == 2) break;
                sb = sb.append("6");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_7:
                if(sys1 == 2) break;
                sb = sb.append("7");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;

            case R.id.button_8:
                if(sys1 == 2 || sys1 == 8) break;
                sb = sb.append("8");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_9:
                if(sys1 == 2 || sys1 == 8) break;
                sb = sb.append("9");
                textview.setText(sb.toString());
                a = Integer.parseInt(sb.toString(),sys1);
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.A:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("a");
                 a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.B:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("b");
                 a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.C:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("c");
                a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.D:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("d");
                a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.E:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("e");
                a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.F:
                if(sys1 != 16){
                    break;
                }
                sb = sb.append("f");
                a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                input =true;
                break;
            case R.id.button_zf:
                if(sb.length() == 0){//如果长度已经为 0，为了不引发程序崩溃，break
                    input = false;
                    break;
                }
                if(sb.length() == 1){
                    sb.deleteCharAt(sb.length()-1);
                    textview.setText("0");
                    textview2.setText("0");
                    textview3.setText("0");
                    break;
                }
                sb.deleteCharAt(sb.length()-1);
                a = Integer.parseInt(sb.toString(),sys1);
                textview.setText(sb.toString());
                textview2.setText(Integer.toString(a,sys2));
                textview3.setText(Integer.toString(a,sys3));
                break;
            case R.id.button_c:
                input =false;
                sb = sb.delete(0, sb.length());
                textview.setText(sb.toString());
                textview2.setText(sb.toString());
                textview3.setText(sb.toString());
                break;
        }
    }

}
