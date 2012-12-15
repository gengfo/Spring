package com.gengfo.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.gengfo.dao.ForumDao;
import com.gengfo.domain.Forum;

public class ForumService1 {
	private ForumDao forumDao;
	private TransactionTemplate template;
	public void addForum(final Forum forum) {
		
		template.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				forumDao.addForum(forum);
			}
		});

	}
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	public void setTemplate(TransactionTemplate template) {
		this.template = template;
	}

	
	
}
