public class string {
    

    public static void main(String args[]){

        String n =new String("hello");
        String n1 = new String("WORLD");
        System.out.println(n.length());
        System.out.println(n.substring(1,3));
        System.out.println(n.concat(n1));
        System.out.println(n.equals(n1));
        System.out.println(n==n1);
        System.out.println(n1.trim());
        System.out.println(n1.compareTo(n));
        System.out.println(n.toUpperCase());
        System.out.println(n1.toLowerCase());
        n1.replace('W', 'B');
        System.out.println(n1);
        System.out.println(n1.repeat(5));
        System.out.println(n1.charAt(3));

    }
}
