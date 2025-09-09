package com.sb.ecom.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class APIException extends RuntimeException {
    private static final Long serialVersionUID = 1L;

    public APIException(String message) {
        super(message);
    }

}
