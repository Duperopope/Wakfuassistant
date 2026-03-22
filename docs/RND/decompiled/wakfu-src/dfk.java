/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfk
extends afk_1 {
    dfk(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "pushPetMessage";
    }

    @Override
    public String getDescription() {
        return "[Obsol?te] Ouvre une bulle de dialogue G?lutin au dessus du joueur";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojl;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        try {
            boolean bl;
            afq_2[] afq_2Array;
            int n2;
            String string;
            if (n < 1) {
                ddU.ohA.warn((Object)"On utilise PushPetMessage sans argument !");
                return;
            }
            int n3 = this.xp(0);
            if (n3 == 0) {
                string = aum_0.cWf().c(this.xu(1), new Object[0]);
            } else {
                String[] stringArray = new String[n3 - 1];
                for (n2 = 1; n2 < stringArray.length; ++n2) {
                    afq_2Array = this.xw(n2);
                    stringArray[n2 - 1] = afq_2Array;
                }
                string = aum_0.cWf().c(this.xu(1), stringArray);
            }
            boolean bl2 = bl = n == 2 || this.xx(2);
            if (n < 4) {
                cye_1.eYk().a(string, bl, 0L, bjb_0.kkb);
                return;
            }
            n2 = 3;
            afq_2Array = this.cP(n2, n);
            if (afq_2Array[0].caK() == aff_2.dJz) {
                cye_1.eYk().a(string, bl, this.xp(n2), bjb_0.kkb);
                ++n2;
            } else {
                cye_1.eYk().a(string, bl, 0L, bjb_0.kkb);
            }
            String string2 = this.xu(n2);
            afq_2[] afq_2Array2 = this.cP(n2 + 1, n);
            afx_1 afx_12 = this.cai();
            String string3 = "petBubbleDialog";
            fis_1 fis_12 = ddi.fcw().a(afx_12, "petBubbleDialog", null, null, string2);
            if (fis_12 == null) {
                fis_12 = new dfl_0(this, afx_12, string2, afq_2Array2);
                ddi.fcw().a(afx_12, "petBubbleDialog", null, null, string2, fis_12);
                cye_1.eYk().a(fis_12);
            } else {
                ((dde_0)fis_12).d(afq_2Array2);
                fis_1 fis_13 = cye_1.eYk().eYm();
                if (fis_13 == null || fis_13 != fis_12) {
                    cye_1.eYk().a(fis_12);
                }
            }
        }
        catch (Exception exception) {
            ddU.ohA.error((Object)"Exception lev?e lors de l'ajout d'un message de familier", (Throwable)exception);
        }
    }
}

