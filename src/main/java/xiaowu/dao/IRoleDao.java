package xiaowu.dao;


import xiaowu.domain.Role;

import java.util.List;

public interface IRoleDao {
    /**
     * 查询所有用户
     * @return
     */
    List<Role> findAll();

    /**
     * 查询所有用户并带有用户名称和地址
     * @return
     */
    List<Role> findAllAccountUser();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    Role findById(Integer userId);
}
