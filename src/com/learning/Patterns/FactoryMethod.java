package Patterns;


import java.util.Date;

public class FactoryMethod {
    public  static void main(String[] args) {
        WatchMaker maker = new RomanWatchmaker();
        Watch watch = maker.createWatch();
        watch.showTime();

        WatchMaker digitMaker = new DigitalWatchmaker();
        watch = digitMaker.createWatch();
        watch.showTime();
        watch.setTime();
    }
}

interface Watch {
    void showTime();
    void setTime();
}

class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }

    @Override
    public void setTime() {
        System.out.println("Time is set!");
    }

}

class RomanWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XV");
    }

    @Override
    public void setTime() {
        System.out.println("Time is set!");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchmaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomanWatchmaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomanWatch();
    }
}