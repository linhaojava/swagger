import com.lh.demo.dao.UserDao;
import com.lh.demo.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUserDao {
    private static final Logger logger = LoggerFactory.getLogger(TestUserDao.class);
    UserDao userDao;

    @Before
    public void init() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        userDao = context.getBean(UserDao.class);
    }

    @Test
    public void test1() {
        List<User> user = userDao.getUser();
        logger.debug(user.toString());
    }
}

