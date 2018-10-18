package com.data.repository;

import com.data.domain.UserReport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class InMemoryUserReportRepository implements UserReportRepository {
    private List<UserReport> reports = new CopyOnWriteArrayList<>();

    @Override
    public List<UserReport> findReportsByGenderAndStatus(String gender, String status) {
        List<UserReport> result = new ArrayList<>();
        for (UserReport report : reports) {
            if (Objects.equals(report.getGender(), gender)
                    && (status == null || Objects.equals(report.getStatus(), status))) {
                result.add(report);
            }
        }
        return result;
    }

    @Override
    public UserReport save(UserReport report) {
        reports.add(report);
        return report;
    }

    @Override
    public void deleteAll() {
        reports.clear();
    }

}
