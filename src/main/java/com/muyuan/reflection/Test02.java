package com.muyuan.reflection;

//测试class类的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是:"+person.name);

        //方式1：
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式2：
        Class<?> c2 = Class.forName("com.muyuan.reflection.Student");
        System.out.println(c2.hashCode());

        //方式3：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式4：基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //方式5：获取父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String name;
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}