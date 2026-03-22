/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVG
 */
class bvg_2
extends afk_1 {
    final /* synthetic */ bvz_2 lsn;

    bvg_2(bvz_2 bvz_22, LuaState luaState) {
        this.lsn = bvz_22;
        super(luaState);
    }

    @Override
    public String getName() {
        return "setClientVar";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("varValue", null, aff_2.dJw, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        this.lsn.lsf.iI(this.xs(0));
    }
}

