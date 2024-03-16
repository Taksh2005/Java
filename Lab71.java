abstract class Veg{
    String color;
    Veg(String color){
        this.color = color;
    }
    abstract void printColor();
}
class Potato extends Veg{
    Potato(String color){
        super(color);
    }
    void printColor(){
        System.out.println("Potato: "+this.color);
    }
}
class Brinjal extends Veg{
    Brinjal(String color){
        super(color);
    }
    void printColor(){
        System.out.println("Brijal: "+this.color);
    }
}
class Tomato extends Veg{
    Tomato(String color){
        super(color);
    }
    void printColor(){
        System.out.println("Tomato: "+this.color);
    }
}

public class Lab71 {
    public static void main(String[] args) {
        
        Tomato T1 = new Tomato("red");
        Brinjal B1 = new Brinjal("purple");
        Potato P1 = new Potato("Yellow");
        
        T1.printColor();
        B1.printColor();
        P1.printColor();
    }
    
}
