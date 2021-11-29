package org.framework.rodolfo.freire.git.library.model.document;

import java.util.Date;

public class IdNational implements Document {

    private String nationalId;
    private Date issueDate;
    private boolean status;

    public IdNational(String nationalId, boolean status) {
        this.nationalId = nationalId;
        this.status = status;
    }

    @Override
    public boolean validationDocument() {

        return false;
    }

    @Override
    public String toString() {
        return "IdNational{" +
                "nationalId='" + nationalId + '\'' +
                ", status=" + status +
                '}';
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
