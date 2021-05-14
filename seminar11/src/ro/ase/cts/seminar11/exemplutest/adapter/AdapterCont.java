package ro.ase.cts.seminar11.exemplutest.adapter;

import ro.ase.cts.seminar11.exemplutest.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar {
    private double total = 500;

    @Override
    public void accountTransfer(BankAccount account, double amount) {
        if(account instanceof AdapterCont)
        	this.transfer((ContBancar)account, amount);
        else
        	throw new UnsupportedOperationException();
    }

    @Override
    public void transfer(ContBancar destinatie, double suma) {
        total -= suma;
        destinatie.depune(suma);
        System.out.println(suma + " de lei au fost transferati in " + destinatie + " -> AdapterCont");
    }

    @Override
    public void depune(double suma) {
        total += suma;
        System.out.println(suma + " de lei au fost adaugati in contul curent -> AdapterCont");
    }

    @Override
    public String toString() {
        return "AdapterCont{" +
                "total=" + total +
                '}';
    }
}
