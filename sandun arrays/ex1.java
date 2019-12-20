package box;


import java.awt.Rectangle;



public class ex1{

    public static void main(String []args){
        //create rectangle
        Rectangle box =new Rectangle(2,5,10,20);
        //print box
        System.out.println(box);
        //box rectangle
        Rectangle box2=box;
        System.out.println(box2);
        //use rectangle
        box.translate(50,100);
        //print box after the translate
        System.out.println(box);
        //print box2 after translate
        System.out.println(box2);
    }
}
