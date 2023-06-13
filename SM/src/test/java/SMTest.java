import com.powernode.bank.mapper.AccountMapper;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
@MapperScan("com.powernode.*.mapper")
public class SMTest {
    @Resource
    private AccountMapper accountMapper;

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
