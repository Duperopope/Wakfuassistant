/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfR
extends afk_1 {
    dfR(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setStartPositions";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohW;
    }

    @Override
    public String getDescription() {
        return "Sp?cifie la position des attaquants et d?fenseurs d'un combat d'entra?nement";
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
        cqc_12.ab(new acd_1(this.xp(1), this.xp(2), (short)this.xp(3)));
        cqc_12.ac(new acd_1(this.xp(4), this.xp(5), (short)this.xp(6)));
    }
}

