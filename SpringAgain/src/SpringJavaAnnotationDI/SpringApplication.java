package SpringJavaAnnotationDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("AnnotationApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= context.getBean("baseBallCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		Coach theCoach2= context.getBean("tennisCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		
		//close the context
		context.close();
		
	}
}
