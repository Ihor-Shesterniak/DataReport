package com.data.sync;

import com.data.domain.UserReport;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserReportCsvReader {
    private static final String ID = "ID";
    private static final String STATUS = "Status";
    private static final String AMOUNT = "Amount";
    private static final String APPLICATION_SIGNED_HOUR = "ApplicationSignedHour";
    private static final String APPLICATION_SIGNED_WEEKDAY = "ApplicationSignedWeekday";
    private static final String CITY = "City";
    private static final String COUNTRY = "Country";
    private static final String CREDIT_SCORE_ES_EQUIFAX_RISK = "CreditScoreEsEquifaxRisk";
    private static final String DATE_OF_BIRTH = "DateOfBirth";
    private static final String DEBT_TO_INCOME = "DebtToIncome";
    private static final String EDUCATION = "Education";
    private static final String EMPLOYMENT_DURATION_CURRENT_EMPLOYER = "EmploymentDurationCurrentEmployer";
    private static final String EMPLOYMENT_POSITION = "EmploymentPosition";
    private static final String EMPLOYMENT_STATUS = "EmploymentStatus";
    private static final String EXISTING_LIABILITIES = "ExistingLiabilities";
    private static final String GENDER = "Gender";
    private static final String HOME_OWNERSHIP_TYPE = "HomeOwnershipType";
    private static final String INCOME_FROM_PRINCIPAL_EMPLOYER = "IncomeFromPrincipalEmployer";
    private static final String INCOME_TOTAL = "IncomeTotal";
    private static final String INTEREST_RATE_APR = "Interest rate (APR)";
    private static final String LOAN_DATE = "LoanDate";
    private static final String LOAN_DURATION = "LoanDuration";
    private static final String MARITAL_STATUS = "MaritalStatus";
    private static final String NEW_CREDIT_CUSTOMER = "NewCreditCustomer";
    private static final String NO_OF_PREVIOUS_LOANS_BEFORE_LOAN = "NoOfPreviousLoansBeforeLoan";
    private static final String OCCUPATION_AREA = "OccupationArea";
    private static final String USE_OF_LOAN = "UseOfLoan";
    private static final String VERIFICATION_TYPE = "VerificationType";
    private static final String WORK_EXPERIENCE = "WorkExperience";
    private static final String PREVIOUS_SCORE = "PreviousScore";
    private static final String DEFAULTED = "Defaulted";
    private static final String DEFAULT_DATE = "DefaultDate";

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static final String[] FILE_HEADER_MAPPING = {"ID", "Status", "Amount", "ApplicationSignedHour", "ApplicationSignedWeekday", "City", "Country", "CreditScoreEsEquifaxRisk", "DateOfBirth", "DebtToIncome", "Education", "EmploymentDurationCurrentEmployer", "EmploymentPosition", "EmploymentStatus", "ExistingLiabilities", "Gender", "HomeOwnershipType", "IncomeFromPrincipalEmployer", "IncomeTotal", "Interest rate (APR)", "LoanDate", "LoanDuration", "MaritalStatus", "NewCreditCustomer", "NoOfPreviousLoansBeforeLoan", "OccupationArea", "UseOfLoan", "VerificationType", "WorkExperience", "PreviousScore", "DefaultDate"};
    private static final CSVFormat CSV_FILE_FORMAT = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);

    public List<UserReport> readFromUrl(URL url) {
        List<UserReport> result = new ArrayList<>();

        Reader fileReader = null;
        CSVParser csvFileParser = null;

        try {
            fileReader = new InputStreamReader(url.openStream());
            csvFileParser = new CSVParser(fileReader, CSV_FILE_FORMAT);
            for (CSVRecord record : csvFileParser.getRecords()) {
                result.add(convertToUserReport(record));
            }
        } catch (IOException e) {
            throw new UserReportReaderException("Can't parse data", e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (csvFileParser != null) {
                    csvFileParser.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    private UserReport convertToUserReport(CSVRecord record) {
        UserReport userReport = new UserReport();
        userReport.setId(Integer.parseInt(record.get(ID)));
        userReport.setStatus(record.get(STATUS));
        userReport.setAmount(Double.parseDouble(record.get(AMOUNT)));
        userReport.setApplicationSignedHour(Integer.parseInt(record.get(APPLICATION_SIGNED_HOUR)));
        userReport.setApplicationSignedWeekday(Integer.parseInt(record.get(APPLICATION_SIGNED_WEEKDAY)));
        userReport.setCity(record.get(CITY));
        userReport.setCountry(record.get(COUNTRY));
        userReport.setCreditScoreEsEquifaxRisk(record.get(CREDIT_SCORE_ES_EQUIFAX_RISK));
        userReport.setDateOfBirth(LocalDate.parse(record.get(DATE_OF_BIRTH), DATE_FORMATTER));
        userReport.setDebtToIncome(record.get(DEBT_TO_INCOME));
        userReport.setEducation(record.get(EDUCATION));
        userReport.setEmploymentDurationCurrentEmployer(record.get(EMPLOYMENT_DURATION_CURRENT_EMPLOYER));
        userReport.setEmploymentPosition(record.get(EMPLOYMENT_POSITION));
        userReport.setEmploymentStatus(record.get(EMPLOYMENT_STATUS));
        userReport.setExistingLiabilities(Integer.parseInt(record.get(EXISTING_LIABILITIES)));
        userReport.setGender(record.get(GENDER));
        userReport.setHomeOwnershipType((record.get(HOME_OWNERSHIP_TYPE)));
        userReport.setIncomeFromPrincipalEmployer(record.get(INCOME_FROM_PRINCIPAL_EMPLOYER));
        userReport.setIncomeTotal(record.get(INCOME_TOTAL));
        userReport.setInterest_rate(Double.parseDouble(record.get(INTEREST_RATE_APR)));                                                    //userReport.setDateOfBirth(LocalDate.parse(record.get(DATE_OF_BIRTH), DATE_FORMATTER));
        userReport.setLoanDate(LocalDate.parse(record.get(LOAN_DATE), DATE_FORMATTER));
        userReport.setLoanDuration(Integer.parseInt(record.get(LOAN_DURATION)));
        userReport.setMaritalStatus(record.get(MARITAL_STATUS));
        userReport.setNewCreditCustomer(Boolean.parseBoolean(record.get(NEW_CREDIT_CUSTOMER)));
        userReport.setNoOfPreviousLoansBeforeLoan(Integer.parseInt(record.get(NO_OF_PREVIOUS_LOANS_BEFORE_LOAN)));
        userReport.setOccupationArea(record.get(OCCUPATION_AREA));
        userReport.setUseOfLoan(Integer.parseInt(record.get(USE_OF_LOAN)));
        userReport.setVerificationType(record.get(VERIFICATION_TYPE));
        userReport.setWorkExperience(record.get(WORK_EXPERIENCE));
        userReport.setPreviousScore(record.get(PREVIOUS_SCORE));
        userReport.setDefaulted(Boolean.parseBoolean(DEFAULTED));
        if (!userReport.isDefaulted()) {
            userReport.setDefaultDate(LocalDate.now());
        } else {
            userReport.setDefaultDate(LocalDate.parse(record.get(DEFAULT_DATE)));
        }
        return userReport;
    }


    public static class UserReportReaderException extends RuntimeException {
        public UserReportReaderException(String message) {
            super(message);
        }

        public UserReportReaderException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
