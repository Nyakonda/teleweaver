package com.reedhousesystems.services.core.health.messenger.exception;

public class WrongPasswordException extends BaseWebApplicationException {

    public WrongPasswordException() {
        super(401, "40103", "Authentication Error", "The current password is wrong");
    }
}