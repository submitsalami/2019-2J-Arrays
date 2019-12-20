
/**
 * Write a description of class review2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class review2
{
   public static void main(String[]args){
    int [] number = {2,4,6,8,10};
      for(int i=0; i<=4; i++){
       
       
      System.out.print (number[i]);
    }System.out.println();
     for(int i=0; i<=4; i++){
     System.out.print(number[i]+1);
    }System.out.println();
    for(int i=0; i<=4; i++){
         number [i]=(number[i]+1);
     System.out.print(number[i]*2);
    
    }System.out.println();
    for(int i=0; i<=4; i++){
        number [i]=number[i]*2;
    System.out.print(number[i]/2);
    }System.out.println();
    for(int i=0; i<=4; i++){
         number [i]=number[i]/2;
     System.out.print(number[i]-1);
    }
 } 
}
