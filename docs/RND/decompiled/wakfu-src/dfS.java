/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfS
extends afk_1 {
    dfS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setUIVisible";
    }

    @Override
    public String getDescription() {
        return "Rend visible/invisible les \u00e9l\u00e9ments d'interface qui ne font pas partis des layers permanents (Upper, Bulles de dialogue, Monde(overheads),etc...)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiW;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        boolean bl = this.xx(0);
        fbw_1 fbw_12 = fbj_1.getInstance().getLayeredContainer();
        TObjectProcedure tObjectProcedure = fes_22 -> {
            fes_22.setVisible(bl);
            return true;
        };
        fbw_12.b((TObjectProcedure<fes_2>)tObjectProcedure, 26000, 25000, 25999, -40000);
    }
}

