/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deV
extends afk_1 {
    deV(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "highlightFighterInTimeline";
    }

    @Override
    public String getDescription() {
        return "S?lectionne un personnage dans la timeLine";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohL;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dkZ();
        bgy bgy2 = bgg_0.dlO().ju(this.xs(0));
        if (bgy2 == null) {
            return;
        }
        if (bsj_02 != null && bsj_02.bl(bgy2)) {
            bsj_02.dGQ().i(bgy2, this.xx(1));
        }
    }
}

