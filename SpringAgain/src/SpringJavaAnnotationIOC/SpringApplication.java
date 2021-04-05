package SpringJavaAnnotationIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("AnnotationApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("baseBallCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		//close the context
		context.close();
		
	}
}
