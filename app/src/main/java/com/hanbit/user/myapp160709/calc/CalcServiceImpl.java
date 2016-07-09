package com.hanbit.user.myapp160709.calc;

/**
 * Created by 1027 on 2016-07-09.
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public int reminder(int num1, int num2) {
        return num1 % num2;
    }
}
