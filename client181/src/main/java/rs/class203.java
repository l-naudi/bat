package main.java.rs;

public class class203 extends class180 {

    byte[] field2491;
    class318 field2492;

    class203(class300 class300_1) {
        class300_1.field3732 = class300_1.field3730.length - 3;
        int i_2 = class300_1.method5504((byte) 74);
        int i_3 = class300_1.method5496(-1459053594);
        int i_4 = i_2 * 10 + 14;
        class300_1.field3732 = 0;
        int i_5 = 0;
        int i_6 = 0;
        int i_7 = 0;
        int i_8 = 0;
        int i_9 = 0;
        int i_10 = 0;
        int i_11 = 0;
        int i_12 = 0;

        int i_13;
        int i_14;
        int i_15;
        for (i_13 = 0; i_13 < i_2; i_13++) {
            i_14 = -1;

            while (true) {
                i_15 = class300_1.method5504((byte) 115);
                if (i_15 != i_14) {
                    ++i_4;
                }

                i_14 = i_15 & 0xf;
                if (i_15 == 7) {
                    break;
                }

                if (i_15 == 23) {
                    ++i_5;
                } else if (i_14 == 0) {
                    ++i_7;
                } else if (i_14 == 1) {
                    ++i_8;
                } else if (i_14 == 2) {
                    ++i_6;
                } else if (i_14 == 3) {
                    ++i_9;
                } else if (i_14 == 4) {
                    ++i_10;
                } else if (i_14 == 5) {
                    ++i_11;
                } else {
                    if (i_14 != 6) {
                        throw new RuntimeException();
                    }

                    ++i_12;
                }
            }
        }

        i_4 += i_5 * 5;
        i_4 += (i_7 + i_8 + i_6 + i_9 + i_11) * 2;
        i_4 = i_4 + i_10 + i_12;
        i_13 = class300_1.field3732;
        i_14 = i_2 + i_5 + i_6 + i_7 + i_8 + i_9 + i_10 + i_11 + i_12;

        for (i_15 = 0; i_15 < i_14; i_15++) {
            class300_1.method5657((byte) 46);
        }

        i_4 += class300_1.field3732 - i_13;
        i_15 = class300_1.field3732;
        int i_16 = 0;
        int i_17 = 0;
        int i_18 = 0;
        int i_19 = 0;
        int i_20 = 0;
        int i_21 = 0;
        int i_22 = 0;
        int i_23 = 0;
        int i_24 = 0;
        int i_25 = 0;
        int i_26 = 0;
        int i_27 = 0;
        int i_28 = 0;

        int i_29;
        for (i_29 = 0; i_29 < i_6; i_29++) {
            i_28 = i_28 + class300_1.method5504((byte) 112) & 0x7f;
            if (i_28 != 0 && i_28 != 32) {
                if (i_28 == 1) {
                    ++i_16;
                } else if (i_28 == 33) {
                    ++i_17;
                } else if (i_28 == 7) {
                    ++i_18;
                } else if (i_28 == 39) {
                    ++i_19;
                } else if (i_28 == 10) {
                    ++i_20;
                } else if (i_28 == 42) {
                    ++i_21;
                } else if (i_28 == 99) {
                    ++i_22;
                } else if (i_28 == 98) {
                    ++i_23;
                } else if (i_28 == 101) {
                    ++i_24;
                } else if (i_28 == 100) {
                    ++i_25;
                } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
                    ++i_27;
                } else {
                    ++i_26;
                }
            } else {
                ++i_12;
            }
        }

