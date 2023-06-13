public class Office {
    private static Office instance;

    private Office() {
    }

    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void processParcel(Parcel parcel) {
        CounterPlovdiv counterPlovdiv = new CounterPlovdiv();
        counterPlovdiv.processParcel(parcel);
    }
}
