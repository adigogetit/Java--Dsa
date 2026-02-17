public class primitive {
    public static void main(String[] args) {
        
        byte b =127;
        short s =5;
        int i =5;
        long l =50000000000l;   // iska type cast kiya hai l nahi lagat toh woo int jaise behave karta l laga diya toh woo long ban gaya 

        
        float f = 99.9f;

        boolean bo = true;

        char ch = 'a';
        // inplicit typecasting
        ch+=1;  //  ch = (char)(ch+1)
        ch++;  //  ch = (char)(ch+1)

        // a--> 97
        // A --> 65
        // 0 to 9 --> 48 to 58

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(bo);
        System.out.println(ch);
    }
}

// byte -- 1 byte = 8 bites   range -   -128(-2^7) to 127(2^7-1)  total 256
// short -- 2 byte = 16 bit   range -   -2^15 to 2^15*-1
// int  -- 4 byte = 32 bit    range -   -2^31 to 2^31*-1
// long  -- 8 byte = 64 bit   range -   -2^63 to 2^63*-1

// float 4 byte = 32 bit
// double 8 byte = 64 bit
 
// char 2 byte = 16 bit
// boolean 1 bit 