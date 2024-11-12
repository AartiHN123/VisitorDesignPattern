public class TwoEmissionStrategy implements IEmissionsStrategy {
    @Override
    public int computeEmissionsFee(IVehicle vehicle) {
        return Math.min((int)(vehicle.co2Emissions() - 1100), 10);
    }
}
