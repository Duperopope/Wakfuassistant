/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from bOE
 */
public class boe_1 {
    private int kMr;
    private ub_0[] kMs;
    private int[] kMt;
    private int[] kMu;
    private int[] kMv;
    private float[] kMw;
    private float[] kMx;
    private wg_0[] kMy;
    private HashMap<ub_0, float[]> kMz;

    public int ehx() {
        return this.kMr;
    }

    public ub_0 IG(int n) {
        return this.kMs[n];
    }

    public int IH(int n) {
        return this.kMt[n];
    }

    public int II(int n) {
        return this.kMu[n];
    }

    public int IJ(int n) {
        return this.kMv[n];
    }

    public float IK(int n) {
        return this.kMw[n];
    }

    public float IL(int n) {
        return this.kMx[n];
    }

    public wg_0 IM(int n) {
        return this.kMy[n];
    }

    public float[] d(ub_0 ub_02) {
        return this.kMz.get((Object)ub_02);
    }

    public void fb(ByteBuffer byteBuffer) {
        this.kMr = byteBuffer.get() & 0xFF;
        if (this.kMr > 0) {
            int n;
            int n2;
            this.kMs = new ub_0[this.kMr];
            this.kMt = new int[this.kMr];
            this.kMu = new int[this.kMr];
            this.kMw = new float[this.kMr];
            this.kMy = new wg_0[this.kMr];
            this.kMv = new int[this.kMr];
            this.kMx = new float[this.kMr];
            for (n2 = 0; n2 < this.kMr; ++n2) {
                this.kMs[n2] = ub_0.values()[byteBuffer.get() & 0xFF];
                this.kMt[n2] = byteBuffer.get();
                this.kMu[n2] = byteBuffer.get();
                this.kMw[n2] = (float)(byteBuffer.getShort() & 0xFFFF) / 65535.0f;
                this.kMy[n2] = wg_0.qk(byteBuffer.getInt());
                this.kMv[n2] = byteBuffer.get();
                this.kMx[n2] = (float)byteBuffer.getShort() / 32767.0f;
            }
            this.kMz = new HashMap();
            n2 = byteBuffer.get() & 0xFF;
            for (n = 0; n < n2; ++n) {
                ub_0 ub_02 = ub_0.values()[byteBuffer.get() & 0xFF];
                float f2 = byteBuffer.get();
                float f3 = byteBuffer.get();
                this.kMz.put(ub_02, new float[]{f2, f3});
            }
            n = 2 - n2;
            for (int i = 0; i < n; ++i) {
                byteBuffer.getShort();
                byteBuffer.get();
            }
        }
    }

    public void reset() {
        this.kMr = 0;
        this.kMs = null;
        this.kMt = null;
        this.kMu = null;
        this.kMv = null;
        this.kMw = null;
        this.kMx = null;
        this.kMy = null;
        this.kMz = null;
    }
}

