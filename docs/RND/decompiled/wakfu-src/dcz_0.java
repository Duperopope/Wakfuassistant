/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dcZ
 */
class dcz_0
extends afk_1 {
    dcz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("dialog", "Name of the dialog to grip to (position will be relative to the dialog anchor point)", aff_2.dJx, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n != 1) {
            throw new LuaException("Invalid parameter count");
        }
        String string = this.xu(0);
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        fkf_2 fkf_22 = fhv_12 instanceof fkf_2 ? (fkf_2)((Object)fhv_12) : fkf_2.uFy;
        cum_1.nNA.setTarget(fkf_22);
    }

    @Override
    public String getName() {
        return "setDialogGrip";
    }
}

