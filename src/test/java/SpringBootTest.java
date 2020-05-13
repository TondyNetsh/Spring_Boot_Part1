import org.junit.Test;

public class SpringBootTest {
    UserService user;

    @Test
    void contextLoads(){
        user.getUser(1);
        user.removeUser(1);
    }
}
