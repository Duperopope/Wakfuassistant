/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akS
 */
public class aks_2
extends afk_1 {
    public aks_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "runOnFadeIn";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("func", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        if (asj_2.bJt().bJw()) {
            this.cai().a(string, afq_2Array, new afp_2[0]);
        } else {
            asj_2.bJt().a(new akt_2(string, this.cai(), afq_2Array));
        }
    }
}

