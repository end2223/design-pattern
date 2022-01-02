package structuaral.proxy.protectionproxy;

public class RealUserServiceImpl implements UserService{
    private String name;

    public RealUserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void load() {
        System.out.println(name + "loaded!");
    }

    @Override
    public void insert() {
        System.out.println(name + "inserted!");
    }
}
