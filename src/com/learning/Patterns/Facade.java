package com.learning.Patterns;

public class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
        computer.dvd.unload();
        computer.power.off();
    }
}

class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.CopyFromDVD(dvd);
    }
}

class Power {
    void on() {
        System.out.println("Turned on");
    }
    void off() {
        System.out.println("Turned off");
    }
}

class DVDRom {
    private boolean data = false;
    boolean hasData() {
        return data;
    }
    void load() {
        data = true;
    }
    void unload() {
        data = false;
    }
}

class HDD {
    void CopyFromDVD(DVDRom dvd) {
        if(dvd.hasData()) {
            System.out.println("Copying data from disk");
        }
        else {
            System.out.println("Enter disk");
        }
    }
}
