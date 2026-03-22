/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfD
extends afk_1 {
    dfD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setLocalPropertyStringValue";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oio;
    }

    @Override
    public String getDescription() {
        return "Applique une valeure String ? une propri?t? xulor";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        String string2 = this.xu(1);
        String string3 = this.xu(2);
        ddU.ojI.add((Object)string);
        fsf_1 fsf_12 = fse_1.gFu().getProperty(string);
        if (fsf_12 == null) {
            fsf_12 = new fsf_1(string, fyw_0.gqw().gqC().uR(string2));
            fsf_12.pn(true);
            fse_1.gFu().b(fsf_12);
        }
        fsf_12.a((Object)string3, false);
    }
}

