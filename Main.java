import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] numbers = {3,4,9};

        System.out.println("1桁の数字を入力してください");

        int sc = scan.nextInt();

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] == sc){
                System.out.println("アタリ！");
            }

        }


    }
    
}