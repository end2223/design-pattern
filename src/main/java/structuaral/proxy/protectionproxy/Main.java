package structuaral.proxy.protectionproxy;
/*
* Protection Proxy
*
* Nguoi goi proxy phai duoc chung thuc truoc khi goi toi real subject
*
* */
public class Main {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("admin", "caongocson");
        admin.load();
        admin.insert();

        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
    }
}
