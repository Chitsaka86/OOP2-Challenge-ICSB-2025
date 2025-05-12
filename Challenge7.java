package Pkg.OOP_Challenge;
public class Challenge7 {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(190012, "Michelle", "michelle2006$");
        User curUser = new User(1000, "Mary");

        curAdmin.performOperation(new Update());
        curUser.performOperation(new View());
        curAdmin.performOperation(new Delete());

    }
}
// abstract class account
abstract class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData){
        myData = _myData;
        myData.execute();
    }
}
// admin inheriting from account
class Admin extends Account{
    private String AuthPassword;

// constructor
    public Admin(int _id, String _name, String _password){
        this.id= _id;
        this.name= _name;
        this.AuthPassword= _password;
    }
}
// user inheriting form account
class User extends Account {

    // constructor
    public User(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }
}
// interface
interface DataSource{
    void execute();
}
// implementations of the datasource
// updating
class Update implements DataSource{
    @Override
    public  void execute(){
        System.out.println("Update Successful");
    }
}
// viewing
class View implements DataSource{
    @Override
    public void execute(){
        System.out.println("View Data");
    }
}
// deleting
class Delete implements DataSource{
    @Override
    public void execute(){
        System.out.println("Data Deleted");
    }
}