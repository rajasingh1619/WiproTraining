# WiproTraining
<beans xmlns="http://www.springframework.org/schema/beans"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
       http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
	<bean id="addressBean1" class="com.wipro.model.Address">
		<constructor-arg name="doorNumber" value="3-4-356"/>
		<constructor-arg name="street" value="MG Street"/>
		<constructor-arg name="locality" value="Abids"/>
		<constructor-arg name="city" value="Hyderabad"/>
		<constructor-arg name="pincode" value="500001"/>
	</bean>
	
	<bean id="addressBean2" class="com.wipro.model.Address">
		<property name="doorNumber" value="8-6-112"/>
		<property name="street" value="Kings Street"/>
		<property name="locality" value="Bandra"/>
		<property name="city" value="Mumbai"/>
		<property name="pincode" value="400001"/>
	</bean>
	
	<!--  Inject the above address beans into person bean, use ref attribute -->
	
	<bean id="personBean" class="com.wipro.model.Person">
		<property name="adharCard" value="988612548769"/>
		<property name="name" value="Vinod Kumar"/>
		<property name="customBirthdate" value="1990-10-15"/>
		<property name="temporaryAddress" ref="addressBean1" />
		<property name="permanentAddress" ref="addressBean2" />
	</bean>
	
</beans>
