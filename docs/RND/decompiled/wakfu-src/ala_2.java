/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ala
 */
public class ala_2
extends afk_1 {
    public ala_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setVideoLoading";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("videoName", null, aff_2.dJx, true), new afe_1("soundId", null, aff_2.dJy, true), new afe_1("fadeInDuration", null, aff_2.dJy, true), new afe_1("fadeOutDuration", null, aff_2.dJy, true)};
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
        int n3 = n > 2 ? this.xp(2) : 1000;
        int n4 = n > 3 ? this.xp(3) : 1000;
        ada2.em(string);
        ada2.setSoundId(n2);
        ada2.rK(n3);
        ada2.rL(n4);
    }
}

