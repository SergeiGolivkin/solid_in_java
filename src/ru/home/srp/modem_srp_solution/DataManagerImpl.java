package ru.home.srp.modem_srp_solution;

public class DataManagerImpl implements IDataManager {
    @Override
    public void send(String message) {
        System.out.println("data send");
    }

    @Override
    public int receive() {
        System.out.println("data received");
        return 0;
    }
}
