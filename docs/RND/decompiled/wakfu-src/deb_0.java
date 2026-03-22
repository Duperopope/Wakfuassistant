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
 * Renamed from deB
 */
class deb_0
extends afk_1 {
    deb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayFresco";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohJ;
    }

    @Override
    public String getDescription() {
        return "Affiche une fr?sque background manipulable horizontalement ? la souris";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        cuo_2.eSX().MZ(n2);
        aue_0.cVJ().a(cuo_2.eSX());
    }
}

