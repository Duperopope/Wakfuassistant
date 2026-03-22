/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deW
extends afk_1 {
    deW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isBarLockedMode";
    }

    @Override
    public String getDescription() {
        return "Indique si le controlCenter (barres, coeur,...) est verouill?e ou non";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return ddU.oji;
    }

    @Override
    protected void ss(int n) {
        this.dK(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljv));
    }
}

