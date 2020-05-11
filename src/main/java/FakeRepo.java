import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Scanner;

@Repository
public abstract class FakeRepo <User> implements FakeRepoInterface{
    ArrayList<User> user = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void insertUser(String name, String surname){
        user.add((User) name);
        user.add((User) surname);
    }

    @Override
    public String findUserById(long Id){
        return null;
    }

    @Override
    public void deleteUser(long Id){

    }
}
