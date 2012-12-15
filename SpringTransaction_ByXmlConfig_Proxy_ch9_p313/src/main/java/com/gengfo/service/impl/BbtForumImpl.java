package com.gengfo.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.gengfo.dao.ForumDao;
import com.gengfo.dao.PostDao;
import com.gengfo.dao.TopicDao;
import com.gengfo.domain.Forum;
import com.gengfo.domain.Topic;
import com.gengfo.service.BbtForum;

@Transactional
public class BbtForumImpl implements BbtForum {
	private ForumDao forumDao;
	private TopicDao topicDao;
	private PostDao postDao;
	public void addTopic(Topic topic) throws Exception {
		topicDao.addTopic(topic);
//		if(true) throw new PessimisticLockingFailureException("fail");
		postDao.addPost(topic.getPost());
	}
	@Transactional(readOnly=true)
	public Forum getForum(int forumId) {
		return forumDao.getForum(forumId);
	}
	public void updateForum(Forum forum) {
		forumDao.updateForum(forum);
	}
	public int getForumNum() {
		return forumDao.getForumNum();
	}
	
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}
}
