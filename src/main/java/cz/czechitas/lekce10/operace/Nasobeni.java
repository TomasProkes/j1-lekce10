package cz.czechitas.lekce10.operace;

/**
 * Operace násobení dvou čísel.
 *
 * @author Filip Jirsák
 */
public class Nasobeni implements Operace {
    private int a;
    private int b;

    @Override
    public void setA(int a) {
        OperaceHelper.validovatOperand(a);
        this.a = a;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setB(int b) {
        OperaceHelper.validovatOperand(b);
        this.b = b;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public int getPocetOperandu() {
        return 2;
    }

    @Override
    public String vypocet() {
        long vysledek = (long) a * (long) b;
        OperaceHelper.validovatVysledek(vysledek);
        return "%d ⋅ %d = %d".formatted(a, b, vysledek);
    }
}
