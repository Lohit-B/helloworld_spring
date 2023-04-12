package club.blink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class ServiceApplication {
    private static ApplicationContext applicationContext;
    
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ServiceApplication.class, args);
	}
	
	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}
