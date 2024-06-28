package Singleton;

public class main {
    public static void main(String[] args){
        Singleton a=Singleton.getInstance("One");
        System.out.println(a);
        Singleton b=Singleton.getInstance("Two");
        System.out.println(b);
        System.out.println(a==b);
    }
}
