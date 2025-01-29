package pl.edu.pjwtsk.Shopee.Client;

public class Client {
    int clientID;
    double saldo;

    public Client(int clientID, double saldo) {
        this.clientID = clientID;
        this.saldo = saldo;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
