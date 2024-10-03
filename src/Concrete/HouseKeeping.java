package Concrete;

import Subsystem.HotelService;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void cleaningRoom(int roomNumber){
        System.out.println("The Front Desk send us to clean your Room");
    }

    @Override
    public void HotelServices(){
        cleaningRoom(roomNumber);
    }


}
