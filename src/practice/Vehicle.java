package practice;

public class Vehicle {
    double speed;
    int power;
    void speedUp(int s) {
        speed = speed + s;
    }
    void speedDown(int d) {
        speed=speed-d;
    }
    void setpower(int p){
        power=p;
    }
    int getpower() {
        return power;
    }
    double getspeed(){
        return speed;
    }

    public static class User {
        public static void main(String args[]){
            Vehicle car1,car2;
            car1=new Vehicle();
            car2=new Vehicle();
            car1.setpower(128);
            car2.setpower(76);
            System.out.println("car1的功率是:"+car1.getpower());
            System.out.println("car2的功率是:"+car2.getpower());
            car1.speedUp(80);
            car2.speedUp(100);
            System.out.println("car1目前的速度:"+car1.getspeed());
            System.out.println("car2目前的速度:"+car2.getspeed());
            car1.speedDown(10);
            car2.speedDown(20);
            System.out.println("car1目前的速度:"+car1.getspeed());
            System.out.println("car2目前的速度:"+car2.getspeed());
        }
    }
}
