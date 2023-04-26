import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //Объявите три массива:
        // 1 - Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int[] arr_00 = new int[]{ 1, 2, 3};
        // 2 - Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] arr_01 = {1.57, 7.654, 9.986};
        //Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        byte[] arr_03 = {1, 3, 9, 12, 15, 18, 21, 24, 27, 30};
        System.out.println("_____________________________________");
    }
    public static void task2(){
        System.out.println("Задача 2");
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        int[] arr_00 = new int[]{ 1, 2, 3};
        for (int i = 0; i < arr_00.length; i++){
            if (i == arr_00.length-1){
                System.out.println(arr_00[i]);
                break;
            }
            System.out.print( arr_00[i] + ", ");
        }

        double[] arr_01 = {1.57, 7.654, 9.986};
        for ( int i = 0; i< arr_01.length; i++){
            if (i == arr_01.length-1){
                System.out.println( arr_01[i]);
                break;
            }
            System.out.print( arr_01[i] + ", ");
        }

        byte[] arr_03 = { 1, 3, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int i = 0; i < arr_03.length; i++){
            if ( i == arr_03.length - 1){
                System.out.println( arr_03[i] );
                break;
            }
            System.out.print( arr_03[i] + ", ");
        }
        System.out.println("_____________________________________");
    }

    public static void task3(){
        System.out.println("Задача 3");
//        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        int[] arr_000 = new int[]{ 1, 2, 3};
        for (int i = arr_000.length-1 ; i >= 0 ; i--){
            if (i == 0){
                System.out.println(arr_000[i]);
                break;
            }
            System.out.print( arr_000[i] + ", ");
        }

        double[] arr_001 = {1.57, 7.654, 9.986};
        for ( int i = arr_001.length-1; i>=0 ; i--){
            if (i == 0){
                System.out.println( arr_001[i]);
                break;
            }
            System.out.print( arr_001[i] + ", ");
        }
        byte[] arr_03 = { 1, 3, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int i = arr_03.length-1; i >=0 ; i--){
            if ( i == 0){
                System.out.println( arr_03[i] );
                break;
            }
            System.out.print( arr_03[i] + ", ");
        }

        System.out.println("_____________________________________");
    }

    public static void task4(){
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.
        int[] arr_00 = new int[]{ 3, 5, 2};
        for (int i = 0; i < arr_00.length; i++){
            if (arr_00[i] % 2 != 0){
                arr_00[i] = arr_00[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr_00));
        System.out.println("_____________________________________");
    }
}




