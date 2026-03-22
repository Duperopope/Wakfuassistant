/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYb
 */
final class byb_2
extends afk_1 {
    private static final String lxQ = "videoAvailable";
    private static final afe_1[] lxR = new afe_1[0];
    private static final afe_1[] lxS = new afe_1[]{new afe_1("available", "true if videos can be launched on this device", aff_2.dJA, false)};

    byb_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lxQ;
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lxR;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lxS;
    }

    @Override
    protected void ss(int n) {
        this.dK(!aQd.cgp());
    }
}

