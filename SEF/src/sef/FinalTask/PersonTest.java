package sef.FinalTask;

import junit.framework.TestCase;


public class PersonTest extends TestCase{
    private Person thePerson;

    protected void setUp() throws Exception{
        super.setUp();
         Person thePerson = new Person("Peter", "Anderson", 25);
         this.thePerson = thePerson;

    }
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    public void testSetAndGetName(){
        assertEquals("Peter",(thePerson.name));}

    public void testSetAndGetLastName(){
            assertEquals("Johnson",(thePerson.lastname));
    }
    public void testSetAndGetAge(){
        assertEquals(25, thePerson.age);
    }

}
