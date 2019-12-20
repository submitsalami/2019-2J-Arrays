
/**
 * Write a description of class Ex27 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex27
{
   public static void main(String[]args){
       double[]n ={45.0,76.0,23.0,8.0,12.0,1.0};
       System.out.println(average(n)/n.length);
    }
    public static double average(double[]number){
        double sum = 0;
        for(int i = 0; i < number.length;i++){
            double sum1 = (sum+= number[i]);
            double average = (sum1);
      }
      return sum;
   }
}
