package main.java.rs;

import javax.imageio.ImageIO;

public class class49 {

    static {
        ImageIO.setUseCache(false);
    }

    public static boolean method818(char var_0, short s_1) {
        return var_0 >= 48 && var_0 <= 57;
    }

    static void method815(short s_0) {
        if (class85.field1180 == null || class85.field1180.length() <= 0) {
            if (class17.field117.field1065 != null) {
                class85.field1180 = class17.field117.field1065;
                Client.field691 = true;
            } else {
                Client.field691 = false;
            }

        }
    }

    static class92 method821(int i_0, int i_1, byte b_2) {
        class92 class92_3 = (class92) class92.field1291.method3320(i_0 << 16);
        if (class92_3 != null) {
            return class92_3;
        } else {
            String string_4 = String.valueOf(i_0);
            int i_5 = class151.field1971.method4160(string_4, 1119165390);
            if (i_5 == -1) {
                return null;
            } else {
                byte[] bytes_6 = class151.field1971.method4208(i_5, 1034279223);
                if (bytes_6 != null) {
                    if (bytes_6.length <= 1) {
                        return null;
                    }

                    class92_3 = class71.method1705(bytes_6, 184444180);
                    if (class92_3 != null) {
                        class92.field1291.method3322(class92_3, i_0 << 16);
                        return class92_3;
                    }
                }

                return null;
            }
        }
    }

}
