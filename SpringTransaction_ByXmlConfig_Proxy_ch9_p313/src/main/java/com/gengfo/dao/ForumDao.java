package com.gengfo.dao;

import com.gengfo.domain.Forum;

public interface ForumDao {
   void addForum(Forum forum);
   void updateForum(Forum forum);
   Forum getForum(int forumId);
   int getForumNum();
}
