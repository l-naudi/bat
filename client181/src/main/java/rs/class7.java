package main.java.rs;

public class class7 {

    public static int field46;
    static int field48;
    static boolean field49;
    public final int field51;
    public final long field42;
    public final class9 field53;
    String field44;
    String field45;

    class7(class300 class300_1, byte b_2, int i_3) {
        this.field44 = class300_1.method5503(-231155257);
        this.field45 = class300_1.method5503(-231155257);
        this.field51 = class300_1.method5496(-1459053594);
        this.field42 = class300_1.method5531((byte) 97);
        int i_4 = class300_1.method5499((byte) -121);
        int i_5 = class300_1.method5499((byte) -24);
        this.field53 = new class9();
        this.field53.method115(2, (byte) 126);
        this.field53.method100(b_2, 874487771);
        this.field53.field60 = i_4;
        this.field53.field61 = i_5;
        this.field53.field58 = 0;
        this.field53.field63 = 0;
        this.field53.field59 = i_3;
    }

    public static class258 method81(int i_0, byte b_1) {
        class258 class258_2 = (class258) class258.field3524.method3320(i_0);
        if (class258_2 != null) {
            return class258_2;
        } else {
            byte[] bytes_3 = class258.field3527.method4144(12, i_0, 1999894982);
            class258_2 = new class258();
            if (bytes_3 != null) {
                class258_2.method4759(new class300(bytes_3), (byte) 88);
            }

            class258_2.method4761(806874502);
            class258.field3524.method3322(class258_2, i_0);
            return class258_2;
        }
    }

    static final void method73(int i_0) {
        class187 class187_1 = class235.method4265(class183.field2223, Client.field880.field1313, 1775123545);
        Client.field880.method2219(class187_1, 2067459847);

        for (class61 class61_2 = (class61) Client.field816.method5950(); class61_2 != null; class61_2 = (class61) Client.field816.method5953()) {
            if (class61_2.field569 == 0 || class61_2.field569 == 3) {
                class197.method3697(class61_2, true, -617236638);
            }
        }

        if (Client.field850 != null) {
            class224.method4120(Client.field850, -64988010);
            Client.field850 = null;
        }

    }

    public String method74(byte b_1) {
        return this.field44;
    }

    public String method77(short s_1) {
        return this.field45;
    }

}
