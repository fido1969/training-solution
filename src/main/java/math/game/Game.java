package math.game;

public class Game {

    public static void main(String[] args) {
        Warrior warriorOne = new Warrior("Joaschim",new Point(5,7));
        Warrior warriorOTwo = new Warrior("Kahles",new Point(1,9));

        System.out.println("Skill_one: "+warriorOne.getSkill());
        System.out.println("Skill_two: "+warriorOTwo.getSkill());

        for (int round = 1; warriorOne.isAlive() && warriorOTwo.isAlive(); round++) {
            System.out.println(round+". Round ");
            System.out.println(warriorOne);
            System.out.println(warriorOTwo);
            if (warriorOne.distance(warriorOTwo) > 0) {
                warriorOne.move(warriorOTwo);
                warriorOTwo.move(warriorOne);
            } else {
                warriorOne.attack(warriorOTwo);
                if (warriorOTwo.isAlive()) {
                    warriorOTwo.attack(warriorOne);
                }
            }
        }
        System.out.println("Winner: " + (warriorOne.isAlive() ? warriorOne : warriorOTwo));

    }
}
