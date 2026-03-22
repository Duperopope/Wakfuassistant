/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dfK
 */
class dfk_0
extends afk_1 {
    dfk_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setShortcutUsable";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiP;
    }

    @Override
    public String getDescription() {
        return "Active/d?sactive le ou les raccourcis de la ou des barres de raccourcis sp?cifi?es";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        blh_2 blh_22 = bgt_02.dlG();
        boolean bl = this.xx(0);
        if (n == 1) {
            for (blg_2 blg_22 : blh_22.hZ(false)) {
                blg_22.hX(bl);
            }
            for (blg_2 blg_22 : blh_22.ia(false)) {
                blg_22.hX(bl);
            }
        } else {
            dfL dfL2;
            String string = this.xu(1);
            try {
                dfL2 = dfL.valueOf(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ddU.ohA.error((Object)("Impossible de retrouver le type de barre de raccourci suivant : " + string));
                return;
            }
            if (n == 2) {
                if (dfL2.fcL()) {
                    for (blg_2 blg_23 : blh_22.hZ(false)) {
                        blg_23.hX(bl);
                    }
                }
                if (dfL2.fcM()) {
                    for (blg_2 blg_23 : blh_22.ia(false)) {
                        blg_23.hX(bl);
                    }
                }
                if (dfL2.fcK()) {
                    blh_22.edI().setUsable(bl);
                    blh_22.edJ().setUsable(bl);
                }
            } else {
                byte by = (byte)this.xp(2);
                blg_2 blg_24 = blh_22.cj(by);
                blg_2 blg_25 = blh_22.ck(by);
                if (n == 3) {
                    if (blg_25 != null && dfL2.fcL()) {
                        blg_25.hX(bl);
                    }
                    if (blg_24 != null && dfL2.fcM()) {
                        blg_24.hX(bl);
                    }
                } else if (n == 4) {
                    short s = (short)this.xp(3);
                    if (blg_25 != null && dfL2.fcL()) {
                        blg_25.cc(s).setUsable(bl);
                    }
                    if (blg_24 != null && dfL2.fcM()) {
                        blg_24.cc(s).setUsable(bl);
                    }
                }
            }
        }
    }
}

