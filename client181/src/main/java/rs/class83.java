package main.java.rs;

import java.math.BigInteger;

public class class83 {

    static final BigInteger field1165 = new BigInteger("10001", 16);
    static final BigInteger field1162 = new BigInteger("bd027f77f1dba615cd5b8b95eae46605247c2af36e815c9e7a78a6510771416b003c9844b70a393b50e2cd4e33bd96d0ae33c6d08a70769d4d00f5b52fa0099d185d7a179d0fae3a3d6b109c953005862e1fbcfd07ee8a6e87a21bc8a89b73479fa47f50d3e4f27610554d84928fc4bab744dc982a6dfd158e57cc57e42a3f9737cf9fed01b9a6b52b1fd49fe218b5606f26c71cfaf6ac909bc4b64299ca4bd39223eaa2a81e8130aa3a2c0d668e0fb67c70c2016a79204d1e4b728e32b8c7688723c626fb6c9080b7111eaf68fe52535644aba8f563990e5344c42549f0f5edf2cf75b3669f74f24032e8182eb4d21808f09d043a3c161fb9996e9587fd5f19", 16);
    static int field1166;

    static final int method1995(int i_0) {
        if (class17.field117.field1060) {
            return class42.field372;
        } else {
            int i_1 = class62.method1130(class299.field3727, class1.field3, class42.field372, (short) 16100);
            return i_1 - class43.field383 < 800 && (class55.field502[class42.field372][class299.field3727 >> 7][class1.field3 >> 7] & 0x4) != 0 ? class42.field372 : 3;
        }
    }

    static int method1994(int i_0, class92 class92_1, boolean bool_2, int i_3) {
        int i_5 = -1;
        class217 class217_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            i_5 = class76.field1098[--class70.field1014];
            class217_4 = class80.method1978(i_5, -2057883066);
        } else {
            class217_4 = bool_2 ? class76.field1111 : class207.field2507;
        }

