package bitset;

public class Bits {

    private int bits; // 32 bits

    // java would put a default constructor for us automatically
    public Bits(){
        bits = 0;
    }

    /**
     * Set the bit to 1 or true
     * @param bit a position number 0 to 31
     */
    public void set(int bit){
        // create a mask with 1 in the 'bit's' place
        int mask = 1 << bit;
        // bitwise or with our data field bits
        bits = bits | mask;
    }

    /**
     *
     * @param bit a position number 0 to 31
     * @return Return true if bit is 1, false otherwise
     * bit number      3210
     * examples: 1010 1010
     * get(3)
     */
    public boolean get(int bit){
        int mask = 1 << bit; //  0000 1000 mask
                             //& 1010 1010 bits
                             //  0000 1000 answer
        return ((mask & bits) == mask);
    }

    /**
     * Set the bit position to false or 0
     * @param bit a position number from 0 to 31
     */
    public void clear(int bit){
        // mask with 1 in the bit position - use shift
        int mask = 1 << bit;
        // invert the mask
        mask = ~mask;
        // bitwise and the mask with the data(bits)
        bits = bits & mask;
    }

}
