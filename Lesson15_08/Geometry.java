package HomeWork.VasievJava.Lesson15_08;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер фигуры: ");
        int n = kb.nextInt();
/*
        for(int i = 0; i<n; i++) {
             for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        /*for(int i = 0; i<n;i++){
            for(int j=0; j <= i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i< n; i++){

            for(int j = i; j< n; j++ ){
                System.out.print(" ");
                System.out.print("/");

            }
        }
*/

        /*for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //if((i+j)%2==0) System.out.print("+ "); else System.out.print("- ");
                System.out.print((i + j) % 2==0 ? "+ " : "- ");
            }
            System.out.println();
        }*/
        //int c = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                System.out.print("*"); // отодвигаем палку от строки
            }
            System.out.print("/");// в конце строки пробела ставится палка

            for (int j = 0; j < i * 2; j++) {

                System.out.print("*");
            }
            System.out.print("\\");

            System.out.println(); // переход на новую строку
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.print("\\");

            for (int j = 0; j < (n - 1 - i) * 2; j++) {
                System.out.print("*");
            }
            System.out.print("/");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                /*if ((i + j) % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }*/
                System.out.print((j+i)%2==0?"+ ":"- ");
            }
            System.out.println();
        }
    }
}
