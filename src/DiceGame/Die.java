package DiceGame;

import java.util.Random;

class Die {

    // roll the die and return the value (1-6)
    int roll() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }

    // roll the die n times and print the values
    void rollMultiple(int n) {
        for (int i = 0 ; i < n ; i++) {
            System.out.print(roll() + " ");
        }
    }
}
