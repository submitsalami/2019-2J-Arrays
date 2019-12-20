
/**
 * Write a description of class Ex26 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Ex26{
    public static void main(String[]args){
        int[] n = {4,75,23};
              int max = n[0];
              int min = n[0];

         for (int i = 0; i < n.length; i++) {
           if (n[i] > max) {
            max = n[i];
           }
           if (n[i] < min) {
            min = n[i];
           }
        }
        System.out.println(max);
        System.out.print(min);
    }
}