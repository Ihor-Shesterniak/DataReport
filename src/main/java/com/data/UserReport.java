package com.data;

import java.time.LocalDate;
import java.util.Objects;

public class UserReport {
    private int id;
    private String status;
    private double amount;
    private int applicationSignedHour;
    private int applicationSignedWeekday;
    private String city;
    private String country;
    private String creditScoreEsEquifaxRisk;
    private LocalDate dateOfBirth;
    private String debtToIncome;
    private String education;
    private String employmentDurationCurrentEmployer;
    private String employmentPosition;
    private String employmentStatus;
    private int existingLiabilities;
    private String gender;
    private String homeOwnershipType;
    private String incomeFromPrincipalEmployer;
    private String incomeTotal;
    private double interest_rate; // (APR)
    private LocalDate loanDate;
    private int loanDuration;
    private String maritalStatus;
    private boolean newCreditCustomer;
    private int noOfPreviousLoansBeforeLoan;
    private String occupationArea;
    private int useOfLoan;
    private String verificationType;
    private String workExperience;
    private String previousScore;
    private boolean defaulted;
    private LocalDate DefaultDate;

    public UserReport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getApplicationSignedHour() {
        return applicationSignedHour;
    }

    public void setApplicationSignedHour(int applicationSignedHour) {
        this.applicationSignedHour = applicationSignedHour;
    }

    public int getApplicationSignedWeekday() {
        return applicationSignedWeekday;
    }

