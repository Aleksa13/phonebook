package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Person extends Record {
    private final List<String> phone = new ArrayList<>();
    private String address;
    private String age;

    public List<String> getPhone() {
        return phone;
    }

    @Command
    public void addPhones(String... phones) {
        this.phone.addAll(Arrays.asList(phones));
    }

    public String getAddress() {
        return address;
    }

    @Command
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    @Command
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + phone + " " + address + " " + age;
    }
}