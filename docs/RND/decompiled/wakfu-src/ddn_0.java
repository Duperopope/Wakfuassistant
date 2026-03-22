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
 * Renamed from ddn
 */
final class ddn_0
extends afk_1 {
    private static final Logger ogA = Logger.getLogger(ddn_0.class);

    ddn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addButton";
    }

    @Override
    public String getDescription() {
        return "Add a button to an InteractiveBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("text", "Texte du bouton a afficher", aff_2.dJx, false), new afe_1("function", "Nom de la fonction a appeler lors du clic sur le boutton", aff_2.dJx, false), new afe_1("parameters", "Parametres a passer a la fonction", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        String string = ddw_0.j(this.xu(1), new Object[0]);
        String string2 = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        afx_1 afx_12 = this.cai();
        fis_1 fis_12 = ddi.fcw().a(afx_12, "interactiveBubbleDialog" + n2, string, "MOUSE_CLICKED", string2);
        if (fis_12 == null) {
            fis_12 = new dde_0(afx_12, string2, afq_2Array);
            ddi.fcw().a(afx_12, "interactiveBubbleDialog" + n2, string, "MOUSE_CLICKED", string2, fis_12);
            chj_2 chj_22 = dds_0.fcD().NV(n2);
            if (chj_22 != null) {
                chj_22.a(string, fis_12, true);
            } else {
                this.a(ogA, "id de bulle correspondant a rien");
            }
        } else {
            ((dde_0)fis_12).d(afq_2Array);
        }
    }
}

