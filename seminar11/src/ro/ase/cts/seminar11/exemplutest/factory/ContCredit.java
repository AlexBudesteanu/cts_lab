package ro.ase.cts.seminar11.exemplutest.factory;

public class ContCredit implements ContBancar {
    private double total = 1000;

    @Override
    public void transfer(ContBancar destinatie, double suma) {
        total -= suma;
        destinatie.depune(suma);
        System.out.println(suma + " de lei au fost adaugati in " + destinatie + " -> Credit");

    }

    @Override
    public void depune(double suma) {
        total += suma;
        System.out.println(suma + " de lei au fost adaugati in contul curent -> Credit");
    }

    @Override
    public String toString() {
        return "ContCredit{" +
                "total=" + total +
                '}';
    }
}
