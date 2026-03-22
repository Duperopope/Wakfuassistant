/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXn
 */
final class bxn_2
extends afk_1 {
    private static final String lwH = "setEffectAreaPlayDeathAnim";
    private static final String lwI = "Active ou d?sactive l'anim de mort sur la zone dont l'uid est pass? en param?tre";
    private static final afe_1[] lwJ = new afe_1[]{new afe_1("areaId", null, aff_2.dJw, false), new afe_1("playAnim", null, aff_2.dJA, false)};

    bxn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lwH;
    }

    @Override
    public afe_1[] bBg() {
        return lwJ;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        boolean bl = this.xx(1);
        bsS bsS2 = akj_0.ciY().cja();
        if (bsS2 == null) {
            return;
        }
        QR qR = bsS2.bai();
        if (qR == null) {
            return;
        }
        QQ qQ = qR.do(l);
        if (!(qQ instanceof bbC)) {
            return;
        }
        ((bbC)((Object)qQ)).cZE().fi(bl);
    }

    @Override
    public String getDescription() {
        return lwI;
    }
}

