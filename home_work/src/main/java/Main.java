import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inPutData;
        int fuel = 0;
        int passenger = 0;
        PublicTransport bus1 = new Bus();
        bus1.create(1);
        PublicTransport bus2 = new Bus();
        bus2.create(2);
        while(true){
            System.out.println("a: 승객 태우기 \nb: 요금확인\nc: 주유하기\nd: 상태변경\nq: 종료하기");
            inPutData = scanner.nextLine();
            if(inPutData.equals("a")){
                System.out.println("몇명을 태울까요?");
                inPutData = scanner.nextLine();
                passenger += Integer.parseInt(inPutData);
                bus1.correntPassenger(passenger);
                if(((Bus) bus1).maxPassengerCoppy<passenger){
                    passenger -= Integer.parseInt(inPutData);
                }
            }
            if(inPutData.equals("b")){
                bus1.setCharge();
            }
            if(inPutData.equals("c")){
                System.out.println("주유량을 입력하세요");
                inPutData = scanner.nextLine();
                bus1.setFuel(Integer.parseInt(inPutData));
                fuel = Integer.parseInt(inPutData);
            }
            if(inPutData.equals("d")){
                System.out.println("변경하실 상태를 선택하세요\n1: 운행중\n2: 차고지 행");
                inPutData = scanner.nextLine();
                bus1.situation(Integer.parseInt(inPutData), fuel);
            }
            if(inPutData.equals("q")){
                break;
            }
        }
    }
}
