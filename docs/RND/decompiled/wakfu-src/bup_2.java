/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUp
 */
class bup_2
extends afk_1 {
    public bup_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getKeyTranslation";
    }

    @Override
    public String getDescription() {
        return "Return the translated text based on parameters";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("translationKeyName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("string return", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        String string;
        String string2 = this.xu(0);
        My my = My.aUV();
        Object[] objectArray = new String[n - 1];
        for (int i = 0; i < objectArray.length; ++i) {
            String string3 = this.xw(i + 1);
            objectArray[i] = string3;
        }
        if (my.cO(string2) && !(string = my.c(string2, objectArray)).isEmpty()) {
            this.hS(string);
            return;
        }
        this.cah();
    }
}

