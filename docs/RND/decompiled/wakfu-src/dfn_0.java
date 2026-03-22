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
 * Renamed from dfN
 */
class dfn_0
extends afk_1 {
    dfn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setTextWidget";
    }

    @Override
    public String getDescription() {
        return "Set the text of a TextWidget";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojG;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "Element " + string2 + " inconnu dans le dialog " + string);
            return;
        }
        if (!(fhv_12 instanceof fdz_1)) {
            this.a(ddU.ohA, "l'Element n'est pas du type TextWidget");
            return;
        }
        ((fdz_1)fhv_12).setText(this.xu(2));
    }
}

