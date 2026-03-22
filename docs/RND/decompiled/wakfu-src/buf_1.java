/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUf
 */
class buf_1
extends afk_1 {
    buf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "Shift";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("number", aff_2.dJw, false), new afe_1("direction (>>, <<, >>>)", aff_2.dJx, false), new afe_1("shift", aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("number", aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        if (n != 3) {
            buc_1.aGh().error((Object)"Invalid param number");
        } else {
            long l = this.xs(0);
            String string = this.xu(1);
            int n2 = this.xp(2);
            if (string.equals("<<")) {
                l <<= n2;
            } else if (string.equals(">>")) {
                l >>= n2;
            } else if (string.equals(">>>")) {
                l >>>= n2;
            }
            this.hA(l);
        }
    }
}

