package bitset;

public class BitTester {

    public static void main(String[] args) {
        Bits bits = new Bits();

        bits.set(3);
        System.out.println("Expect True: "+ bits.get(3));

        bits.set(2);
        System.out.println("Expect True: "+ bits.get(2));

        bits.clear(2);
        System.out.println("Expect False: "+ bits.get(2));
    }
}
