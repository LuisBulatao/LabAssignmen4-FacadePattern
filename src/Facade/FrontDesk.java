package Facade;
import Concrete.*;
import Subsystem.*;
public class FrontDesk {
    public void pickUpVehicle(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.HotelServices();
    }

    public void cleanRoom(int roomNumber) {
        HotelService hk = new HouseKeeping(roomNumber);
        hk.HotelServices();
    }

    public void requestCart(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.HotelServices();
    }
}