        i_29 = 0;
        int i_30 = class300_1.field3732;
        class300_1.field3732 += i_26;
        int i_31 = class300_1.field3732;
        class300_1.field3732 += i_11;
        int i_32 = class300_1.field3732;
        class300_1.field3732 += i_10;
        int i_33 = class300_1.field3732;
        class300_1.field3732 += i_9;
        int i_34 = class300_1.field3732;
        class300_1.field3732 += i_16;
        int i_35 = class300_1.field3732;
        class300_1.field3732 += i_18;
        int i_36 = class300_1.field3732;
        class300_1.field3732 += i_20;
        int i_37 = class300_1.field3732;
        class300_1.field3732 += i_7 + i_8 + i_11;
        int i_38 = class300_1.field3732;
        class300_1.field3732 += i_7;
        int i_39 = class300_1.field3732;
        class300_1.field3732 += i_27;
        int i_40 = class300_1.field3732;
        class300_1.field3732 += i_8;
        int i_41 = class300_1.field3732;
        class300_1.field3732 += i_17;
        int i_42 = class300_1.field3732;
        class300_1.field3732 += i_19;
        int i_43 = class300_1.field3732;
        class300_1.field3732 += i_21;
        int i_44 = class300_1.field3732;
        class300_1.field3732 += i_12;
        int i_45 = class300_1.field3732;
        class300_1.field3732 += i_9;
        int i_46 = class300_1.field3732;
        class300_1.field3732 += i_22;
        int i_47 = class300_1.field3732;
        class300_1.field3732 += i_23;
        int i_48 = class300_1.field3732;
        class300_1.field3732 += i_24;
        int i_49 = class300_1.field3732;
        class300_1.field3732 += i_25;
        int i_50 = class300_1.field3732;
        class300_1.field3732 += i_5 * 3;
        this.field2491 = new byte[i_4];
        class300 class300_51 = new class300(this.field2491);
        class300_51.method5481(1297377380, 194212452);
        class300_51.method5481(6, -1789150025);
        class300_51.method5479(i_2 > 1 ? 1 : 0, (byte) -49);
        class300_51.method5479(i_2, (byte) -87);
        class300_51.method5479(i_3, (byte) 33);
        class300_1.field3732 = i_13;
        int i_52 = 0;
        int i_53 = 0;
        int i_54 = 0;
        int i_55 = 0;
        int i_56 = 0;
        int i_57 = 0;
        int i_58 = 0;
        int[] ints_59 = new int[128];
        i_28 = 0;

