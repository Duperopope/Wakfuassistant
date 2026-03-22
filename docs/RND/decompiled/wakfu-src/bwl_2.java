/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWL
 */
class bwl_2
extends afk_1 {
    private static final int luD = eui_1.rsf.aJr();
    private static final String luE = "executeSpellCost";
    private static final String luF = "Execute les effets de type ActionCost pr?sents dans le groupe d'actions";
    private final afw_2 luG;

    public bwl_2(LuaState luaState, afw_2 afw_22) {
        super(luaState);
        this.luG = afw_22;
    }

    @Override
    public final String getName() {
        return luE;
    }

    @Override
    public final afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("actionExists", null, aff_2.dJA, false)};
    }

    @Override
    public final void ss(int n) {
        boolean bl = false;
        aft_2[] aft_2Array = new aft_2[this.luG.caZ().size()];
        this.luG.caZ().toArray(aft_2Array);
        for (aft_2 aft_22 : aft_2Array) {
            int n2;
            if (aft_22.caP() != luD || (n2 = aft_22.avZ()) != enf_0.qPB.d()) continue;
            this.luG.a(aft_22, false);
            bl = true;
        }
        this.dK(bl);
    }

    @Override
    public String getDescription() {
        return luF;
    }
}

