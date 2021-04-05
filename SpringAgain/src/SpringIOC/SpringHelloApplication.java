package SpringIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApplication {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}
}
