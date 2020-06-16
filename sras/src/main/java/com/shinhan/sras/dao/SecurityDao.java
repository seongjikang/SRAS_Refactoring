package com.shinhan.sras.dao;

import com.shinhan.sras.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityDao {
	User getUser(String id);
}
