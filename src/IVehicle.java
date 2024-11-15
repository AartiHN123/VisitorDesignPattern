public interface IVehicle {
    // Every vehicle that has gone under a full service
    // is supposed to let the Vehicle Inspector to calculate
    // the total Service Charge.
    float co2Emissions();
    int accept(IVehicleInspector vehicleInspector);
}
