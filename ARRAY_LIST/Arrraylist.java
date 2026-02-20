import java.util.*;

//  unchecked unsafe ayega <> yeah nahi dnege toh 
public class Arrraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // tc of add is O(1);
        list.add(1,7);
        //  for this tc is O(n);
        System.out.println(list);
        
        // get
        System.out.println(list.get(3));
        
        //  remove
        System.out.println(list.remove(1));
        
        System.out.println(list);

        // update
        list.set(2,110);
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);


        //  triversing
        
        //  simple for loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //  for each loop
        for(int x: list){
            System.out.print(x +" ");
        }
    }
} 
