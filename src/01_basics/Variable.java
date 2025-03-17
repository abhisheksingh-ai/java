import jdk.jfr.Unsigned;

public class Variable {
    public static void main(String[] args) {
        //Random Learnig
        String name = "Abhishek Singh";
        int age = 24;
        boolean isMarried = false;
        double height = 5.7;
        float height2 = 6.4f;

        //System.out.println("The name is " + name);

        //There are total 8 types in java
        //1. byte (8 bit) range = -128 to 127 in integer
        byte number = 123;
        //System.out.println("number: " + number);

        //2. short (16 bit) range = -32,768 and a maximum value of 32,767 (inclusive)
        short number2 = 23278;
        //System.out.println("number: " + number2);

        //3. int (32 bit) range = -2^31 and a maximum value of 2^31-1
        int  number3 = 26375343;
        //System.out.println("number: " + number2);

        //4. float (32 bit) single precision
        float height3 = 171.4543346673576563725675423754732527547325475725747247434663567523675476235467257625653267545555f;
        //without f it consider double
        System.out.println("number: " + height3); //number: 171.45433

        //5. double (64 bit)
        double height4 = 171.4543346673576563725675423754734433252754732547572574724643654274527645274;
        System.out.println("number: " + height4); //number: 171.45433466735764

        //6. boolean
        boolean isPass = true; //size is not precisely defined

        /*7. char The char data type is a single 16-bit Unicode character.
         It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
         */
        char a = 'a';
        System.out.println("a: " + a);
    }
}
