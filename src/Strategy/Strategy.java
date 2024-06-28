package Strategy;

//public class Strategy {
//}
interface PaymentStrategy{
    void pay(int amount);
}
class CreditCard implements PaymentStrategy{
    private int cardno;
    private String name;

    public CreditCard(int cardno,String name) {
        this.cardno = cardno;
        this.name=name;
    }
    public void pay(int amount){
        System.out.println("Sir "+name+" with Card no. : "+cardno+" paid Rs: "+amount);
    }
}
class UPI implements PaymentStrategy{
    private String name;
    private String upiid;
    public UPI(String name, String upiid){
        this.upiid=upiid;
        this.name=name;
    }
    public void pay(int amount){
        System.out.println("Sir "+name +" with UPI id " +upiid+" paid Rs: "+amount);
    }
}


class Cart{
    private PaymentStrategy payStrategy;
    public void setPayStrategy(PaymentStrategy payStrategy){
        this.payStrategy=payStrategy;
    }
    public void checkout(int amount) {
        payStrategy.pay(amount);
    }
}