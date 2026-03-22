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
 * Renamed from bXU
 */
public class bxu_1
extends alz_1<alq_1> {
    public static final String lxx = "playSound";
    private static final afe_1[] lxy = new afe_1[]{new afe_1("soundFileId", null, aff_2.dJw, false), new afe_1("gainModification", null, aff_2.dJz, true), new afe_1("playCount", null, aff_2.dJz, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};
    private final bxv_1 lxz;
    private final Logger lxA;

    public bxu_1(bxv_1 bxv_12, LuaState luaState, Logger logger) {
        super(luaState);
        this.lxz = bxv_12;
        this.lxA = logger;
    }

    @Override
    public String getName() {
        return lxx;
    }

    @Override
    public afe_1[] bBg() {
        return lxy;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        if (n < 2) {
            return new alq_1(l);
        }
        float f2 = this.xr(1);
        if (n < 3) {
            return new alq_1(l, f2);
        }
        int n2 = this.xp(2);
        if (n < 5) {
            return new alq_1(l, f2, n2);
        }
        float f3 = this.xr(3);
        float f4 = this.xr(4);
        return new alq_1(l, f2, n2, f3, f4);
    }

    @Override
    protected void a(alq_1 alq_12, afx_1 afx_12) {
        long l = alq_12.aYj();
        float f2 = alq_12.bBt();
        int n = alq_12.bBI();
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, alq_12.bBN(), n, -1L, -1L, -1);
                if (ahm_12 != null) {
                    this.lxz.hF(ahm_12.ccq());
                }
            } else {
                this.lxA.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.lxA.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sD(n);
    }
}

