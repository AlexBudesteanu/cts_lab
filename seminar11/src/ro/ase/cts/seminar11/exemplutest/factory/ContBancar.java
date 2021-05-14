package ro.ase.cts.seminar11.exemplutest.factory;

public interface ContBancar {
    void transfer(ContBancar destinatie, double suma);

    void depune(double suma);
}
