/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiS
 */
public final class ais_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] czY = new afe_1[]{new afe_1("UID", null, aff_2.dJw, false)};

    public ais_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "generateClientMobileId";
    }

    @Override
    public String getDescription() {
        return "Generate an unique ID used for mobiles creation";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return czY;
    }

    @Override
    public void ss(int n) {
        this.hA(aym_2.bSE());
    }
}

