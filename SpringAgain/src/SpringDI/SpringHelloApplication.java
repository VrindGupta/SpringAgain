package SpringDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApplication {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
Coach theCoach2= context.getBean("myCoach2",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getFortune());
		
		//close the context
		context.close();
		
	}
}
