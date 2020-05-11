public abstract interface FakeRepoInterface {
    public void insertUser(String name, String surname);
    public String findUserById(long Id);
    public void deleteUser(long Id);

    void addUser(User user)

    void removeUser(long id);

    void getUser(long id);
}
