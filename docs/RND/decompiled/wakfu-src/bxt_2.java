/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXt
 */
public final class bxt_2
extends afk_1 {
    public bxt_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getCharacterName";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("characterName", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.xs(0));
        this.hS(bgy2 != null ? bgy2.getName() : "");
    }
}

