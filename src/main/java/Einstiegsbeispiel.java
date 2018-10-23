import java.util.Scanner;

public class Einstiegsbeispiel {


    public static int isPalindrome (String Puffer){

        char [] arr1 = Puffer.toCharArray();

        for (int i = 0; i <arr1.length ; i++) {
            if (Character.isDigit(arr1[i]))
            {
               return 0;
            }
        }


        int pali = 1;
        //char [] arr1 = Puffer.toCharArray();


        for (int j = 0 ; j <arr1.length/2 ; j++) {
            if (arr1 [j] != arr1 [(arr1.length-1)-j])
                pali = 0;
        }
        return pali;

    }



    }
