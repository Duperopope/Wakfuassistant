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
 * Renamed from alN
 */
public class aln_1
extends alw_1<alq_1> {
    public static final String cFY = "playSound";
    private static final afe_1[] cFZ = new afe_1[]{new afe_1("soundFileId", null, aff_2.dJw, false), new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("gainModification", null, aff_2.dJz, true), new afe_1("playCount", null, aff_2.dJz, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public aln_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFY;
    }

    @Override
    public afe_1[] bBg() {
        return cFZ;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        boolean bl = this.xx(1);
        if (n < 3) {
            return new alq_1(bl, l);
        }
        int n2 = this.xp(2);
        if (n < 4) {
            return new alq_1(bl, l, (float)n2);
        }
        int n3 = this.xp(3);
        if (n < 6) {
            return new alq_1(bl, l, (float)n2, n3);
        }
        float f2 = this.xr(4);
        float f3 = this.xr(5);
        return new alq_1(bl, l, (float)n2, n3, f2, f3);
    }

    @Override
    public void a(alq_1 alq_12, afx_1 afx_12) {
        long l = alq_12.aYj();
        if (!this.cFw.bpw().hC(l)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (!alb_2.bBL().f(l2, l)) {
            return;
        }
        alb_2.bBL().g(l2, l);
        boolean bl = alq_12.bBY();
        float f2 = alq_12.bBt();
        int n = alq_12.bBI();
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, alq_12.bBN(), n, -1L, -1L, afx_12.bha(), this.c(afx_12));
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
        return this.sD(n);
    }
}

