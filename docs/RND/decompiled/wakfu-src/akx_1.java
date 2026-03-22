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
 * Renamed from akx
 */
public class akx_1
extends alz_1<aky_1> {
    private static final Logger cDe = Logger.getLogger(akx_1.class);
    public static final String cDf = "playLocalSound";
    private static final afe_1[] cDg = new afe_1[]{new afe_1("rollOff", null, aff_2.dJy, false), new afe_1("soundFileId", null, aff_2.dJw, false), new afe_1("gain", null, aff_2.dJz, false), new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public akx_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDf;
    }

    @Override
    public afe_1[] bBg() {
        return cDg;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected aky_1 sE(int n) {
        int n2 = this.xp(0);
        long l = this.xs(1);
        float f2 = this.xr(2);
        int n3 = this.xp(3);
        int n4 = this.xp(4);
        int n5 = this.xp(5);
        if (n < 8) {
            return new aky_1(n2, l, f2, n3, n4, n5);
        }
        float f3 = this.xr(6);
        float f4 = this.xr(7);
        return new aky_1(n2, l, f2, n3, n4, n5, f3, f4);
    }

    @Override
    protected void a(aky_1 aky_12, afx_1 afx_12) {
        try {
            if (aky_12.bBy() > 0L) {
                aiv_2.bBr().a(aky_12.bBy(), aky_12.bBt() / 100.0f, aky_12.bBN(), 1, -1L, -1L, -1, new aha_2(aky_12.getX(), aky_12.getY(), aky_12.NN(), false, 0), aky_12.bBw());
            } else {
                cDe.warn((Object)"Pas de son sp\u00e9cifi\u00e9 (ID<=0)");
            }
        }
        catch (Exception exception) {
            this.a(cDe, "soundExtension or soundPath not initialized");
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sE(n);
    }
}

