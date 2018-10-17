package com.data.controller;

import com.data.UserReport;
import com.data.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Service service;

    List<UserReport> reports = new CopyOnWriteArrayList();

    @RequestMapping(value = "/api /file", method = RequestMethod.GET)
    @ResponseBody
    public List<UserReport> getData() throws IOException {
        InputStream input = new URL("http://localhost:8080/api/file").openStream();
        String csvFileAddress = String.valueOf(input);
        List<UserReport> getAll = service.readCsvFile(csvFileAddress);
        reports.clear();
        reports.addAll(getAll);
        return getAll;
    }

    @RequestMapping(value = "api/file{gender}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserReport> getByParam(@PathVariable String gender) throws IOException {
        List<UserReport> getDataByParam = service.getDataByParam(reports, gender);
        return getDataByParam;
    }

    @RequestMapping(value = "api/file{gender}/{status}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserReport> getByParam(@PathVariable String gender, @PathVariable String status) throws IOException {
        List<UserReport> getDataByParam = service.getDataByMultipleParam(reports, gender, status);
        return getDataByParam;
    }
}
