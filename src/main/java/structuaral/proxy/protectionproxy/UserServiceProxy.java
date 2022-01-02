package structuaral.proxy.protectionproxy;

public class UserServiceProxy implements UserService{
    private String role;
    private RealUserServiceImpl realUserService;

    public UserServiceProxy(String role, String name) {
        this.role = role;
        this.realUserService = new RealUserServiceImpl(name);
    }

    @Override
    public void load() {
        realUserService.load();
    }

    @Override
    public void insert() {
        if (isAdmin()) {
            realUserService.insert();
        } else {
            throw new IllegalAccessError("Access denied");
        }
    }

    private boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.role);
    }
}