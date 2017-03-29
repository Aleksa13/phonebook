package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<>();

    @Command
    public void createPerson(String name, String address, String age, String... phone) {
        Person r = new Person();
        r.setName(name);
        r.setAddress(address);
        r.setAge(age);
        r.addPhones(phone);
        recordList.add(r);
    }

    @Command
    public void createNote(String name, String note) {
        Note r = new Note();
        r.setName(name);
        r.setNote(note);
        recordList.add(r);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {
            if (r instanceof Person && r.getId() == id) {
                Person p = (Person) r;
                p.addPhones(phone);
                break;
            }
        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            String address;
            if (r instanceof Person) {
                Person p = (Person) r;
                address = p.getAddress().toLowerCase();
            } else {
                address = "";
            }

//            List<String> phones = r.getPhone();
//            for (String phone : phones){
//            if (name.contains(str) ||address.contains(str)||phone.toLowerCase().contains(str) ) {
//                result.add(r);
//            }
//            }
        }

        return result;
    }
}