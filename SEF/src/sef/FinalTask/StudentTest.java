package sef.FinalTask;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Students student1;

    protected void setUp() throws Exception{
        super.setUp();
        Students student1 = new Students("Andrew", "Pauliner", 19, "MIT");
        this.student1 = student1;

    }
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    public void testSetAndGetName(){
        assertEquals("Peter",(student1.name));}

    public void testSetAndGetLastName(){
        assertEquals("Johnson",(student1.lastname));
    }
    public void testSetAndGetAge(){
        assertEquals(25, student1.age);
    }
    public void testSetAndGetSchoolName(){
        assertEquals("MIT", student1.schoolName);

}

}
