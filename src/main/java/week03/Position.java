package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private static final int MIN_WAGE = 400000;
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public static int getMinEage() {
        return MIN_WAGE;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position:" +
                "name = " + name +
                ", bonus = " + bonus;
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("Production Shiftleader", 380000));
        positions.add(new Position("Production Supervisor", 550000));
        positions.add(new Position("Production Junior Manager", 710000));
        positions.add(new Position("Production Manager", 950000));

        for (Position position : positions) {
            if (position.getBonus() > position.MIN_WAGE) {
                System.out.println(position.toString());
            }
        }
    }
}

