
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class Test {

   
    public static void main(String[] args) {
        A a1 = A.getA(10);
        A a2 = A.getA(50);
        A a3 = A.getA(10);

        System.out.println(a1==a2);
        System.out.println(a1==a3);
    }
}
class A{
    int i;
    
    private static final HashMap<String,A> POOL = new HashMap<>();
    public A(int i){
        this.i = i;
    }
    public static A getA(int i){
        
        A a = POOL.get(String.valueOf(i));
        
        if(a==null){
         a = new A(i);
        POOL.put(String.valueOf(i), a);
        
    }
    return a;
}
}

    

