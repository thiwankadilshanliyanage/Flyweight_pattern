
import java.util.HashMap;
public class optional_system {

   
    public static void main(String[] args) {
        A a1 = AFactory.getA(10);
        A a2 = AFactory.getA(50);
        A a3 = AFactory.getA(10);

        System.out.println(a1==a2);
        System.out.println(a1==a3);
    }
}
class AFactory{
    int i;
    
    private static final HashMap<String,A> POOL = new HashMap<>();
    public static A getA(int i){
        
        A a = POOL.get(String.valueOf(i));
        
        if(a==null){
         a = new A(i);
        POOL.put(String.valueOf(i), a);
        
    }
    return a;
}
}

    

