package com.muyuan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {

    //注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
    @MyAnnotation2(age = 18,name = "美阳")
    public void test(){

    }

    @MyAnnotation3("美阳")//只有默认值是value的时候才能省略
    public void test2(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数 ：参数类型 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在，indexof，如果找不到就返回-1
    String [] schools() default {"日本大学","清华大学"};
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();//只有默认值是value的时候才能省略
}