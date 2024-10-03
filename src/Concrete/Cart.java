package Concrete;
import Subsystem.HotelService;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    public void luggageCart(int numberOfCarts) {
        System.out.println("The Front Desk send us to help you with your luggage");
    }

    @Override
    public void HotelServices(){
        luggageCart(numberOfCarts);
    }

}
