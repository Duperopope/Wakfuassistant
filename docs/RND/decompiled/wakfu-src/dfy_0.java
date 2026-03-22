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
 * Renamed from dfy
 */
class dfy_0
extends afk_1 {
    dfy_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removePropertyClient";
    }

    @Override
    public String getDescription() {
        return "Supprime un element d'interface specifiee de la liste des clients d'une propriete";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiq;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        fsf_1 fsf_12;
        fhs_2 fhs_22;
        String string = this.xu(0);
        String string2 = this.xu(1);
        String string3 = this.xu(2);
        boolean bl = false;
        if (n > 3) {
            bl = this.xx(3);
        }
        if ((fhs_22 = fyw_0.gqw().gqC().uR(string)) == null) {
            this.a(ddU.ohA, "ElementMap inconnue " + string);
            return;
        }
        fsf_1 fsf_13 = fsf_12 = bl ? fse_1.gFu().aX(string3, string) : fse_1.gFu().getProperty(string3);
        if (fsf_12 == null) {
            this.a(ddU.ohA, "Propri?t?e inconnue " + string3);
            return;
        }
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        fsf_12.an(fhv_12);
    }
}

