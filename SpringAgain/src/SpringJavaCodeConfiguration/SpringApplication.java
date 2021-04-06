package SpringJavaCodeConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
	public static void main(String[] args) {
		
		//load the spring configuration file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container
//		Coach theCoach= context.getBean("baseBallCoach",Coach.class);
//		
//		//call method on the bean
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
//
//		Coach theCoach2= context.getBean("tennisCoach",Coach.class);
//		
//		//call method on the bean
//		System.out.println(theCoach2.getDailyWorkout());
//		System.out.println(theCoach2.getDailyFortune());
		
		
		Coach theCoach3= context.getBean("swimCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
		
		//close the context
		context.close();
		
	}
}
