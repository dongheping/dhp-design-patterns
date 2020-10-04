package com.dhp.design.patterns.create.builder;

import lombok.ToString;

/**
 * 建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，
 * 使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
 * 它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。
 * 它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 */
@ToString
public class Car {
    private String steeringWheel;
    private String door;
    private String window;
    private String tire;
    private String seat;
    private String airConditioner;
    private String seatBelts;
    private String gasPedal;
    private String brake;
    private String trunk;

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public String getSeatBelts() {
        return seatBelts;
    }

    public void setSeatBelts(String seatBelts) {
        this.seatBelts = seatBelts;
    }

    public String getGasPedal() {
        return gasPedal;
    }

    public void setGasPedal(String gasPedal) {
        this.gasPedal = gasPedal;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public static CarBuilder Builder(){
        return new CarBuilder();
    }

    private static final class CarBuilder{
        private String steeringWheel;
        private String door;
        private String window;
        private String tire;
        private String seat;
        private String airConditioner;
        private String seatBelts;
        private String gasPedal;
        private String brake;
        private String trunk;

        public CarBuilder steeringWheel(String steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }

        public CarBuilder door(String door) {
            this.door = door;
            return this;
        }

        public CarBuilder window(String window) {
            this.window = window;
            return this;
        }

        public CarBuilder tire(String tire) {
            this.tire = tire;
            return this;
        }

        public CarBuilder seat(String seat) {
            this.seat = seat;
            return this;
        }

        public CarBuilder airConditioner(String airConditioner) {
            this.airConditioner = airConditioner;
            return this;
        }

        public CarBuilder seatBelts(String seatBelts) {
            this.seatBelts = seatBelts;
            return this;
        }

        public CarBuilder gasPedal(String gasPedal) {
            this.gasPedal = gasPedal;
            return this;
        }

        public CarBuilder brake(String brake) {
            this.brake = brake;
            return this;
        }

        public CarBuilder trunk(String trunk) {
            this.trunk = trunk;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.setTrunk(this.trunk);
            car.setAirConditioner(this.airConditioner);
            car.setBrake(this.brake);
            car.setDoor(this.door);
            car.setGasPedal(this.gasPedal);
            car.setSeat(this.seat);
            car.setSeatBelts(this.seatBelts);
            car.setTire(this.tire);
            car.setWindow(this.window);
            car.setSteeringWheel(this.steeringWheel);
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = Car.Builder().brake("座椅").trunk("尾箱").steeringWheel("方向盘").build();
        System.out.println("开始组装汽车:");
        System.out.println(car.toString());
    }
}
