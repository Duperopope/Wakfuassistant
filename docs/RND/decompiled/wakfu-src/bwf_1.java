/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWf
 */
class bwf_1
extends afk_1 {
    bwf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isResourceVisible";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("Resource X", null, aff_2.dJz, false), new afe_1("Resource Y", null, aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("visible", null, aff_2.dJA, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        bKV bKV2 = bLe.ecw().dQ(n2, n3);
        if (bKV2 == null) {
            this.a(bvy_1.aGi(), "Aucune ressource trouv?e en [" + n2 + ";" + n3 + "]");
            return;
        }
        this.dK(bKV2.isVisible());
    }
}

