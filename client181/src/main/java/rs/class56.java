package main.java.rs;

public class class56 {

    public static int field529;
    static class190 field528;
    static int field527;
    static int field526;
    class92 field523;
    int[] field524;
    String[] field525;
    int field522 = -1;

    static final void method1090(int i_0) {
        if (Client.field700 > 0) {
            class174.method3593(1403573360);
        } else {
            Client.field797.method4993(-602398430);
            class96.method2265(40, (short) -28103);
            class269.field3563 = Client.field880.method2223((short) -15491);
            Client.field880.method2224((byte) 94);
        }
    }

    static void method1085(int i_0) {
        if (Client.field657.field1005 >> 7 == Client.field885 && Client.field657.field949 >> 7 == Client.field842) {
            Client.field885 = 0;
        }

    }

    static final void method1087(boolean bool_0, class299 class299_1, int i_2) {
        Client.field775 = 0;
        Client.field697 = 0;
        class250.method4530(-1674693758);

        int i_3;
        class79 class79_5;
        int i_6;
        int i_7;
        int i_8;
        int i_9;
        int i_10;
        while (class299_1.method5461(Client.field880.field1315, (short) 4225) >= 27) {
            i_3 = class299_1.method5445(15, -1832053520);
            if (i_3 == 32767) {
                break;
            }

            boolean bool_4 = false;
            if (Client.field694[i_3] == null) {
                Client.field694[i_3] = new class79();
                bool_4 = true;
            }

            class79_5 = Client.field694[i_3];
            Client.field696[++Client.field695 - 1] = i_3;
            class79_5.field973 = Client.field881;
            if (bool_0) {
                i_6 = class299_1.method5445(8, -1702898281);
                if (i_6 > 127) {
                    i_6 -= 256;
                }
            } else {
                i_6 = class299_1.method5445(5, -1974486374);
                if (i_6 > 15) {
                    i_6 -= 32;
                }
            }

            i_7 = class299_1.method5445(1, -2058066389);
            i_8 = Client.field780[class299_1.method5445(3, -1820438251)];
            if (bool_4) {
                class79_5.field1000 = class79_5.field950 = i_8;
            }

            i_9 = class299_1.method5445(1, -1867401853);
            if (i_9 == 1) {
                Client.field859[++Client.field697 - 1] = i_3;
            }

            if (bool_0) {
                i_10 = class299_1.method5445(8, -1657435452);
                if (i_10 > 127) {
                    i_10 -= 256;
                }
            } else {
                i_10 = class299_1.method5445(5, -1618169243);
                if (i_10 > 15) {
                    i_10 -= 32;
                }
            }

            class79_5.field1134 = class53.method1005(class299_1.method5445(14, -1787515405), (byte) -3);
            class79_5.field952 = class79_5.field1134.field3469;
            class79_5.field948 = class79_5.field1134.field3492;
            if (class79_5.field948 == 0) {
                class79_5.field950 = 0;
            }

            class79_5.field957 = class79_5.field1134.field3475;
            class79_5.field958 = class79_5.field1134.field3499;
            class79_5.field959 = class79_5.field1134.field3485;
            class79_5.field960 = class79_5.field1134.field3501;
            class79_5.field1004 = class79_5.field1134.field3472;
            class79_5.field955 = class79_5.field1134.field3482;
            class79_5.field956 = class79_5.field1134.field3474;
            class79_5.method1963(Client.field657.field994[0] + i_6, Client.field657.field962[0] + i_10, i_7 == 1, (short) 128);
        }

        class299_1.method5446((byte) -35);

        int i_15;
        for (i_3 = 0; i_3 < Client.field697; i_3++) {
            i_15 = Client.field859[i_3];
            class79_5 = Client.field694[i_15];
            i_6 = class299_1.method5504((byte) 42);
            if ((i_6 & 0x1) != 0) {
                class79_5.field975 = class299_1.method5532((byte) 28);
                if (class79_5.field975 == 65535) {
                    class79_5.field975 = -1;
                }
            }

            if ((i_6 & 0x40) != 0) {
                i_7 = class299_1.method5534(-2104150124);
                i_8 = class299_1.method5534(-2058967951);
                i_9 = class79_5.field1005 - (i_7 - class196.field2389 - class196.field2389) * 64;
                i_10 = class79_5.field949 - (i_8 - class1.field1 - class1.field1) * 64;
                if (i_9 != 0 || i_10 != 0) {
                    class79_5.field976 = (int) (Math.atan2(i_9, i_10) * 325.949D) & 0x7ff;
                }
            }

            if ((i_6 & 0x20) != 0) {
                i_7 = class299_1.method5496(-1459053594);
                if (i_7 == 65535) {
                    i_7 = -1;
                }

                i_8 = class299_1.method5525(2127964353);
                if (i_7 == class79_5.field981 && i_7 != -1) {
                    i_9 = class7.method81(i_7, (byte) 1).field3529;
                    if (i_9 == 1) {
                        class79_5.field951 = 0;
                        class79_5.field974 = 0;
                        class79_5.field984 = i_8;
                        class79_5.field985 = 0;
                    }

                    if (i_9 == 2) {
                        class79_5.field985 = 0;
                    }
                } else if (i_7 == -1 || class79_5.field981 == -1 || class7.method81(i_7, (byte) 1).field3533 >= class7.method81(class79_5.field981, (byte) 1).field3533) {
                    class79_5.field981 = i_7;
                    class79_5.field951 = 0;
                    class79_5.field974 = 0;
                    class79_5.field984 = i_8;
                    class79_5.field985 = 0;
                    class79_5.field1008 = class79_5.field1003;
                }
            }

            if ((i_6 & 0x4) != 0) {
                class79_5.field1134 = class53.method1005(class299_1.method5496(-1459053594), (byte) -91);
                class79_5.field952 = class79_5.field1134.field3469;
                class79_5.field948 = class79_5.field1134.field3492;
                class79_5.field957 = class79_5.field1134.field3475;
                class79_5.field958 = class79_5.field1134.field3499;
                class79_5.field959 = class79_5.field1134.field3485;
                class79_5.field960 = class79_5.field1134.field3501;
                class79_5.field1004 = class79_5.field1134.field3472;
                class79_5.field955 = class79_5.field1134.field3482;
                class79_5.field956 = class79_5.field1134.field3474;
            }

            if ((i_6 & 0x10) != 0) {
                i_7 = class299_1.method5524((byte) -67);
                int i_11;
                int i_12;
                int i_13;
                if (i_7 > 0) {
                    for (i_8 = 0; i_8 < i_7; i_8++) {
                        i_10 = -1;
                        i_11 = -1;
                        i_12 = -1;
                        i_9 = class299_1.method5508(497319136);
                        if (i_9 == 32767) {
                            i_9 = class299_1.method5508(497319136);
                            i_11 = class299_1.method5508(497319136);
                            i_10 = class299_1.method5508(497319136);
                            i_12 = class299_1.method5508(497319136);
                        } else if (i_9 != 32766) {
                            i_11 = class299_1.method5508(497319136);
                        } else {
                            i_9 = -1;
                        }

                        i_13 = class299_1.method5508(497319136);
                        class79_5.method1657(i_9, i_11, i_10, i_12, Client.field881, i_13, 295125263);
                    }
                }

                i_8 = class299_1.method5722(1353343245);
                if (i_8 > 0) {
                    for (i_9 = 0; i_9 < i_8; i_9++) {
                        i_10 = class299_1.method5508(497319136);
                        i_11 = class299_1.method5508(497319136);
                        if (i_11 != 32767) {
                            i_12 = class299_1.method5508(497319136);
                            i_13 = class299_1.method5504((byte) 74);
                            int i_14 = i_11 > 0 ? class299_1.method5525(375649690) : i_13;
                            class79_5.method1655(i_10, Client.field881, i_11, i_12, i_13, i_14, (byte) 15);
                        } else {
                            class79_5.method1659(i_10, 1541896355);
                        }
                    }
                }
            }

            if ((i_6 & 0x8) != 0) {
                class79_5.field986 = class299_1.method5532((byte) 27);
                i_7 = class299_1.method5542((byte) 113);
                class79_5.field990 = i_7 >> 16;
                class79_5.field989 = (i_7 & 0xffff) + Client.field881;
                class79_5.field987 = 0;
                class79_5.field988 = 0;
                if (class79_5.field989 > Client.field881) {
                    class79_5.field987 = -1;
                }

                if (class79_5.field986 == 65535) {
                    class79_5.field986 = -1;
                }
            }

            if ((i_6 & 0x2) != 0) {
                class79_5.field977 = class299_1.method5503(-231155257);
                class79_5.field1002 = 100;
            }
        }

        for (i_3 = 0; i_3 < Client.field775; i_3++) {
            i_15 = Client.field776[i_3];
            if (Client.field694[i_15].field973 != Client.field881) {
                Client.field694[i_15].field1134 = null;
                Client.field694[i_15] = null;
            }
        }

        if (class299_1.field3732 != Client.field880.field1315) {
            throw new RuntimeException(class299_1.field3732 + "," + Client.field880.field1315);
        } else {
            for (i_3 = 0; i_3 < Client.field695; i_3++) {
                if (Client.field694[Client.field696[i_3]] == null) {
                    throw new RuntimeException(i_3 + "," + Client.field695);
                }
            }

        }
    }

