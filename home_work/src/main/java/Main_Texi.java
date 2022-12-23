import public_transport.PublicTransport;
import public_transport.texi.Texi;

import java.util.Scanner;

public class Main_Texi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inPutData;
        int passenger = 0;
        int distance = 0;
        int addCharge = 0;
        int fuel = 0;
        PublicTransport texi1 = new Texi();
        PublicTransport texi2 = new Texi();
        texi1.create(1);
        texi2.create(2);
        while(true){
            System.out.println("a: 승객 태우기 \nb: 추가 요금확인\nc: 주유하기\nd: 내리기 및 요금결재\ne: 상태확인\nq: 종료하기");
            inPutData = scanner.nextLine();
            if(inPutData.equals("a")){
                if(fuel>=10){
                    System.out.println("몇명을 태울까요?");
                    inPutData = scanner.nextLine();
                    passenger += Integer.parseInt(inPutData);
                    texi1.correntPassenger(passenger);
                    if(((Texi) texi1).maxPassengerCoppy<passenger){
                        passenger -= Integer.parseInt(inPutData);
                    }else{
                        texi1.setCharge();
                        System.out.println("목적지를 입력하세요");
                        inPutData = scanner.nextLine();
                        System.out.println("목적지: " + inPutData);
                        System.out.println("거리를 입력하세요");
                        inPutData = scanner.nextLine();
                        System.out.println("목적지까지 거리: " + inPutData + "km");
                        distance = Integer.parseInt(inPutData);
                    }
                }else{
                    System.out.println("운행불가");
                    texi1.setFuel(fuel);
                }

            }
            if(inPutData.equals("b")){
                addCharge = ((Texi) texi1).addCharge(distance);
                System.out.println("추가요금: " + addCharge);
            }
            if(inPutData.equals("c")){
                System.out.println("주유량을 입력하세요");
                inPutData = scanner.nextLine();
                fuel += Integer.parseInt(inPutData);
                texi1.setFuel(fuel);
            }
            if(inPutData.equals("d")){
                System.out.println("손님이 내립니다.");
                int totalCharge = addCharge + texi1.charge;
                System.out.println("지불할 요금: " + totalCharge);
                passenger = 0;
            }
            if(inPutData.equals("e")){
                texi1.situation(passenger, fuel);
            }
            if(inPutData.equals("q")){
                break;
            }
        }
    }
}
