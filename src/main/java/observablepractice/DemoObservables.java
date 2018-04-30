package observablepractice;

//package com.howtoprogram.junit5.observablepratice;

import io.reactivex.Flowable;
//import io.reactivex.Observable;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoObservables {

    public static int[] getGreaterThanTen(int[] arrNumbers) {

        Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);

        List<Integer> resultList = new ArrayList<>();

        Flowable
                .fromArray(arrIntNumbers)
                .filter(x -> x > 10)
                .toList()
                .subscribe(x -> {
                    resultList.addAll(x);
                });

        /*Observable
                .fromArray(arrIntNumbers)
                .filter(x -> x > 10);*/

        return resultList.stream().mapToInt(x -> x).toArray();
    }

    public static int[] duplicateNumbers(int[] arrNumbers) {

        Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);

        List<Integer> resultList = new ArrayList<>();

        Flowable
                .fromArray(arrIntNumbers)
                .map(x -> x*2)
                .toList()
                .subscribe(x -> {
                    resultList.addAll(x);
                });

        /*Observable
                .fromArray(arrIntNumbers)
                .filter(x -> x > 10);*/

        return resultList.stream().mapToInt(x -> x).toArray();
    }
}