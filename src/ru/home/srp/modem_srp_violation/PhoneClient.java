package ru.home.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.dial("12345678");
        phone.send("message text");
        phone.receive();
        phone.disconnect();


    }
}
