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
 * Renamed from dep
 */
class dep_0
extends afk_1 {
    dep_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "characterDisplayerChangeLinkage";
    }

    @Override
    public String getDescription() {
        return "Change l'animation d'un perso dans une interface";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oie;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        String string = this.xu(1);
        String string2 = ddU.Of(n2);
        String string3 = string.substring(2);
        int n3 = Integer.parseInt(string.substring(0, 1));
        fse_1.gFu().b("animName", (Object)string3, string2);
        fse_1.gFu().b("direction", n3, string2);
    }
}

