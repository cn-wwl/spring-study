import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.user;

public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("spring-context.xml");
        user u= context.getBean("user",user.class);
        u.Show();
    }
}
