/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class deP
extends afk_1 {
    deP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getSpellPosition";
    }

    @Override
    public String getDescription() {
        return "Return the position of a spell in shortcut bar";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojC;
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.ojD;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n2 = this.xp(0);
        frd frd2 = bgt_02.dnM();
        if (frd2 == null) {
            this.xC(-1);
            this.xC(-1);
            return;
        }
        int n3 = frd2.Zu(n2);
        if (n3 == -1) {
            this.xC(-1);
            this.xC(-1);
            return;
        }
        if (n3 >= 6) {
            this.xC(n3 % 6);
            this.xC(1);
        } else {
            this.xC(n3);
            this.xC(0);
        }
    }
}

