/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aka
 */
public final class aka_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBT = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("partName", null, aff_2.dJx, false), new afe_1("red", "0 to 1", aff_2.dJz, false), new afe_1("green", "0 to 1", aff_2.dJz, false), new afe_1("blue", "0 to 1", aff_2.dJz, false), new afe_1("alpha", "0 to 1", aff_2.dJz, false)};

    public aka_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPartColor";
    }

    @Override
    public String getDescription() {
        return "Set the color of a part of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBT;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        String string = this.xu(1);
        int n2 = Anm.fO(string);
        if (n2 == 0) {
            this.a(this.bBx(), "partName invalid " + string);
            return;
        }
        float f2 = (float)this.xq(2);
        float f3 = (float)this.xq(3);
        float f4 = (float)this.xq(4);
        float f5 = (float)this.xq(5);
        zC.a(n2, new float[]{f2, f3, f4, f5});
    }
}

