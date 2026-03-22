/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcC
 */
public class bcc_2
extends bcw_1 {
    private final bcj_1 hGf;
    private final bcd_2 hGg;

    public bcc_2(long l, bcj_1 bcj_12) {
        this.hGg = bbw_2.hCq.je(l);
        this.hGf = bcj_12;
    }

    @Override
    protected long dbv() {
        try {
            bcm_2[] bcm_2Array = this.hGf.daV();
            if (bcm_2Array == null) {
                return -1L;
            }
            if (bcm_2Array.length == 1) {
                int n = bcm_2Array[0].d();
                return this.hGg.AS(n) ? Long.valueOf(this.hGg.ok(n)) : null;
            }
            long l = 0L;
            for (bcm_2 bcm_22 : bcm_2Array) {
                if (!this.hGg.AS(bcm_22.d())) continue;
                l += this.hGg.ok(bcm_22.d());
            }
            return l;
        }
        catch (Exception exception) {
            return -1L;
        }
    }

    public int d() {
        return this.hGf.d();
    }

    @Override
    public String getDescription() {
        String string = aum_0.cWf().a(64, (long)this.hGf.d(), new Object[0]);
        if (evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ)) {
            return string;
        }
        return string + " (" + this.hGf.d() + ")";
    }

    @Override
    public String dak() {
        return aum_0.cWf().b(64, (long)this.hGf.d(), new Object[0]);
    }

    @Override
    protected boolean daJ() {
        int n = this.hGf.d();
        return !this.hGg.ob(n) || this.hGg.oc(n);
    }

    @Override
    protected boolean daI() {
        return false;
    }

    @Override
    protected boolean dbw() {
        return bcm_1.hIK.Bp(this.hGf.d());
    }

    @Override
    protected boolean dbx() {
        return this.hGf.daW();
    }

    @Override
    protected boolean dby() {
        return this.hGf.jf(aue_0.cVJ().cVK().aqZ());
    }

    public void dbO() {
        fse_1.gFu().a((aef_2)this, "isCompleted");
    }

    public void dbP() {
        fse_1.gFu().a((aef_2)this, "progressionText");
    }
}

