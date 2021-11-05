import org.w3c.dom.xpath.XPathNamespace;

import java.io.File;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args){
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[30];
        arr[2] = new int[10];

        arr[1][15] = 99;
        MyArrayUtil.printArray(arr);

        int[][] arr2 = {
                {1, 2, 3},
                {3, 4, 5, 12, 235, 46, 67},
                {6, 7, 8},
        };

        MyArrayUtil.printArray(arr2);

        int[] arr15 = MyArrayUtil.makeArrayWithRandomValues( 15);

        MyArrayUtil.printArray(arr15);

        Random rand = new Random();

        int q = rand.nextInt(100);
        System.out.println(q);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s);

      /*      File file = new File(PathName: "files.txt/ java core 1 oct 21");

            try (Scanner sc = new Scanner) */


    }



    //    lenearArr();


    // lenearArr() {
      //  int[] arr = {1, 2, 3, 4, 5, 6, 7};
    //    double[] arr1 = {1, 2, 3, 4, 5, 6, 7};
    //    String[] arr2 = {"1", "2", "3", "4", "5", "6", "7"};
        //      System.out.println(arr);
        //    System.out.println(arr1);
        //  System.out.println(arr2);

      //  MyArrayUtil.printArray(arr);
      //  MyArrayUtil.printArray(arr1);
      //  MyArrayUtil.printArray();
      //  MyArrayUtil.printArray(1.0, 2.0, 3.0, 4, 5, 6);
    }

