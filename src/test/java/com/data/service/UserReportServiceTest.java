package com.data.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.net.MalformedURLException;

@SpringBootTest
public class UserReportServiceTest {
    private static final String CSV_FILE = "./loans_data.csv";

    @Autowired
    private UserReportService userReportService;

    @Test
    public void readCsvFile() throws MalformedURLException {
        File file = new File(CSV_FILE);
        userReportService.syncFromUrl(file.toURL());

        assert userReportService.findByParameters("test", null) != null;
    }
}