package com.data.controller;

import com.data.domain.UserReport;
import com.data.service.UserReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
public class UserReportController {
    @Autowired
    private UserReportService userReportService;

    @RequestMapping(value = "/api/data/sync", method = RequestMethod.POST)
    public void sync(@Param("url") String url) throws MalformedURLException {
        userReportService.syncFromUrl(new URL(url));
    }

    @RequestMapping(value = "api/file/{gender}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserReport> getByParam(@PathVariable String gender) {
        return userReportService.findByParameters(gender, null);
    }

    @RequestMapping(value = "api/file/{gender}/{status}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserReport> getByParam(@PathVariable String gender, @PathVariable String status) {
        return userReportService.findByParameters(gender, status);
    }
}
