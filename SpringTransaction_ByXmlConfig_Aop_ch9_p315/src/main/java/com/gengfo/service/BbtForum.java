package com.gengfo.service;
import com.gengfo.domain.Forum;
import com.gengfo.domain.Topic;

public interface BbtForum {
	void addTopic(Topic topic) throws Exception;
	void updateForum(Forum forum);
	Forum getForum(int forumId);
	int getForumNum();
}
