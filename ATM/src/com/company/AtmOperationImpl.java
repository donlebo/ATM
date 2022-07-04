package com.company;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{

    ID id = new ID();
    ATM atm = new ATM();
    Map<String, Double> registro = new HashMap<>();

    @Override
    public void visualizzaSaldo() {
        System.out.println("\nIl saldo disponibile sulla carta è: " + atm.getSaldo() + "€");
    }

    @Override
    public void prelievo(double prelievo) {
        if (prelievo <= atm.getSaldo()){
            registro.put(id.setUniqueID(), prelievo);
            System.out.println("\nRitira i " + prelievo + "€ entro 30 secondi");
            atm.setSaldo(atm.getSaldo() - prelievo);
            visualizzaSaldo();
        } else {
            System.out.println("\nSaldo insufficiente per effettuare qesto prelievo.");
            visualizzaSaldo();
        }

    }

    @Override
    public void deposito(double deposito) {
        registro.put(id.setUniqueID(), deposito);
        System.out.println("\nDeposito di " +deposito + "€ effettuato con successo.");
        atm.setSaldo(atm.getSaldo() + deposito);
        visualizzaSaldo();
    }

    @Override
    public void transazioniRecenti() {
        for(Map.Entry<String, Double> r:registro.entrySet()) {
            System.out.println("");
            System.out.println("Transazione di " + r.getValue() + " in data " + r.getKey());
        }
    }
}
