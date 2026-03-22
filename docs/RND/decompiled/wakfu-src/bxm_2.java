/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXm
 */
final class bxm_2
extends bxo_2 {
    private static final String lwE = "rollEcaflipDice";
    private static final String lwF = "Joue les visuels associ?s ? un jet de d? Ecaflip";
    private static final afe_1[] lwG = new afe_1[]{new afe_1("diceValue", null, aff_2.dJz, false)};

    bxm_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwE;
    }

    @Override
    public afe_1[] bBg() {
        return lwG;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        long l = this.lwK.Qy();
        bgy bgy2 = bgg_0.dlO().ju(l);
        biv_0 biv_02 = biw_0.ikN.jL(bgy2.Sn());
        if (biv_02 != null) {
            biv_02.bq((byte)n2);
        }
    }

    @Override
    public String getDescription() {
        return lwF;
    }
}

