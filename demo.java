public class demo{
    public static void main(String[] args) {
        //1.charAt()//
        String s1 ="I am Naveen Kumar";
        System.out.println(s1);
        char ch = s1.charAt(3);
        System.out.println(ch);

        //2.equals and equalsignoreCase//
        String s2 = "EAR";
        String s3= "ear";
        boolean b = s1.equals("Ear");
        System.out.println(b);
        System.out.println(s1.equalsIgnoreCase(s3));


        //3.contains & split 
        String s4 = "hello welcome to java";
        System.out.println(s4);
        boolean a = s4.contains("java");
        System.out.println(s4.length());
        String[] y = s4.split(" ");
        System.out.println(y.length);
         
        //for loop 
        for(int i =0; i<y.length;i++){
            System.out.println(y[i]);

        }

        //enhaced for loop 
        for (String k : y) {
            System.out.println(k);
        }

        //to uppercase and lower Case 
        String m = s2.toLowerCase();
        String s = s3.toUpperCase();
        System.out.println(m +"\n"+ s );

        //SubStrings
        String j = s1.substring(4);
        System.out.println(j);
        String k = s1.substring(4,11);
        System.out.println(k);

        //indexof() & lastindexOf()

        int  l = s1.indexOf("a");
        System.out.println(l);

        String s5 = "Hello World";
        int n = s5.lastIndexOf("o");

        System.out.println(n);

        //replace() & isEmpty()
        String p = s1.replace("I am", "Hello");
        System.out.println(p);
        boolean q = s1.isEmpty();
        System.out.println(q);

        //startsWith() & endawith()
        boolean r = s1.startsWith("Hello");
        boolean t = s1.endsWith("Kumar");












    }
}
