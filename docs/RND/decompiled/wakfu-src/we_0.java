/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

/*
 * Renamed from We
 */
public class we_0 {
    private int o = 0;
    private float bMp = 5.0f;
    private float bMq = 5.0f;
    private float bMr = 3.0f;
    private float bMs = 10.0f;
    private float bMt = 0.0f;
    private float bMu = 0.5f;
    private final EnumMap<wg_0, Integer> bMv = new EnumMap(wg_0.class);

    public int d() {
        return this.o;
    }

    public void lK(int n) {
        this.o = n;
    }

    public float bll() {
        return this.bMp;
    }

    public void bv(float f2) {
        this.bMp = f2;
    }

    public float blm() {
        return this.bMq;
    }

    public void bw(float f2) {
        this.bMq = f2;
    }

    public float blx() {
        return this.bMr;
    }

    public void bx(float f2) {
        this.bMr = f2;
    }

    public float bly() {
        return this.bMs;
    }

    public void by(float f2) {
        this.bMs = f2;
    }

    public float blz() {
        return this.bMt;
    }

    public void bz(float f2) {
        this.bMt = f2;
    }

    public float blA() {
        return this.bMu;
    }

    public void bA(float f2) {
        this.bMu = f2;
    }

    public int a(wg_0 wg_02) {
        return this.bMv.get((Object)wg_02);
    }

    public void a(wg_0 wg_02, int n) {
        this.bMv.put(wg_02, n);
    }
}

