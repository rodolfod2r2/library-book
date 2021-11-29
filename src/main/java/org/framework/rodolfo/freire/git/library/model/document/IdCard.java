package org.framework.rodolfo.freire.git.library.model.document;

import java.util.Date;

public class IdCard implements Document {

    private String number;
    private String dispatchingAgency;
    private Date issueDate;
    private boolean status;

    public IdCard(String number, boolean status) {
        this.number = number;
        this.status = status;
    }

    @Override
    public boolean validationDocument() {

        return false;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "number='" + number + '\'' +
                ", status=" + status +
                '}';
    }
}