    static final void method1088(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, class172[] arr_8, byte b_9) {
        int i_11;
        for (int i_10 = 0; i_10 < 8; i_10++) {
            for (i_11 = 0; i_11 < 8; i_11++) {
                if (i_10 + i_2 > 0 && i_10 + i_2 < 103 && i_3 + i_11 > 0 && i_3 + i_11 < 103) {
                    arr_8[i_1].field2085[i_10 + i_2][i_3 + i_11] &= ~0x1000000;
                }
            }
        }

        class300 class300_14 = new class300(bytes_0);

        for (i_11 = 0; i_11 < 4; i_11++) {
            for (int i_12 = 0; i_12 < 64; i_12++) {
                for (int i_13 = 0; i_13 < 64; i_13++) {
                    if (i_11 == i_4 && i_12 >= i_5 && i_12 < i_5 + 8 && i_13 >= i_6 && i_13 < i_6 + 8) {
                        class28.method419(class300_14, i_1, i_2 + class197.method3702(i_12 & 0x7, i_13 & 0x7, i_7, (byte) -75), i_3 + class36.method625(i_12 & 0x7, i_13 & 0x7, i_7, 1091225216), 0, 0, i_7, -1566017890);
                    } else {
                        class28.method419(class300_14, 0, -1, -1, 0, 0, 0, -1566017890);
                    }
                }
            }
        }

    }

    static void method1086(int i_0, int i_1, int i_2) {
        class187 class187_3 = class235.method4265(class183.field2273, Client.field880.field1313, 1775123545);
        class187_3.field2333.method5540(i_0, 703583712);
        class187_3.field2333.method5530(i_1, (byte) -4);
        Client.field880.method2219(class187_3, 2067459847);
    }

    static final void method1089(byte b_0) {
        class187 class187_1 = class235.method4265(class183.field2286, Client.field880.field1313, 1775123545);
        class187_1.field2333.method5655(0, 246102595);
        Client.field880.method2219(class187_1, 2067459847);
    }

}
