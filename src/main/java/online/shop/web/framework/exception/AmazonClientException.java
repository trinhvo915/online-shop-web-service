package online.shop.web.framework.exception;

import javax.print.attribute.standard.Severity;

public class AmazonClientException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String msg;

    public AmazonClientException(String msg) {
        this.msg = msg;
    }

    public AmazonClientException(String string, String code, Object[] args, Object object) {}

    public AmazonClientException(String message, Throwable rootCause) {}

    public AmazonClientException(Throwable rootCause) {}

    public AmazonClientException(String message, Severity warning, Throwable rootCause) {}
}
