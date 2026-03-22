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
 * Renamed from akq
 */
public class akq_1
extends alz_1<akr_1> {
    private static final Logger cCC = Logger.getLogger(akh_1.class);
    public static final String cCD = "loopSound";
    private static final afe_1[] cCE = new afe_1[]{new afe_1("soundFileId", "Id du fichier son", aff_2.dJw, false), new afe_1("isStereo", "Activation de mode st\u00e9r\u00e9o", aff_2.dJA, true), new afe_1("gainMod", "Entier compris entre 0 et 200 sp\u00e9cifiant un gain en %", aff_2.dJz, true), new afe_1("loopingTime", "Temps (en ms) pendant lequel le son doit \u00eatre boucl\u00e9", aff_2.dJz, true), new afe_1("fadeOut time", "Temps (en ms) \u00e0 partir duquel le volume du son doit \u00eatre diminu\u00e9", aff_2.dJz, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public akq_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCD;
    }

    @Override
    public String getDescription() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) en boucle pendant un temps fix\u00e9.";
    }

    @Override
    public afe_1[] bBg() {
        return cCE;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected akr_1 sz(int n) {
        long l = this.xs(0);
        if (n < 2) {
            return new akr_1(l);
        }
        boolean bl = this.xx(1);
        if (n < 3) {
            return new akr_1(l, bl);
        }
        float f2 = (float)this.xq(2);
        if (n < 4) {
            return new akr_1(l, bl, f2);
        }
        int n2 = this.xp(3);
        if (n < 5) {
            return new akr_1(l, bl, f2, n2);
        }
        long l2 = this.xp(4);
        if (n < 7) {
            return new akr_1(l, bl, f2, n2, l2);
        }
        float f3 = this.xr(5);
        float f4 = this.xr(6);
        return new akr_1(l, bl, f2, n2, l2, f3, f4);
    }

    @Override
    protected void a(akr_1 akr_12, afx_1 afx_12) {
        try {
            if (akr_12.bBy() != 0L) {
                boolean bl = akr_12.bBB() > 0;
                long l = bl ? System.currentTimeMillis() + (long)akr_12.bBB() : -1L;
                aiv_2.bBr().a(akr_12.bBy(), akr_12.bBA() / 100.0f, akr_12.bBN(), bl ? 0 : 1, l, akr_12.bBC(), afx_12.bha());
            } else {
                cCC.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(cCC, "soundExtension or soundPath not initialized");
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sz(n);
    }
}

