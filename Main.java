class Mobile{
    String brand;
    double price;

Mobile(){
    brand="Samsung";
    price=25000;}

    void displayDetails() {
        System.out.println("brand:"+brand);
        System.out.println("price:"+price);

    }

}

public class Main {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.displayDetails();
    }
    
}
