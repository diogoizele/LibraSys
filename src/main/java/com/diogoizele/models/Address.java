package main.java.com.diogoizele.models;

public record Address(String street, String number, String neighbor, String postalCode, String state, String Country) {

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", neighbor='" + neighbor + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
