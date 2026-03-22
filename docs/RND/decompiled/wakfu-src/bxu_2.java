/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXu
 */
public final class bxu_2
extends afk_1 {
    private static final Logger lwX = Logger.getLogger(bxu_2.class);

    public bxu_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getCharacteristicValue";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false), new afe_1("charac", null, aff_2.dJx, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("characValue", null, aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lwX.error((Object)("No character found :" + l));
            this.cah();
            return;
        }
        if (!bgy2.a((pt_0)exx_2.valueOf(string))) {
            lwX.error((Object)("No charac found (" + string + ") for character " + l));
            this.cah();
            return;
        }
        this.xC(bgy2.c((pt_0)exx_2.valueOf(string)));
    }
}

