# Capgemini
Internship


<servlet>
        <servlet-name>billGeneration</servlet-name>
        <servlet-class>com.capgemini.billing.CreateBill</servlet-class>
        <init-param>
        	<param-name>database</param-name>
        	<param-value>oracle</param-value>
        </init-param>
    </servlet>
    <servlet-mapping>
        <servlet-name>billGeneration</servlet-name>
        <url-pattern>/generate</url-pattern>
    </servlet-mapping> 
