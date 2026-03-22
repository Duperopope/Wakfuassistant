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
 * Renamed from aks
 */
public class aks_1
extends alz_1<akt_1> {
    private static final Logger cCM = Logger.getLogger(aks_1.class);
    public static final String cCN = "play3DSound";
    private static final afe_1[] cCO = new afe_1[]{new afe_1("soundFileId", "Id du fichier son", aff_2.dJw, false), new afe_1("posX", "Position x", aff_2.dJy, false), new afe_1("posY", "Position y", aff_2.dJy, false), new afe_1("posZ", "Position z", aff_2.dJy, false), new afe_1("isLoop", "Si le son boucle", aff_2.dJA, true), new afe_1("isStereo", "Si on active le mode st\u00e9r\u00e9o", aff_2.dJA, true), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public aks_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCN;
    }

    @Override
    public String getDescription() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) plac\u00e9 \u00e0 une position sp\u00e9cifique du monde.";
    }

    @Override
    public afe_1[] bBg() {
        return cCO;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected akt_1 sB(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        if (n < 5) {
            return new akt_1(l, n2, n3, n4);
        }
        boolean bl = this.xx(4);
        if (n < 6) {
            return new akt_1(l, n2, n3, n4, bl);
        }
        boolean bl2 = this.xx(5);
        if (n < 8) {
            return new akt_1(l, n2, n3, n4, bl, bl2);
        }
        float f2 = this.xr(6);
        float f3 = this.xr(7);
        return new akt_1(l, n2, n3, n4, bl, bl2, f2, f3);
    }

    @Override
    protected void a(akt_1 akt_12, afx_1 afx_12) {
        try {
            if (akt_12.bBy() > 0L) {
                aiv_2.bBr().a(akt_12.bBy(), 1.0f, akt_12.bBN(), akt_12.bBD() ? 0 : 1, -1L, -1L, afx_12.bha());
            } else {
                cCM.warn((Object)"Pas de son sp\u00e9cifi\u00e9 (ID<=0)");
            }
        }
        catch (Exception exception) {
            this.a(cCM, "soundExtension or soundPath not initialized");
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sB(n);
    }
}

