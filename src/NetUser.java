/**
 * Created @2017/5/13 16:09
 */
public class NetUser {
    int id;
    String name;
    String email;

    public NetUser(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public NetUser(int id, String name) {
        this.id = id;
        this.name = name;
        email = "@gameschool.com";
    }

    public String toString() {
        return id + " " + name + " " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetUser netUser = (NetUser) o;

        if (id != netUser.id) return false;
        if (name != null ? !name.equals(netUser.name) : netUser.name != null) return false;
        return email != null ? email.equals(netUser.email) : netUser.email == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }



    public static void main(String... args) {
        NetUser netUser = new NetUser(1, "XYZ", "XYZ@u.com");

        System.out.println(netUser);

        change(netUser);
        System.out.println(netUser);


    }

    public static NetUser change(NetUser netUser) {
        netUser.email = "XXXXXXXXXX";
        return netUser;
    }
}


