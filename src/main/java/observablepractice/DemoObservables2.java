package observablepractice;


import io.reactivex.Flowable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoObservables2 {

    public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
    	

        List<Integer> resultList = new ArrayList<>();

        Flowable
                .fromArray(arrNumbers)
                .filter(x -> x > 10)
                .toList()
                .subscribe(x -> {
                    resultList.addAll(x);
                });
        /*Integer[] resultArr = new Integer[resultList.size()];
		  resultArr = resultList.toArray(resultArr);*/


         return resultList.stream().toArray(Integer[]::new);
    }

    public static Integer[] duplicateNumbers(Integer[] arrNumbers) {
        	

            List<Integer> resultList = new ArrayList<>();

            Flowable
                    .fromArray(arrNumbers)
                    .map(x -> x * 2 )
                    .toList()
                    .subscribe(x -> {
                        resultList.addAll(x);
                    });
            Integer[] resultArr = new Integer[resultList.size()];
            		  resultArr = resultList.toArray(resultArr);
            

            return resultArr;
    }
}