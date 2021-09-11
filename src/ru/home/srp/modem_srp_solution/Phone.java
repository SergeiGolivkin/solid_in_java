package ru.home.srp.modem_srp_solution;

public class Phone implements IConnectionManager,IDataManager {

    private IConnectionManager connection;
    private IDataManager data;

    public Phone(IConnectionManager connection, IDataManager data) {
        this.connection = connection;
        this.data = data;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);

    }

    @Override
    public void disconnect() {
        connection.disconnect();

    }

    @Override
    public void send(String message) {
       data.send(message);
    }

    @Override
    public int receive() {

        return data.receive();
    }
}
