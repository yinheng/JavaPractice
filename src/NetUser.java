/**
 * Created @2017/5/13 16:09
 */
public class NetUser {
    int id;
    String name;
    String email;

    public  NetUser(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public  NetUser(int id, String name) {
        this.id = id;
        this.name = name;
        email = "@gameschool.com";
    }

    public String toString() {
        return id + " " +   name + " " + email;
    }
}


