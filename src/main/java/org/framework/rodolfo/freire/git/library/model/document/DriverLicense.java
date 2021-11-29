package org.framework.rodolfo.freire.git.library.model.document;

import java.util.Date;

public class DriverLicense implements Document {

    private String number;
    private String dispatchingAgency;
    private Date issueDate;
    private Date validateDate;
    private boolean status;

    public DriverLicense(String number, String dispatchingAgency, boolean status) {
        this.number = number;
        this.dispatchingAgency = dispatchingAgency;
        this.status = status;
    }

    @Override
    public boolean validationDocument() {
        return false;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "number='" + number + '\'' +
                ", dispatchingAgency='" + dispatchingAgency + '\'' +
                ", issueDate=" + issueDate +
                ", validateDate=" + validateDate +
                ", status=" + status +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDispatchingAgency() {
        return dispatchingAgency;
    }

    public void setDispatchingAgency(String dispatchingAgency) {
        this.dispatchingAgency = dispatchingAgency;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(Date validateDate) {
        this.validateDate = validateDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
