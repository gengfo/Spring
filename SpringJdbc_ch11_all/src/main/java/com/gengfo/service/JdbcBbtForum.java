package com.gengfo.service;

import com.gengfo.dao.ForumDao;
import com.gengfo.domain.Forum;

public class JdbcBbtForum implements BbtForum {
    private ForumDao forumDao;
    
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}

	public void addForum(Forum forum) {
		forumDao.addForum(forum);
	}
}
