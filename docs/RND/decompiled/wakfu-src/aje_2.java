/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajE
 */
public final class aje_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBs = new afe_1[]{new afe_1("speed", "Global animation speed (default = 1.0)", aff_2.dJz, false)};

    public aje_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setGlobalAnimationSpeed";
    }

    @Override
    public String getDescription() {
        return "Set the global animation speed. (default = 1.0)";
    }

    @Override
    public afe_1[] bBg() {
        return cBs;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        ZK.bS(this.xr(0));
    }
}

