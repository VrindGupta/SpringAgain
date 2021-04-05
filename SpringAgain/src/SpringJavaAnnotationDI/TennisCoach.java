package SpringJavaAnnotationDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise batting in a batting cage";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
