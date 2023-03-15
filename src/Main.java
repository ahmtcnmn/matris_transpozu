import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void matrisUp(int[][] arr,int[] arr2){


    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Oluşturmak istediğiniz matris transpozunun değerlerini giriniz");
        System.out.print("Sütun sayısını giriniz : ");
        a=input.nextInt();
        System.out.print("Kolon sayısını giriniz : ");
        b=input.nextInt();
        c=b;
        d=a;
        int[][] matris=new int[a][b];
        int[][] transpoz=new int[c][d];
        int[] number= new int[a*b];
        for (int i=0;i<number.length;i++){
            System.out.printf((i+1)+". sayiyi giriniz : ");
            number[i]= input.nextInt();
        }
        int f=0,g=0;
        for (int i=0;i<matris.length;i++){
            for (int k=0;k<matris[i].length;k++){
                matris[i][k]=number[f];
                f++;
            }
        }
        for (int i=0;i<transpoz.length;i++){
            for (int k=0;k<transpoz[i].length;k++){
                transpoz[i][k]=number[g];
                g++;
            }
        }

        System.out.println("Matris : ");
        for (int i=0;i<matris.length;i++){
            for (int k=0;k<matris[i].length;k++){
                System.out.print(matris[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpoze : ");
        for (int i=0;i<transpoz.length;i++){
            for (int k=0;k<transpoz[i].length;k++){
                    System.out.print(transpoz[i][k]+" ");
            }
            System.out.println();
        }










    }
}