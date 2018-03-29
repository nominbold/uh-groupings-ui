package edu.hawaii.its.groupings.type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Feedback {

    private String name;
    private String email;
    private String type;
    private String message;
    private String exceptionError;

    private static final Log logger = LogFactory.getLog(Feedback.class);

    // Constructor.
    public Feedback() {
        // Empty.
    }

    public Feedback(String exceptionError) {
        this.exceptionError = exceptionError;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getExceptionError() {
        return exceptionError;
    }

    @Override
    public String toString() {
        return "Feedback [email=" + email
                + ", message=" + message
                + ", name=" + name
                + ", type=" + type
                + ", exceptionError=" + exceptionError
                + "]";
    }

}
