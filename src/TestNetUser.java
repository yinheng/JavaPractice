/**
 * Created @2017/5/13 16:15
 */
public class TestNetUser {
    public static void main(String[] arg) {
        NetUser user1 = new NetUser(1, "Tom");
        NetUser user2 = new NetUser(2, "Kitty", "Kitty@qq.com");
        System.out.println(user1.toString() + " " + user2.toString());
    }

}
