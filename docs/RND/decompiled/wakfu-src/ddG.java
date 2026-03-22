/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class ddG
extends afk_1 {
    ddG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setOffset";
    }

    @Override
    public String getDescription() {
        return "Change the offsets of an InteractiveBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("x", "Decalage en pixel vers la droite", aff_2.dJy, false), new afe_1("y", "Decalage en pixel vers le haut", aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        chj_2 chj_22 = dds_0.fcD().NV(this.xp(0));
        if (chj_22 != null) {
            chj_22.setOffset(this.xp(1), this.xp(2));
        }
    }
}

