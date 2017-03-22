package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private final List<String> phone = new ArrayList<>();
    private String address;
    private String age;

    public Record() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void addPhones(String... phones) {
        this.phone.addAll(Arrays.asList(phones));
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + address + " " + age;
    }
}