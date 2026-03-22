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
 * Renamed from bYa
 */
class bya_2
extends afk_1 {
    private static final Logger lxM = Logger.getLogger(bya_2.class);
    private static final String lxN = "startVideoLoading";
    private static final String lxO = "[WIP] Charge une vid\u00e9o donn\u00e9e et affiche une interface de chargement";
    private static final afe_1[] lxP = new afe_1[]{new afe_1("videoName", null, aff_2.dJx, false)};

    bya_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lxN;
    }

    @Override
    public String getDescription() {
        return lxO;
    }

    @Override
    public afe_1[] bBg() {
        return lxP;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        aQd.eBx.z(string, true);
    }
}

