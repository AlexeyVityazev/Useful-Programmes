package alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configApplication.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
//        myCat.say();
//        context.close();
    }
}
