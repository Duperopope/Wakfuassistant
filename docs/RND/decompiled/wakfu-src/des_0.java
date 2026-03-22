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

/*
 * Renamed from deS
 */
class des_0
extends afk_1 {
    des_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hasShortcut";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return ddU.oiK;
    }

    @Override
    public String getDescription() {
        return "Indique si le joueur a au moins un raccourci";
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.oiJ;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02;
        blh_2 blh_22;
        ArrayList<blg_2> arrayList;
        int n2 = -1;
        fqu_0 fqu_02 = null;
        if (n == 2) {
            n2 = this.xp(0);
            fqu_02 = fqu_0.ho((byte)this.xp(1));
        }
        if (this.a(n2, fqu_02, arrayList = (blh_22 = (bgt_02 = aue_0.cVJ().cVK()).dlG()).ia(false))) {
            return;
        }
        ArrayList<blg_2> arrayList2 = blh_22.hZ(false);
        if (this.a(n2, fqu_02, arrayList2)) {
            return;
        }
        this.dK(false);
    }

    private boolean a(int n, fqu_0 fqu_02, ArrayList<blg_2> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            blg_2 blg_22 = arrayList.get(i);
            if (n != -1) {
                for (blb_2 blb_22 : blg_22.pd(n)) {
                    if (blb_22.gih() != fqu_02) continue;
                    this.dK(true);
                    return true;
                }
                continue;
            }
            if (blg_22.aJG()) continue;
            this.dK(true);
            return true;
        }
        return false;
    }
}

