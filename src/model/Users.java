package model;



import javax.annotation.ManagedBean;
import java.util.List;



public class Users
{
    private List<User> users;



    public Users()
    {
    }



    public Users(List<User> users)
    {
        this.users = users;
    }



    public List<User> getUsers()
    {
        return users;
    }



    public void setUsers(List<User> users)
    {
        this.users = users;
    }



    public void addUser(User user)
    {
        this.users.add(user);
    }
}