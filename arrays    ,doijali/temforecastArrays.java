
/**
 * Write a description of class temforecastArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class temforecastArrays
{
    public static void main(String[]args){
    double[] firstArrays = {26.0,24.5,22.3};
    double[] secondArrays = new double[firstArrays.length];
     for (int i=0; i<firstArrays.length; i++){
     secondArrays[i]=firstArrays[i];
     System.out.println(secondArrays[i]);
    }
    }
}