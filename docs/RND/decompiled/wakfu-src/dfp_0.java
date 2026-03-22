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
 * Renamed from dfP
 */
class dfp_0
extends afk_1 {
    dfp_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setBattlegroundCenter";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohV;
    }

    @Override
    public String getDescription() {
        return "Sp?cifie la position du centre du battleground d'un combat d'entra?nement";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        cqc_1 cqc_12;
        int n2 = this.xp(0);
        if (n2 == cps_1.niM.avZ()) {
            cqc_12 = (cqc_1)cps_1.niM.eLJ();
        } else if (n2 == cps_1.niN.avZ()) {
            cqc_12 = (cqc_1)cps_1.niN.eLJ();
        } else {
            ddU.ohA.error((Object)"Il n'y a que 2 actions diff?rentes de combat d'entrainement");
            return;
        }
        cqc_12.aa(new acd_1(this.xp(1), this.xp(2), (short)this.xp(3)));
    }
}

