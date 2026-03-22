/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfY
extends afk_1 {
    dfY(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "startInteractiveDialog";
    }

    @Override
    public String getDescription() {
        return "Affiche une fen?tre de dialogue interactive";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohB;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        byte by = (byte)this.xp(1);
        long l = this.xs(2);
        cjr_0 cjr_02 = new cjr_0();
        cjr_02.KU(n2);
        cjr_02.na(l);
        cjr_02.dk(by);
        aue_0.cVJ().etu().d(cjr_02);
    }
}

