/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ail
 */
class ail_2
extends afk_1 {
    ail_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removePointLight";
    }

    @Override
    public String getDescription() {
        return "Supprime une lumi?re ponctuelle";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", "Id de la lumi?re", aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        acq_0.cge.b(aih_2.sv(n2));
        aih_2.sw(n2);
    }
}

