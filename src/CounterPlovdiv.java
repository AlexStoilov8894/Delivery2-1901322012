public class CounterPlovdiv extends ParcelProcessor {
    @Override
    public void processParcel(Parcel parcel) {
        if (parcel.getDestination().equalsIgnoreCase("Plovdiv")) {
            System.out.println("Processing parcel for Plovdiv");
        } else if (nextProcessor != null) {
            nextProcessor.processParcel(parcel);
        } else {
            System.out.println("No suitable counter found for the parcel.");
        }
    }
}