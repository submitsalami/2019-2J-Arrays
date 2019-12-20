
/**
 * クラス ex26 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class ex26{
    public static void main(String[] args){
      int [] n = {4,75,23,18,11,98};
      Arrays.sort(n);
      System.out.println("Minimum = " + n[0]);
      System.out.println("Maximum = " + n[n.length-1]);
    }
 }
