package laba2;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class task2 {
    public static int[]  RecordArr (int num) {
// fill array from keyboard
        int[] arr;

            Scanner sc = new Scanner(System.in, "cp1251");
            arr = new int[num];
            System.out.println("Заповніть масив числами:");
            for (int i = 0; i < arr.length; i++) {
                try {
                arr[i] = Integer.parseInt(sc.next()); //checking for type int
            } catch (NumberFormatException e) { //caught an error when the user entered a negative number of elements in the array
                System.out.print("\n!!!Помилка, ви ввели некоректні дані. Перезапустіть програму. \nІнформація про помилку: \n" + e);}
            }

        return arr;
    }
    // Displaying the resulting array
    public static void showArray (int[] arr) {
        System.out.print("\nОтриманий масив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //finding the maximum number that is divisible by 3
    public static void maxNum (int[] arr) {
        int indMax = 0;
        int max = arr[indMax];
        try {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] > max  && arr[i] % 3 == 0  ) {
                    max = arr[i];
                    indMax = i;

                } else if ( arr[i] > max && arr[i] % 3 != 0) { //if there is no number in the array that is divisible by 3
                    throw new Error("\nВ масиві немає числа, яке кратне 3.");
                }
            }System.out.print("\nМаксимальне число: " + max + ", a його індекс: " + indMax);

        } catch (Error e) { //caught an error when there is no number divisible by 3 in the array
            System.out.println("\n\n!!!Помилка. Перезапустіть програму " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        try {
        System.out.print("Введіть кількість чисел в масиві: ");
        int n=parseInt(sc.next()); //checking for type int
        if (n >0) {
        int[] array = RecordArr(n);
        showArray(array);
        maxNum(array);
        }else throw new Exception ("Кількість елементів в масиві не може бути від'ємною.");
        } catch (NumberFormatException e) {//caught error when user enters letters instead of numbers
            System.out.print("\n!!!Помилка, ви ввели некоректні дані. Перезапустіть програму. \nІнформація про помилку: \n" + e);
    } catch (Exception e){ //caught an error when the user entered a negative number of elements in the array
        System.out.print("\n!!!Помилка. Перезапустіть програму. Інформація про помилку: \n"+ e);}
    }
}
