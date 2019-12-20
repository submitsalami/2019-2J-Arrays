
/**
 * Write a description of class review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class review
{
    public static void main(String[]args){
    int [] number = {2,4,6,8,10};
      for(int i=0; i<=4; i++){
       
       
      System.out.println ( number[i] + " value is " +number[i]);
    }System.out.println();
     for(int i=0; i<=4; i++){
     System.out.println(number[i]+" plus 1 is " + (number[i] + 1));
    }System.out.println();
    for(int i=0; i<=4; i++){
     System.out.println((number[i]+1) +" time 2 is equal to "+ ((number[i]+1)*2));
    
    }System.out.println();
    for(int i=0; i<=4; i++){
    System.out.println(((number[i]+1)*2)+" divided by 2 is " + ((number[i]+1)*2)/2);
    }System.out.println();
    for(int i=0; i<=4; i++){
     System.out.println((((number[i]+1)*2)/2)+" substract by 1 is " + ((((number[i]+1)*2)/2)-1));
    }
 }
}