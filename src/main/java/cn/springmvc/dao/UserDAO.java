package cn.springmvc.dao;

import cn.springmvc.model.User;

public interface UserDAO {

	/**
	 * ������û�
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
}
