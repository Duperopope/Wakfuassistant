/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ewi
extends WH
implements fss_0 {
    private static final Logger oyk = Logger.getLogger(ewi.class);
    public static final VK oyl = new VK(18, 18, (short)Short.MIN_VALUE);
    public static final VK oym = new VK(18, 18, 0);
    private fam_0[] lHo;
    private VL oyn;
    private VL oyo;
    private VL oyp;

    public ewi(int n, int n2) {
        this.bap = n * 18;
        this.baq = n2 * 18;
        this.ban = 0;
    }

    @Override
    public void a(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        int n = 9;
        int n2 = 9;
        this.a(fsu2, 0, 0);
        this.a(fsu3, 9, 0);
        this.a(fsu4, 0, 9);
        this.a(fsu5, 9, 9);
        this.oyn = fsu.b(fsu2, fsu3, fsu4, fsu5);
        this.oyo = fsu.c(fsu2, fsu3, fsu4, fsu5);
        this.oyp = fsu.d(fsu2, fsu3, fsu4, fsu5);
    }

    @Override
    public void a(@NotNull fam_0[] fam_0Array) {
        this.lHo = fam_0Array;
    }

    private void a(fsu fsu2, int n, int n2) {
        int n3 = n + this.bap;
        int n4 = n2 + this.baq;
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (fsu2 != null && !fsu2.ab(j, i)) continue;
                this.d(j + n3, i + n4, true);
            }
        }
    }

    @Override
    public final boolean aJ(int n, int n2) {
        if (super.aJ(n, n2)) {
            return true;
        }
        for (fam_0 fam_02 : this.lHo) {
            if (!fam_02.aq(n, n2) || !fam_02.aJ(n, n2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(apl_1 apl_12) {
        throw new UnsupportedOperationException("Impossible sur les patch");
    }

    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        int n4 = 1;
        wt_0 wt_02 = wt_0Array[n3];
        wt_02.bap = n;
        wt_02.baq = n2;
        wt_02.ban = this.fc(n, n2);
        wt_02.aXR = (byte)Math.max(0, wt_02.ban);
        wt_02.bNP = (byte)(super.aJ(n, n2) ? -1 : 7);
        wt_02.bNr = false;
        wt_02.bNQ = (byte)this.fd(n, n2);
        wt_02.bNR = (byte)this.aL(n, n2);
        if (this.lHo.length != 0) {
            for (fam_0 fam_02 : this.lHo) {
                int n5 = fam_02.a(n, n2, wt_0Array, n3 + n4);
                if (n5 == -1) continue;
                n4 += ewi.a(wt_0Array, n3, n3 + n4, n5);
            }
        }
        return n4;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        int n4 = 1;
        wu_0 wu_02 = wu_0Array[n3];
        wu_02.bap = n;
        wu_02.baq = n2;
        wu_02.ban = this.fc(n, n2);
        wu_02.aXR = (byte)Math.max(0, wu_02.ban);
        wu_02.bNr = false;
        if (this.lHo.length != 0) {
            for (fam_0 fam_02 : this.lHo) {
                int n5 = fam_02.a(n, n2, wu_0Array, n3 + n4);
                if (n5 == -1) continue;
                n4 += ewi.a(wu_0Array, n3, n3 + n4, n5);
            }
        }
        return n4;
    }

    private short fc(int n, int n2) {
        if (this.oyn == null) {
            return oyl.bkK();
        }
        return oyl.a(n - this.bap, n2 - this.baq, 0, this.oyn);
    }

    @Override
    public short aL(int n, int n2) {
        if (this.oyp == null) {
            return oym.bkK();
        }
        return oym.a(n - this.bap, n2 - this.baq, 0, this.oyp);
    }

    private short fd(int n, int n2) {
        if (this.oyo == null) {
            return oym.bkK();
        }
        return oym.a(n - this.bap, n2 - this.baq, 0, this.oyo);
    }

    private static int a(ws_0[] ws_0Array, int n, int n2, int n3) {
        for (int i = n; i < n2; ++i) {
            int n4 = n2;
            while (n4 < n2 + n3) {
                if (!ws_0.a(ws_0Array[i], ws_0Array[n4])) {
                    ++n4;
                    continue;
                }
                ws_0 ws_02 = ws_0Array[i];
                ws_0Array[i] = ws_0Array[i].b(ws_0Array[n4]);
                if (--n3 == 0) continue;
                System.arraycopy(ws_0Array, n4 + 1, ws_0Array, n4, n3);
                ws_0Array[n4 + n3] = ws_02;
            }
        }
        return n3;
    }
}

