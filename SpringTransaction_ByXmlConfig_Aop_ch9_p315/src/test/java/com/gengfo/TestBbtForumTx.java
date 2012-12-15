package com.gengfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gengfo.domain.Post;
import com.gengfo.domain.Topic;
import com.gengfo.service.BbtForum;

public class TestBbtForumTx{
	public static void main(String[] args) throws Throwable{
		String configPath = "classpath:applicationContext-tx.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		BbtForum bbtForum = ctx.getBean(BbtForum.class);
		
    	System.out.println("begin........");
    	Topic topic = new Topic();
    	topic.setTopicTitle("Title -tx");
    	Post post = new Post();
    	post.setPostText("post content -tx");
    	topic.setPost(post);
    	bbtForum.addTopic(topic);
    	System.out.println("end........");
    }
}
