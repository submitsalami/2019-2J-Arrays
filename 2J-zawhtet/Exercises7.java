public class Exercises7{
    public static void main(String[] args){
        int [] n = new int[5];
        for(int i = 1; i <= n.length; i++){
          System.out.print(i * 2);
        }
        System.out.println(" ");
        for(int i = 2; i <= n.length + 1; i++){
            System.out.print(i * 2 -1);
        }
    }
}