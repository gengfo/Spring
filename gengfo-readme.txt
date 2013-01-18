tried clone to office pc

?? apache common lang StringBuilder usage

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


<<<<<<< HEAD
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
=======
-----Spring 注解用法，smmary page： 133， 基于xml，基于注解配置，基于java类配置
~spring @Configuration，等同@Component
~spring @Component //注解表明这个类作为一个bean
example:
@Component("userDao") //bean id 
public class UserDao{ //bean class
}
=>等同于
<bean id = "userDao" class="com.gengfo.UserDao">

<context:component-scan base-package="com.baobaotao.anno"/>


@Autowired -> 实现bean的依赖注入
@Qualifier -> 限定bean的名称， 如： @Qualifier("userDao")

JSR-250定义@Resource，@Resource按名称匹配注入，@Autowired默认按类型匹配
JSR-330定义@Inject


～spring事务核心api
interface PlatformTransactionManager -> 根据TransactionDefinition的定义创建事务，并用TransactionStatus记录状态
TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException;
void commit
void rollback
interface TransactionDefinition ->描述事务的隔离级别、超时时间、是否为只读事务、事务传播规则等控制事务行为的事务属性
interface TransactionStatus -> 描述已经激活事务的状态


~JPA Transaction: JPA通过javax.persistence.EntityTransaction管理JPA的事务，EntityTransaction对象可以通过javax.persistence.EntityManager#getTransaction()获得，而EntityManager又通过javax.persistence.EntityManagerFactory()#createEntityManager()获得。JPA依然通过底层JDBC connection的事务方法完成最终事务控制。
~配置JPA事务管理器：
1. 提供一个data source
2. 配置一个EntityManagerFactory
3. 配置JpaTransactionManager

EntityManager的创建过程：
javax.persistence.spi.PersistenceProvider接口有JPA的实现者提供，该接口有容器调用，以便创建EntityManagerFacttory实例。

~proxy-target-class
 spring进行事务管理时，有proxy-target-class属性，定义事务dao是接口还是类，默认为false，为接口，如果dao为实现类时就会报以上错误，将 proxy-target-class设置为true就可以了。 

在spring中@Transaction是通过AOP实现的，而spring对AOP有两种实现方式，一种是动态代理，它是通过接口方式实现的，要求所代理的类一定是实现了某一个接口，对一般的类就无法代理，spring默认是这种；通过设置proxy-target-class="true"，则是使用CGLIB实现AOP，CGLIB直接生成二进制码，使得普通类也可以实现AOP。在没有设置proxy-target-class="true"时，使用动态代理，是一个临时生成的类，如proxy17，它不是@Resource指定的类，因此出现了上述错误。 


spring transaction的通常配置方法：
1. 配置datasource，作为事务管理的具体实现机制
2. 配置trasaction manager 并关联到datasource
3. 配置advisor, 包括pointcut 以及advice，也就是类切入点，以及切入的逻辑
4. 将transaction manager 和advisor 进行管理，制定事务管理




-------------mysql usage------------------
already installed
~mysqld start as windows service

mysql -u root -p
oocl123456
use mysql;
grant all privileges on *.* to dbuser@localhost identified by 'oocl123456' with grant option;
create database BookDB;


