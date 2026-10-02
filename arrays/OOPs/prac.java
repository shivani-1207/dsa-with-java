

public class prac {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);    
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip ;

    void setColor( String newColor){
        color = newColor ;
    }
    void setTip(int newTip){
        tip = newTip ;
    }
}
 
class Student{
    String name;
    int age ; 
    float percentage ;

    void calcPercentage(int phy ,int maths ,int chem){
        percentage = (phy + maths + chem) / 3.0f;
    }
}
