import com.powernode.spring6.ProxyUtil;
import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.springconfig;
import com.powernode.spring6.web.UseAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {springconfig.class}, loader = AnnotationConfigContextLoader.class)
public final class MyTest {
    @Autowired
    private UseAction useAction;

    @Test
    public void test1() {
        System.out.println(useAction);
        useAction.deleteRequest();
    }

    @Test
    public void test2() {
        UserDao proxy = ProxyUtil.createProxy(new UserDaoImplForMySQL());
        proxy.deleteById();
    }
}
