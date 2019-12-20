
/**
 * クラス Ex25 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
 import java.util.Arrays;
public class Ex25
{
   public static void main(String[]args){
       int [] n = {12,32,43,8,42,90};
       
       int i = 0;
       int j = 0;
       int[]n2 = new int[n.length];
        for( i = 0, j = n2.length - 1; i< n.length; i++,j--){
          n2[j] =n[i] ;
          
          
         }
       System.out.print(Arrays.toString(n2));  
   }
}
