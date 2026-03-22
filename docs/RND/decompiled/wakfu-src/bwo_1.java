/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWO
 */
final class bwo_1
extends bxo_2 {
    private static final String luP = "displayFlyingItem";
    private static final String luQ = "Affiche le gfx d'un item au dessus de la cible de l'effet (le refId de l'item correspond ? la valeur de l'effet)";

    bwo_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return luP;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.lwK.cWC();
        long l = this.lwK.Qy();
        bgy bgy2 = bgg_0.dlO().ju(l);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        acd_1 acd_12 = bgy2 != null ? bgy2.aZw() : this.lwK.aZw();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null && this.lwK.bha() != bsj_02.d()) {
            return;
        }
        if (acd_12 == null) {
            return;
        }
        bgz_2.a(n2, (anz_1)new bxl_2(acd_12), (fjm)bgy2);
    }

    @Override
    public String getDescription() {
        return luQ;
    }
}

