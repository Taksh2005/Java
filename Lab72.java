interface A{
    int a = 0;
    public void printa();
}
interface A1 extends A{
    int a1 = 1;
    public void printa1();
}
interface A2 extends A{
    int a2 = 2;
    public void printa2();
}
interface A12 extends A1, A2{
    int a12 = 12;
    public void printa12();
}
class B implements A12{
    public void printa(){System.out.println(a);}
    public void printa1(){System.out.println(a1);}
    public void printa2(){System.out.println(a2);}
    public void printa12(){System.out.println(a12);}
}
public class Lab72 {
    public static void main(String[] args) {
        B b1 = new B();
        
        b1.printa();
        b1.printa1();
        b1.printa2();
        b1.printa12();
    }
    
}
