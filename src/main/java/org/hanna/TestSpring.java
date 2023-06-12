package org.hanna;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Solution solution = context.getBean("testBean", Solution.class);

        System.out.println(solution.getName());
        context.close();
    }
}
