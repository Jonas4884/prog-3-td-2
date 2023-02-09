package app.foot.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class InternalToExceptionHandler {
    @ExceptionHandler(value = {BadRequestException.class})
    ResponseEntity<String> handleBadRequest(
            BadRequestException e) {
        log.info("Bad request", e);
        return ResponseEntity.badRequest()
                .contentType(MediaType.APPLICATION_JSON)
                .header("Bad request exception")
                .body(e.getMessage());
}}
