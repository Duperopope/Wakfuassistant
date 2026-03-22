/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from fMU
 */
public class fmu_1 {
    private final Logger uJy = Logger.getLogger(fmu_1.class);
    private static final fmu_1 uJz = new fmu_1();

    private fmu_1() {
    }

    public awk_1 k(URL uRL) {
        if (uRL == null) {
            return null;
        }
        String string = uRL.toString();
        long l = arn_2.fX(string);
        awk_1 awk_12 = awm_1.bPn().b(aru_2.cVG.bIv(), l, string, false, true);
        if (awk_12 == null) {
            this.uJy.error((Object)("Probl\u00e8me au chargement de la texture " + String.valueOf(uRL)));
            axc_2 axc_22 = new axc_2();
            awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, axc_22, false);
            axc_22.bsI();
        }
        return awk_12;
    }

    public awk_1 vU(String string) {
        return fic_1.gBr().vp(string);
    }

    public awk_1 vV(String string) {
        long l = Bw.a((Object)string, -1L);
        if (l == -1L) {
            return null;
        }
        return awm_1.bPn().gB(l);
    }

    public void gEE() {
    }

    public static fmu_1 gEF() {
        return uJz;
    }
}

