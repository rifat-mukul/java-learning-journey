package encapsulation;

public class Main2 {
    public static void main(String[] args) {
        aA obgAA = new aA(75, "devine");

        obgAA.setNum(55); 

        System.out.println(obgAA.getNum());
        System.out.println(obgAA.getNameString());
    }
}
