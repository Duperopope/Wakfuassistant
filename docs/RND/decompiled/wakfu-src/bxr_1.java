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
 * Renamed from bXR
 */
public class bxr_1
extends aly_1<List<alq_1>> {
    public static final String lxp = "playRandomSound";
    private static final afe_1[] lxq = new afe_1[]{new afe_1("soundId, gain", null, aff_2.dJC, true)};
    private final bxv_1 lxr;
    private final Logger lxs;

    public bxr_1(bxv_1 bxv_12, LuaState luaState, Logger logger) {
        super(luaState);
        this.lxr = bxv_12;
        this.lxs = logger;
    }

    @Override
    public String getName() {
        return lxp;
    }

    @Override
    public afe_1[] bBg() {
        return lxq;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected List<alq_1> sG(int n) {
        return this.g(0, n, false);
    }

    @Override
    protected void a(List<alq_1> list, afx_1 afx_12) {
        alq_1 alq_12 = this.o(list);
        long l = alq_12.aYj();
        int n = (int)alq_12.bBt();
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(l, (float)n / 100.0f, alq_12.bBN(), 1, -1L, -1L, -1);
                if (ahm_12 != null) {
                    this.lxr.hF(ahm_12.ccq());
                }
            } else {
                this.lxs.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.lxs.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sG(n);
    }
}

