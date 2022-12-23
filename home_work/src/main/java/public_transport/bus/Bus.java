package public_transport.bus;

import public_transport.PublicTransport;

public class Bus extends PublicTransport {
    final int maxPassenger = 30;
    public int maxPassengerCoppy = maxPassenger;

    public Bus() {
        super(1500);
    }

    @Override
    public void create(int num) {
        System.out.println(num + "번 버스 객체 만들어짐");
    }

    @Override
    public void correntPassenger(int passenger) {
        if(maxPassenger - passenger>=0){
            System.out.println("탑승 승객 수: " + passenger + "\n" + "잔여 승객 수: "+ (maxPassenger - passenger));
        }else{
            System.out.println("최대 승객 수 초과");
        }
    }

    @Override
    public void setCharge() {
        System.out.println("요금 확인: " + charge);
    }

    @Override
    public void situation(int situation, int fuel) {
        if(situation == 1 && fuel>=10){
            System.out.println("운행중");
        }
        if(situation == 2){
            System.out.println("차고지 행");
        }
        if(fuel<10){
            System.out.println("연료가 부족하여 차고지행으로 변경됩니다.");
            System.out.println("차고지 행");
        }
    }
}