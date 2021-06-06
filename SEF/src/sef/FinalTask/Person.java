package sef.FinalTask;
import java.util.*;
public class Person {
    public String name;
    public String lastname;
    public int age;

    public void setName(String userName, String userLastName) {
        name = userName;
        lastname = userLastName;
    }


    public void setAge(int userAge) {
        age = userAge;
    }

    public Person(String name, String lastname, int age) throws Exception{
        char[] chars = name.toCharArray();
        char[] chars1 = lastname.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                throw new Exception();
            }
        }
        for (char c : chars1) {
            if (!Character.isLetter(c)) {
                throw new Exception();


            }
        }

            this.name = name;
            this.lastname = lastname;
            this.age = age;

        }



            public void intro () {
                System.out.println("My name is " + name + " " + lastname + " and I'm " + age + " years old.");
            }


        }





