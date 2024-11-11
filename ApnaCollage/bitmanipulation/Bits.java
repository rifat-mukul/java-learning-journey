package bitmanipulation;

public class Bits {
    public static void updateBit(int n, int bitMask) {
        int updateTo = 1;

        if (updateTo >= 0 && updateTo <= 1) {
            if (updateTo == 0) {
                clearBit(n, bitMask);
            } else {
                setBit(n, bitMask);
            }
        }

    }

    public static void clearBit(int n, int bitMask) {
        int notBitMask = ~(bitMask);
        System.out.println("New number after the position bit clear : "+ (notBitMask & n));
    }

    public static void setBit(int n, int bitMask) {
        int newNumber = bitMask | n;
        System.out.println("The bit is after bit mask : "+ newNumber);
    }

    public static void getBit(int n, int bitMask) {
        if ((bitMask & n) == 0 ) {
            System.out.println("Bit Mask was Zero");
        } else {
            System.out.println("Bit was One"); 
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1 << position;

        getBit(n, bitMask);
        setBit(n, bitMask);
        clearBit(n, bitMask);
        updateBit(n, bitMask);
    }
}
