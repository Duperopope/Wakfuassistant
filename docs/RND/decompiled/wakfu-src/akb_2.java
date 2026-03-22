/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akb
 */
public final class akb_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBU = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("partName", null, aff_2.dJx, false), new afe_1("red", "0 to 255", aff_2.dJy, false), new afe_1("green", "0 to 255", aff_2.dJy, false), new afe_1("blue", "0 to 255", aff_2.dJy, false), new afe_1("alpha", "0 to 255", aff_2.dJy, false)};

    public akb_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPartColorByte";
    }

    @Override
    public String getDescription() {
        return "Set the color of a part of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBU;
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
        float f2 = (float)this.xp(2) / 255.0f;
        float f3 = (float)this.xp(3) / 255.0f;
        float f4 = (float)this.xp(4) / 255.0f;
        float f5 = (float)this.xp(5) / 255.0f;
        zC.a(n2, new float[]{f2, f3, f4, f5});
    }
}

