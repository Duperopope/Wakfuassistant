/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deT
extends afk_1 {
    deT(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hasWorldShortcut";
    }

    @Override
    public String getDescription() {
        return "Indique si le joueur a au moins un raccourci de monde";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return ddU.oiM;
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.oiL;
    }

    @Override
    protected void ss(int n) {
        int n2 = -1;
        fqu_0 fqu_02 = null;
        if (n == 2) {
            n2 = this.xp(0);
            fqu_02 = fqu_0.ho((byte)this.xp(1));
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        blh_2 blh_22 = bgt_02.dlG();
        ArrayList<blg_2> arrayList = blh_22.ia(false);
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            blg_2 blg_22 = arrayList.get(i);
            if (n2 != -1) {
                for (blb_2 blb_22 : blg_22.pd(n2)) {
                    if (blb_22.gih() != fqu_02) continue;
                    this.dK(true);
                    return;
                }
                continue;
            }
            if (blg_22.aJG()) continue;
            this.dK(true);
            return;
        }
        this.dK(false);
    }
}

