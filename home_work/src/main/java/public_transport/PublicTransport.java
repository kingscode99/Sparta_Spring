package public_transport;

public abstract class PublicTransport{
    public int charge;

    public PublicTransport(int charge) {
        this.charge = charge;
    }

    public abstract void create(int num);
    public abstract void correntPassenger(int passenger);
    public abstract void setCharge(int passenger);
    public abstract void situation(int situation, int fuel);

    public void setFuel(int fuel) {
        if(fuel<10){
            System.out.println("주유량: " + fuel);
            System.out.println("주유가 필요합니다.");
        }else{
            System.out.println("주유량: " + fuel);
        }
    }
}