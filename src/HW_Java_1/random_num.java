package HW_Java_1;

public class random_num {
    public static void main(String[] args) {
        int start = 100;
        int stop = 999;
        int random_n = start + (int) (Math.random() * stop);

        int rn1 = random_n%1000/100;
        int rn2 = random_n/10%10;
        int rn3 = random_n%10;
        if (rn1>=rn2 & rn1>=rn3){
            System.out.println(random_n);
            System.out.println(rn1);
        } else if (rn2>=rn1 & rn2>=rn3){
            System.out.println(random_n);
            System.out.println(rn2);
        } else if (rn3>=rn1 & rn3>=rn2){
            System.out.println(random_n);
            System.out.println(rn3);
        }
    }
}
