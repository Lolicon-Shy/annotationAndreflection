package com.muyuan.annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object{
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated//不建议使用
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")//镇压注解
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
