package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo1Application.class, args);
	    System.out.println(checkIfInputIsAnEvenNumber(122));
		
	}
		 
    public static boolean checkIfInputIsAnEvenNumber(int number){
		 return number % 2 == 0;
	 }

}
