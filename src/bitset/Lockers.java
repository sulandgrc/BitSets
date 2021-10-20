package bitset;

import java.util.BitSet;

public class Lockers {

    private static final int LOCKERS = 50;
    public static void main(String[] args) {

        BitSet lockers = new BitSet(LOCKERS);

        // student 1
        for (int i = 0; i < LOCKERS ; i++) {
            // open all lockers
            lockers.set(i);

        }

        // student 2 - closing every other locker - inverting
        for (int i = 0; i < LOCKERS ; i+=2) {

        }

        // student 3
        for (int i = 0; i < LOCKERS ; i+=3) {

        }

        // student 4.. student 50

    }
}
