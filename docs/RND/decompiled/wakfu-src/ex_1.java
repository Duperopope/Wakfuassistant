/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * Renamed from EX
 */
public final class ex_1 {
    public static final int azH = -1;
    private static final int azI = 1;
    private static final int azJ = 2;
    private static final int azK = 4;
    private static final int azL = 8;
    private static final int azM = 16;
    private static final int azN = 32;
    private static final int azO = 64;
    private static final int azP = 128;
    private byte awb;
    private float azQ;
    private float azR;
    private String[] azS;
    private ew_1[] azT;
    private fa_1[] azU;
    private ez_1[] azV;
    private ey_1 azW;

    public ex_1() {
        this.clear();
    }

    public float[] aJI() {
        return this.azW == null ? ey_1.azX : this.azW.aJI();
    }

    public int bs(String string) {
        if (this.azW == null) {
            return -1;
        }
        return this.azW.bu(string);
    }

    public ew_1 bt(String string) {
        return this.azT == null ? null : (ew_1)Arrays.stream(this.azT).filter(ew_12 -> ew_12 != null && ew_12.getName() != null && ew_12.getName().equals(string)).findFirst().orElse(null);
    }

    public String mE(int n) {
        return this.azS[n];
    }

    public ew_1[] aJJ() {
        return this.azT;
    }

    public String[] aJK() {
        return this.azS;
    }

    public fa_1[] aJL() {
        return this.azU;
    }

    public float getScale() {
        return this.azQ;
    }

    public float aJM() {
        return this.azR;
    }

    public boolean aJN() {
        return (this.awb & 1) != 0;
    }

    public boolean aJO() {
        return (this.awb & 2) != 0;
    }

    public boolean aJP() {
        return (this.awb & 8) != 0;
    }

    public boolean aJQ() {
        return (this.awb & 4) != 0;
    }

    public boolean aJR() {
        return (this.awb & 0x10) == 0;
    }

    public boolean aJz() {
        return (this.awb & 0x20) == 32;
    }

    public boolean aJS() {
        return (this.awb & 0x40) != 0;
    }

    public boolean aJT() {
        return (this.awb & 0x80) != 0;
    }

    public void clear() {
        this.awb = 0;
        this.azQ = 1.0f;
        this.azR = 1.0f;
        this.azS = null;
        this.azT = null;
        this.azU = null;
        this.azV = null;
        this.azW = null;
    }

    public void c(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.awb = (byte)(this.awb | 2);
        this.azS = list.toArray(new String[list.size()]);
    }

    public void d(List<fa_1> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.awb = (byte)(this.awb | 4);
        this.azU = new fa_1[list.size()];
        list.toArray(this.azU);
    }

    public void e(List<ez_1> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.awb = (byte)(this.awb | 0x40);
        this.azV = new ez_1[list.size()];
        list.toArray(this.azV);
    }

    public void setScale(float f2) {
        if (f2 != 1.0f) {
            this.awb = (byte)(this.awb | 1);
            this.azQ = f2;
        }
    }

    public void l(float f2) {
        if (f2 != 1.0f) {
            this.awb = (byte)(this.awb | 8);
            this.azR = f2;
        }
    }

    public void ax(boolean bl) {
        this.awb = bl ? (byte)(this.awb | 0x10) : (byte)(this.awb & 0xFFFFFFEF);
    }

    public void aJA() {
        this.awb = (byte)(this.awb | 0x20);
    }

    public ez_1[] aJU() {
        return this.azV;
    }

    public void q(Map<String, Byte> map) {
        if (map.isEmpty()) {
            return;
        }
        this.awb = (byte)(this.awb | 0x80);
        this.azW = new ey_1();
        this.azW.q(map);
    }

    public void m(float[] fArray) {
        if (fArray == null) {
            return;
        }
        this.awb = (byte)(this.awb | 0x80);
        this.azW = new ey_1();
        this.azW.m(fArray);
    }

    public byte aIl() {
        return this.awb;
    }

    public void f(byte by) {
        this.awb = by;
    }

    public void h(String[] stringArray) {
        this.azS = stringArray;
    }

    public void a(ew_1[] ew_1Array) {
        this.azT = ew_1Array;
    }

    public fa_1[] aJV() {
        return this.azU;
    }

    public void a(fa_1[] fa_1Array) {
        this.azU = fa_1Array;
    }

    public ez_1[] aJW() {
        return this.azV;
    }

    public void a(ez_1[] ez_1Array) {
        this.azV = ez_1Array;
    }

    public ey_1 aJX() {
        return this.azW;
    }

    public void a(ey_1 ey_12) {
        this.azW = ey_12;
    }
}

