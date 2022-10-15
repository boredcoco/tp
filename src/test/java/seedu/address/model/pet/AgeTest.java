package seedu.address.model.pet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

import seedu.address.testutil.TypicalPets;

public class AgeTest {

    @Test
    public void getPetAge_pet() {
        int expected = Period.between(TypicalPets.PLUM.getDateOfBirth().getDate(), LocalDate.now()).getYears();
        int result = new Age(0).getPetAge(TypicalPets.PLUM);
        assertEquals(result, expected);
    }

    @Test
    public void getAge_void() {
        Age age = new Age(10);
        assertEquals(age.getAge(), 10);
    }

    @Test
    public void equals_sameObject() {
        Age age = new Age(10);
        assertEquals(age, age);
    }

    @Test
    public void equals_true() {
        Age age1 = new Age(10);
        Age age2 = new Age(10);
        assertEquals(age1, age2);
    }

    @Test
    public void equals_false() {
        Age age1 = new Age(1);
        Age age2 = new Age(10);
        assertNotEquals(age1, age2);
    }

    @Test
    public void hashcode() {
        Age age1 = new Age(10);
        Age age2 = new Age(10);
        assertEquals(age1.hashCode(), age2.hashCode());
    }

    @Test
    public void toStringTest() {
        Age age = new Age(8);
        assertEquals(age.toString(), Integer.toString(8));
    }

}