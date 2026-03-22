/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXb
 */
final class bxb_2
extends afk_1 {
    public static final String lvU = "getEffectAreaBaseId";
    private static final String lvV = "Retourne le reference id de la zone dont l'uid est pass? en param?tre";
    private static final afe_1[] lvW = new afe_1[]{new afe_1("areaId", null, aff_2.dJw, false)};
    private static final afe_1[] lvX = new afe_1[]{new afe_1("areaBaseId", null, aff_2.dJw, false)};

    bxb_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lvU;
    }

    @Override
    public afe_1[] bBg() {
        return lvW;
    }

    @Override
    public afe_1[] bBh() {
        return lvX;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bsS bsS2 = akj_0.ciY().cja();
        if (bsS2 == null) {
            return;
        }
        QR qR = bsS2.bai();
        if (qR == null) {
            return;
        }
        QQ qQ = qR.do(l);
        if (qQ == null || !(qQ instanceof bbC)) {
            return;
        }
        this.hA(qQ.bcw());
    }

    @Override
    public String getDescription() {
        return lvV;
    }
}

