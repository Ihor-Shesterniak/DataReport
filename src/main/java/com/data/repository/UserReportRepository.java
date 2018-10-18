package com.data.repository;

import com.data.domain.UserReport;

import java.util.List;

public interface UserReportRepository {
    List<UserReport> findReportsByGenderAndStatus(String gender, String status);

    UserReport save(UserReport report);

    void deleteAll();
}
