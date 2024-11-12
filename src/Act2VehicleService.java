public class Act2VehicleService {
    private static final Act2VehicleService instance;
    private final IVehicleInspector inspector;
    
    static {
        String inspectorType = System.getProperty("vi");
        IVehicleInspector configuredInspector = VehicleFactory.getVehicleInspector(inspectorType);
        instance = new Act2VehicleService(configuredInspector);
    }
    
    private Act2VehicleService(IVehicleInspector inspector) {
        this.inspector = inspector;
    }
    
    public static Act2VehicleService getInstance() {
        return instance;
    }
    
    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles) {
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
}