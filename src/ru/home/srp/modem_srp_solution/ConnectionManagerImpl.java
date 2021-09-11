package ru.home.srp.modem_srp_solution;

public class ConnectionManagerImpl implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }
}
