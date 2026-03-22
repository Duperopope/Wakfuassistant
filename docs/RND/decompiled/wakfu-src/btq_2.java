/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TByteIntHashMap;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTQ
 */
class btq_2
extends afk_1 {
    btq_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getEquippedWeaponType";
    }

    @Override
    public String getDescription() {
        return "Return type of equipped weapon";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqo;
    }

    @Override
    public afe_1[] bBh() {
        return btd_2.lqp;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(btd_2.doj(), "le characterInfo " + l + " n'existe pas ");
            this.xC(0);
            return;
        }
        TByteIntHashMap tByteIntHashMap = bgy2.dkE();
        if (tByteIntHashMap == null) {
            this.xC(0);
            return;
        }
        int n2 = tByteIntHashMap.get(ffS.sgQ.shb);
        Object r = fgD.fXh().Vd(n2);
        if (r == null) {
            this.xC(0);
            return;
        }
        int n3 = btq_1.d(((fhc_0)r).dGh());
        if (n3 == 237) {
            this.xC(0);
            return;
        }
        this.xC(n3);
    }
}

