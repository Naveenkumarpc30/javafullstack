public class s {
    public static void main(String[] args) {
        String s1 = "APPLE";
        String s2 = "apple";
        //ASCII Value
        char ch = 'm';
        int x =ch ;
        System.out.println(x);

        //comparTo()
        String s ="A";
        int i = s.compareTo("A");
        System.out.println(i);

        //HashCode()
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        

        
    }
    
}
