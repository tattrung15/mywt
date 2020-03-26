package app.weather.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = {NoHandlerFoundException.class})
	public String exception() {
		return "error";
	}
}
