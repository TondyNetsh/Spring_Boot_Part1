import com.Springboot.User;
public abstract interface FakeRepoInterface <T>{
    public T insertUser(User user);

    Object insertUser(Object user);

    public T findUserById(long id);
    public T deleteUser(long id);
}
