/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVW
 */
class bvw_1
extends afk_1 {
    bvw_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPetId";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("playerId", null, aff_2.dJw, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("petId", null, aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null && bgy2 instanceof bhJ) {
            bjo_0 bjo_02 = ((bhJ)bgy2).dpe();
            if (bjo_02 != null) {
                this.hA(bjo_02.eam().Sn());
            } else {
                this.cah();
                this.a(bvv_1.aGh(), "le character " + l + " n'a pas de pet");
            }
        } else {
            this.cah();
            this.a(bvv_1.aGi(), "le character " + l + " n'existe pas ou n'est pas un joueur");
        }
    }
}

