// Wrapper class sirf primitive ka hota hai 
//  wrapper class heap mai banta hai 

//  primitive --> non-primitive = autoboxing
//  primitive <-- non-primitive = Unboxing

// primitive = wrapper class(non-primitive)
// boolean = Boolean
// char = Character

// byte = Byte
// int = Integer
// short = Short
// long = Long

// float = Float
// double = Double

// cache
// byte,int,short,long  isme from range -128 to 127 tak value wapis nahi banti hai means duplicate nahi hoti hai same adrees par in banega 
// for boolean and char also no dulicate value banega same adress oar store hoga 
// integer a = 19;
// integer b = 19
// a==b true

import java.util.*;

public class wrapperclass {
    public static void main(String[] args) {
        Integer a1 = 10;
        int a = 10;
        System.out.println(a);
        System.out.println(a1);

        Integer b = a1; // Auto-Bosing
        int x = a; // Un-Boxing
    }
}
