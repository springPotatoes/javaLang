package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    //constant
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    //field
    public int flymode = NORMAL;

    @Override
    public void fly(){
        if(flymode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }
        else{
            //Airplane 객체의 fly()메소드 호출
            super.fly();
        }
    }
}
