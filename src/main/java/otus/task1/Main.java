package otus.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Test test = context.getBean("testBean", Test.class);
        test.startTest();
        context.close();
    }
}
