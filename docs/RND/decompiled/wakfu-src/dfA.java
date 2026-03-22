/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfA
extends afk_1 {
    dfA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeShortcutWithPosition";
    }

    @Override
    public String getDescription() {
        return "Remove the specified shortcut from his position";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiG;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        short s = (short)this.xp(0);
        int n2 = this.xp(1);
        bgt_02.dlG().b(n2, s, true);
    }
}

