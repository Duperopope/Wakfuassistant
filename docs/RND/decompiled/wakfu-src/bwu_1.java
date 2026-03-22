/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWU
 */
final class bwu_1
extends bxo_2 {
    private static final String lvx = "getArmorLossValue";
    private static final String lvy = "Retourne la valeur d'armure perdue";
    private static final afe_1[] lvz = new afe_1[]{new afe_1("value", null, aff_2.dJy, false)};

    bwu_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvx;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvz;
    }

    @Override
    public void ss(int n) {
        this.xC(this.lwK.cXx());
    }

    @Override
    public String getDescription() {
        return lvy;
    }
}

