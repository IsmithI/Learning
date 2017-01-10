package Interfaces;


public class Player implements Options{


    @Override
    public void move() {

    }

    @Override
    public int hit(int damage) {
        return damage;
    }

    @Override
    public int getHit(int damage) {
        return damage;
    }
}
