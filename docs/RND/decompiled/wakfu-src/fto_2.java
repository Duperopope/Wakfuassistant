/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.util.HashMap;

/*
 * Renamed from fTo
 */
public class fto_2 {
    private long vfN = 0L;
    private fhv_1 vfP = null;
    private String cHc = null;
    private fyc_0 vfR = null;
    private fhs_2 nQt = null;
    private fhv_1 uxL = null;
    private URL tCn = null;
    private int bMn = Integer.MAX_VALUE;
    private String vfW = null;
    private String vfX = null;
    private String vfY = null;
    private boolean vfZ = false;
    private int vga = 0;
    private int vgb = 0;
    private HashMap<String, String> vgc = null;

    public fto_2 wk(String string) {
        this.vfR = fyc_0.tr(string);
        return this;
    }

    public fto_2 a(fyc_0 fyc_02) {
        this.vfR = fyc_02;
        return this;
    }

    public fto_2 m(fhs_2 fhs_22) {
        this.nQt = fhs_22;
        return this;
    }

    public fto_2 wl(String string) {
        this.cHc = string;
        return this;
    }

    public fto_2 ve(long l) {
        this.vfN = l;
        return this;
    }

    public fto_2 z(fhv_1 fhv_12) {
        this.uxL = fhv_12;
        return this;
    }

    public fto_2 ach(int n) {
        this.bMn = n;
        return this;
    }

    public fto_2 l(URL uRL) {
        this.tCn = uRL;
        return this;
    }

    public fto_2 wm(String string) {
        this.vfW = string;
        return this;
    }

    public fto_2 wn(String string) {
        this.vfX = string;
        return this;
    }

    public fto_2 wo(String string) {
        this.vfY = string;
        return this;
    }

    public fto_2 pw(boolean bl) {
        this.vfZ = bl;
        return this;
    }

    public fto_2 aci(int n) {
        this.vga = n;
        return this;
    }

    public fto_2 acj(int n) {
        this.vgb = n;
        return this;
    }

    public fto_2 A(fhv_1 fhv_12) {
        this.vfP = fhv_12;
        return this;
    }

    public void aM(String string, String string2) {
        if (this.vgc == null) {
            this.vgc = new HashMap();
        }
        this.vgc.put(string, string2);
    }

    public ftn_1 gGY() {
        return new ftn_1(this.vfR, this.vfP, this.cHc, this.nQt, this.uxL, this.vfW, this.vfX, this.vfY, this.vfZ, this.vga, this.vgb, this.tCn, this.bMn, this.vfN, this.vgc);
    }
}

