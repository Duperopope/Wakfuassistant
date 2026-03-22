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
 * Renamed from bTR
 */
class btr_2
extends afk_1 {
    btr_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getHandsOccupedByWeapon";
    }

    @Override
    public String getDescription() {
        return "Return number of hands used by a weapon";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqq;
    }

    @Override
    public afe_1[] bBh() {
        return btd_2.lqr;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(btd_2.dqc(), "le characterInfo " + l + " n'existe pas ");
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
        int n3 = btq_1.d(((fhc_0)r).dGh());
        if (n3 == 237) {
            this.xC(0);
            return;
        }
        this.xC(((fhc_0)r).fYp() ? 2 : 1);
    }
}

