/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTL
 */
class btl_2
extends afk_1 {
    btl_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createActor";
    }

    @Override
    public String getDescription() {
        return "Create a mobile in the world. /!\\ Server doesn't knows this mobile.";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqe;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        int n2 = this.xp(2);
        int n3 = this.xp(3);
        int n4 = this.xp(4);
        byte by = (byte)(n >= 6 ? this.xp(5) : 8);
        int n5 = this.cai().bha();
        btm_2 btm_22 = new btm_2(this, l, n5);
        btm_22.a(agh_1.dLJ);
        byte by2 = 0;
        if (string != null && !string.isEmpty() && string.charAt(string.length() - 1) == '1') {
            by2 = 1;
        }
        btm_22.lf(string);
        btm_22.a(abi_1.dzk);
        btm_22.dT("AnimStatique");
        btm_22.e(n2, n3, n4);
        btm_22.qR(afX.csq.byy());
        if (by != 4 && by != 8) {
            this.a(btd_2.aGj(), "nombre de direction (" + by + ") inconnu, forc?e ? 8 ");
            btm_22.at((byte)8);
        } else {
            btm_22.at(by);
        }
        if (n >= 7) {
            bhJ.a((short)this.xp(6), btm_22, by2);
        }
        aue_0.a(btm_22);
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dmV();
        crt_2.a(bsj_02, btm_22);
        adn_0.bvh().g(btm_22);
        this.cai().ae(btm_22);
    }
}

