public class Pies extends Zwierze {
    String imie;

    public Pies(String imie) {
        this.imie = imie;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau hau");
    }
}
