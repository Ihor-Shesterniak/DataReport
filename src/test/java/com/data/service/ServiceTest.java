package com.data.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    public static final String CSV_FILE = "./loans_data.csv";
    @Test
    public void readCsvFile() {
        Service service = new Service();
        Assert.assertNotNull(service.readCsvFile(CSV_FILE));
    }
}