/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dfO
 */
class dfo_0
extends afk_1 {
    dfo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setToastsEnabled";
    }

    @Override
    public String getDescription() {
        return "Active ou d\u00e9sactive les notifications toasts affich\u00e9es en haut de l'\u00e9cran.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojH;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"1 parameter expected for setToastsEnabled function but received 0");
            return;
        }
        boolean bl = this.xx(0);
        byj_1.epo().b(!bl, 0);
        cwz_1.eWv().kM(!bl);
    }
}

