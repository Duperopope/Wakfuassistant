/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alF
 */
public class alf_1
extends alv_1<alp_1<alq_1>> {
    public static final String cFI = "playLocalRandomSound";
    private static final afe_1[] cFJ = new afe_1[]{new afe_1("rollOffPresetId", null, aff_2.dJy, false), new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public alf_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFI;
    }

    @Override
    public afe_1[] bBg() {
        return cFJ;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alp_1<alq_1> sV(int n) {
        int n2 = this.xp(0);
        boolean bl = this.xx(1);
        List<alq_1> list = this.g(2, n, false);
        return new alp_1<alq_1>(n2, bl, list);
    }

    @Override
    public void a(alp_1<alq_1> alp_12, afx_1 afx_12) {
        alq_1 alq_12 = this.o(alp_12.bBH());
        long l = alq_12.aYj();
        int n = (int)alq_12.bBt();
        if (!this.cFu.bpw().hC(l)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (!alb_2.bBL().f(l2, l)) {
            return;
        }
        alb_2.bBL().g(l2, l);
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(l, (float)n / 100.0f, alq_12.bBN(), 1, -1L, -1L, afx_12.bha(), this.c(afx_12), this.cFu, alp_12.bCe());
                if (alp_12.bBY() && ahm_12 != null) {
                    this.cFu.e(l, ahm_12.ccq());
                }
            } else {
                this.cFv.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.cFv.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sV(n);
    }
}