        if (i_0 == 1100) {
            class70.field1014 -= 2;
            class217_4.field2585 = class76.field1098[class70.field1014];
            if (class217_4.field2585 > class217_4.field2687 - class217_4.field2579) {
                class217_4.field2585 = class217_4.field2687 - class217_4.field2579;
            }

            if (class217_4.field2585 < 0) {
                class217_4.field2585 = 0;
            }

            class217_4.field2586 = class76.field1098[class70.field1014 + 1];
            if (class217_4.field2586 > class217_4.field2569 - class217_4.field2667) {
                class217_4.field2586 = class217_4.field2569 - class217_4.field2667;
            }

            if (class217_4.field2586 < 0) {
                class217_4.field2586 = 0;
            }

            class224.method4120(class217_4, 688005229);
            return 1;
        } else if (i_0 == 1101) {
            class217_4.field2695 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, -1890264007);
            return 1;
        } else if (i_0 == 1102) {
            class217_4.field2571 = class76.field1098[--class70.field1014] == 1;
            class224.method4120(class217_4, -1496234484);
            return 1;
        } else if (i_0 == 1103) {
            class217_4.field2595 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, 756651832);
            return 1;
        } else if (i_0 == 1104) {
            class217_4.field2597 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, -970722845);
            return 1;
        } else if (i_0 == 1105) {
            class217_4.field2599 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, 455465967);
            return 1;
        } else if (i_0 == 1106) {
            class217_4.field2591 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, -981123802);
            return 1;
        } else if (i_0 == 1107) {
            class217_4.field2613 = class76.field1098[--class70.field1014] == 1;
            class224.method4120(class217_4, -434022168);
            return 1;
        } else if (i_0 == 1108) {
            class217_4.field2607 = 1;
            class217_4.field2649 = class76.field1098[--class70.field1014];
            class224.method4120(class217_4, 448034692);
            return 1;
        } else if (i_0 == 1109) {
            class70.field1014 -= 6;
            class217_4.field2593 = class76.field1098[class70.field1014];
            class217_4.field2614 = class76.field1098[class70.field1014 + 1];
            class217_4.field2615 = class76.field1098[class70.field1014 + 2];
            class217_4.field2616 = class76.field1098[class70.field1014 + 3];
            class217_4.field2640 = class76.field1098[class70.field1014 + 4];
            class217_4.field2618 = class76.field1098[class70.field1014 + 5];
            class224.method4120(class217_4, -1246952320);
            return 1;
        } else {
            int i_9;
            if (i_0 == 1110) {
                i_9 = class76.field1098[--class70.field1014];
                if (i_9 != class217_4.field2611) {
                    class217_4.field2611 = i_9;
                    class217_4.field2692 = 0;
                    class217_4.field2584 = 0;
                    class224.method4120(class217_4, 199222964);
                }

                return 1;
            } else if (i_0 == 1111) {
                class217_4.field2621 = class76.field1098[--class70.field1014] == 1;
                class224.method4120(class217_4, 501340498);
                return 1;
            } else if (i_0 == 1112) {
                String string_8 = class76.field1093[--class221.field2747];
                if (!string_8.equals(class217_4.field2601)) {
                    class217_4.field2601 = string_8;
                    class224.method4120(class217_4, -1709652249);
                }

                return 1;
            } else if (i_0 == 1113) {
                class217_4.field2624 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, 29740998);
                return 1;
            } else if (i_0 == 1114) {
                class70.field1014 -= 3;
                class217_4.field2628 = class76.field1098[class70.field1014];
                class217_4.field2629 = class76.field1098[class70.field1014 + 1];
                class217_4.field2627 = class76.field1098[class70.field1014 + 2];
                class224.method4120(class217_4, 1069244657);
                return 1;
            } else if (i_0 == 1115) {
                class217_4.field2659 = class76.field1098[--class70.field1014] == 1;
                class224.method4120(class217_4, -1723969164);
                return 1;
            } else if (i_0 == 1116) {
                class217_4.field2559 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, 246275897);
                return 1;
            } else if (i_0 == 1117) {
                class217_4.field2604 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, -1585074641);
                return 1;
            } else if (i_0 == 1118) {
                class217_4.field2605 = class76.field1098[--class70.field1014] == 1;
                class224.method4120(class217_4, -451228735);
                return 1;
            } else if (i_0 == 1119) {
                class217_4.field2606 = class76.field1098[--class70.field1014] == 1;
                class224.method4120(class217_4, -255830891);
                return 1;
            } else if (i_0 == 1120) {
                class70.field1014 -= 2;
                class217_4.field2687 = class76.field1098[class70.field1014];
                class217_4.field2569 = class76.field1098[class70.field1014 + 1];
                class224.method4120(class217_4, -1703724876);
                if (i_5 != -1 && class217_4.field2566 == 0) {
                    class27.method413(class217.field2556[i_5 >> 16], class217_4, false, -2043799095);
                }

                return 1;
            } else if (i_0 == 1121) {
                class56.method1086(class217_4.field2688, class217_4.field2565, -881674814);
                Client.field850 = class217_4;
                class224.method4120(class217_4, -49665364);
                return 1;
            } else if (i_0 == 1122) {
                class217_4.field2600 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, -732057462);
                return 1;
            } else if (i_0 == 1123) {
                class217_4.field2639 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, -663764899);
                return 1;
            } else if (i_0 == 1124) {
                class217_4.field2596 = class76.field1098[--class70.field1014];
                class224.method4120(class217_4, 190024036);
                return 1;
            } else if (i_0 == 1125) {
                i_9 = class76.field1098[--class70.field1014];
                class323 class323_7 = (class323) class107.method2476(class105.method2405((byte) 69), i_9, (byte) 0);
                if (class323_7 != null) {
                    class217_4.field2693 = class323_7;
                    class224.method4120(class217_4, -1838794485);
                }

                return 1;
            } else {
                boolean bool_6;
                if (i_0 == 1126) {
                    bool_6 = class76.field1098[--class70.field1014] == 1;
                    class217_4.field2598 = bool_6;
                    return 1;
                } else if (i_0 == 1127) {
                    bool_6 = class76.field1098[--class70.field1014] == 1;
                    class217_4.field2564 = bool_6;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }

    static void method1996(int i_0, int i_1, int i_2, class253 class253_3, int i_4, int i_5) {
        class75 class75_6 = new class75();
        class75_6.field1078 = i_0;
        class75_6.field1083 = i_1 * 128;
        class75_6.field1090 = i_2 * 128;
        int i_7 = class253_3.field3365;
        int i_8 = class253_3.field3366;
        if (i_4 == 1 || i_4 == 3) {
            i_7 = class253_3.field3366;
            i_8 = class253_3.field3365;
        }

        class75_6.field1077 = (i_7 + i_1) * 128;
        class75_6.field1082 = (i_8 + i_2) * 128;
        class75_6.field1079 = class253_3.field3394;
        class75_6.field1091 = class253_3.field3399 * 128;
        class75_6.field1086 = class253_3.field3392;
        class75_6.field1081 = class253_3.field3397;
        class75_6.field1088 = class253_3.field3367;
        if (class253_3.field3391 != null) {
            class75_6.field1087 = class253_3;
            class75_6.method1821(-1999836308);
        }

        class75.field1080.method4917(class75_6);
        if (class75_6.field1088 != null) {
            class75_6.field1089 = class75_6.field1086 + (int) (Math.random() * (double) (class75_6.field1081 - class75_6.field1086));
        }

    }

}
