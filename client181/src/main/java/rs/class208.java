package main.java.rs;

import java.util.Date;

public class class208 {

    static int method3941(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
        String string_4;
        int i_5;
        if (i_0 == 4100) {
            string_4 = class76.field1093[--class221.field2747];
            i_5 = class76.field1098[--class70.field1014];
            class76.field1093[++class221.field2747 - 1] = string_4 + i_5;
            return 1;
        } else {
            String string_10;
            if (i_0 == 4101) {
                class221.field2747 -= 2;
                string_4 = class76.field1093[class221.field2747];
                string_10 = class76.field1093[class221.field2747 + 1];
                class76.field1093[++class221.field2747 - 1] = string_4 + string_10;
                return 1;
            } else if (i_0 == 4102) {
                string_4 = class76.field1093[--class221.field2747];
                i_5 = class76.field1098[--class70.field1014];
                class76.field1093[++class221.field2747 - 1] = string_4 + class195.method3683(i_5, true, -808579598);
                return 1;
            } else if (i_0 == 4103) {
                string_4 = class76.field1093[--class221.field2747];
                class76.field1093[++class221.field2747 - 1] = string_4.toLowerCase();
                return 1;
            } else {
                int i_7;
                int i_11;
                if (i_0 == 4104) {
                    i_11 = class76.field1098[--class70.field1014];
                    long long_12 = (11745L + (long) i_11) * 86400000L;
                    class76.field1102.setTime(new Date(long_12));
                    i_7 = class76.field1102.get(5);
                    int i_17 = class76.field1102.get(2);
                    int i_9 = class76.field1102.get(1);
                    class76.field1093[++class221.field2747 - 1] = i_7 + "-" + class76.field1097[i_17] + "-" + i_9;
                    return 1;
                } else if (i_0 != 4105) {
                    if (i_0 == 4106) {
                        i_11 = class76.field1098[--class70.field1014];
                        class76.field1093[++class221.field2747 - 1] = Integer.toString(i_11);
                        return 1;
                    } else if (i_0 == 4107) {
                        class221.field2747 -= 2;
                        class76.field1098[++class70.field1014 - 1] = class141.method3292(class82.method1993(class76.field1093[class221.field2747], class76.field1093[class221.field2747 + 1], class56.field528, (byte) -1), -2066331179);
                        return 1;
                    } else {
                        int i_6;
                        byte[] bytes_14;
                        class295 class295_15;
                        if (i_0 == 4108) {
                            string_4 = class76.field1093[--class221.field2747];
                            class70.field1014 -= 2;
                            i_5 = class76.field1098[class70.field1014];
                            i_6 = class76.field1098[class70.field1014 + 1];
                            bytes_14 = class2.field6.method4144(i_6, 0, -1205433816);
                            class295_15 = new class295(bytes_14);
                            class76.field1098[++class70.field1014 - 1] = class295_15.method5390(string_4, i_5);
                            return 1;
                        } else if (i_0 == 4109) {
                            string_4 = class76.field1093[--class221.field2747];
                            class70.field1014 -= 2;
                            i_5 = class76.field1098[class70.field1014];
                            i_6 = class76.field1098[class70.field1014 + 1];
                            bytes_14 = class2.field6.method4144(i_6, 0, -1861029539);
                            class295_15 = new class295(bytes_14);
                            class76.field1098[++class70.field1014 - 1] = class295_15.method5343(string_4, i_5);
                            return 1;
                        } else if (i_0 == 4110) {
                            class221.field2747 -= 2;
                            string_4 = class76.field1093[class221.field2747];
                            string_10 = class76.field1093[class221.field2747 + 1];
                            if (class76.field1098[--class70.field1014] == 1) {
                                class76.field1093[++class221.field2747 - 1] = string_4;
                            } else {
                                class76.field1093[++class221.field2747 - 1] = string_10;
                            }

                            return 1;
                        } else if (i_0 == 4111) {
                            string_4 = class76.field1093[--class221.field2747];
                            class76.field1093[++class221.field2747 - 1] = class296.method5362(string_4);
                            return 1;
                        } else if (i_0 == 4112) {
                            string_4 = class76.field1093[--class221.field2747];
                            i_5 = class76.field1098[--class70.field1014];
                            class76.field1093[++class221.field2747 - 1] = string_4 + (char) i_5;
                            return 1;
                        } else if (i_0 == 4113) {
                            i_11 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = class278.method5153((char) i_11, (byte) 103) ? 1 : 0;
                            return 1;
                        } else if (i_0 == 4114) {
                            i_11 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = class67.method1231((char) i_11, -1187847794) ? 1 : 0;
                            return 1;
                        } else if (i_0 == 4115) {
                            i_11 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = class185.method3615((char) i_11, 2012637233) ? 1 : 0;
                            return 1;
                        } else if (i_0 == 4116) {
                            i_11 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = class49.method818((char) i_11, (short) 8230) ? 1 : 0;
                            return 1;
                        } else if (i_0 == 4117) {
                            string_4 = class76.field1093[--class221.field2747];
                            if (string_4 != null) {
                                class76.field1098[++class70.field1014 - 1] = string_4.length();
                            } else {
                                class76.field1098[++class70.field1014 - 1] = 0;
                            }

                            return 1;
                        } else if (i_0 == 4118) {
                            string_4 = class76.field1093[--class221.field2747];
                            class70.field1014 -= 2;
                            i_5 = class76.field1098[class70.field1014];
                            i_6 = class76.field1098[class70.field1014 + 1];
                            class76.field1093[++class221.field2747 - 1] = string_4.substring(i_5, i_6);
                            return 1;
                        } else if (i_0 == 4119) {
                            string_4 = class76.field1093[--class221.field2747];
                            StringBuilder stringbuilder_18 = new StringBuilder(string_4.length());
                            boolean bool_16 = false;

                            for (i_7 = 0; i_7 < string_4.length(); i_7++) {
                                char var_8 = string_4.charAt(i_7);
                                if (var_8 == 60) {
                                    bool_16 = true;
                                } else if (var_8 == 62) {
                                    bool_16 = false;
                                } else if (!bool_16) {
                                    stringbuilder_18.append(var_8);
                                }
                            }

                            class76.field1093[++class221.field2747 - 1] = stringbuilder_18.toString();
                            return 1;
                        } else if (i_0 == 4120) {
                            string_4 = class76.field1093[--class221.field2747];
                            i_5 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = string_4.indexOf(i_5);
                            return 1;
                        } else if (i_0 == 4121) {
                            class221.field2747 -= 2;
                            string_4 = class76.field1093[class221.field2747];
                            string_10 = class76.field1093[class221.field2747 + 1];
                            i_6 = class76.field1098[--class70.field1014];
                            class76.field1098[++class70.field1014 - 1] = string_4.indexOf(string_10, i_6);
                            return 1;
                        } else if (i_0 == 4122) {
                            string_4 = class76.field1093[--class221.field2747];
                            class76.field1093[++class221.field2747 - 1] = string_4.toUpperCase();
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    class221.field2747 -= 2;
                    string_4 = class76.field1093[class221.field2747];
                    string_10 = class76.field1093[class221.field2747 + 1];
                    if (Client.field657.field613 != null && Client.field657.field613.field2535) {
                        class76.field1093[++class221.field2747 - 1] = string_10;
                    } else {
                        class76.field1093[++class221.field2747 - 1] = string_4;
                    }

                    return 1;
                }
            }
        }
    }

}
