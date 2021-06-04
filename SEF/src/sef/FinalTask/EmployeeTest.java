package sef.FinalTask;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    private Employee employee1;

    protected void setUp() throws Exception{
        super.setUp();
        Employee employee1 = new Employee("Jimmy", "Dudeson", 45, "banker", "American Express", 12000);
        this.employee1 = employee1;

    }
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    public void testSetAndGetName(){
        assertEquals("Jimmy",(employee1.name));}

    public void testSetAndGetLastName(){
        assertEquals("Dudeson",(employee1.lastname));
    }
    public void testSetAndGetAge(){
        assertEquals(45, employee1.age);
}
    public void testSetAndGetTitle(){
        assertEquals("banker", employee1.title);
    }
    public void testSetAndGetCompany(){
        assertEquals("American Express", employee1.company);
    }
    public void testSetAndGetSalary(){
        assertEquals(12000, employee1.salary);
    }
    }

