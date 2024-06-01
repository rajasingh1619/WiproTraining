# WiproTraining
--------
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main Public {

public static void main(String[] args)

{

String config_loc= "/in/sp/resources/applicationContext.xml";

ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

Student std1 = (Student) context.getBean("stdId1"); std1.display();

System.out.println("------------");

Student std2 = (Student) context.getBean ("stdId 2 ") ; std2.display();

}
----------
<bean class="in.sp.beans.Student" id="stdId1">

<property name="name" value="Deepak" />

<property name="rollno" 31ue =^ prime prime 101^ prime prime />

<property name="email" value="deepak@gmail.com" />

</bean>

<bean class="in.sp.beans.Student" id="stdId2">

<property name="name" value="Amit" /> <property name="rollno" value=" 102 "/>

<property name="email" value="amit@gmail.com co m^ prime prime />

</bean>
