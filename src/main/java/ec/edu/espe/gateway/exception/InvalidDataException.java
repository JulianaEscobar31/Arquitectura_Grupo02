package ec.edu.espe.gateway.exception;

public class InvalidDataException extends RuntimeException {

    private final String message;

    public InvalidDataException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Datos inválidos: " + message;
    }
} 