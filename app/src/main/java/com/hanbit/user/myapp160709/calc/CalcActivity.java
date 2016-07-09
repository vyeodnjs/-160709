package com.hanbit.user.myapp160709.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160709.MainActivity;
import com.hanbit.user.myapp160709.R;

public class CalcActivity extends Activity implements View.OnClickListener{

    EditText et1,et2;
    Button btPlus,btMinus,btMulti,btDivide,btHome;
    TextView tvResult;
    int num1,num2;
    CalcService service = new CalcServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        btDivide = (Button) findViewById(R.id.btDivide);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btPlus = (Button) findViewById(R.id.btPlus);
        btHome = (Button) findViewById(R.id.btHome);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btDivide.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btPlus.setOnClickListener(this);
        btHome.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());
        switch (v.getId()){
            case R.id.btHome :
                this.startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btPlus :
                tvResult.setText("계산결과 : " + service.plus(num1,num2));
                break;
            case R.id.btMinus :
                tvResult.setText("계산결과 : " + service.minus(num1,num2));
                break;
            case R.id.btMulti :
                tvResult.setText("계산결과 : " + service.multi(num1,num2));
                break;
            case R.id.btDivide :
                tvResult.setText("계산결과 : 몫 = " + service.divide(num1,num2)
                        + ",나머지 = " + service.reminder(num1,num2));
                break;
            default : break;

        }
    }
}