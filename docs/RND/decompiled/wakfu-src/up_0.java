/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from UP
 */
public class up_0 {
    private static final Logger bwW = Logger.getLogger(up_0.class);

    public static uw_0 p(@NotNull String string, @NotNull String string2) {
        if (!uo_0.o(string, string2)) {
            throw new UR(string, string2);
        }
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        char[] cArray = string.toCharArray();
        int n7 = 0;
        int n8 = 0;
        while (n7 < cArray.length) {
            String string3;
            char c2 = cArray[n7++];
            int n9 = n8++;
            if (c2 != US.bxd.bkg()) continue;
            c2 = cArray[n7++];
            if (n7 < cArray.length) {
                int n10 = string2.indexOf(cArray[n7], n8);
                string3 = string2.substring(n9, n10);
            } else {
                string3 = string2.substring(n9);
            }
            n8 += string3.length();
            US uS = US.bxl.get(Character.valueOf(c2));
            switch (uS) {
                case bxe: {
                    String string4 = ut_0.getInstance().get(1) / 100 + string3;
                    n = Integer.parseInt(string4);
                    break;
                }
                case bxf: {
                    n = Integer.parseInt(string3);
                    break;
                }
                case bxg: {
                    n2 = Integer.parseInt(string3);
                    break;
                }
                case bxh: {
                    n3 = Integer.parseInt(string3);
                    break;
                }
                case bxi: {
                    n4 = Integer.parseInt(string3);
                    break;
                }
                case bxj: {
                    n5 = Integer.parseInt(string3);
                    break;
                }
                case bxk: {
                    n6 = Integer.parseInt(string3);
                }
            }
            ++n7;
        }
        return new uw_0(n6, n5, n4, n3, n2, n);
    }

    public static String a(@NotNull String string, @NotNull ux_0 ux_02) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string.toCharArray();
        int n = 0;
        for (int i = 0; i < cArray.length; ++i) {
            if (cArray[i] != '%') continue;
            if (i != n) {
                stringBuilder.append(cArray, n, i - n);
            }
            if (++i == cArray.length) {
                n = cArray.length;
                break;
            }
            char c2 = cArray[i];
            US uS = US.bxl.get(Character.valueOf(c2));
            switch (uS) {
                case bxe: {
                    stringBuilder.append(ux_02.bjI() % 100);
                    break;
                }
                case bxf: {
                    stringBuilder.append(ux_02.bjI());
                    break;
                }
                case bxg: {
                    int n2 = ux_02.bjG();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case bxh: {
                    int n2 = ux_02.bjD();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case bxi: {
                    int n2 = ux_02.bjE();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case bxj: {
                    int n2 = ux_02.bjF();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case bxk: {
                    int n2 = ux_02.bjH();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case bxd: {
                    stringBuilder.append(US.bxd.bkg());
                    break;
                }
                default: {
                    bwW.warn((Object)("Caract\u00e8re de formattage inconnu '" + c2 + "' dans la chaine " + string));
                }
            }
            n = i + 1;
        }
        stringBuilder.append(cArray, n, cArray.length - n);
        return stringBuilder.toString();
    }
}

