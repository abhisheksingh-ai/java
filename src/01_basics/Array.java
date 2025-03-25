public class Array {
    public static void main(String[] args){
        int[] scores = new int[5];
        scores[0] = 56;
        scores[2] = 78;
        scores[4] = 80;

        for(int i=0;i<5;i++){
            System.out.println(scores[i]); //un initialized values will be zero
        }

        //scores[7] = 10; //array index out of bount

        String[] fullName = new String[3];
        fullName[0] = "Abhishek";
        fullName[2] = "Singh";

        for(int i=0;i<3;i++){
            System.out.println(fullName[i]); // Abhishek  null  Singh
        }

        double[] percent = new double[3];
        percent[0] = 98.7877;
        percent[2] = 76.989898;

        for(int i=0;i<3;i++){
            System.out.println(percent[i]); // 0.0 for unintialized data
        }
    }
}