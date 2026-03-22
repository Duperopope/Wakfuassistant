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
 * Renamed from det
 */
class det_0
extends afk_1 {
    det_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "clickButton";
    }

    @Override
    public String getDescription() {
        return "Simule un clique sur un bouton";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oia;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.xu(0));
        if (fhs_22 == null) {
            return;
        }
        fhv_1 fhv_12 = fhs_22.uH(this.xu(1));
        if (fhv_12 instanceof fad_1) {
            if (n > 2) {
                ((fad_1)fhv_12).ar(switch (this.xp(2)) {
                    case 2 -> 2;
                    case 3 -> 3;
                    default -> 1;
                }, n == 4 ? this.xp(3) : 1, 0);
            } else {
                ((fad_1)fhv_12).gsw();
            }
        }
    }
}

