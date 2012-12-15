package com.gengfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gengfo.domain.Post;
import com.gengfo.domain.Topic;
import com.gengfo.service.BbtForum;


public class TestBbtForumAnno{

	public static void main(String[] args) throws Throwable{
    	
		String configPath = "classpath:applicationContext-anno.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		BbtForum bbtForum = ctx.getBean(BbtForum.class);
		
    	System.out.println("begin........");
    	Topic topic = new Topic();
    	topic.setTopicTitle("Title -pfb");
    	Post post = new Post();
    	post.setPostText("post content -pfb");
    	topic.setPost(post);
    	bbtForum.addTopic(topic);
//    	((BbtForumImpl)bbtForum).setForumDao(null);
    	System.out.println("end........");
    }
}
