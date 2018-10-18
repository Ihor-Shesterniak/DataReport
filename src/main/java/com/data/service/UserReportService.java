package com.data.service;

import com.data.domain.UserReport;
import com.data.repository.UserReportRepository;
import com.data.sync.UserReportCsvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class UserReportService {

    @Autowired
    private UserReportRepository userReportRepository;

    @Autowired
    private UserReportCsvReader userReportCsvReader;

    public int syncFromUrl(URL url) {
        userReportRepository.deleteAll();

        int counter = 0;
        for (UserReport report : userReportCsvReader.readFromUrl(url)) {
            userReportRepository.save(report);
            counter++;
        }

        return counter;
    }

    public List<UserReport> findByParameters(String gender, String status) {
        return userReportRepository.findReportsByGenderAndStatus(gender, status);
    }

}
