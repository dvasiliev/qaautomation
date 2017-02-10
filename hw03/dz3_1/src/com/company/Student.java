package com.company;


public class Student {
    private int id;
    private String surname;
    private String name;
    private String secondname;
    private String birthday;
    private String address;
    private String telephone;
    private String faculty;
    private int grade;
    private String group;

    public Student(int id, String surname, String name, String faculty, int grade, String birthday, String group) {
        setId(id);
        setSurname(surname);
        setName(name);
        setFaculty(faculty);
        setGrade(grade);
        setBirthday(birthday);
        setGroup(group);
    }

    public Student(int id, String surname, String name, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.group = group;
    }

    public Student(int id, String surname, String name, String birthday, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 6) {System.out.println("there is no such grade");}
        else {this.grade = grade;}
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", grade=" + grade +
                ", group='" + group + '\'' +
                '}';
    }
}
