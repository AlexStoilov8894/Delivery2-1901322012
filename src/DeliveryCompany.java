public class DeliveryCompany {
    public static void main(String[] args) {
        Office office = Office.getInstance();
        Parcel parcel1 = new Parcel("Plovdiv");
        Parcel parcel2 = new Parcel("Bulgaria");
        Parcel parcel3 = new Parcel("Abroad");

        office.processParcel(parcel1);
        office.processParcel(parcel2);
        office.processParcel(parcel3);
    }
}