/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWd
 */
class bwd_1
extends afk_1 {
    bwd_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getResourceAlpha";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("Resource X", null, aff_2.dJz, false), new afe_1("Resource Y", null, aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("Alpha", null, aff_2.dJz, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        bKV bKV2 = bLe.ecw().dQ(n2, n3);
        if (bKV2 == null) {
            this.a(bvy_1.aGR(), "Aucune ressource trouv?e en [" + n2 + ";" + n3 + "]");
            return;
        }
        this.dJ(bKV2.aIX());
    }
}

