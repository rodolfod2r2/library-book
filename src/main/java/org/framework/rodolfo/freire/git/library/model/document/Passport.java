package org.framework.rodolfo.freire.git.library.model.document;

import java.util.Date;

public class Passport implements Document {

    private String number;
    private String dispatchingAgency;
    private Date issueDate;
    private Date validateDate;
    private boolean status;

    @Override
    public boolean validationDocument() {

        return false;
    }
}
