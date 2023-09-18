package com.example;

import java.util.Optional;

/**
 * @author liqiuliang
 * @create ${YEAR}-${MONTH}-${DAY} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Integer num=12;
        Integer integer = Optional.ofNullable(num).orElse(0);
        System.out.println(integer);
    }
}