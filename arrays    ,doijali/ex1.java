
/**
 * Write a description of class ex1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ex1
{
    public static void main(String[]args){
      double []scores = new double [3];
      double[]grades = {98.2,22.4,30.0};
      grades[0]=98.2;
      grades[1]=22.4;
      
    for (int i = 0; i <= 2; i++){
     scores[i] = grades[i] ;
     System.out.println(scores[i]);
    }
  } 
}