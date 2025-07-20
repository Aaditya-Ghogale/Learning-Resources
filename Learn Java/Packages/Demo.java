import com.learn.java.packages.*;
import com.learn.java.db.B;
class Demo {
public static void main(String[] args) {
     C c = new C();
    
    A a = new A();
    a.show();
    B b = new B();
    b.show();//prints zero as num is uninitiated in A and default val is zero and B inherits A
}}
