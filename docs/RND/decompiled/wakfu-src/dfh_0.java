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
 * Renamed from dfH
 */
class dfh_0
extends afk_1 {
    dfh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPropertyStringValue";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oin;
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
        ddU.ojI.add((Object)string);
        fsf_1 fsf_12 = fse_1.gFu().getProperty(string);
        if (fsf_12 == null) {
            fsf_12 = new fsf_1(string, null);
            fsf_12.pn(true);
            fse_1.gFu().b(fsf_12);
        }
        fsf_12.a((Object)string2, false);
    }
}

