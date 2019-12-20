
/**
 * クラス exercise25 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class ex25{
  public static void main(String[] args){
    int[] a = new int[]{12,32,43,8,42,90};
    int n=a.length;
    int[] b = new int[n];
    //reverse
    for(int i=0;i<n;i++){
    int temp=a[i];
    b[i]=a[n-i-1];
    a[i]=temp;
    System.out.println(b[i]);

    }
  }
}