        label235:
        for (int i_60 = 0; i_60 < i_2; i_60++) {
            class300_51.method5481(1297379947, -2095140300);
            class300_51.field3732 += 4;
            int i_61 = class300_51.field3732;
            int i_62 = -1;

            while (true) {
                while (true) {
                    int i_63 = class300_1.method5657((byte) 35);
                    class300_51.method5603(i_63, -1186433377);
                    int i_64 = class300_1.field3730[i_29++] & 0xff;
                    boolean bool_65 = i_64 != i_62;
                    i_62 = i_64 & 0xf;
                    if (i_64 == 7) {
                        if (bool_65) {
                            class300_51.method5655(255, 291233392);
                        }

                        class300_51.method5655(47, 955699508);
                        class300_51.method5655(0, 1713251277);
                        class300_51.method5489(class300_51.field3732 - i_61, -1846433239);
                        continue label235;
                    }

                    if (i_64 == 23) {
                        if (bool_65) {
                            class300_51.method5655(255, 1569747082);
                        }

                        class300_51.method5655(81, 763247308);
                        class300_51.method5655(3, 1039111078);
                        class300_51.method5655(class300_1.field3730[i_50++], 1545784548);
                        class300_51.method5655(class300_1.field3730[i_50++], 840659094);
                        class300_51.method5655(class300_1.field3730[i_50++], 906831865);
                    } else {
                        i_52 ^= i_64 >> 4;
                        if (i_62 == 0) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 144, 386612606);
                            }

                            i_53 += class300_1.field3730[i_37++];
                            i_54 += class300_1.field3730[i_38++];
                            class300_51.method5655(i_53 & 0x7f, 732389109);
                            class300_51.method5655(i_54 & 0x7f, 1364006297);
                        } else if (i_62 == 1) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 128, 1745462229);
                            }

                            i_53 += class300_1.field3730[i_37++];
                            i_55 += class300_1.field3730[i_40++];
                            class300_51.method5655(i_53 & 0x7f, 910098018);
                            class300_51.method5655(i_55 & 0x7f, 1064938707);
                        } else if (i_62 == 2) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 176, 228698113);
                            }

                            i_28 = i_28 + class300_1.field3730[i_15++] & 0x7f;
                            class300_51.method5655(i_28, 1444795229);
                            byte b_66;
                            if (i_28 != 0 && i_28 != 32) {
                                if (i_28 == 1) {
                                    b_66 = class300_1.field3730[i_34++];
                                } else if (i_28 == 33) {
                                    b_66 = class300_1.field3730[i_41++];
                                } else if (i_28 == 7) {
                                    b_66 = class300_1.field3730[i_35++];
                                } else if (i_28 == 39) {
                                    b_66 = class300_1.field3730[i_42++];
                                } else if (i_28 == 10) {
                                    b_66 = class300_1.field3730[i_36++];
                                } else if (i_28 == 42) {
                                    b_66 = class300_1.field3730[i_43++];
                                } else if (i_28 == 99) {
                                    b_66 = class300_1.field3730[i_46++];
                                } else if (i_28 == 98) {
                                    b_66 = class300_1.field3730[i_47++];
                                } else if (i_28 == 101) {
                                    b_66 = class300_1.field3730[i_48++];
                                } else if (i_28 == 100) {
                                    b_66 = class300_1.field3730[i_49++];
                                } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
                                    b_66 = class300_1.field3730[i_39++];
                                } else {
                                    b_66 = class300_1.field3730[i_30++];
                                }
                            } else {
                                b_66 = class300_1.field3730[i_44++];
                            }

                            int i_67 = b_66 + ints_59[i_28];
                            ints_59[i_28] = i_67;
                            class300_51.method5655(i_67 & 0x7f, 2029992045);
                        } else if (i_62 == 3) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 224, 946777970);
                            }

                            i_56 += class300_1.field3730[i_45++];
                            i_56 += class300_1.field3730[i_33++] << 7;
                            class300_51.method5655(i_56 & 0x7f, 288754187);
                            class300_51.method5655(i_56 >> 7 & 0x7f, 766760781);
                        } else if (i_62 == 4) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 208, 2137578388);
                            }

                            i_57 += class300_1.field3730[i_32++];
                            class300_51.method5655(i_57 & 0x7f, 899269979);
                        } else if (i_62 == 5) {
                            if (bool_65) {
                                class300_51.method5655(i_52 + 160, 1408674166);
                            }

                            i_53 += class300_1.field3730[i_37++];
                            i_58 += class300_1.field3730[i_31++];
                            class300_51.method5655(i_53 & 0x7f, 1952872287);
                            class300_51.method5655(i_58 & 0x7f, 1056136741);
                        } else {
                            if (i_62 != 6) {
                                throw new RuntimeException();
                            }

                            if (bool_65) {
                                class300_51.method5655(i_52 + 192, 254225805);
                            }

                            class300_51.method5655(class300_1.field3730[i_44++], 944893766);
                        }
                    }
                }
            }
        }

    }

    public static class203 method3917(class233 class233_0, int i_1, int i_2) {
        byte[] bytes_3 = class233_0.method4144(i_1, i_2, -1990204311);
        return bytes_3 == null ? null : new class203(new class300(bytes_3));
    }

    void method3925() {
        if (this.field2492 == null) {
            this.field2492 = new class318(16);
            int[] ints_1 = new int[16];
            int[] ints_2 = new int[16];
            ints_2[9] = 128;
            ints_1[9] = 128;
            class200 class200_4 = new class200(this.field2491);
            int i_5 = class200_4.method3849();

            int i_6;
            for (i_6 = 0; i_6 < i_5; i_6++) {
                class200_4.method3835(i_6);
                class200_4.method3865(i_6);
                class200_4.method3836(i_6);
            }

            label53:
            do {
                while (true) {
                    i_6 = class200_4.method3842();
                    int i_7 = class200_4.field2465[i_6];

                    while (i_7 == class200_4.field2465[i_6]) {
                        class200_4.method3835(i_6);
                        int i_8 = class200_4.method3869(i_6);
                        if (i_8 == 1) {
                            class200_4.method3847();
                            class200_4.method3836(i_6);
                            continue label53;
                        }

                        int i_9 = i_8 & 0xf0;
                        int i_10;
                        int i_11;
                        int i_12;
                        if (i_9 == 176) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_11 == 0) {
                                ints_1[i_10] = (i_12 << 14) + (ints_1[i_10] & ~0x1fc000);
                            }

                            if (i_11 == 32) {
                                ints_1[i_10] = (ints_1[i_10] & ~0x3f80) + (i_12 << 7);
                            }
                        }

                        if (i_9 == 192) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            ints_2[i_10] = i_11 + ints_1[i_10];
                        }

                        if (i_9 == 144) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_12 > 0) {
                                int i_13 = ints_2[i_10];
                                class177 class177_14 = (class177) this.field2492.method5952(i_13);
                                if (class177_14 == null) {
                                    class177_14 = new class177(new byte[128]);
                                    this.field2492.method5951(class177_14, i_13);
                                }

                                class177_14.field2108[i_11] = 1;
                            }
                        }

                        class200_4.method3865(i_6);
                        class200_4.method3836(i_6);
                    }
                }
            } while (!class200_4.method3856());

        }
    }

    void method3922() {
        this.field2492 = null;
    }

}
