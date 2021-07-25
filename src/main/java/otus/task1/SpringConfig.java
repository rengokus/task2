package otus.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("otus.task1")
public class SpringConfig {
    @Bean
    public Question question1() {
        return new Question();
    }

    @Bean
    public Question question2() {
        return new Question();
    }

    @Bean
    public Question question3() {
        return new Question();
    }

    @Bean
    public Test test() {
        return new Test(new Question[] {question1(), question2(), question3()});
    }
}
