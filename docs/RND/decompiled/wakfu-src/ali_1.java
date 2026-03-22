/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alI
 */
public class ali_1
extends alw_1<alr_1> {
    public static final String cFO = "playLocalSound";
    private static final afe_1[] cFP = new afe_1[]{new afe_1("rollOffPresetId", null, aff_2.dJy, false), new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("soundFileId", null, aff_2.dJw, false), new afe_1("gainModification", null, aff_2.dJz, true), new afe_1("playCount", null, aff_2.dJz, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public ali_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFO;
    }

    @Override
    public afe_1[] bBg() {
        return cFP;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alr_1 sW(int n) {
        int n2 = this.xp(0);
        long l = this.xs(1);
        boolean bl = this.xx(2);
        if (n < 4) {
            return new alr_1(n2, bl, l);
        }
        float f2 = this.xr(3);
        if (n < 5) {
            return new alr_1(n2, bl, l, f2);
        }
        int n3 = this.xp(4);
        if (n < 7) {
            return new alr_1(n2, bl, l, f2, n3);
        }
        float f3 = this.xr(5);
        float f4 = this.xr(6);
        return new alr_1(n2, bl, l, f2, n3, f3, f4);
    }

    @Override
    public void a(alr_1 alr_12, afx_1 afx_12) {
        long l = alr_12.aYj();
        if (!this.cFw.bpw().hC(l)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (!alb_2.bBL().f(l2, l)) {
            return;
        }
        alb_2.bBL().g(l2, l);
        boolean bl = alr_12.bBY();
        float f2 = alr_12.bBt();
        int n = alr_12.bBI();
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, alr_12.bBN(), n, -1L, -1L, afx_12.bha(), this.c(afx_12), this.cFw, alr_12.bCf());
                if (bl && ahm_12 != null) {
                    this.cFw.e(l, ahm_12.ccq());
                }
            } else {
                this.cFx.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.cFx.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sW(n);
    }
}

