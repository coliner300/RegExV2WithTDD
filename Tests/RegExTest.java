import org.junit.jupiter.api.Test;
import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.*;

class RegExTest {

    @Test
    void FirstNameLetterACapTrue()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("A");
        //assertEquals("Bob", tester1.getFirstName());
        assertTrue( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameLetterBCapTrue()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("B");
        //assertEquals("Bob", tester1.getFirstName());
        assertTrue( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameStartsWCapTrue()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("Bubbles");
        //assertEquals("Bob", tester1.getFirstName());
        assertTrue( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameLetterbCapFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("b");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameLetterzCapFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("z");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameStartsWCapFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("bubbles");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameHasNumberFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("B1");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameHasSymbolFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("A&");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameHasSpaceFalse()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("Bo b");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z][a-z]*"));
    }
    @Test
    void FirstNameHasHyphenTrue()
    {
        RegEx tester1 = new RegEx();
        tester1.setFirstName("Bo-Derek");
        //assertEquals("Bob", tester1.getFirstName());
        assertFalse( tester1.getFirstName().matches("[A-Z]+([-][a-z])*"));
    }
/*
    @Test
    void getLastName() {
    }

    @Test
    void getAge()
    {
        RegEx tester1 = new RegEx();
        tester1.setAge(20);
        assertEquals(20, tester1.getAge());
    }

    @Test
    void getIsActive() {
    }

    @Test
    void getStuID() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setAge() {
    }

    @Test
    void setActive() {
    }

    @Test
    void setStuID() {
    }

 */
}