package src;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.singleton.Singleton;

/**
 * PizzaTestDrive
 */
public class SingletonTest {

    @Test
    public void shouldBeEqual() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertTrue(s1 == s2);
    }

}