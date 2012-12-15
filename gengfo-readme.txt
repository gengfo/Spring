mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=AopBasic_ch6_p178

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=BeanAnnotation_ch4_p120
@Component
@Repository
@Service
@Controller


mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=AttrInject_ch4_p86

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=BeanLifeCycle_ch3_p72

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=WebApplicationContextByServlet_ch3_p65

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=WebApplicationContextByListener_ch3_p65

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=AnnotationApplicationContextTest_ch3_p63

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=XmlApplicationContextTest_ch3_62

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=SpringBeanFactoryBasic_ch3_p60

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=SpringResourceBasic_ch3_p54
FileSystemResource:以系统绝对路径访问String filePath = "C://conf//file1.txt";
ClassPathResource:以classpath路径访问Resource res2 = new ClassPathResource("conf/file1.txt");
            

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=SpringIocBasic_ch3

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=ReflectTest_ch3

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=mf-mif-usage

----------------------------------------------------------------------
20121104-jotm 做事务管理实例
SpringJTATotm


<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>


		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-orm</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>
		<!-- <dependency> <groupId>org.springframework</groupId> <artifactId>spring-beans</artifactId> 
			<version>2.5.4</version> </dependency> -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-expression</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<version>3.0.5.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.16</version>
		</dependency>
		
		<dependency>
			<groupId>cglib</groupId>
			<artifactId>cglib-full</artifactId>
			<version>2.0.2</version>
		</dependency>