package com.example;

public class Main {
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        if (args.length > 0) {
            ReflectSample instance = null;
            if (args[0].equals("ReflectSample1Impl")) {
                instance = new ReflectSample1Impl();
            } else if (args[0].equals("ReflectSample2Impl")) {
                instance = new ReflectSample2Impl();
            }
            instance.hello();

            Class<?> clazz = Class.forName("com.example." + args[0]);
            // 引数なしのコンストラクタを呼び出し
            ReflectSample instance2 = (ReflectSample) clazz.newInstance();
            instance2.hello();
        }
    }
}
