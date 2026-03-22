/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddx
 */
final class ddx_0
extends afk_1 {
    ddx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "changeToLayer";
    }

    @Override
    public String getDescription() {
        return "Change the layer of an InteractiveBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("layerValue", "valeur du layer (cf LayeredContainer)", aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        chj_2 chj_22 = dds_0.fcD().NV(this.xp(0));
        if (chj_22 != null) {
            fbj_1.getInstance().getLayeredContainer().n(chj_22);
            chj_22.setModalLevel((short)Short.MAX_VALUE);
            fbj_1.getInstance().getLayeredContainer().d(chj_22, this.xp(1));
        }
    }
}

