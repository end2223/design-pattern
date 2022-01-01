package structuaral.facade.shop;
/*
* Facade design pattern
*
* 1. Facade: ShopFacade, here have the subsystems. The functions of subsystems are used to create a specific service
*    (A order will include shipping, payment, send email...).
* 2. Subsystem: ShippingService, PaymentService...The subsystems will implement the methods that represent the features of service.
*
*
*
* */
public class ShopFacade {
    private static ShopFacade INSTANCE;

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    private ShopFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public static ShopFacade getInstance() {
        if (INSTANCE==null){
            return new ShopFacade();
        }
        return INSTANCE;
    }

    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccountInfo(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendMail(email);
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccountInfo(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        emailService.sendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}
