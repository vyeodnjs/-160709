package com.hanbit.user.myapp160709;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hanbit.user.myapp160709.calc.CalcActivity;
import com.hanbit.user.myapp160709.calc.CalendarActivity;
import com.hanbit.user.myapp160709.kaup.KaupActivity;
import com.hanbit.user.myapp160709.member.JoinActivity;
import com.hanbit.user.myapp160709.member.LoginActivity;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btCalc,btCalendar,btImageView,btConnectWeb,btKaup,btJoin,btLogin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button) findViewById(R.id.btCalc);
        btCalendar = (Button) findViewById(R.id.btCalendar);
        btImageView = (Button) findViewById(R.id.btImageView);
        btConnectWeb = (Button) findViewById(R.id.btConnectWeb);
        btKaup = (Button) findViewById(R.id.btKaup);
        btJoin = (Button) findViewById(R.id.btJoin);
        btLogin = (Button) findViewById(R.id.btLogin);


        btCalc.setOnClickListener(this);
        btCalendar.setOnClickListener(this);
        btImageView.setOnClickListener(this);
        btConnectWeb.setOnClickListener(this);
        btKaup.setOnClickListener(this);
        btJoin.setOnClickListener(this);
        btLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btConnectWeb :
                intent = new Intent( intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr"));
                startActivity(intent);
                break;
        }

        switch (v.getId()){
            case R.id.btCalc :
                this.startActivity(new Intent(this,CalcActivity.class));
                break;
            case R.id.btCalendar :
                this.startActivity(new Intent(this,CalendarActivity.class));
                break;
            case R.id.btImageView :
                this.startActivity(new Intent(this,ImageActivity.class));
                break;
            case R.id.btKaup :
                this.startActivity(new Intent(this,KaupActivity.class));
            break;
            case R.id.btJoin :
                this.startActivity(new Intent(this,JoinActivity.class));
                break;
            case R.id.btLogin :
                this.startActivity(new Intent(this,LoginActivity.class));
                break;

            default: break;

        }
    }
}
