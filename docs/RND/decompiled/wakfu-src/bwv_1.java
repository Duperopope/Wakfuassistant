/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWV
 */
final class bwv_1
extends bxo_2 {
    private static final String lvA = "getBarrierLossValue";
    private static final String lvB = "Retourne la valeur de barri\u00e8re perdue";
    private static final afe_1[] lvC = new afe_1[]{new afe_1("value", null, aff_2.dJy, false)};

    bwv_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvA;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvC;
    }

    @Override
    public void ss(int n) {
        this.xC(this.lwK.cXy());
    }

    @Override
    public String getDescription() {
        return lvB;
    }
}

