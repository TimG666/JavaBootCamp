package sef.FinalTask;

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

    public Person(String name, String lastname, int age) {

            this.name = name;
//        if (Character.isLetter(0)){
//            }
//        else (Character.isDigit(0)){
//            System.out.println("Digit in the name");
//            }
            this.lastname = lastname;
            this.age = age;


//        } catch (Exception e) {
//            System.out.println("Wrong enter");
        }


        public void intro () {
            System.out.println("My name is " + name + " " + lastname + " and I'm " + age + " years old.");
        }

    }




