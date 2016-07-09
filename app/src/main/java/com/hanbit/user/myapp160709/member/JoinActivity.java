package com.hanbit.user.myapp160709.member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160709.MainActivity;
import com.hanbit.user.myapp160709.R;

public class JoinActivity extends Activity implements View.OnClickListener{
    EditText etName,etID,etPW,etEmail;
    Button btJoin,btHome;
    TextView tvResult;
    MemberBean bean = new MemberBean();
    MemberService service = new MemberServiceImpl();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        etName = (EditText) findViewById(R.id.etName);
        etID = (EditText) findViewById(R.id.etID);
        etPW = (EditText) findViewById(R.id.etPW);
        etEmail = (EditText) findViewById(R.id.etEmail);

        btJoin = (Button) findViewById(R.id.btJoin);
        btHome = (Button) findViewById(R.id.btHome);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btJoin.setOnClickListener(this);
        btHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String id = etID.getText().toString();
        String pw = etPW.getText().toString();
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();

        bean.setId(id);
        bean.setPw(pw);
        bean.setName(name);
        bean.setEmail(email);

        switch (v.getId()){
            case R.id.btJoin :
                String result = service.join(bean);
                tvResult.setText(result);
                break;
            case  R.id.btHome :
                this.startActivity(new Intent(this, MainActivity.class));
                break;
            default : break;
        }
    }
}
