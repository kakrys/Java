import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        //problem1();
        //problem2();
        //problem3();
        //problem4();
        //problem5();
    }
    public static void problem1(){  // Реализация п.1 лабораторной работы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        if (n>0) {
            int StepCounter = 0;
            if (n == 1)
                StepCounter = 3; // Как указано в методичке,от 1 мы снова можем дойти до 1 (1->4->2->1) поэтому в случае ввода единицы присваиваем счетчику значение 3
            while (n != 1) {
                if (n % 2 == 0) n = n / 2;
                else n = 3 * n + 1;
                StepCounter++;
            }
            System.out.println("Необходимо " + StepCounter + " шага(ов)");
        }
        else System.out.println("Число не натуральное");
    }

    public static void problem2(){ // Реализация п.2 лабораторной работы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        if (n>0) {
            int[] arr = new int[n]; // Инициализация и заполнение циклом for массива arr,в котором будем хранить члены ряда
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            double result = 0;
            for (int i = 0; i < n; i++) {
                result += arr[i] * Math.pow(-1, i);
            }
            System.out.println(result);
        }
        else System.out.println("Число не натуральное");
    }
    public static void problem3(){ // Реализация п.3 лабораторной работы
        Scanner scanner = new Scanner(System.in);
        int TargetX = scanner.nextInt(); // Вводим координаты клада по оси х
        int TargetY = scanner.nextInt(); // Вводим координаты клада по оси y
        String str="";
        int step;
        int x=0,y=0;
        int StepCounter=0;
        boolean flag=true;
        while (true){
            str = scanner.next();
            if (str.equals("стоп")) break;
            step = scanner.nextInt();
            if (flag)StepCounter++;
            if (x==TargetX && y==TargetY) flag=false;
            if (str.equals("север")) y+=step;
            if (str.equals("юг")) y-=step;
            if (str.equals("запад")) x-=step;
            if (str.equals("восток")) x+=step;
            if (x==TargetX & y==TargetY) flag=false;

       }
        System.out.println(StepCounter);
        //System.out.println("str");
    }
    public static void problem4(){ // Реализация п.4 лабораторной работы
        Scanner scanner = new Scanner(System.in);
        int NumberOfRoad = scanner.nextInt();
        int NumberOfTunnels;
        int CurrentTunnel;
        int CurrentRoad=0;
        int[] MinTunnel = new int[NumberOfRoad];
        for (int i=0;i<NumberOfRoad;i++){
            int LocalMin=MAX_VALUE;
            NumberOfTunnels = scanner.nextInt();
            for (int j=0;j<NumberOfTunnels;j++){
                CurrentTunnel = scanner.nextInt();
                if (CurrentTunnel < LocalMin) LocalMin=CurrentTunnel;
            }
            MinTunnel[i] = LocalMin;
        }
        int result=0;
        for (int i=0;i<NumberOfRoad;i++){
            if (MinTunnel[i]>result) {
                result=MinTunnel[i];
                CurrentRoad = i+1;
            }
                    }
        System.out.println(CurrentRoad + " " + result);
    }
    public static void problem5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int units=0;
        int tens=0;
        int hundreds=0;
        int N = scanner.nextInt();
        units = N % 10;
        tens = N % 100 / 10;
        hundreds = N / 100;
        if ((units*tens*hundreds % 2 == 0) && ((units+tens+hundreds) % 2 == 0)) System.out.println("Число является дваджы четным");
        else System.out.println("Число НЕ является дваджы четным");
    }
}