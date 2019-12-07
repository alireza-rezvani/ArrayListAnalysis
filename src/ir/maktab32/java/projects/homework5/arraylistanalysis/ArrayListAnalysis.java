package ir.maktab32.java.projects.homework5.arraylistanalysis;

import java.util.ArrayList;

public class ArrayListAnalysis {

    public static ArrayList<Integer> analyze(ArrayList<Integer> arrayList){

        ArrayList<Integer> resultArrayList = arrayList;

        if (resultArrayList.size() % 2 != 0) {
            resultArrayList.remove(arrayList.size() - 1);
        }
        if (!resultArrayList.isEmpty()){
            for (int i = resultArrayList.size() / 2 -1; i >= 0 ; i--){
                if (resultArrayList.get(2 * i) > resultArrayList.get(2 * i + 1)){
                    resultArrayList.remove(2 * i + 1);
                    resultArrayList.remove(2 * i);
                }
            }
        }

        return resultArrayList;
    }

}
