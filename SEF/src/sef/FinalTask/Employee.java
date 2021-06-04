package sef.FinalTask;

import java.util.*;

public class Employee extends Person {
    public String title;
    public String company;
    public static int salary;

    public Employee(String name, String lastname, int age, String title, String company, int salary) {
        super(name, lastname, age);
        this.title = title;
        this.company = company;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void intro() {
        System.out.println("My name is " + name + " " + lastname + " and I'm " + age + " years old. " + "I'm work as " + title + " in " + company);

    }
}

//    public static void arraySalary() {                       // salary array
//        int[] array = {salary};
//        int result = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < result) {
//                result = array[i];
//
//            }
//
//            {
//                if (array[i] > result) {
//                    result = array[i];
//
//                }
//            }
//        }
//    }


    //public static void arraySalary() {    // array for highest salary check
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(salary);
//        Collections.sort(arrayList, Collections.reverseOrder());
//        for (Object str : arrayList) {
//            System.out.println(str);








                








