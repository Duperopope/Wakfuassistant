/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXH
 */
public final class bxh_1
extends afk_1 {
    public bxh_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getTranslation";
    }

    @Override
    public String getDescription() {
        return "Return the translation of a translation key";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("translationKey", null, aff_2.dJx, false), new afe_1("translationParams", null, aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("text", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        Object[] objectArray = new String[n - 1];
        for (int i = 1; i < n; ++i) {
            objectArray[i - 1] = this.xu(i);
        }
        this.hS(My.aUV().c(string, objectArray));
    }
}

