/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Renamed from bjW
 */
public class bjw_2
implements bjy_2 {
    private final Random ipO = new GD();
    private final char[] ipP;
    private final char[] ipQ;
    private final HashMap<Character, char[]> ipR = new HashMap();
    private static final int ipS = 1;
    private static final int ipT = 20;
    private static final int ipU = 45;
    private static final int ipV = 30;
    private static final int ipW = 8;

    bjw_2() {
        short s;
        int n;
        int n2;
        int n3;
        char[] cArray = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        char[] cArray2 = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        short[] sArray = new short[]{9, 15, 8, 6, 6, 1};
        short[] sArray2 = new short[]{2, 2, 3, 2, 2, 2, 1, 1, 5, 3, 6, 2, 1, 6, 6, 6, 2, 1, 1, 1};
        this.a('c', new char[]{'_', 'h', 'l', 'r'}, new short[]{8, 3, 2, 2});
        this.a('g', new char[]{'_', 'l', 'n', 'r'}, new short[]{10, 2, 1, 2});
        this.a('l', new char[]{'_', 'l'}, new short[]{8, 1});
        this.a('m', new char[]{'_', 'm'}, new short[]{8, 1});
        this.a('n', new char[]{'_', 'n'}, new short[]{6, 1});
        this.a('p', new char[]{'_', 'h', 'l', 'r', 'p'}, new short[]{8, 2, 1, 3, 1});
        this.a('q', new char[]{'_', 'u'}, new short[]{0, 1});
        this.a('s', new char[]{'_', 'h', 'k', 'l', 'n', 'p', 'q', 'r', 's', 't'}, new short[]{15, 1, 1, 1, 2, 5, 1, 2, 10, 5});
        this.a('t', new char[]{'_', 'h', 'r', 't'}, new short[]{8, 3, 5, 1});
        this.a('a', new char[]{'t'}, new short[]{1});
        this.a('e', new char[]{'t', 'd'}, new short[]{2, 1});
        this.a('i', new char[0], new short[0]);
        this.a('o', new char[]{'t'}, new short[]{1});
        this.a('u', new char[]{'s', 't'}, new short[]{2, 1});
        this.a('y', new char[0], new short[0]);
        int n4 = 0;
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n3 = 0; n3 < cArray.length; ++n3) {
            n4 += sArray[n3];
        }
        for (n3 = 0; n3 < n4; n3 = (short)(n3 + 1)) {
            tShortArrayList.add((short)n3);
        }
        this.ipP = new char[n4];
        for (n3 = 0; n3 < cArray.length; ++n3) {
            for (n2 = 0; n2 < sArray[n3]; ++n2) {
                n = this.ipO.nextInt(tShortArrayList.size());
                s = tShortArrayList.get(n);
                this.ipP[s] = cArray[n3];
                tShortArrayList.removeAt(n);
            }
        }
        n4 = 0;
        tShortArrayList = new TShortArrayList();
        for (n3 = 0; n3 < cArray2.length; ++n3) {
            n4 += sArray2[n3];
        }
        for (n3 = 0; n3 < n4; n3 = (short)(n3 + 1)) {
            tShortArrayList.add((short)n3);
        }
        this.ipQ = new char[n4];
        for (n3 = 0; n3 < cArray2.length; ++n3) {
            for (n2 = 0; n2 < sArray2[n3]; ++n2) {
                n = this.ipO.nextInt(tShortArrayList.size());
                s = tShortArrayList.get(n);
                this.ipQ[s] = cArray2[n3];
                tShortArrayList.removeAt(n);
            }
        }
    }

    private void a(char c2, char[] cArray, short[] sArray) {
        int n;
        int n2 = 0;
        for (int i = 0; i < cArray.length; ++i) {
            n2 += sArray[i];
        }
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n = 0; n < n2; n = (short)(n + 1)) {
            tShortArrayList.add((short)n);
        }
        char[] cArray2 = new char[n2];
        for (n = 0; n < cArray.length; ++n) {
            for (int i = 0; i < sArray[n]; ++i) {
                int n3 = this.ipO.nextInt(tShortArrayList.size());
                short s = tShortArrayList.get(n3);
                cArray2[s] = cArray[n];
                tShortArrayList.removeAt(n3);
            }
        }
        this.ipR.put(Character.valueOf(c2), cArray2);
    }

    private boolean Dx(int n) {
        return this.ipO.nextInt(100) < n;
    }

    private char drS() {
        return this.ipP[this.ipO.nextInt(this.ipP.length)];
    }

    private char drT() {
        return this.ipQ[this.ipO.nextInt(this.ipQ.length)];
    }

    private String drU() {
        char[] cArray;
        Object object = "";
        char c2 = this.drT();
        object = (String)object + c2;
        if (this.ipR.containsKey(Character.valueOf(c2)) && (cArray = this.ipR.get(Character.valueOf(c2))).length > 0) {
            object = (String)object + cArray[this.ipO.nextInt(cArray.length)];
        }
        object = (String)object + this.drS();
        object = ((String)object).replace("_", "");
        return object;
    }

    private String drV() {
        if (this.Dx(20)) {
            return ("" + this.drS()).toUpperCase();
        }
        String string = this.drU();
        if (string.charAt(0) == string.charAt(1)) {
            string = string.substring(1);
        }
        string = BH.aQ(string);
        return string;
    }

    private String drW() {
        Object object = "";
        for (int i = 0; i < 1 && this.Dx(45); ++i) {
            object = (String)object + this.drU();
        }
        return object;
    }

    private String drX() {
        char[] cArray;
        Object object = this.drU();
        char[] cArray2 = ((String)object).toCharArray();
        char c2 = cArray2[cArray2.length - 1];
        if (this.ipR.containsKey(Character.valueOf(c2)) && this.Dx(30) && (cArray = this.ipR.get(Character.valueOf(c2))).length > 1) {
            object = (String)object + cArray[this.ipO.nextInt(cArray.length)];
        }
        return object;
    }

    private String drY() {
        return this.drV() + this.drW() + this.drX();
    }

    private String drZ() {
        if (this.Dx(8)) {
            return this.drY() + "-" + this.drY();
        }
        return this.drY();
    }

    @Override
    public String dsa() {
        String string = this.drZ();
        if (!bYV.bkY().dB(string)) {
            return this.dsa();
        }
        return string;
    }

    @Override
    public void clean() {
    }
}

