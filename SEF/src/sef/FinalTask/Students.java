package sef.FinalTask;

public class Students extends Person {
    public String schoolName;

    public Students(String name, String lastname, int age, String schoolName) throws Exception {
        super(name, lastname, age);
        this.schoolName = schoolName;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void intro(){
        System.out.println("My name is " + name + " " + lastname + " I'm " + age + " years old and I'm study in university " + schoolName);
    }



}
