package zyz.dao;

import org.apache.ibatis.annotations.Select;
import zyz.domain.User;

import java.util.List;

/**用户的持久层接口
 * @author 张远之
 * @create 2021-04-22 21:42
 */

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
}
