/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXY
 */
class bxy_2
extends afk_1 {
    private static final Logger lxI = Logger.getLogger(bxy_2.class);
    private static final String lxJ = "playCinematicVideo";
    private static final String lxK = "Joue une video en plein \u00e9cran";
    private static final afe_1[] lxL = new afe_1[]{new afe_1("videoName", "Video name", aff_2.dJx, false), new afe_1("volume", "Video volume", aff_2.dJz, true)};

    bxy_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lxJ;
    }

    @Override
    public String getDescription() {
        return lxK;
    }

    @Override
    public afe_1[] bBg() {
        return lxL;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        float f2 = n >= 2 ? this.xr(1) : 1.0f;
        aQd.eBx.e(string, f2);
    }
}

