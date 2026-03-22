/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from arN
 */
public class arn_2 {
    public awk_1 cVc;
    public awk_1 cVd;
    public static final float cVe = 0.004f;
    private static final arn_2 cVf = new arn_2();
    private boolean bYn = false;
    private aqs_2 cVg;
    private String cVh;
    protected static final Logger cVi = Logger.getLogger(arn_2.class);

    public static arn_2 bIc() {
        return cVf;
    }

    public static boolean aY(float f2, float f3) {
        return GC.c(f2, f3, 0.004f);
    }

    public void gV(InputStream inputStream) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        try {
            aqr_22.gU(inputStream);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
        }
        catch (Exception exception) {
            cVi.error((Object)"Exception during loadConfig", (Throwable)exception);
        }
        this.cVg = aqs_22;
    }

    public void fU(String string) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        try {
            aqr_22.ex(string);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
        }
        catch (Exception exception) {
            cVi.error((Object)("Exception during loadConfig(" + string + ")"), (Throwable)exception);
        }
        this.cVg = aqs_22;
    }

    public void fV(String string) {
        assert (this.cVg != null) : "You must call loadConfig before";
        apd_1 apd_12 = this.cVg.bGT().fn("engine");
        arn_2.a(apd_12, string);
        awm_1 awm_12 = awm_1.bPn();
        atg_2 atg_22 = aru_2.cVG.bIv();
        this.cVh = string;
        this.cVc = awm_12.a((art_1)atg_22, -1296775008915292159L, string + "textures/maskAlpha.tga", false);
        this.cVc.bGY();
        this.cVd = awm_12.a((art_1)atg_22, -1296775008915292158L, string + "textures/perturb.tga", false);
        this.cVd.bGY();
        this.bYn = true;
    }

    public final boolean bId() {
        return this.bYn;
    }

    public final String bIe() {
        return this.cVh;
    }

    private arn_2() {
    }

    private static void a(apd_1 apd_12, String string) {
        assert (apd_12 != null) : "Unable to find engine node";
        apd_1 apd_13 = apd_12.fn("effects");
        assert (apd_13 != null) : "Unable to find shaders node";
        ArrayList<apd_1> arrayList = apd_13.fo("effect");
        assert (arrayList != null) : "Unable to find effect nodes";
        for (apd_1 apd_14 : arrayList) {
            apd_1 apd_15 = apd_14.fq("name");
            assert (apd_15 != null) : "Unable to find name parameter and it's not optionnal";
            apd_1 apd_16 = apd_14.fq("file");
            assert (apd_16 != null) : "Unable to find file parameter and it's not optionnal";
            apd_1 apd_17 = apd_14.fq("class");
            String string2 = apd_17 == null ? null : apd_17.bCt();
            String string3 = string + apd_16.bCt();
            ast_1.bJG().b(apd_15.bCt(), string3, string2);
        }
    }

    public static int fW(String string) {
        return string.hashCode();
    }

    public static int fX(String string) {
        return string.hashCode();
    }

    public static int[] o(String ... stringArray) {
        int n = stringArray.length;
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = stringArray[i].hashCode();
        }
        return nArray;
    }

    public void c(aqs_2 aqs_22) {
        this.cVg = aqs_22;
    }
}

