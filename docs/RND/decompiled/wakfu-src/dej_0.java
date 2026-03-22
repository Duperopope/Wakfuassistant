/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dej
 */
class dej_0
extends afk_1 {
    dej_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addMRU";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohS;
    }

    @Override
    public String getDescription() {
        return "Ajoute un MRU d'action d\u00e9finie \u00e0 un personnage";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        cps_1[] cps_1Array;
        long l = this.xs(0);
        int n2 = this.xp(1);
        bgy bgy2 = bgg_0.dlO().ju(l);
        cpm_1[] cpm_1Array = bgy2.chR();
        cps_1[] cps_1Array2 = new cps_1[cpm_1Array.length];
        for (int i = 0; i < cpm_1Array.length; ++i) {
            cps_1Array2[i] = cpm_1Array[i].eLz();
        }
        cps_1 cps_12 = null;
        for (cps_1 cps_13 : cps_1Array = cps_1.values()) {
            if (cps_13.avZ() != n2) continue;
            cps_12 = cps_13;
            break;
        }
        boolean bl = false;
        if (n < 3 || this.xx(2)) {
            for (cps_1 cps_14 : cps_1Array2) {
                if (cps_12 == null || cps_14.avZ() != cps_12.eLJ().eLz().avZ()) continue;
                bl = true;
                break;
            }
        }
        if (!bl) {
            bgy2.a(cps_12);
        }
    }
}

