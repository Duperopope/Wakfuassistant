/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWl
 */
class bwl_1
extends afk_1 {
    bwl_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "triggerEvent";
    }

    @Override
    public String getDescription() {
        return "Trigger an event on the server";
    }

    @Override
    public afe_1[] bBg() {
        afe_1[] afe_1Array = new afe_1[]{new afe_1("eventId", "Used as filter on server", aff_2.dJy, false)};
        return afe_1Array;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        cje_0 cje_02 = new cje_0();
        cje_02.lT(n2);
        aue_0.cVJ().etu().d(cje_02);
    }
}

