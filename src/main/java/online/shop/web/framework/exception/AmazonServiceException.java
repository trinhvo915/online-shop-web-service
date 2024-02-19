package online.shop.web.framework.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.print.attribute.standard.Severity;

public class AmazonServiceException extends RuntimeException {

    private static final long serialVersionUID = 853150900897132470L;

    private String msg;

    private Severity severity;

    @JsonIgnore
    private Throwable rootCause;

    public AmazonServiceException(String msg) {
        this.msg = msg;
    }

    public AmazonServiceException(Throwable rootCause) {
        this.rootCause = rootCause;
    }

    public AmazonServiceException(String message, Throwable rootCause) {
        this.msg = message;
        this.rootCause = rootCause;
        this.severity = Severity.ERROR;
    }
}
