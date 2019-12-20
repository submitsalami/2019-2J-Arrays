
/**
 * クラス reverse の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/11/01)
 */
public class reverse{
    public static void main(String[] args){
         String s = fruit("banana");
         System.out.println(s);
    }
    public static String fruit(String s){
        String r = " ";
        for(int i = s.length()-1;i >= 0;i--){
             r = r+s.charAt(i);
        }
        return r;
   }
}

