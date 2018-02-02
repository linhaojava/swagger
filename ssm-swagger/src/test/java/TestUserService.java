import com.lh.demo.entity.User;
import com.lh.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUserService {
    private static final Logger logger = LoggerFactory.getLogger(TestUserService.class);
    @Autowired
    IUserService userService;

    @Test
    public void test1() {
        List<User> user = userService.getUser();
        logger.debug(user.toString());
    }
}
