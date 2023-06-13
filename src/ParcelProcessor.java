abstract class ParcelProcessor {
    protected ParcelProcessor nextProcessor;

    public void setNextProcessor(ParcelProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void processParcel(Parcel parcel);
}