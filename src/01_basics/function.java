import java.util.Scanner;

class Function {

    static int sumOfTwoNumber(int a, int b) {  // Made the method static
        return a + b;
    }

    static void printName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int sum = sumOfTwoNumber(a, b);  // No issue now

        System.out.println(sum);

        String name = "Abhishek Singh";
        printName(name);
        sc.close(); // Close Scanner to avoid resource leak
    }
}
