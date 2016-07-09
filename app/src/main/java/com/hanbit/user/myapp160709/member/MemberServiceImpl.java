package com.hanbit.user.myapp160709.member;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class MemberServiceImpl implements MemberService {
    public  static String sessionID, sessionPW;

    @Override
    public String join(MemberBean bean) {
        String id = bean.getId();
        String pw = bean.getPw();
        String name = bean.getName();
        String email = bean.getEmail();
        Log.d("넘어온 ID : ", id);
        Log.d("넘어온 PW : ", pw);
        Log.d("넘어온 이름 : ", name);
        Log.d("넘어온 EMAIL : ", email);
        sessionID = id;
        sessionPW = pw;
        return name + "님 회원가입을 축하드립니다.";
    }

    @Override
    public boolean login(MemberBean bean) {
        boolean loginOK = false;

        String id = bean.getId();
        String pw = bean.getPw();
        String name = bean.getName();
        String email = bean.getEmail();
        Log.d("넘어온 ID : ", id);
        Log.d("넘어온 PW : ", pw);
        if (sessionID.equals(id) && sessionPW.equals(pw))
            loginOK = true;
            return loginOK;

    }
}
