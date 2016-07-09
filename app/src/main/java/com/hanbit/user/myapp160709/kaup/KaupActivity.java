package com.hanbit.user.myapp160709.kaup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160709.MainActivity;
import com.hanbit.user.myapp160709.R;

public class KaupActivity extends Activity implements View.OnClickListener{
    EditText name,height,weight;
    Button btResult,btHome;
    TextView tvResult;
    KaupService service = new KaupServiceImpl();
    KaupBean bean = new KaupBean();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);

        name = (EditText) findViewById(R.id.name);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        btResult = (Button) findViewById(R.id.btResult);
        btHome = (Button) findViewById(R.id.btHome);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btResult.setOnClickListener(this);
        btHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputName = name.getText().toString();
        int inputHeight = Integer.parseInt(height.getText().toString());
        int inputWeight = Integer.parseInt(weight.getText().toString());
        Log.d("inputName",inputName);
        Log.d("inputHeight",String.valueOf(inputHeight));
        Log.d("inputWeight",String.valueOf(inputWeight));

        bean.setName(inputName);
        bean.setHeight(inputHeight);
        bean.setWeight(inputWeight);

        switch (v.getId()){
            case R.id.btResult :
                String result = service.execute(bean);
                tvResult.setText(result);
                break;
            case R.id.btHome :
                this.startActivity(new Intent(this, MainActivity.class));
                break;
            default : break;
        }
    }
}
