/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTZ
 */
final class btz_2
extends afk_1 {
    private static final Logger lqE = Logger.getLogger(btz_2.class);
    private static final String lqF = "applyMount";
    private static final afe_1[] lqG = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("mountGfxId", null, aff_2.dJz, false), new afe_1("mountBreed", null, aff_2.dJz, false)};

    btz_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lqF;
    }

    @Override
    public afe_1[] bBg() {
        return lqG;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        fjk fjk2 = fjk.gP((byte)n3);
        ads_0 ads_02 = (ads_0)adn_0.bvh().fM(l);
        if (ads_02 != null) {
            try {
                btz_2.a(ads_02, Integer.toString(n2), fjk2);
            }
            catch (fu_0 fu_02) {
                lqE.error((Object)"Exception levee", (Throwable)fu_02);
            }
            ajh_0 ajh_02 = new ajh_0(new ajg_0(sm_0.bpx, fjk2.d()));
            ads_02.a(ajh_02);
        } else {
            this.a(lqE, "le mobile " + l + " n'existe pas ");
        }
    }

    private static void a(ZC zC, String string, fjk fjk2) {
        String string2 = "petGfxPath";
        String string3 = auc_0.cVq().bS("petGfxPath");
        String string4 = String.format(string3, string);
        Anm anm = zC.dS(string4);
        zC.a(anm, () -> zC.dT(ajf_0.yG(fjk2.d())));
    }
}

