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
 * Renamed from dfd
 */
class dfd_0
extends afk_1 {
    dfd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "manageSkillMRU";
    }

    @Override
    public String getDescription() {
        return "Active/Desactive une action MRU";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohQ;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        fqy_0 fqy_02 = fqz_0.giz().YY(n2);
        if (fqy_02 == null) {
            ddU.ohA.error((Object)("[GD] Mauvais param?tre, le visuel " + n2 + " n'existe pas"));
            return;
        }
        fqy_02.setEnabled(this.xx(1));
    }
}

