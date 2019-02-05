package a_exception_5;
import java.util.*;

public class WrongMail extends Exception{
	public WrongMail() {}
	
	public WrongMail(String msj_error) {
		super(msj_error);
	}
}
