/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from fFy
 */
public class ffy_2 {
    private static final Logger uqe = Logger.getLogger(ffy_2.class);
    public final double uqf;
    public final double uqg;
    public final double uqh;
    public final double uqi;
    public final int uqj;
    public final int uqk;

    private ffy_2(double d2, double d3, double d4, double d5, int n, int n2) {
        this.uqf = d2;
        this.uqg = d3;
        this.uqh = d4;
        this.uqi = d5;
        this.uqj = n;
        this.uqk = n2;
    }

    public static ffy_2 o(apd_1 apd_12) {
        if (apd_12.getName().equals("#text") || apd_12.getName().equals("#comment")) {
            return null;
        }
        double d2 = ffy_2.a(apd_12, "isoX", 0.0);
        double d3 = ffy_2.a(apd_12, "isoY", 0.0);
        double d4 = ffy_2.a(apd_12, "isoWidth", -1.0);
        double d5 = ffy_2.a(apd_12, "isoHeight", -1.0);
        int n = ffy_2.a(apd_12, "width", -1);
        int n2 = ffy_2.a(apd_12, "height", -1);
        return new ffy_2(d2, d3, d4, d5, n, n2);
    }

    public static awk_1 a(apd_1 apd_12, URL uRL) {
        apd_1 apd_13 = apd_12.fq("texture");
        if (apd_13 == null) {
            return null;
        }
        String string = apd_13.bCt();
        try {
            URL uRL2 = bl_0.a(uRL, string);
            String string2 = uRL2.toString();
            return ffy_2.tM(string2);
        }
        catch (Exception exception) {
            uqe.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
            return null;
        }
    }

    public static awk_1 a(apd_1 apd_12, URL uRL, String string) {
        apd_1 apd_13 = apd_12.fq("texture");
        if (apd_13 == null) {
            return null;
        }
        try {
            String string2 = fq_0.bJ(string);
            URL uRL2 = bl_0.a(uRL, "mask" + StringUtils.capitalize((String)string2) + ".png");
            return bl_0.a(uRL2) ? ffy_2.K(uRL2.toString(), true) : null;
        }
        catch (Exception exception) {
            uqe.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
            return null;
        }
    }

    private static double a(apd_1 apd_12, String string, double d2) {
        apd_1 apd_13 = apd_12.fq(string);
        return apd_13 == null ? d2 : apd_13.bCr();
    }

    private static int a(apd_1 apd_12, String string, int n) {
        apd_1 apd_13 = apd_12.fq(string);
        return apd_13 == null ? n : apd_13.bCo();
    }

    public static awk_1 tM(String string) {
        return ffy_2.K(string, false);
    }

    public static awk_1 K(String string, boolean bl) {
        if (bl_0.bl(string)) {
            return awm_1.bPn().b(aru_2.cVG.bIv(), arn_2.fX(string), string, bl, true);
        }
        uqe.info((Object)("Impossible de trouver le fichier " + string));
        return null;
    }

    public awg_1 i(awk_1 awk_12) {
        if (this.uqj != -1 && this.uqk != -1) {
            return new awg_1(awk_12, 0, 0, this.uqj, this.uqk);
        }
        return new awg_1(awk_12);
    }
}

