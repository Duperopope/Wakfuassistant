/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVA
 */
class bva_1
extends afk_1 {
    bva_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getCastPosition";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvz_2.lse;
    }

    @Override
    public void ss(int n) {
        acd_1 acd_12 = czj_2.eYW().eSj();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }
}

