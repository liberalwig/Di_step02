package com.mono.di.entity;

import com.mono.di.ui.Printer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonInfo {

    private Printer printer;
    private List<String> names;
    private List<String> persons;
    private Map<String, Integer> ages;
    private Set<String> emails;

    public PersonInfo() {
    }

    public PersonInfo(Printer printer, List<String> names, List<String> persons, Map<String, Integer> ages, Set<String> emails) {
        this.printer = printer;
        this.names = names;
        this.persons = persons;
        this.ages = ages;
        this.emails = emails;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getPersons() {
        return persons;
    }

    public void setPersons(List<String> persons) {
        this.persons = persons;
    }

    public Map<String, Integer> getAges() {
        return ages;
    }

    public void setAges(Map<String, Integer> ages) {
        this.ages = ages;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "printer=" + printer +
                ", names=" + names +
                ", persons=" + persons +
                ", ages=" + ages +
                ", emails=" + emails +
                '}';
    }

    public void print(String s) {
        printer.print(s);
    }
}
