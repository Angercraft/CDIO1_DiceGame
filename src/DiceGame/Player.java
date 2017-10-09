package DiceGame;

public class Player {

    private String name = "Player";
    private int score = 0;
    private int lastThrowD1 = 0;
    private int lastThrowD2 = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLastthrowD1() {
        return lastThrowD1;
    }

    public void setLastthrowD1(int lastThrowD1) {
        this.lastThrowD1 = lastThrowD1;
    }

    public int getLastthrowD2() {
        return lastThrowD2;
    }

    public void setLastthrowD2(int lastThrowD2) {
        this.lastThrowD2 = lastThrowD2;
    }
}
