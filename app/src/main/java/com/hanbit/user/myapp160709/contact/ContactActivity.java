package com.hanbit.user.myapp160709.contact;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hanbit.user.myapp160709.R;

import java.util.ArrayList;

public class ContactActivity extends Activity implements AdapterView.OnItemClickListener{
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ArrayList<ContactBean> list = null;
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new ContactAdapter(this,list));
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
