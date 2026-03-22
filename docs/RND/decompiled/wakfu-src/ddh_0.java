/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddh
 */
class ddh_0
extends afk_1 {
    ddh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getItemPath";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("id", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("path", null, aff_2.dJx, false)};
    }

    @Override
    public void ss(int n) {
        Object r = fgD.fXh().Vd(this.xp(0));
        String string = auc_0.cVq().zz(((fhc_0)r).aVt());
        this.hS(string);
    }
}

