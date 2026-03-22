/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eIS
 */
public class eis_0
implements eit_0 {
    private static char[] ipP;
    private static char[] ipQ;
    private static final char[] qxW;
    private int qxX;
    private int qxY;
    private int qxZ;
    private int qya;
    private int qyb;
    private int qyc;
    private int qyd;
    private int qye;
    private int qyf;
    private int qyg;

    private static boolean n(char c2) {
        return Arrays.binarySearch(ipP, c2) >= 0;
    }

    private static boolean o(char c2) {
        return Arrays.binarySearch(ipQ, c2) >= 0;
    }

    private static boolean p(char c2) {
        return Arrays.binarySearch(qxW, c2) >= 0;
    }

    private static boolean m(char c2) {
        return eis_0.o(c2) || eis_0.n(c2) || eis_0.p(c2);
    }

    private static boolean a(Character c2, Character c3) {
        return BH.aT(c2.toString()).equals(BH.aT(c3.toString()));
    }

    public eis_0(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.qxX = n;
        this.qxY = n2;
        this.qxZ = n3;
        this.qya = n4;
        this.qyb = n5;
        this.qyc = n6;
        this.qyd = n7;
        this.qye = n8;
        this.qyf = n9;
        this.qyg = n10;
    }

    @Override
    public eik_0 sf(@NotNull String string) {
        String[] stringArray;
        int n;
        int n2;
        char[] cArray = string.toCharArray();
        for (n2 = 0; n2 < cArray.length; ++n2) {
            if (eis_0.m(cArray[n2])) continue;
            return eii_0.a(eij_0.qxi, cArray[n2]);
        }
        if (string.length() < this.qxX) {
            return eii_0.b(eij_0.qxg);
        }
        if (string.length() > this.qxY) {
            return eii_0.b(eij_0.qxh);
        }
        n2 = 0;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        int n6 = 47;
        for (int i = 0; i < cArray.length; ++i) {
            n = cArray[i];
            if (eis_0.n((char)n)) {
                ++n2;
                n3 = 0;
            } else if (eis_0.o((char)n)) {
                ++n3;
                n2 = 0;
            } else {
                ++n5;
                n3 = 0;
                n2 = 0;
            }
            n4 = eis_0.a(Character.valueOf((char)n6), Character.valueOf((char)n)) ? ++n4 : 1;
            n6 = n;
            if (n2 > this.qxZ) {
                return eii_0.b(eij_0.qxk);
            }
            if (n3 > this.qya) {
                return eii_0.b(eij_0.qxj);
            }
            if (n4 > this.qyb) {
                return eii_0.b(eij_0.qxl);
            }
            if (n5 <= this.qyc) continue;
            return eii_0.b(eij_0.qxq);
        }
        String[] stringArray2 = string.split("([ -])");
        for (n = 0; n < stringArray2.length; ++n) {
            n5 = 0;
            n3 = 0;
            n2 = 0;
            char[] objectArray = stringArray2[n].toCharArray();
            for (int i = 0; i < objectArray.length; ++i) {
                if (eis_0.n(objectArray[i])) {
                    ++n2;
                    continue;
                }
                if (eis_0.o(objectArray[i])) {
                    ++n3;
                    continue;
                }
                if (!eis_0.p(objectArray[i])) continue;
                ++n5;
            }
            if (n2 < this.qyd) {
                return eii_0.b(eij_0.qxm);
            }
            if (n3 < this.qye) {
                return eii_0.b(eij_0.qxn);
            }
            if (n5 > this.qyf) {
                return eii_0.b(eij_0.qxo);
            }
            if (objectArray.length <= this.qyg) continue;
            return eii_0.b(eij_0.qxp);
        }
        if (string.length() > 1 && (string.charAt(0) == '-' || string.charAt(string.length() - 1) == '-')) {
            return eii_0.b(eij_0.qxs);
        }
        for (String string2 : stringArray = string.split("[ \\-']")) {
            if (string2.length() >= 1 && !Character.isLowerCase(string2.charAt(0)) && string2.substring(1).equals(string2.substring(1).toLowerCase())) continue;
            return eii_0.b(eij_0.qxt);
        }
        return eii_0.b(eij_0.qxf);
    }

    static {
        int n;
        ipP = new char[]{'a', 'e', 'i', 'o', 'u', 'y', '\u00e9', '\u00e8', '\u00eb', '\u00ea', '\u00e2', '\u00e4', '\u00fc', '\u00fb', '\u00f9', '\u00f4', '\u00f6', '\u00ee', '\u00ef'};
        ipQ = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        qxW = new char[]{' ', '-', '\''};
        char[] cArray = new char[ipP.length * 2];
        System.arraycopy(ipP, 0, cArray, 0, ipP.length);
        for (n = 0; n < ipP.length; ++n) {
            cArray[eis_0.ipP.length + n] = Character.toUpperCase(ipP[n]);
        }
        ipP = cArray;
        cArray = new char[ipQ.length * 2];
        System.arraycopy(ipQ, 0, cArray, 0, ipQ.length);
        for (n = 0; n < ipQ.length; ++n) {
            cArray[eis_0.ipQ.length + n] = Character.toUpperCase(ipQ[n]);
        }
        ipQ = cArray;
        Arrays.sort(ipP);
        Arrays.sort(ipQ);
        Arrays.sort(qxW);
    }
}

