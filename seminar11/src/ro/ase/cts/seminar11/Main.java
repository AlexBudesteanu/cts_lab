package ro.ase.cts.seminar11;

import ro.ase.cts.seminar11.exemplutest.adapter.AdapterCont;
import ro.ase.cts.seminar11.exemplutest.adapter.BankAccount;
import ro.ase.cts.seminar11.exemplutest.factory.ContBancar;
import ro.ase.cts.seminar11.exemplutest.singleton.SingleBanca;
import ro.ase.cts.seminar11.state.Gate;

public class Main {

	public static void main(String[] args) {
		
		Gate securedGate = new Gate();
		securedGate.authorize();
		securedGate.enter();
		securedGate.enter();
		 
		System.out.println("-----------------------------------------------------");

        SingleBanca singleBanca = SingleBanca.getInstance("BCR", "Centru");

        ContBancar contBancar1 = singleBanca.createInstance("CREDIT");

        ContBancar contBancar2 = singleBanca.createInstance("DEBIT");
        BankAccount bankAccount = new AdapterCont();
        System.out.println(SingleBanca.NRCONTURI);


        ContBancar adapterCont = new AdapterCont();
        System.out.println(adapterCont);

        adapterCont.transfer(contBancar1, 200);
        System.out.println(adapterCont);

        adapterCont.depune(500);
        System.out.println(adapterCont);

        ((BankAccount) adapterCont).accountTransfer(bankAccount, 600);
        System.out.println(adapterCont);
	}

}
