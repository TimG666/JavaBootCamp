package sef.FinalTask;

import java.util.Comparator;

public class FirstActivity {
    public static void main(String[] args) {


        Person person1 = null;
        try {
            person1 = new Person("Bob", "Johnson", 50);
        } catch (Exception e) {
            System.out.println("Digit in the username");
        }
        {
            person1.intro();
            Employee employee1 = null;
            try {
                employee1 = new Employee("Jack", "Peterson",25, "developer", "Watermelon Inc.", 7000);
            } catch (Exception e) {
                System.out.println("Digit in the username");
            }
            employee1.intro();
//            employee1.arraySalary();
            Employee employee2 = null;
            try {
                employee2 = new Employee("Victor", "Palmer",47, "janitor", "Watermelon Inc.", 1000);
            } catch (Exception e) {
                System.out.println("Digit in the username");
            }
            employee2.intro();
//            employee2.arraySalary();
            Employee employee3 = null;
            try {
                employee3 = new Employee("Maria","Moody", 34, "CEO", "Watermelon Inc.", 50000);
            } catch (Exception e) {
                System.out.println("Digit in the username");
            }
            employee3.intro();
//            employee3.arraySalary();
            Students student1 = null;
            try {
                student1 = new Students("Peter", "Milos",17, "Harvard University");
            } catch (Exception e) {
                System.out.println("Digit in the username");
            }
            student1.intro();

            }



        }



            }






