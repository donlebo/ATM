package com.company;

public class ATM {
    private double saldo, deposito, prelievo;

    public ATM() {}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito(String s) {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getPrelievo() {
        return prelievo;
    }

    public void setPrelievo(double prelievo) {
        this.prelievo = prelievo;
    }
}