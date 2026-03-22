/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deq
extends afk_1 {
    deq(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "characterDisplayerClose";
    }

    @Override
    public String getDescription() {
        return "Ferme une fenetre d'interface dans laquelle on place un perso";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oif;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        fyw_0.gqw().tl(ddU.Of(n2));
    }
}

