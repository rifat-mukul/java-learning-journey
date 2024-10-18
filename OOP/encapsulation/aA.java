package encapsulation;

public class aA {
    private int num;
    private String nameString;
    int[] arr;

    public aA(int num, String nameString) {
        this.num = num;
        this.nameString = nameString;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public String getNameString() {
        return nameString;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
