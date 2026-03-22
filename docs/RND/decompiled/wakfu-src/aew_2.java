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
 * Renamed from aEW
 */
class aew_2
extends afk_1 {
    private static final afe_1[] dHG = new afe_1[]{new afe_1("filePath", "Path of the file to be loaded (must include .lua and the path is relative to ../src_content/script/)", aff_2.dJx, false)};

    aew_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "loadScript";
    }

    @Override
    public String getDescription() {
        return "Load a script (functions and variables can be used from loader script)";
    }

    @Override
    public afe_1[] bBg() {
        return dHG;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        String string2 = afs_1.can().bYf() + string;
        afx_1 afx_12 = this.cai();
        afl_2.dHW.J(string, string2);
        afx_12.e(afl_2.dHW.hT(string));
        afx_12.e(afl_2.dHW.hT(afx_12.aXV()));
        this.L.LdoFile(string2);
    }
}

