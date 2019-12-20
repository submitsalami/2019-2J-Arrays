
/**
 * Write a description of class thirdvalues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 import java.util.Arrays;
public class printhirdvalues
{
    public static void main(String[]args){
    double[] first2Values = {26.0,24.5};
    double[] thirdArrays = new double [first2Values.length];
    for (int i=0; i<first2Values.length; i++){
     thirdArrays[i]= first2Values[i];
     System.out.println(thirdArrays[i]);
    }
 }
}