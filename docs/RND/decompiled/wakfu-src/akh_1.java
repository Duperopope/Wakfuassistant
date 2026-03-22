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
 * Renamed from akH
 */
public class akh_1
extends alz_1<aki_1> {
    private static final Logger cDM = Logger.getLogger(akh_1.class);
    public static final String cDN = "playSound";
    private static final afe_1[] cDO = new afe_1[]{new afe_1("soundFileId", "Id du fichier son", aff_2.dJw, false), new afe_1("isStereo", "Activation de la st\u00e9r\u00e9o", aff_2.dJA, true), new afe_1("gainModification", "Entier compris entre 0 et 200 % sp\u00e9cifiant une modification du gain", aff_2.dJz, true), new afe_1("playCount", "Nombre de fois ou le son doit \u00eatre jou\u00e9", aff_2.dJz, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};
    private static final afe_1[] cDP = new afe_1[]{new afe_1("fileId", "uid du son cr??", aff_2.dJw, false)};

    public akh_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return cDN;
    }

    @Override
    public String getDescription() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) au sein du monde.";
    }

    @Override
    public final afe_1[] bBg() {
        return cDO;
    }

    @Override
    public final afe_1[] bBh() {
        return cDP;
    }

    protected aki_1 sH(int n) {
        long l = this.xs(0);
        if (n < 2) {
            return new aki_1(l);
        }
        boolean bl = this.xx(1);
        if (n < 3) {
            return new aki_1(l, bl);
        }
        float f2 = (float)this.xq(2);
        if (n < 4) {
            return new aki_1(l, bl, f2);
        }
        int n2 = this.xp(3);
        if (n < 6) {
            return new aki_1(l, bl, f2, n2);
        }
        float f3 = this.xr(4);
        float f4 = this.xr(5);
        return new aki_1(l, bl, f2, n2, f3, f4);
    }

    @Override
    protected void a(aki_1 aki_12, afx_1 afx_12) {
        try {
            if (aki_12.bBy() != 0L) {
                ahm_1 ahm_12 = aiv_2.bBr().a(aki_12.bBy(), aki_12.bBA() / 100.0f, aki_12.bBN(), aki_12.bBI(), -1L, -1L, this.cai().bha());
                this.hA(ahm_12 == null ? -1L : ahm_12.ccq());
            } else {
                cDM.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(cDM, "soundExtension or soundPath not initialized " + String.valueOf(exception));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sH(n);
    }
}

