import com.powernode.spring6.web.UseAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-001.xml");
        UseAction useAction = applicationContext.getBean("UseAction", UseAction.class);
        System.out.println(useAction);
    }
}
