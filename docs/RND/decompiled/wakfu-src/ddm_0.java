/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddm
 */
class ddm_0
extends afk_1 {
    ddm_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addMessage";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("message", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string;
        if (n == 1) {
            string = aum_0.cWf().c(this.xu(0), new Object[0]);
        } else {
            Object[] objectArray = new String[n - 1];
            for (int i = 1; i < n; ++i) {
                String string2 = this.xw(i);
                objectArray[i - 1] = string2;
            }
            string = aum_0.cWf().c(this.xu(0), objectArray);
        }
        int n2 = 1000 + 50 * string.length();
        dgw.fcT().a(new dgv(dgx.okK, string, n2));
    }
}

