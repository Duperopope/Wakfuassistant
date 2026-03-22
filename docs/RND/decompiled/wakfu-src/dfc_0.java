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
 * Renamed from dfc
 */
class dfc_0
extends afk_1 {
    dfc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "manageMRU";
    }

    @Override
    public String getDescription() {
        return "Active/D?sactive des actions du MRU en fonction de leur ID";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohR;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        cps_1[] cps_1Array;
        int n2 = this.xp(0);
        for (cps_1 cps_12 : cps_1Array = cps_1.values()) {
            if (cps_12.avZ() != n2) continue;
            cps_12.setUsable(this.xx(1));
            break;
        }
    }
}

