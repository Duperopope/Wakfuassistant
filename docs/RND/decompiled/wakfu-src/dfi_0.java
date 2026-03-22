/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dfI
 */
class dfi_0
extends afk_1 {
    dfi_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setShortcutBarType";
    }

    @Override
    public String getDescription() {
        return "Permet de changer le type de la barre de raccourci (Combat ou objet)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojE;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"setShortcutBarType: le type de barre \u00e0 afficher est obligatoire");
            return;
        }
        int n2 = this.xp(0);
        blh_2 blh_22 = aue_0.cVJ().cVK().dlG();
        switch (n2) {
            case 0: {
                fqt_0 fqt_02 = blh_22.ede() == fqt_0.sTc ? fqt_0.sTd : fqt_0.sTc;
                blh_22.a(fqt_02, true);
                break;
            }
            case 1: {
                if (blh_22.ede() == fqt_0.sTc) break;
                blh_22.a(fqt_0.sTc, true);
                break;
            }
            case 2: {
                if (blh_22.ede() == fqt_0.sTd) break;
                blh_22.a(fqt_0.sTd, true);
                break;
            }
            default: {
                ddU.ohA.error((Object)"setShortcutBarType: Param\u00e8tre invalide");
            }
        }
    }
}

