public class CounterAbroad extends ParcelProcessor {
    @Override
    public void processParcel(Parcel parcel) {
        if (parcel.getDestination().equalsIgnoreCase("Abroad")) {
            System.out.println("Processing parcel for abroad");
        } else if (nextProcessor != null) {
            nextProcessor.processParcel(parcel);
        } else {
            System.out.println("No suitable counter found for the parcel.");
        }
    }
}