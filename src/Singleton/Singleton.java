package Singleton;

public final class Singleton {
    private static Singleton z;
    public String value;
    public Singleton(String value){
        this.value=value;
    }
    public static Singleton getInstance(String value){
        if(z==null){
            z=new Singleton(value);
        }
        return z;
    }
}
