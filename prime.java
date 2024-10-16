
public class prime {

    public static void main(String[] args) {
        
        int num  = 100 ;

        for (int i =   1; i < num; i++) {
            int count = 0 ;
            for (int j = 1; j < i; j++) {
                if (j%i==0) {
                    count++;
                }
            }
            if (count!=2) {
                System.out.println(i+"not");
            } else {
                System.out.println(i+"yes");
            }
        }
    }
    
}