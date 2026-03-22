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
 * Renamed from aFi
 */
class afi_2
extends afk_1 {
    afi_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "trace";
    }

    @Override
    public String getDescription() {
        return "Log a message. Each param is coma-separated";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHb;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        StringBuilder stringBuilder = new StringBuilder("[ligne: " + this.caf() + "]");
        for (int i = 0; i < n; ++i) {
            String string = this.xw(i);
            stringBuilder.append(", ").append(string != null ? string : null);
        }
        aek_1.dGR.info((Object)stringBuilder.toString());
    }
}

