/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWI
 */
final class bwi_2
extends afk_1 {
    private static final Logger lus = Logger.getLogger(bwi_2.class);
    private static final String lut = "addActionToPendingGroup";
    private static final String luu = "Permet d'ajouter une action au groupe d'actions du combat du joueur et qui va executer la fonction pass?e en param?tre sur une certaine dur?e";
    private static final afe_1[] luv = new afe_1[]{new afe_1("fighterId", null, aff_2.dJw, false), new afe_1("actionDuration", null, aff_2.dJw, false), new afe_1("functionName", null, aff_2.dJx, false), new afe_1("functionParams", null, aff_2.dJC, true)};

    bwi_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lut;
    }

    @Override
    public afe_1[] bBg() {
        return luv;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        String string = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        afx_1 afx_12 = this.cai();
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lus.warn((Object)("Impossible d'executer la fonction, Fighter inconnu : " + l));
            return;
        }
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            lus.warn((Object)("Impossible d'executer la fonction, le fighter n'est pas en combat " + l));
            return;
        }
        bwj_1 bwj_12 = new bwj_1(this, agb_1.cbm(), eui_1.rtg.aJr(), 0, afx_12, string, afq_2Array, l2);
        aVi.cWF().a(bsj_02, (aft_2)bwj_12);
        aVi.cWF().m(bsj_02);
    }

    @Override
    public String getDescription() {
        return luu;
    }
}

