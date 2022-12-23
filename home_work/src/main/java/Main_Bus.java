import public_transport.bus.Bus;
import public_transport.PublicTransport;

import java.util.Scanner;

public class Main_Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inPutData;
        int fuel = 100;
        //1번 버스객체 생성
        PublicTransport bus1 = new Bus();
        bus1.create(1);
        //2번 버스객체 생성
        PublicTransport bus2 = new Bus();
        bus2.create(2);
        //승객 2명 탑승
        //승객이 2명일때 잔여좌석 확인 메소드
        bus1.correntPassenger(2);
        //요금확인 메소드
        bus1.setCharge(((Bus) bus1).checkPassenger());
        //주유량 -50
        fuel -= 50;
        bus1.setFuel(fuel);
        //상태변경
        System.out.println("변경할 상태를 선택하시오\n1: 운행중\n2: 차고지행");
        inPutData = scanner.nextLine();
        bus1.situation(Integer.parseInt(inPutData), fuel);
        //주유량 +10
        fuel += 10;
        bus1.setFuel(fuel);
        //승객 45명 탑승
        bus1.correntPassenger(45);
        //승객 5명 탑승
        bus1.correntPassenger(5);
        //요금확인
        bus1.setCharge(((Bus) bus1).checkPassenger());
        //주유량 = 5
        fuel = 5;
        bus1.setFuel(fuel);


        /*while(true){
            System.out.println("a: 승객 태우기 \nb: 요금확인\nc: 주유하기\nd: 상태변경\nq: 종료하기");
            inPutData = scanner.nextLine();
            if(inPutData.equals("a")){
                System.out.println("몇명을 태울까요?");
                inPutData = scanner.nextLine();
                bus1.correntPassenger(Integer.parseInt(inPutData));
            }
            if(inPutData.equals("b")){
                bus1.setCharge(((Bus) bus1).checkPassenger());
            }
            if(inPutData.equals("c")){
                System.out.println("주유량을 입력하세요");
                inPutData = scanner.nextLine();
                fuel += Integer.parseInt(inPutData);
                bus1.setFuel(fuel);
            }
            if(inPutData.equals("d")){
                System.out.println("변경하실 상태를 선택하세요\n1: 운행중\n2: 차고지 행");
                inPutData = scanner.nextLine();
                bus1.situation(Integer.parseInt(inPutData), fuel);
            }
            if(inPutData.equals("q")){
                break;
            }
        }*/
    }
}
