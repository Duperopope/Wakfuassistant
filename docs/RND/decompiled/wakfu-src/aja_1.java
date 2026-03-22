/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajA
 */
public final class aja_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBo = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("partName", null, aff_2.dJx, false)};

    public aja_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removePartColor";
    }

    @Override
    public String getDescription() {
        return "Remove the color on a part of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBo;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
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
        zC.bqd().tN(n2);
    }
}

