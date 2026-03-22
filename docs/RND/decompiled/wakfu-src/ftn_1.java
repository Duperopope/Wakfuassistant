/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.util.HashMap;

/*
 * Renamed from fTn
 */
public class ftn_1
implements ftq_1 {
    private final long vfO;
    private final fhv_1 vfP;
    private final String vfQ;
    private final fyc_0 vfR;
    private final fhs_2 vfS;
    private final fhv_1 vfT;
    private final URL vfU;
    private final int vfV;
    private final String vfW;
    private final String vfX;
    private final String vfY;
    private final boolean vfZ;
    private final int vga;
    private final int vgb;
    private HashMap<String, String> vgc = null;

    public fyc_0 gGN() {
        return this.vfR;
    }

    public HashMap<String, String> gGO() {
        return this.vgc;
    }

    public fhs_2 getElementMap() {
        return this.vfS;
    }

    public String getId() {
        return this.vfQ;
    }

    public long gGP() {
        return this.vfO;
    }

    public fhv_1 getParent() {
        return this.vfT;
    }

    public int getDuration() {
        return this.vfV;
    }

    public URL gGQ() {
        return this.vfU;
    }

    public String gGR() {
        return this.vfW;
    }

    public String gGS() {
        return this.vfX;
    }

    public String gGT() {
        return this.vfY;
    }

    public boolean gGU() {
        return this.vfZ;
    }

    public int gGV() {
        return this.vga;
    }

    public int gGW() {
        return this.vgb;
    }

    public fhv_1 gGX() {
        return this.vfP;
    }

    public ftn_1(fyc_0 fyc_02, fhv_1 fhv_12, String string, fhs_2 fhs_22, fhv_1 fhv_13, String string2, String string3, String string4, boolean bl, int n, int n2, URL uRL, int n3, long l, HashMap<String, String> hashMap) {
        this.vfR = fyc_02;
        this.vfS = fhs_22;
        this.vfQ = string;
        this.vfO = l;
        this.vfT = fhv_13;
        this.vfV = n3;
        this.vfU = uRL;
        this.vfW = string2;
        this.vfX = string3;
        this.vfY = string4;
        this.vfZ = bl;
        this.vga = n;
        this.vgb = n2;
        this.vfP = fhv_12;
        this.vgc = hashMap;
    }
}

