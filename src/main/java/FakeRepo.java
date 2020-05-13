import com.Springboot.User;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public abstract class FakeRepo implements FakeRepoInterface <User>{
    private Map<Integer, User> repository;

    public FakeRepo() {
        this.repository = new HashMap<>();
    }

    @Override
    public User deleteUser(long id) {
        User e = repository.get(id);
        this.repository.remove(id);
        return e;
    }

    @Override
    public User insertUser(User user) {
        return repository.put((int) user.getId(),user);
    }

    @Override
    public User findUserById(long id) {
        return repository.get(id);
    }
}
