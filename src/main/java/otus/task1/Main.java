package otus.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {



    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        Test test = context.getBean(Test.class);
        test.startTest();
        context.close();
    }
}
