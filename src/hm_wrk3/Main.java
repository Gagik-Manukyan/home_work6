package hm_wrk3;

public class Main {
    public static void main(String[] args){
        int x = 0;
        int y = 100;
        int z = x + (int) (Math.random() *y);
        System.out.println("Случайное число " + z);
        if((z%2)==0){
            System.out.println("Число " + z + " четное ");
        } else{
            if(z%1==0){
                System.out.println("Число " + z + " нечетное ");
            }
        }
    }
}

