package src.builder2;

public class Client {
    public static void main(String[] args) {
        F16Builder f16Builder = new F16Builder();
        IAircraft f16 = f16Builder.getResult();

        Boeing747Builder boeing747Builder = new Boeing747Builder();
        IAircraft boeing474 = boeing747Builder.getResult();
    }
}
