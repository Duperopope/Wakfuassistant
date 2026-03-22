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
 * Renamed from dff
 */
class dff_0
extends afk_1 {
    dff_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "openInfoDialog";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojx;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Ouvre un popup semblable ? celui des donjons shukrutes, mais sans ic?ne challenge et avec un titre param?tr?";
    }

    @Override
    public void ss(int n) {
        Object object;
        String string = null;
        String string2 = aum_0.cWf().c(this.xu(0), new Object[0]);
        if (n >= 1) {
            object = this.xu(1);
            if (n == 1) {
                string = aum_0.cWf().c((String)object, new Object[0]);
            } else {
                String[] stringArray = new String[n - 1];
                for (int i = 1; i < n; ++i) {
                    String string3;
                    stringArray[i - 1] = string3 = this.xw(i);
                }
                string = aum_0.cWf().c((String)object, stringArray);
            }
        }
        object = new cvg_1(string2, string);
        cva_2.eUD().a((cvg_1)object);
    }
}