    public void setApplicationSignedWeekday(int applicationSignedWeekday) {
        this.applicationSignedWeekday = applicationSignedWeekday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreditScoreEsEquifaxRisk() {
        return creditScoreEsEquifaxRisk;
    }

    public void setCreditScoreEsEquifaxRisk(String creditScoreEsEquifaxRisk) {
        this.creditScoreEsEquifaxRisk = creditScoreEsEquifaxRisk;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDebtToIncome() {
        return debtToIncome;
    }

    public void setDebtToIncome(String debtToIncome) {
        this.debtToIncome = debtToIncome;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmploymentDurationCurrentEmployer() {
        return employmentDurationCurrentEmployer;
    }

    public void setEmploymentDurationCurrentEmployer(String employmentDurationCurrentEmployer) {
        this.employmentDurationCurrentEmployer = employmentDurationCurrentEmployer;
    }

    public String getEmploymentPosition() {
        return employmentPosition;
    }

    public void setEmploymentPosition(String employmentPosition) {
        this.employmentPosition = employmentPosition;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public int getExistingLiabilities() {
        return existingLiabilities;
    }

    public void setExistingLiabilities(int existingLiabilities) {
        this.existingLiabilities = existingLiabilities;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeOwnershipType() {
        return homeOwnershipType;
    }

    public void setHomeOwnershipType(String homeOwnershipType) {
        this.homeOwnershipType = homeOwnershipType;
    }

    public String getIncomeFromPrincipalEmployer() {
        return incomeFromPrincipalEmployer;
    }

    public void setIncomeFromPrincipalEmployer(String incomeFromPrincipalEmployer) {
        this.incomeFromPrincipalEmployer = incomeFromPrincipalEmployer;
    }

    public String getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(String incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(boolean newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    public int getNoOfPreviousLoansBeforeLoan() {
        return noOfPreviousLoansBeforeLoan;
    }

    public void setNoOfPreviousLoansBeforeLoan(int noOfPreviousLoansBeforeLoan) {
        this.noOfPreviousLoansBeforeLoan = noOfPreviousLoansBeforeLoan;
    }

    public String getOccupationArea() {
        return occupationArea;
    }

    public void setOccupationArea(String occupationArea) {
        this.occupationArea = occupationArea;
    }

    public int getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(int useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(String previousScore) {
        this.previousScore = previousScore;
    }

    public boolean isDefaulted() {
        return defaulted;
    }

    public void setDefaulted(boolean defaulted) {
        this.defaulted = defaulted;
    }

    public LocalDate getDefaultDate() {
        return DefaultDate;
    }

    public void setDefaultDate(LocalDate defaultDate) {
        DefaultDate = defaultDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserReport that = (UserReport) o;
        return id == that.id &&
                Double.compare(that.amount, amount) == 0 &&
                applicationSignedHour == that.applicationSignedHour &&
                applicationSignedWeekday == that.applicationSignedWeekday &&
                existingLiabilities == that.existingLiabilities &&
                Double.compare(that.interest_rate, interest_rate) == 0 &&
                loanDuration == that.loanDuration &&
                newCreditCustomer == that.newCreditCustomer &&
                noOfPreviousLoansBeforeLoan == that.noOfPreviousLoansBeforeLoan &&
                useOfLoan == that.useOfLoan &&
                defaulted == that.defaulted &&
                Objects.equals(status, that.status) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(creditScoreEsEquifaxRisk, that.creditScoreEsEquifaxRisk) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(debtToIncome, that.debtToIncome) &&
                Objects.equals(education, that.education) &&
                Objects.equals(employmentDurationCurrentEmployer, that.employmentDurationCurrentEmployer) &&
                Objects.equals(employmentPosition, that.employmentPosition) &&
                Objects.equals(employmentStatus, that.employmentStatus) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(homeOwnershipType, that.homeOwnershipType) &&
                Objects.equals(incomeFromPrincipalEmployer, that.incomeFromPrincipalEmployer) &&
                Objects.equals(incomeTotal, that.incomeTotal) &&
                Objects.equals(loanDate, that.loanDate) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(occupationArea, that.occupationArea) &&
                Objects.equals(verificationType, that.verificationType) &&
                Objects.equals(workExperience, that.workExperience) &&
                Objects.equals(previousScore, that.previousScore) &&
                Objects.equals(DefaultDate, that.DefaultDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, amount, applicationSignedHour, applicationSignedWeekday, city, country, creditScoreEsEquifaxRisk, dateOfBirth, debtToIncome, education, employmentDurationCurrentEmployer, employmentPosition, employmentStatus, existingLiabilities, gender, homeOwnershipType, incomeFromPrincipalEmployer, incomeTotal, interest_rate, loanDate, loanDuration, maritalStatus, newCreditCustomer, noOfPreviousLoansBeforeLoan, occupationArea, useOfLoan, verificationType, workExperience, previousScore, defaulted, DefaultDate);
    }

    @Override
    public String toString() {
        return "UserReport{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", applicationSignedHour=" + applicationSignedHour +
                ", applicationSignedWeekday=" + applicationSignedWeekday +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", creditScoreEsEquifaxRisk='" + creditScoreEsEquifaxRisk + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", debtToIncome='" + debtToIncome + '\'' +
                ", education='" + education + '\'' +
                ", employmentDurationCurrentEmployer='" + employmentDurationCurrentEmployer + '\'' +
                ", employmentPosition='" + employmentPosition + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", existingLiabilities=" + existingLiabilities +
                ", gender='" + gender + '\'' +
                ", homeOwnershipType='" + homeOwnershipType + '\'' +
                ", incomeFromPrincipalEmployer='" + incomeFromPrincipalEmployer + '\'' +
                ", incomeTotal='" + incomeTotal + '\'' +
                ", interest_rate=" + interest_rate +
                ", loanDate=" + loanDate +
                ", loanDuration=" + loanDuration +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", newCreditCustomer=" + newCreditCustomer +
                ", noOfPreviousLoansBeforeLoan=" + noOfPreviousLoansBeforeLoan +
                ", occupationArea='" + occupationArea + '\'' +
                ", useOfLoan=" + useOfLoan +
                ", verificationType='" + verificationType + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", previousScore='" + previousScore + '\'' +
                ", defaulted=" + defaulted +
                ", DefaultDate=" + DefaultDate +
                '}';
    }
}
