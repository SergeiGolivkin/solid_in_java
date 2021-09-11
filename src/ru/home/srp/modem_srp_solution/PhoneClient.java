package ru.home.srp.modem_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(),new DataManagerImpl());

        phone.dial("12345678");
        phone.send("message text");
        phone.receive();
        phone.disconnect();
    }
}
