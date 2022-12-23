package public_transport.texi;

import public_transport.PublicTransport;

public class Texi extends PublicTransport {
    final int maxPassenger = 4;
    public int maxPassengerCoppy = maxPassenger;
    public int passenger;
    public Texi() {
        super(3000);
    }

    @Override
    public void create(int num) {
        System.out.println(num + "번 택시 객체 만들어짐");
    }

    @Override
    public void correntPassenger(int passenger) {
        this.passenger += passenger;
        if(maxPassenger - this.passenger>=0){
            System.out.println("탑승 승객 수: " + passenger + "\n" + "잔여 승객 수: "+ (maxPassenger - this.passenger));
        }else{
            System.out.println("최대 승객 수 초과");
            this.passenger -= passenger;
        }
    }

    @Override
    public void setCharge(int passenger) {
        System.out.println("기본 요금 확인: " + charge);
    }

    @Override
    public void situation(int passenger, int fuel) {
        if(passenger>0 && fuel>=10){
            System.out.println("운행중");
        }
        if(passenger==0 && fuel>=10){
            System.out.println("일반");
        }
        if(fuel<=0){
            System.out.println("운행불가");
        }
    }
    public int addCharge(int distance){
        int result = 0;
        result = (distance-1)*1000;
        return result;
    }
}
