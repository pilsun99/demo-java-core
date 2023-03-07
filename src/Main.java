import java.util.*;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //singleton design pattern
        /*Calendar calc = Calendar.getInstance();
        System.out.println(calc.get(Calendar.MONTH)+1);
        System.out.println(calc.get(Calendar.DAY_OF_MONTH));
        System.out.println(calc.get(Calendar.DAY_OF_WEEK));*/
        /*Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getMonth()+1);*/

        Random random = new Random();
        //System.out.println(random.nextFloat() * 100);//0-100
        System.out.println(random.nextFloat() * (100 - 20)+20);//0*80+20=20, 1*80+20=100, 0.5*80+20=60, 0.2*80+20=36
    }
}
