/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUo
 */
class buo_2
extends afk_1 {
    public buo_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getContentTranslation";
    }

    @Override
    public String getDescription() {
        return "Return the translated text based on parameters";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("translationTypeId", null, aff_2.dJy, false), new afe_1("translationLinkedId", null, aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("string return", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        String string;
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        aum_0 aum_02 = aum_0.cWf();
        if (aum_02.e(n2, n3) && !(string = aum_02.a(n2, (long)n3, new Object[0])).isEmpty()) {
            this.hS(string);
            return;
        }
        this.cah();
    }
}

