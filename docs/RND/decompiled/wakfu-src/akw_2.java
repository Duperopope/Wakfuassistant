/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akW
 */
public class akw_2
extends afk_1 {
    public akw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setLoading";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("anmName", null, aff_2.dJx, true), new afe_1("durationMin", null, aff_2.dJy, true), new afe_1("soundId", null, aff_2.dJy, true), new afe_1("fadeInDuration", null, aff_2.dJy, true), new afe_1("fadeOutDuration", null, aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        ada ada2 = ada.buh();
        if (n == 0) {
            ada2.reset();
            return;
        }
        String string = n > 0 ? this.xu(0) : null;
        int n2 = n > 1 ? this.xp(1) : 0;
        int n3 = n > 2 ? this.xp(2) : 0;
        int n4 = n > 3 ? this.xp(3) : 1000;
        int n5 = n > 4 ? this.xp(4) : 1000;
        ada2.el(string);
        ada2.rJ(n2);
        ada2.setSoundId(n3);
        ada2.rK(n4);
        ada2.rL(n5);
    }
}

