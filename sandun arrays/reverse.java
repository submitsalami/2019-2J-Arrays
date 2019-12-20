package box;


/**
 * クラス ex01 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
       
import java.util.Arrays; 
  
public class reverse
{  
   
    public static void main(String[] args) 
    { 
         int[] n = {12,32,43,8,42,90}; 
        for (int i=0;i<n.length;i++){
         System.out.print(n[i] + " ");
        }
        
        for (int j=n.length-1;j>=0;j--){
         System.out.print( n[j] + " ");
        }
    
    
    }
    
} 

