/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eNm
 */
public final class enm_0 {
    private long mkw;
    private enk_0 hMZ;
    private int qXs;
    private short ejt = 0;
    private short qXt = 0;
    private short qXu = 0;
    private short qXv = 0;
    private boolean qXw = false;
    private BitSet qXx = null;

    public enm_0 qt(long l) {
        this.mkw = l;
        return this;
    }

    public enm_0 RR(int n) {
        this.qXs = n;
        return this;
    }

    public enm_0 s(enk_0 enk_02) {
        this.hMZ = enk_02;
        return this;
    }

    public enm_0 ee(short s) {
        this.qXt = s;
        return this;
    }

    public enm_0 ef(short s) {
        this.qXu = s;
        return this;
    }

    public enm_0 eg(short s) {
        this.qXv = s;
        return this;
    }

    public enm_0 eh(short s) {
        this.ejt = s;
        return this;
    }

    public eNl fBe() {
        enn_0 enn_02 = new enn_0(this.mkw, this.qXs, this.hMZ);
        enn_02.ejt = this.ejt;
        enn_02.qXt = this.qXt;
        enn_02.qXu = this.qXu;
        enn_02.qXv = this.qXv;
        return enn_02;
    }
}

