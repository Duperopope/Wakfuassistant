/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpS
 */
public class fps_0 {
    private final long sQZ;
    private fpR sRa;
    private long sRb;

    public fps_0(long l) {
        this.sQZ = l;
    }

    public long bhh() {
        return this.sQZ;
    }

    public void a(fpR fpR2) {
        this.sRa = fpR2;
    }

    public fpR dPE() {
        return this.sRa;
    }

    public void uA(long l) {
        this.sRb = l;
    }

    public void d(uw_0 uw_02) {
        this.sRb = uw_02.bjB();
    }

    public long ghs() {
        return this.sRb;
    }

    public uw_0 ght() {
        return uw_0.fn(this.sRb);
    }

    public void ghu() {
        switch (this.sRa) {
            case sQS: {
                break;
            }
            case sQT: {
                break;
            }
            case sQU: {
                this.sRb = ue_0.bjV().bjg() + fpv_0.sRm;
                break;
            }
            case sQV: {
                this.sRb = ue_0.bjV().bjg() + fpv_0.sRn;
                break;
            }
            case sQW: {
                this.sRb = ue_0.bjV().bjg() + fpv_0.sRo;
            }
        }
    }
}

