public class array {
    public static int getRandom(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        int [][] new_array = {
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)},
                {getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99), getRandom(-99, 99)}
        };
        int max_num   = 0;
    for (int i = 0; i < new_array.length; i++){
        for ( int j=0; j < new_array[i].length; j++){
            System.out.println(new_array[i][j]);
            if (max_num < new_array[i][j]){
                max_num = new_array[i][j];
            }
        }
        }
        System.out.printf("Max number of the array is %d", max_num);
    }
}
