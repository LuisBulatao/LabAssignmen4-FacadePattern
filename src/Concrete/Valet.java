package Concrete;

import Subsystem.HotelService;

public class Valet implements HotelService {

    private String plateNumber;

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public void parkVehicle(String plateNumber){
        System.out.println("The Front Desk send us to park/pick-up your car");
    }
    @Override
    public void HotelServices(){
        parkVehicle(plateNumber);
    }


}

