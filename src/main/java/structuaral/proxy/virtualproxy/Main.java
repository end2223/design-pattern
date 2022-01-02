package structuaral.proxy.virtualproxy;
/*
* Virtual proxy: Tri hoan viec tao ra real subject ben trong proxy class.
* Load anh khi scroll website
*
* Subject: Image
* Proxy: ProxyImage
* RealSubject: RealImage
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}