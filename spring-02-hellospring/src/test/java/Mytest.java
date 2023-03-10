import com.jyching.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        // 获取Spring的上下对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在Spring中管理了，我们要使用，直接去里面取出来就可以了
        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
