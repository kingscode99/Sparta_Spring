public abstract class PublicTransport implements SetFuel{
    int charge;

    public PublicTransport(int charge) {
        this.charge = charge;
    }

    abstract void create(int num);
    abstract void correntPassenger(int passenger);
    abstract void setCharge();
    abstract void situation(int situation, int fuel);
}