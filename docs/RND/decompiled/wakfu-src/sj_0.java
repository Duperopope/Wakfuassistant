/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/*
 * Renamed from SJ
 */
public class sj_0
implements ayz_2 {
    private static final Logger boZ = Logger.getLogger(sj_0.class);
    private static final Logger bpa = Logger.getLogger((String)"debug");
    private static final boolean bpb = false;
    private wz_0 bpc;
    private int bpd;
    private int bpe;
    private short bpf;
    private int bpg;
    private int bph;
    private short bpi;
    private int bpj;
    private int bpk;
    private short bpl;
    private short bpm;
    private final boolean bpn = false;
    private final wu_0[] bpo = new wu_0[32];
    private static final ObjectPool bpp;
    private sl_0 bpq = null;

    sj_0() {
        for (int i = 0; i < this.bpo.length; ++i) {
            this.bpo[i] = new wu_0();
        }
    }

    public static sj_0 bfS() {
        try {
            return (sj_0)bpp.borrowObject();
        }
        catch (Exception exception) {
            boZ.error((Object)"Exception during LineOfSightChecker checkout", (Throwable)exception);
            return null;
        }
    }

    @Override
    public final void aZp() {
        try {
            bpp.returnObject((Object)this);
        }
        catch (Exception exception) {
            boZ.error((Object)"Exception during LineOfSightChecker release", (Throwable)exception);
        }
    }

    @Override
    public final void aVI() {
    }

    @Override
    public final void aVH() {
        this.bpc = null;
    }

    public final void a(wz_0 wz_02) {
        this.bpc = wz_02;
    }

    public final void k(int n, int n2, short s) {
        this.bpd = n;
        this.bpe = n2;
        this.bpf = s;
    }

    public final void i(acd_1 acd_12) {
        this.bpd = acd_12.getX();
        this.bpe = acd_12.getY();
        this.bpf = acd_12.bdi();
    }

    public final void l(int n, int n2, short s) {
        this.bpg = n;
        this.bph = n2;
        this.bpi = s;
    }

    public final void j(acd_1 acd_12) {
        this.bpg = acd_12.getX();
        this.bph = acd_12.getY();
        this.bpi = acd_12.bdi();
    }

    private boolean bfT() {
        boolean bl;
        ww_0 ww_02 = this.bpc.aO(this.bpj, this.bpk);
        if (ww_02 == null) {
            return false;
        }
        boolean bl2 = bl = this.bpj == this.bpg && this.bpk == this.bph || this.bpj == this.bpd && this.bpk == this.bpe;
        if (!bl && this.bfU()) {
            return false;
        }
        int n = ww_02.a(this.bpj, this.bpk, this.bpo, 0);
        if (n <= 0) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            wu_0 wu_02 = this.bpo[i];
            if (wu_02.ban <= this.bpl) continue;
            if (wu_02.ban - wu_02.aXR >= this.bpm) {
                return i > 0;
            }
            if (this.bpm <= wu_02.ban - wu_02.aXR || this.bpl >= wu_02.ban || wu_02.bNr) continue;
            return false;
        }
        return true;
    }

    private boolean bfU() {
        return this.bpc.h(this.bpj, this.bpk, this.bpl) || this.bpc.h(this.bpj, this.bpk, this.bpm);
    }

    private boolean m(int n, int n2, short s) {
        if (this.bpj == Integer.MAX_VALUE) {
            this.bpj = n;
            this.bpk = n2;
            this.bpl = s;
            this.bpm = s;
            return true;
        }
        if (n == this.bpj && n2 == this.bpk) {
            if (s < this.bpl) {
                this.bpl = s;
            }
            if (s > this.bpm) {
                this.bpm = s;
            }
            return true;
        }
        if (!this.bfT()) {
            return false;
        }
        this.bpj = n;
        this.bpk = n2;
        this.bpl = s;
        this.bpm = s;
        return true;
    }

    public final boolean bfV() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        assert (this.bpc != null) : "No TopologyMapInstanceSet defined for this LOS Check";
        this.bpj = Integer.MAX_VALUE;
        this.bpk = Integer.MAX_VALUE;
        this.bpl = (short)Short.MAX_VALUE;
        this.bpm = (short)Short.MIN_VALUE;
        int n7 = this.bpd;
        int n8 = this.bpe;
        short s = this.bpf;
        int n9 = this.bpg - this.bpd;
        int n10 = this.bph - this.bpe;
        int n11 = this.bpi - this.bpf;
        if (n9 < 0) {
            n6 = -1;
            n5 = -n9;
        } else {
            n6 = 1;
            n5 = n9;
        }
        if (n10 < 0) {
            n4 = -1;
            n3 = -n10;
        } else {
            n4 = 1;
            n3 = n10;
        }
        if (n11 < 0) {
            n2 = -1;
            n = -n11;
        } else {
            n2 = 1;
            n = n11;
        }
        int n12 = n5 << 2;
        int n13 = n3 << 2;
        int n14 = n << 2;
        if (n5 >= n3 && n5 >= n) {
            int n15 = (n13 >>> 1) - 2 * n5;
            int n16 = (n14 >>> 1) - 2 * n5;
            for (int i = 0; i < n5; ++i) {
                n7 += n6;
                if (n15 < 0) {
                    if (n16 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        n16 -= n12;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        n16 -= n12;
                        if (!this.m(n7 - n6, n8, s = (short)(s + n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else if (n15 == 0) {
                    n15 -= n12;
                    n8 += n4;
                    if (n16 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        n16 -= n12;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        n16 -= n12;
                        if (!this.m(n7 - n6, n8 - n4, s = (short)(s + n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else {
                    n15 -= n12;
                    n8 += n4;
                    if (n16 < 0) {
                        if (!this.m(n7 - n6, n8, s)) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n16 == 0) {
                        if (!this.m(n7 - n6, n8, s)) {
                            return false;
                        }
                        n16 -= n12;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        int n17;
                        s = (short)(s + n2);
                        int n18 = n15 + n15 - n13;
                        if (n18 > (n17 = (n16 -= n12) + n16 - n14) ? !this.m(n7 - n6, n8, (short)(s - n2)) : n17 > n18 && !this.m(n7 - n6, n8 - n4, s)) {
                            return false;
                        }
                        if (!this.m(n7 - n6, n8, s)) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                }
                n15 += n13;
                n16 += n14;
            }
        } else if (n3 >= n5 && n3 >= n) {
            int n19 = (n12 >>> 1) - 2 * n3;
            int n20 = (n14 >>> 1) - 2 * n3;
            for (int i = 0; i < n3; ++i) {
                n8 += n4;
                if (n19 < 0) {
                    if (n20 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        n20 -= n13;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        n20 -= n13;
                        if (!this.m(n7, n8 - n4, s = (short)(s + n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else if (n19 == 0) {
                    n19 -= n13;
                    n7 += n6;
                    if (n20 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        n20 -= n13;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        n20 -= n13;
                        if (!this.m(n7 - n6, n8 - n4, s = (short)(s + n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else {
                    n19 -= n13;
                    n7 += n6;
                    if (n20 < 0) {
                        if (!this.m(n7, n8 - n4, s)) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n20 == 0) {
                        if (!this.m(n7, n8 - n4, s)) {
                            return false;
                        }
                        n20 -= n13;
                        if (!this.m(n7, n8, s = (short)(s + n2))) {
                            return false;
                        }
                    } else {
                        int n21;
                        s = (short)(s + n2);
                        int n22 = n19 + n19 - n12;
                        if (n22 > (n21 = (n20 -= n13) + n20 - n14) ? !this.m(n7, n8 - n4, (short)(s - n2)) : n21 > n22 && !this.m(n7 - n6, n8 - n4, s)) {
                            return false;
                        }
                        if (!this.m(n7, n8 - n4, s)) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                }
                n19 += n12;
                n20 += n14;
            }
        } else {
            int n23 = (n12 >>> 1) - 2 * n;
            int n24 = (n13 >>> 1) - 2 * n;
            for (int i = 0; i < n; ++i) {
                s = (short)(s + n2);
                if (n23 < 0) {
                    if (n24 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        n24 -= n14;
                        if (!this.m(n7, n8 += n4, s)) {
                            return false;
                        }
                    } else {
                        n24 -= n14;
                        if (!this.m(n7, n8 += n4, (short)(s - n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else if (n23 == 0) {
                    n23 -= n14;
                    n7 += n6;
                    if (n24 < 0) {
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        n24 -= n14;
                        if (!this.m(n7, n8 += n4, s)) {
                            return false;
                        }
                    } else {
                        n24 -= n14;
                        if (!this.m(n7 - n6, n8 += n4, (short)(s - n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                } else {
                    n23 -= n14;
                    n7 += n6;
                    if (n24 < 0) {
                        if (!this.m(n7, n8, (short)(s - n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    } else if (n24 == 0) {
                        if (!this.m(n7, n8, (short)(s - n2))) {
                            return false;
                        }
                        n24 -= n14;
                        if (!this.m(n7, n8 += n4, s)) {
                            return false;
                        }
                    } else {
                        int n25;
                        n8 += n4;
                        int n26 = n23 + n23 - n12;
                        if (n26 > (n25 = (n24 -= n14) + n24 - n13) ? !this.m(n7, n8 - n4, (short)(s - n2)) : n25 > n26 && !this.m(n7 - n6, n8, (short)(s - n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, (short)(s - n2))) {
                            return false;
                        }
                        if (!this.m(n7, n8, s)) {
                            return false;
                        }
                    }
                }
                n23 += n12;
                n24 += n13;
            }
        }
        return this.bfT();
    }

    public void a(sl_0 sl_02) {
        this.bpq = sl_02;
    }

    static {
        bpa.setLevel(Level.ALL);
        bpp = new ayv_2(new sk_0());
    }
}

