/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTN
 */
class btn_2
extends afk_1 {
    btn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "deleteActor";
    }

    @Override
    public String getDescription() {
        return "Delete a mobile in the world. /!\\ Server doesn't knows this mobile.";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqg;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adn_0.bvh().fL(l);
        big_2.a(0, l, (bip_2)bif_2.dYO());
    }
}

