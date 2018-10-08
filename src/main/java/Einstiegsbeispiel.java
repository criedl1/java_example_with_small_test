import java.util.Scanner;

public class Einstiegsbeispiel {

    public static void main(String[] args) {

        Scanner S1 = new Scanner(System.in);
        String Puffer = S1.next();

        System.out.println(isPalindrome(Puffer));


    }

    public static int isPalindrome (String Puffer){
        int pali = 1;
        char [] arr1 = Puffer.toCharArray();

        for (int i = 0 ; i <arr1.length/2 ; i++) {
            if (arr1 [i] != arr1 [(arr1.length-1)-i])
                pali = 0;
        }
        return pali;

    }


}
