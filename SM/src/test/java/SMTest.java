import com.powernode.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest {
    @Test
    public void testSM() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceImpl = applicationContext.getBean("AccountServiceImpl", AccountService.class);
        try {
            accountServiceImpl.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            System.out.println("转账失败");
        }
    }
}
