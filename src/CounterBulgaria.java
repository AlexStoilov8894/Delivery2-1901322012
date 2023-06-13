public class CounterBulgaria extends ParcelProcessor {
    @Override
    public void processParcel(Parcel parcel) {
        if (parcel.getDestination().equalsIgnoreCase("Bulgaria")) {
            System.out.println("Processing parcel for Bulgaria");
        } else if (nextProcessor != null) {
            nextProcessor.processParcel(parcel);
        } else {
            System.out.println("No suitable counter found for the parcel.");
        }
    }
}