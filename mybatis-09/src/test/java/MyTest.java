import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);

        User user = mapper.QueryUserById(1);
        System.out.println(user);

        User user2 = mapper2.QueryUserById(1);
        System.out.println(user2);

        sqlSession.close();
        sqlSession2.close();

    }
}
