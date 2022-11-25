package day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public void checkFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME FOR VALIDATION");
		System.out.println("(It should be in format of 'First name starts with Cap and has minimum 3 characters'");
		String firstname = sc.next();
		String format = "^[A-Z]([a-z]+){2}$";
		Pattern pattern = Pattern.compile(format);
		Matcher firstnamematch = pattern.matcher(firstname);
		if(firstnamematch.matches()) {
			System.out.println("FIRST NAME SUCCESSFULLY MATCH");
		} else 
			System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
		
		}
	
	public void checklastName() {
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER LAST NAME FOR VALIDATION");
	System.out.println("(It should be in format of 'First name starts with Cap and has minimum 3 characters'");
	String lastname = sc.next();
	String format = "^[A-Z]([a-z]+){2}$";
	Pattern pattern = Pattern.compile(format);
	Matcher lastnamematch = pattern.matcher(lastname);
	if(lastnamematch.matches()) {
		System.out.println("LAST NAME SUCCESSFULLY MATCH");
	} else 
		System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
	
	}
    

	public void checkemail() {
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER EMAIL FOR VALIDATION");
	System.out.println("(Email has 3 mandatory parts (abc, bl\r\n"
			+ "& co) and 2 optional (xyz & in) with\r\n"
			+ "precise @ and . positions' E.g. abc.xyz@bl.co.in ");
	String email = sc.next();
	String format = "^[a-zA-Z0-9_.-]+(@)[a-zA-Z]+([.])[a-z.]+$";
	Pattern pattern = Pattern.compile(format);
	Matcher emailmatch = pattern.matcher(email);
	if(emailmatch.matches()) {
		System.out.println("EMAIL NAME SUCCESSFULLY MATCH");
	} else 
		System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
	
	}

	public void checkpassword() {
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER PASSWORD FOR VALIDATION");
	System.out.println("(It should be in format of 'minimum 8 Characters and Should have at least Upper Case \r\n"
			+ "Should have at least 1 numeric number in the password and has 1 special character '");
	String password = sc.next();
	String format = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$";
	Pattern pattern = Pattern.compile(format);
	Matcher passwordmatch = pattern.matcher(password);
	if(passwordmatch.matches()) {
		System.out.println("PASSWORD  SUCCESSFULLY MATCH");
	} else 
		System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
	
	}
		
	

	public void checkmobileno() {
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER MOBILE NUMBER  FOR VALIDATION");
	System.out.println("(It should be in format of 'Mobile Format - E.g. +919919819801\r\n"
			+ "Country code follow by 10 digit number')");
	String mobile = sc.next();
	String format = "^[+](91)[6-9][0-9]{9}$";
	Pattern pattern = Pattern.compile(format);
	Matcher mobilematch = pattern.matcher(mobile);
	if(mobilematch.matches()) {
		System.out.println("MOBILE NUMBER SUCCESSFULLY MATCH");
	} else 
		System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
	
	}
}


//Password    ^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$




