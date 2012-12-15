
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=SpringResourceBasic_ch3_p54
FileSystemResource:以系统绝对路径访问String filePath = "C://conf//file1.txt";
ClassPathResource:以classpath路径访问Resource res2 = new ClassPathResource("conf/file1.txt");
            

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=SpringIocBasic_ch3

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=ReflectTest_ch3

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=gengfo.test -DartifactId=mf-mif-usage

----------------------------------------------------------------------
20121104-jotm 做事务管理实例
SpringJTATotm


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
