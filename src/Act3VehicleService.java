public class Act3VehicleService {
    private static final Act3VehicleService instance;
    private final IVehicleInspector inspector;
    private final IEmissionsStrategy emissionsStrategy;

    static {
        String inspectorType = System.getProperty("vi");
        String emissionsType = System.getProperty("es");

        IVehicleInspector configuredInspector = VehicleFactory.getVehicleInspector(inspectorType);
        
        IEmissionsStrategy configuredStrategy;
        if ("one".equalsIgnoreCase(emissionsType)) {
            configuredStrategy = new OneEmissionsStrategy();
        } else if ("two".equalsIgnoreCase(emissionsType)) {
            configuredStrategy = new TwoEmissionStrategy();
        } else {
            configuredStrategy = new NullEmissionsStrategy();
        }

        instance = new Act3VehicleService(configuredInspector, configuredStrategy);
    }

    private Act3VehicleService(IVehicleInspector inspector, IEmissionsStrategy emissionsStrategy) {
        this.inspector = inspector;
        this.emissionsStrategy = emissionsStrategy;
    }

    public static Act3VehicleService getInstance() {
        return instance;
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle vehicle : vehicles) {
            total += emissionsStrategy.computeEmissionsFee(vehicle) + vehicle.accept(inspector);
        }
        return total;
    }
}
