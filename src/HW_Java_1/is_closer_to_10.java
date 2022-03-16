package HW_Java_1;

public class is_closer_to_10 {
    public static void main(String[] args) {
    double m = 8.5;
    double n = 11.1;
        double m_one = Math.abs(m - 10);
        double n_one = Math.abs(n - 10);
        if (m_one > n_one){
            System.out.println("Number n is closer to ten");
        } else if (m_one < n_one){
            System.out.println("Number m is closer to ten");
        } else {
            System.out.println("Numbers n and m are equally close to ten");
        }
    }
}
