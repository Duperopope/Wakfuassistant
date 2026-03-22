/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableRangeMap
 *  com.google.common.collect.ImmutableRangeMap$Builder
 *  com.google.common.collect.Range
 */
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.security.SecureRandom;
import java.util.Random;

/*
 * Renamed from Wc
 */
public class wc_0 {
    private final wf_0[] bMf;
    private final Random bMg = new SecureRandom();
    private we_0 bMh = new we_0();

    public wc_0() {
        long l = ud_0.bwr.bjS() / 7200L;
        this.bMf = new wf_0[(int)l];
        int n = 0;
        while ((long)n < l) {
            this.bMf[n] = new wf_0(n);
            ++n;
        }
    }

    public int getDuration() {
        return this.bMf.length;
    }

    public wf_0 bli() {
        return this.bMf[this.bMf.length - 1];
    }

    public wf_0 blj() {
        return this.bMf[0];
    }

    public void a(we_0 we_02) {
        this.bMh = we_02;
    }

    public we_0 blk() {
        return this.bMh;
    }

    public float bll() {
        return this.bMh.bll();
    }

    public float blm() {
        return this.bMh.blm();
    }

    public wf_0 qj(int n) {
        return this.bMf[n];
    }

    private void bln() {
        for (wf_0 wf_02 : this.bMf) {
            wf_02.bv(0.0f);
            wf_02.bw(0.0f);
        }
    }

    private void blo() {
        float f2 = this.bMh.bll();
        float f3 = this.bMh.blm();
        float f4 = this.bMh.blx();
        float f5 = this.bMh.bly();
        for (wf_0 wf_02 : this.bMf) {
            if (wf_02.blC() == 0) {
                wf_02.bv(f2 + this.bMg.nextFloat() * (f3 - f2));
            } else {
                float f6 = this.bMf[wf_02.blC() - 1].blm();
                wf_02.bv(Math.max(f2, f6 - (float)((int)(f4 + this.bMg.nextFloat() * (f5 - f4)))));
            }
            wf_02.bw(Math.min(f3, wf_02.bll() + (float)((int)(f4 + this.bMg.nextFloat() * (f5 - f4)))));
        }
    }

    private void blp() {
        for (wf_0 wf_02 : this.bMf) {
            wf_02.bB(0.0f);
        }
    }

    private void blq() {
        float f2 = this.bMh.blz();
        float f3 = this.bMh.blA();
        for (wf_0 wf_02 : this.bMf) {
            wf_02.bB(f2 + this.bMg.nextFloat() * (f3 - f2));
            wf_02.av(f2, f3);
        }
    }

    public void aPc() {
        this.blr();
        this.bls();
    }

    private void blr() {
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        int n = 0;
        int n2 = 0;
        for (wg_0 wg_02 : wg_0.values()) {
            int n3 = Math.max(1, this.bMh.a(wg_02));
            builder.put(Range.closedOpen((Comparable)Integer.valueOf(n2), (Comparable)Integer.valueOf(n2 + n3)), (Object)wg_02);
            n2 += n3;
            n += n3;
        }
        ImmutableRangeMap immutableRangeMap = builder.build();
        for (wf_0 wf_02 : this.bMf) {
            int n4 = this.bMg.nextInt(n);
            wf_02.b((wg_0)((Object)immutableRangeMap.get((Comparable)Integer.valueOf(n4))));
        }
        this.blt();
    }

    private void bls() {
        this.bln();
        this.blo();
    }

    private void blt() {
        this.blp();
        this.blq();
    }
}

