package id.ac.ui.cs.advprog.hoomgroompayment.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class TopUpTest {

    @Test
    public void testTopUpConstructor() {
        Date timestamp = new Date();
        String username = "testUser";
        int amount = 10000;

        TopUp topUp = new TopUp(timestamp, username, amount);

        assertEquals(timestamp, topUp.getTimestamp());
        assertEquals(username, topUp.getUsername());
        assertEquals("dummy wallet", topUp.getTopUpMethod());
        assertEquals(amount, topUp.getAmount());
    }

    @Test
    public void testTopUpSetter() {
        Date timestamp = new Date();
        String username = "testUser";
        int amount = 25000;

        TopUp topUp = new TopUp();
        topUp.setTimestamp(timestamp);
        topUp.setUsername(username);
        topUp.setAmount(amount);

        assertEquals(timestamp, topUp.getTimestamp());
        assertEquals(username, topUp.getUsername());
        assertEquals("dummy wallet", topUp.getTopUpMethod());
        assertEquals(amount, topUp.getAmount());
    }

    @Test
    public void testTopUpEquals() {
        Date timestamp = new Date();
        String username = "testUser";
        int amount = 50000;

        TopUp topUp1 = new TopUp(timestamp, username, amount);
        TopUp topUp2 = new TopUp(timestamp, username, amount);

        assertEquals(topUp1.getUsername(), topUp2.getUsername());
    }

    @Test
    public void testTopUpNotEquals() {
        Date timestamp1 = new Date();
        Date timestamp2 = new Date(timestamp1.getTime() + 1000); // Different timestamp
        String username = "testUser";
        int amount1 = 100000;
        int amount2 = 25000;

        TopUp topUp1 = new TopUp(timestamp1, username, amount1);
        TopUp topUp2 = new TopUp(timestamp2, username, amount2);

        assertNotEquals(topUp1, topUp2);
    }

    @Test
    public void testTopUpNotEqualsDifferentUsername() {
        Date timestamp = new Date();
        String username1 = "testUser1";
        String username2 = "testUser2";
        int amount = 50000;

        TopUp topUp1 = new TopUp(timestamp, username1, amount);
        TopUp topUp2 = new TopUp(timestamp, username2, amount);

        assertNotEquals(topUp1, topUp2);
    }

    @Test
    public void testTopUpNotEqualsDifferentTimestamp() {
        Date timestamp1 = new Date();
        Date timestamp2 = new Date(timestamp1.getTime() + 1000);
        String username = "testUser";
        int amount = 50000;

        TopUp topUp1 = new TopUp(timestamp1, username, amount);
        TopUp topUp2 = new TopUp(timestamp2, username, amount);

        assertNotEquals(topUp1, topUp2);
    }
}