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
 * Renamed from dfr
 */
class dfr_0
extends afk_1 {
    dfr_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeEventListener";
    }

    @Override
    public String getDescription() {
        return "Permet de retirer une fonction sur un ?v?nement sur un widget.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohZ;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        fzq_0 fzq_02;
        String string = this.xu(0);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        String string3 = this.xu(2);
        boolean bl = "MOUSE_CLICKED_AND_DOUBLE_CLICKED".equals(string3);
        try {
            fzq_02 = bl ? fzq_0.tJU : fzq_0.valueOf(string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(ddU.ohA, "Unknown event type " + string3 + " for dialog " + string);
            return;
        }
        String string4 = this.xu(3);
        afx_1 afx_12 = this.cai();
        fis_1 fis_12 = ddi.fcw().b(afx_12, string, string2, string3, string4);
        if (fis_12 == null) {
            this.a(ddU.ohA, "Le Listener a d?j? ?t? enlev?");
            return;
        }
        fhv_12.b(fzq_02, fis_12, false);
        if (bl) {
            fhv_12.b(fzq_0.tJV, fis_12, false);
        }
    }
}

