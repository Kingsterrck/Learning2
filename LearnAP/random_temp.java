package LearnAP;
public class random_temp {
    public static void main(String[] args) {
        double[] temp = {35.8,35.9,36,36.1,36.2,36.3,36.4,36.5,36.6,36.7,36.8,36.9,37};
        for (int i = 0; i < 17; i++) {
            int a = (int)(Math.random()*12);
            System.out.println(temp[a]);
            // System.out.println(rand());
        }
    }
    // public static double rand() {
    //     return Math.random()*1.2+35.8;
    // }
}