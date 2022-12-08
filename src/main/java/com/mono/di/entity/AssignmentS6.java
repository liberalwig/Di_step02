package com.mono.di.entity;

import com.mono.di.ui.ColorPrinter;

import java.util.*;

public class AssignmentS6 {
    public AssignmentS6() {

        ColorPrinter printer = new ColorPrinter();

        PersonInfo personInfo = new PersonInfo();
        personInfo.setPrinter(printer);
        personInfo.setPrinter(printer);

        List<String> nameList = new ArrayList<>();
        nameList.add("Spring");
        nameList.add("IoC");
        nameList.add("DI");
        personInfo.setNames(nameList);

//    personInfo.setNames(new ArrayList<String>() {{
//        add("Spring");
//        add("Ioc");
//        add("DI");
//    }});

        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(); // setAge, setName는 리턴값이 없는 void형이라서 내가 맘대로 형을 <Person>으로 가정하고 넣으면 안됨. 값을 넣고 싶으면;
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setAge(30); // p1.getAge(); Age값을 받을 때 호출하는 메소드
        p1.setName("power");
        personList.add(p1);

        p2.setAge(50);
        p2.setName("abcd");
        personList.add(p2);

        p3.setAge(24);
        p3.setName("next");
        personList.add(p3);
        personInfo.setPersons(personList);


        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Kim", 10);
        ageMap.put("Lee", 20);
        ageMap.put("Ahn", 30);
        personInfo.setAges(ageMap);

        Set<String> emailSet = new HashSet<>();
        emailSet.add("kor@naver.com");
        emailSet.add("eng@naver.com");
        emailSet.add("eng@naver.com");
        personInfo.setEmails(emailSet);
    }
}
//
//        ColorPrinter printer = new ColorPrinter();
//
//        PersonInfo personInfo = new PersonInfo();
//        personInfo.setPersonInfo(printer);
//
//        List<String> name1 = new ArrayList<>();
//        name1.add("Spring");
//        name1.add("IoC");
//        name1.add("DI");
//        personInfo.setNames(name1);
//
//    }
//
//
//    }
//}
//    public Printer printer;
//    private List<String> names;
//    private List<Person> persons;
//    private Map<String, Integer> ages;
//    private Set<String> emails;
//    public AssignmentS6(Printer printer, List<String> names, List<Person> persons, Map<String, Integer> ages, Set<String> emails) {
//        this.printer = printer;
//        this.names = names;
//        this.persons = persons;
//        this.ages = ages;
//        this.emails = emails;
//    }
//
//    public Printer getPrinter() {
//        return printer;
//    }
//
//    public void setPrinter(Printer printer) {
//        this.printer = printer;
//    }
//
//    public List<String> getNames() {
//        return names;
//    }
//
//    public void setNames(List<String> names) {
//        this.names = names;
//    }
//
//    public List<Person> getPersons() {
//        return persons;
//    }
//
//    public void setPersons(List<Person> persons) {
//        this.persons = persons;
//    }
//
//    public Map<String, Integer> getAges() {
//        return ages;
//    }
//
//    public void setAges(Map<String, Integer> ages) {
//        this.ages = ages;
//    }
//
//    public Set<String> getEmails() {
//        return emails;
//    }
//
//    public void setEmails(Set<String> emails) {
//        this.emails = emails;
//    }
//
//    public PersonInfo getPersonInfo() {
//        return personInfo;
//    }
//
//    public void setPersonInfo(PersonInfo personInfo) {
//        this.personInfo = personInfo;
//    }


