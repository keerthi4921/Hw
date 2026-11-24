abstract class Delivery{
    void  acceptOrder() {
        System.err.println("Delivery order accepted");
    }
    abstract void deliverProduct();
}
class FoodDelivery extends  Delivery{
    @Override
    void deliverProduct(){
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    @Override
    void deliverProduct(){
        System.out.println("Parcel delivered successfully");
    }
    
}
public class Order {
    public static void main(String[] args) {
        FoodDelivery f=new FoodDelivery();
        ParcelDelivery p=new ParcelDelivery() ;
        f.acceptOrder();
        f.deliverProduct();
        p.acceptOrder();
        p.deliverProduct();

    }
    
}
