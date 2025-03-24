import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args){
        //if-else
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>=18){
            System.out.println("You can drive the car");
        }else{
            System.out.println("you can not drive the car");
        }
//
//        //while
        int count = 5;
        System.out.println("Show will starts in: ");
        while(count!=0){
            System.out.println(count);
            count--;
        }

        //for loop with break and continue
        for(int i=0;i<10;i++){
            if(i%2==1)continue; //0 2 4 6 8
            System.out.println(i);
        }

        //break
        for(int i=0;i<6;i++){
            if(i==5)break;
            System.out.println(i);
        }
    }
}