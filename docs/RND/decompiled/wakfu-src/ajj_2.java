/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajj
 */
public final class ajj_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAF = new afe_1[]{new afe_1("hide", "true = show only local player, false = show all", aff_2.dJA, false)};

    public ajj_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hideOtherPlayerMobile";
    }

    @Override
    public String getDescription() {
        return "Hide player mobiles except the local player";
    }

    @Override
    public afe_1[] bBg() {
        return cAF;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        boolean bl = this.xx(0);
        adn_0.bvh().cg(bl);
    }
}

