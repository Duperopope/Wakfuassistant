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
 * Renamed from dew
 */
class dew_0
extends afk_1 {
    dew_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayBackground";
    }

    @Override
    public String getDescription() {
        return "Ouvre l'interface d'affichage background (Affiche, St?le, Livre, etc..)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojm;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        cso_2 cso_22 = cso_2.eOa();
        cso_22.Mr(this.xp(0));
        aue_0.cVJ().a(cso_22);
    }
}

