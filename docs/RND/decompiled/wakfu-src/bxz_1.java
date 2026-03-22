/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXz
 */
public final class bxz_1
extends afk_1 {
    public bxz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerBreed";
    }

    @Override
    public String getDescription() {
        return "Return the Breed ID and Name of the current local player character";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerBreedId", null, aff_2.dJy, false), new afe_1("localPlayerBreedName", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        bfo_2 bfo_22 = aue_0.cVJ().cVK().dkD();
        short s = bfo_22.aIi();
        String string = bfo_22.getName();
        this.xC(s);
        this.hS(string);
    }
}

