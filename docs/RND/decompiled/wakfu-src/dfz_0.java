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
 * Renamed from dfz
 */
class dfz_0
extends afk_1 {
    dfz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeShortcut";
    }

    @Override
    public String getDescription() {
        return "Enl?ve le raccourci sp?cifi? des barres de raccourcis";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiF;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n2 = this.xp(0);
        fqu_0 fqu_02 = fqu_0.ho((byte)this.xp(1));
        bgt_02.dlG().a(n2, fqu_02, true);
    }
}

