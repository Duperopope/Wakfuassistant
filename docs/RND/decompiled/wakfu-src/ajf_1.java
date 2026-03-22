/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajF
 */
public final class ajf_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBt = new afe_1[]{new afe_1("speed", "Global movement speed (default = 1.0)", aff_2.dJz, false)};

    public ajf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setGlobalMovementSpeed";
    }

    @Override
    public String getDescription() {
        return "Set the global movement speed. (default = 1.0)";
    }

    @Override
    public afe_1[] bBg() {
        return cBt;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        adq_0.bS(this.xr(0));
    }
}

