import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Пробую коммит и пуш через идею");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("в этом году день программиста празднуют 12.09."+year );
        }else { System.out.println("в этом году день программиста празднуют 13.09."+year );}
    }

    public static boolean isLeapYear (int year) {
        if (year%400 ==0){
            return true;
        }else{
            if (year%100==0){
                return false;
            } else{
                if (year%4==0){
                    return true;
                }
            }
        } return false;

    }
} 