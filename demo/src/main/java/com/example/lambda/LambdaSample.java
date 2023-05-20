package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSample {
    public static void main(String[] args) {
        // 通常クラスで実装
        Color c0 = new ColorImpl();
        c0.print("c0");

        // 無名クラスで実装
        Color c1 = new Color() {

            @Override
            public void print(String str) {
                System.out.println(this.getClass() + "：" + str);
            }
        };
        c1.print("c1");

        // lambdaで実装
        Color c2 = str -> {
            System.out.println(LambdaSample.class + "：" + str);
            System.out.println(LambdaSample.class + "：" );
        };
        c2.print("c2");

        List<Value> list = Arrays.asList(
            new Value(1, "nakajun"),
            new Value(3, "manome"),
            new Value(0, "kouno"),
            new Value(2, "chida")
        );

        list.stream().forEach(e -> System.out.println(e));
        list.sort(Comparator.naturalOrder());
        list.stream().forEach(e -> System.out.println(e));
        list.sort((o1, o2) -> {
            return ((Value)o1).getIndex() - ((Value)o2).getIndex();
        });
        list.stream().forEach(e -> System.out.println(e));

        list.sort((o1, o2) -> {
            return ((Value)o1).getValue().compareTo(((Value)o2).getValue());
        });
        list.stream().forEach(e -> System.out.println(e));
    }
}


