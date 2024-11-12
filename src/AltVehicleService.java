public class AltVehicleService {
    IVehicleInspector inspector;

    AltVehicleService(String prop) {
        inspector = VehicleFactory.getVehicleInspector(prop);
    }
    
    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
}