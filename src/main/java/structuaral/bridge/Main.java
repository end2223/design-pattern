package structuaral.bridge;

import structuaral.bridge.devices.Device;
import structuaral.bridge.devices.Radio;
import structuaral.bridge.devices.Tv;
import structuaral.bridge.remote.AdvancedRemote;
import structuaral.bridge.remote.BasicRemote;
/*
*
* Bridge Pattern
* 1. Abstraction: BasicRemote
* 2. Refined Abstraction: AdvancedRemote
* 3. Implementor: Device
* 4. Concrete: Tv, Radio
*
* BasicRemote will do nothing.All control from BasicRemote will send to Device Interface. And after that, subclasses of
* Device will do it.
* This help decouple Abstraction and Implement. RemoteBasic will create abstract or common method, and their implementation
* is implemented by implementer
*
* */

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());

        System.out.println();
        System.out.println("====================================");
        System.out.println();

        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
