package com.example.mycalcuator2;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

import static java.lang.Math.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textview;
    private StringBuilder sb = new StringBuilder();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_about:
            {
                Intent qq = new Intent(this,AboutActivity.class);
                startActivity(qq);

            }
            break;
            case R.id.menu_rate:
            {
                Intent qq = new Intent(this,RateActivity.class);
                startActivity(qq);

            }
            break;
            case R.id.menu_system:
            {
                Intent qq = new Intent(this,SystemActivity.class);
                startActivity(qq);

            }
            break;
            case R.id.menu_length:
                Intent qq = new Intent(this,LenghtActivity.class);
                startActivity(qq);
                break;
            case R.id.menu_volume:
                Intent q = new Intent(this,VolumeActivity.class);
                startActivity(q);
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏(不需要隐藏了)
        /*ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }*/

        //隐藏通知栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.calculator);


        //定义控件
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
        Button btjia = findViewById(R.id.button_jia);
        Button btjian = findViewById(R.id.button_jian);
        Button btcheng = findViewById(R.id.button_cheng);
        Button btchu = findViewById(R.id.button_chu);
        Button btdeng = findViewById(R.id.button_deng);
        Button btdian = findViewById(R.id.button_dian);
        Button bttui = findViewById(R.id.button_zf);
        Button btce = findViewById(R.id.button_c);

        Button btsin = findViewById(R.id.button_sin);
        Button btcos = findViewById(R.id.button_cos);
        Button bttan = findViewById(R.id.button_tan);

        Button btzuo = findViewById(R.id.button_zuo);
        Button btyou = findViewById(R.id.button_you);
        textview = findViewById(R.id.text_view);

        Configuration mConfiguration = this.getResources().getConfiguration();
        int ori = mConfiguration.orientation;
        if(ori == mConfiguration.ORIENTATION_LANDSCAPE){
            btsin.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    try{
                        Symbols s = new Symbols();
                        double res = s.eval(sb.toString());

                        double radians = Math.toRadians(res);

                        textview.setText(String.valueOf(Math.sin(radians)));
                    }catch(SyntaxException e){
                        Toast.makeText(MainActivity.this,"error!",Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        Symbols s = new Symbols();
                        double res = s.eval(sb.toString());
                        double radians = Math.toRadians(res);

                        textview.setText(String.valueOf(Math.cos(radians)));
                    }catch(SyntaxException e){
                        Toast.makeText(MainActivity.this,"error!",Toast.LENGTH_SHORT).show();
                    }
                }
            });
            bttan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        Symbols s = new Symbols();
                        double res = s.eval(sb.toString());
                        double radians = Math.toRadians(res);

                        textview.setText(String.valueOf(Math.tan(radians)));
                    }catch(SyntaxException e){
                        Toast.makeText(MainActivity.this,"error!",Toast.LENGTH_SHORT).show();
                    }

                }
            });
            btzuo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(equal){
                        sb = sb.delete(0,sb.length());
                        equal = false;
                    }
                    sb = sb.append("(");
                    sing=false;
                    textview.setText(sb.toString());
                }
            });
            btyou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(equal){
                        sb = sb.delete(0,sb.length());
                        equal = false;
                    }
                    sb = sb.append(")");
                    sing=false;
                    textview.setText(sb.toString());
                }
            });


        }




        //设置监听事件
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
        btjia.setOnClickListener(this);
        btjian.setOnClickListener(this);
        btce.setOnClickListener(this);
        btcheng.setOnClickListener(this);
        btchu.setOnClickListener(this);
        btdian.setOnClickListener(this);
        bttui.setOnClickListener(this);
        btdeng.setOnClickListener(this);




    }
    private boolean sing = false;
    private boolean dot = false;
    private boolean equal = false;
    private boolean input = false;
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view){
        switch (view.getId()){


            case R.id.button_0:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }

                sb = sb.append("0");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_1:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("1");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_2:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("2");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_3:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("3");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_4:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("4");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_5:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("5");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_6:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("6");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_7:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("7");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_8:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("8");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_9:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sb = sb.append("9");
                sing=false;
                textview.setText(sb.toString());
                break;
            case R.id.button_c:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                sing =false;dot=false;
                sb = sb.delete(0, sb.length());
                textview.setText(sb.toString());
                break;


            case R.id.button_zf:
                if(sb.length() == 0){//如果长度已经为 0，为了不引发程序崩溃，break
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals("+")
                        ||sb.substring(sb.length()-1,sb.length()).equals("-")
                        ||sb.substring(sb.length()-1,sb.length()).equals("*")
                        ||sb.substring(sb.length()-1,sb.length()).equals("/")){//如果删除了一个符号，重置符号标示
                    sing = false;
                    sb.deleteCharAt(sb.length()-1);
                    textview.setText(sb.toString());
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){//如果删除了一个小数点，小数点标示重置
                    dot = false;
                    sb.deleteCharAt(sb.length()-1);
                    textview.setText(sb.toString());
                    break;
                }
                sb.deleteCharAt(sb.length()-1);
                textview.setText(sb.toString());
                break;


            case R.id.button_dian://小数点逻辑
                if(equal){
                    equal = false;
                }
                if(dot){//如果已经有小数点了
                    break;
                }
                if(sb.length() == 0|| sing){//如果小数点前面为0或刚输入运算符号，自动补0
                    sb=sb.append("0");sb=sb.append(".");
                    dot=true;
                    textview.setText(sb.toString());
                    break;
                }
                sb = sb.append(".");
                dot=true;
                textview.setText(sb.toString());
                break;


            case R.id.button_jia:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                if(sb.length() == 0){//如果啥还都没输入，那么不让你输入运算符号
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){//如果有睿智打了个小数点在后面之后再输入加号，自动补0
                    sb.append("0");sb.append("+");
                    sing=true;
                    dot=false;
                    textview.setText(sb.toString());
                    break;
                }
                if(sing){//如果前面输入了一个符号，那么让这个符号改为当前的符号
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("+");
                    textview.setText(sb.toString());
                    break;

                }
                sb = sb.append("+");
                dot=false;
                sing =true;
                textview.setText(sb.toString());
                break;
            case R.id.button_jian:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                if(sb.length() == 0){
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){
                    sb.append("0");sb.append("-");
                    sing=true;
                    dot=false;
                    textview.setText(sb.toString());
                    break;
                }
                if(sing){
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("-");
                    textview.setText(sb.toString());
                    break;

                }
                sb = sb.append("-");
                dot=false;
                sing =true;
                textview.setText(sb.toString());
                break;
            case R.id.button_cheng:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                if(sb.length() == 0){
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){
                    sb.append("0");sb.append("*");
                    sing=true;
                    dot=false;
                    textview.setText(sb.toString());
                    break;
                }
                if(sing){
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("*");
                    textview.setText(sb.toString());
                    break;

                }
                sb = sb.append("*");
                dot=false;
                sing =true;
                textview.setText(sb.toString());
                break;
            case R.id.button_chu:
                if(equal){
                    sb = sb.delete(0,sb.length());
                    equal = false;
                }
                if(sb.length() == 0){
                    break;
                }
                if(sb.substring(sb.length()-1,sb.length()).equals(".")){
                    sb.append("0");sb.append("/");
                    sing=true;
                    dot=false;
                    textview.setText(sb.toString());
                    break;
                }
                if(sing){
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("/");
                    textview.setText(sb.toString());
                    break;

                }
                sb = sb.append("/");
                dot=false;
                sing =true;
                textview.setText(sb.toString());
                break;
            case R.id.button_deng:



                try{
                    Symbols s = new Symbols();
                    double res = s.eval(sb.toString());

                    textview.setText(String.valueOf(res));
                }catch(SyntaxException e){
                    Toast.makeText(MainActivity.this,"输入的运算公式有误！",Toast.LENGTH_SHORT).show();
                }
                //textview.setText(calculation(sb.toString()));
                break;


        }

    }
    class MyStack {
        private int maxSize;
        private int top = -1;
        private Object[] array;

        public MyStack(int maxSize) {
            this.maxSize = maxSize;
            array = new Object[maxSize];
        }

        public void push(Object object) {
            if (top == maxSize) {
                throw new RuntimeException("超出最大栈深度");
            }
            array[++top] = object;
        }

        public Object peek() {
            return array[top];
        }

        public Object pop() {
            if (top <= -1) {
                throw new RuntimeException("已到栈底");
            }
            Object cur = array[top];
            top--;
            return cur;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void show() {
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i]);
            }
        }
    }




        public boolean compareChar(char char1, char char2) {
            if (char1 == '*' || char1 == '/') {
                if (char2 == '+' || char2 == '-') {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (char2 == '*' || char2 == '/') {
                    return false;
                } else {
                    return true;
                }
            }
        }

        public String calculation(String str) {
            MyStack numStack = new MyStack(100);
            MyStack charStack = new MyStack(100);
            String num = "";
            //区分数字字符入栈
            for (int i = 0; i < str.length(); i++) {
                if (!isNum(str.charAt(i))) {
                    //符号入栈
                    if (charStack.isEmpty()) {
                        charStack.push(str.charAt(i));
                    } else if (compareChar((Character) charStack.peek(), str.charAt(i))) {
                        int num1 = Integer.parseInt(numStack.pop() + "");
                        int num2 = Integer.parseInt(numStack.pop() + "");
                        char oper = (char) charStack.pop();
                        int cal = cal(num1, num2, oper);
                        numStack.push(cal);
                        charStack.push(str.charAt(i));
                    } else {
                        charStack.push(str.charAt(i));
                    }
                } else {
                    //数字入栈
                    if (i == str.length() - 1) {
                        numStack.push(str.charAt(i));
                    } else if (isNum(str.charAt(i + 1))) {
                        num += str.charAt(i);
                        continue;
                    } else {
                        num += str.charAt(i);
                        numStack.push(num);
                        num = "";
                    }
                }
            }
            while (true) {
                if (charStack.isEmpty()) {
                    break;
                }
                int num1 = Integer.parseInt(numStack.pop() + "");
                int num2 = Integer.parseInt(numStack.pop() + "");
                char oper = (char) charStack.pop();
                int cal = cal(num1, num2, oper);
                numStack.push(cal);
            }
            return numStack.peek().toString();


        }

        public int cal(int num1, int num2, char oper) {
            int resul = 0;
            switch (oper) {
                case '*':
                    resul = num1 * num2;
                    break;
                case '-':
                    resul = num2 - num1;
                    break;
                case '+':
                    resul = num1 + num2;
                    break;
                default:
                    break;
            }
            return resul;
        }

        public boolean isNum(char c) {
            return Character.isDigit(c);
        }

}
