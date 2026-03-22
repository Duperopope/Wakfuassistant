/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXc
 */
final class bxc_2
extends bxo_2 {
    private static final String lvY = "getEffectValue";
    private static final String lvZ = "Retourne la valeur de l'effet";
    private static final afe_1[] lwa = new afe_1[]{new afe_1("value", null, aff_2.dJy, false)};

    bxc_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvY;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwa;
    }

    @Override
    public void ss(int n) {
        this.xC(this.lwK.cWC());
    }

    @Override
    public String getDescription() {
        return lvZ;
    }
}

