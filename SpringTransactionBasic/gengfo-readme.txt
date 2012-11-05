C:\GengFo\GitHub\Spring\SpringTransactionBasic

Take sample of the book spring enterprise to understand the transaction objects lived in jvm

~ enviornment preparation
1. oracle db setup
2. java project organization
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.gengfo -DartifactId=sprting-trancaction-basic




---- TECH 讲解 ----
Spring事务管理主要有三个借口：
1. PlatformTransactionManager：根据TransactionDefinition提供的事务属性配置信息，创建事务，并用TransactionStatus描述这个激活事务的状态。 
2. TransactionDefinition：描述事务的隔离级别、超时时间、是否为只读事务和事务传播规则等控制事务具体行为的事务属性，这些属性可以通过XML配置或者注解描述提供，也可以通过手工编程的方式设置。
3. TransactionStatus

~ TransactionDefinition

