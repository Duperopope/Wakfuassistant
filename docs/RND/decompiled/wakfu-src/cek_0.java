/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cek
 */
public class cek_0
implements adi_1 {
    private static final cek_0 lSa = new cek_0();
    protected static final Logger lSb = Logger.getLogger(cek_0.class);

    public static cek_0 euy() {
        return lSa;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return switch (aam_22.d()) {
            case 12667 -> {
                lSb.warn((Object)"[CONVENTION] Cadeau gagn\u00e9");
                ctz_2.eQl().eQo();
                yield false;
            }
            case 12601 -> {
                cpy_0 var2_2 = (cpy_0)aam_22;
                ctz_2.eQl().jm(var2_2.bDG());
                ctz_2.eQl().MF(var2_2.exq());
                aue_0.cVJ().a(ctz_2.eQl());
                yield false;
            }
            default -> true;
        };
    }

    @Override
    public long Sn() {
        return 8L;
    }

    @Override
    public void dC(long l) {
    }
}

