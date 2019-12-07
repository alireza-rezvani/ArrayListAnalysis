package ir.maktab32.java.projects.homework5.arraylistanalysis;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAnalysisApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        String arrayListInitialSize;
        boolean tryAgain = false;

        do {
            do {
                System.out.print("\u29bf Enter Your ArrayList Size: ");
                arrayListInitialSize = scanner.next();
                if (!Utilities.isNumeric(arrayListInitialSize))
                    System.out.println("\t\u26a0 Invalid Input!");
            } while (!Utilities.isNumeric(arrayListInitialSize));

            if (Integer.parseInt(arrayListInitialSize) > 0) {
                System.out.println();
                String number = "";
                for (int i = 0; i < Integer.parseInt(arrayListInitialSize); i++) {
                    System.out.printf("\u29bf Enter Element %d: ", i + 1);
                    number = scanner.next();
                    while (!Utilities.isNumeric(number)) {
                        System.out.println("\t\u26a0 Invalid Input!");
                        System.out.printf("\u29bf Enter Element %d: ", i + 1);
                        number = scanner.next();
                    }
                    arrayList.add(Integer.parseInt(number));
                }
            }
            else if (Integer.parseInt(arrayListInitialSize) < 0){
                System.out.println("\t\u26a0 Negative size is Invalid! Size Is Set to Zero!");
            }

            System.out.println("\n\t\u2705 Input  ArrayList: " + arrayList);
            System.out.println("\t\u2705 Result ArrayList: " + ArrayListAnalysis.analyze(arrayList) + "\n");

            System.out.println("\u29bf Do You Want to Try Again?\t(y = Yes | other Keys = No)");
            if (scanner.next().equals("y")){
                tryAgain = true;
                while (arrayList.size() > 0){
                    arrayList.remove(arrayList.size()-1);
                }
                System.out.println();
            }
            else
                tryAgain = false;

        }while (tryAgain);

        System.out.println("\t\u2705 Bye!");

    }
}