package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.newsys.CustomerDataFromDB;
import edu.bu.met.cs665.newsys.CustomerDataViaHttps;
import edu.bu.met.cs665.old.CustomerDataFromDisk;
import edu.bu.met.cs665.old.HttpsToUsbAdapter;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestCustomerData {

    public TestCustomerData() {
    }

    @Test
    public void testCustomerDataFromDiskViaAdapter() {
        CustomerDataViaHttps https = new CustomerDataFromDB();

        https = new HttpsToUsbAdapter(new CustomerDataFromDisk());
        Customer c = https.getCustomerViaHttps(2);
        assertEquals("Hello world from local disk", c.getData());
    }

    @Test
    public void testCustomerIdFromDiskViaAdapter() {
        CustomerDataViaHttps https = new CustomerDataFromDB();

        https = new HttpsToUsbAdapter(new CustomerDataFromDisk());
        Customer c = https.getCustomerViaHttps(2);
        assertEquals(2, c.getCustomerId());
    }

    @Test
    public void testCustomerDataFromHttps() {
        CustomerDataViaHttps https = new CustomerDataFromDB();

        https.printCustomer(1);
        Customer c = https.getCustomerViaHttps(1);
        assertEquals("Hello World from remote Database", c.getData());
    }

    @Test
    public void testCustomerIDFromHttps() {
        CustomerDataViaHttps https = new CustomerDataFromDB();

        Customer c = https.getCustomerViaHttps(10);
        assertEquals(10, c.getCustomerId());
    }

}
