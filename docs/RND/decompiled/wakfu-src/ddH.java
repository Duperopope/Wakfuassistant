/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ddH
extends afk_1 {
    private static final Logger ohb = Logger.getLogger(ddH.class);

    ddH(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setScreenPosition";
    }

    @Override
    public String getDescription() {
        return "D?place une bulle de dialogue";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("align", "Alignement de la bulle", aff_2.dJx, false), new afe_1("screenXoffset", "D?calage en pixel vers la droite", aff_2.dJy, false), new afe_1("screenYoffset", "D?calage en pixel vers le haut", aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        chj_2 chj_22 = dds_0.fcD().NV(n2);
        if (chj_22 != null) {
            fzw_0 fzw_02 = fzw_0.valueOf(this.xu(1));
            int n3 = this.xp(2);
            int n4 = this.xp(3);
            frp_1 frp_12 = new frp_1();
            frp_12.aVI();
            frp_12.setAlign(fzw_02);
            frp_12.setXOffset(n3);
            frp_12.setYOffset(n4);
            chj_22.d(frp_12);
        }
        ohb.info((Object)("SetScreenPosition " + String.valueOf(chj_22)));
    }
}

