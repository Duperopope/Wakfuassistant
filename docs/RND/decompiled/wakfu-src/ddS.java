/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashSet;
import org.keplerproject.luajava.LuaState;

final class ddS
extends afk_1 {
    private final int ohu = 4500;
    private final int ohv = 600;

    ddS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayFlyingText";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("R", "Valeur rouge appliqu?e au texte", aff_2.dJz, false), new afe_1("G", "Valeur verte appliqu?e au texte", aff_2.dJz, false), new afe_1("B", "Valeur bleue appliqu?e au texte", aff_2.dJz, false), new afe_1("font", "Font ? utiliser", aff_2.dJx, false), new afe_1("targetId", "Id du mobile concern?", aff_2.dJw, false), new afe_1("textKey", "Clef de traduction du texte", aff_2.dJx, false), new afe_1("style", "Style du texte", aff_2.dJz, false), new afe_1("size", "Taille du texte", aff_2.dJz, true), new afe_1("textParams", "Param?tres ?ventuels du texte (20 par d?faut)", aff_2.dJC, true)};
    }

    @Override
    public String getDescription() {
        return "Affiche un texte volant au-dessus d'un mobile donn?";
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        Object[] objectArray;
        float f2 = (float)this.xq(0);
        float f3 = (float)this.xq(1);
        float f4 = (float)this.xq(2);
        String string = this.xu(3);
        long l = this.xs(4);
        String string2 = this.xu(5);
        int n2 = this.xp(6);
        int n3 = 20;
        if (n > 7) {
            n3 = Math.max(1, this.xp(7));
        }
        if (n > 8) {
            objectArray = new String[n - 8];
            for (int i = 0; i < objectArray.length; ++i) {
                objectArray[i] = this.xw(8 + i);
            }
        } else {
            objectArray = new String[]{};
        }
        if (string.isEmpty()) {
            n2 = 5;
            string = "wci";
            n3 = 23;
        }
        bbp_2 bbp_22 = null;
        bbp_2 bbp_23 = bbq_2.dao().jb(l);
        if (bbp_23 != null && bbp_23.isVisible()) {
            bbp_22 = bbp_23;
        }
        if (bbp_22 == null) {
            return;
        }
        String string3 = aum_0.cWf().c(string2, objectArray);
        if (string3 != null && string3.length() > 0) {
            this.a(f2, f3, f4, string, n2, n3, bbp_22, string3);
        }
    }

    private void a(float f2, float f3, float f4, String string, int n, int n2, anz_1 anz_12, String string2) {
        xw_0 xw_02 = new xw_0();
        xv_0 xv_02 = new xv_0(awk_2.f(string, n, n2), string2, xw_02, 4500);
        xv_02.c(f2, f3, f4, 1.0f);
        xv_02.a(anz_12);
        HashSet<xa_0> hashSet = xd_0.bnv().b(anz_12);
        if (hashSet != null) {
            xv_02.qC(hashSet.size() * 600);
        }
        xd_0.bnv().a(xv_02);
    }
}

