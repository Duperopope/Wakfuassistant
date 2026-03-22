/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.File;
import java.net.URL;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fHS
 */
public class fhs_1 {
    private static final Logger uzD = Logger.getLogger(fhs_1.class);
    public static final String uzE = "file:";
    public static final String uzF = "init/";
    public static final String uzG = "components/";
    private final fhq_2 uzH;
    private final String uzI;

    public fhs_1(fhq_2 fhq_22, String string) {
        this.uzH = fhq_22;
        this.uzI = string.endsWith("/") ? string : string + "/";
    }

    public void gAf() {
        this.vg(this.uW("fontDefinitions.xml"));
        this.vh(this.uW("fonts.xml"));
        this.ti(this.uW("colors.xml"));
        this.vi(this.uW("cursors.xml"));
        this.vj(this.uW("textures.xml"));
        this.vk(this.uW("tooltips.xml"));
        this.vl(this.uW("pixmaps.xml"));
        this.vl(this.uW("pixmapBackgrounds.xml"));
        this.vl(this.uW("themeElements.xml"));
        this.gBj();
    }

    public void gBi() {
        this.ti(this.uW("colors.xml"));
    }

    @NotNull
    private String uW(String string) {
        return uzE + this.uzI + uzF + string;
    }

    @NotNull
    static File[] vf(String string) {
        File[] fileArray = new File(string + uzG).listFiles();
        if (fileArray == null || fileArray.length == 0) {
            throw new IllegalArgumentException("There is no theme components XML files!");
        }
        return fileArray;
    }

    private static aqs_2 uX(String string) {
        try {
            return fyw_0.j(new URL(string));
        }
        catch (Exception exception) {
            uzD.error((Object)("[THEME] Error while loading Xulor theme from file " + string), (Throwable)exception);
            throw new IllegalArgumentException("Error while loading Xulor theme from file " + string, exception);
        }
    }

    private void vg(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (!"fontDefinition".equalsIgnoreCase(apd_12.getName())) continue;
            this.uzH.w(apd_12);
        }
    }

    private void vh(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (!"font".equalsIgnoreCase(apd_12.getName())) continue;
            this.uzH.x(apd_12);
        }
    }

    private void ti(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (!"color".equalsIgnoreCase(apd_12.getName())) continue;
            this.uzH.y(apd_12);
        }
        Map<String, axb_2> map = fhm_2.uwB.gzS();
        if (!map.isEmpty()) {
            throw new RuntimeException(String.format("[THEME] Following colors have faulty declaration ! %s", map));
        }
    }

    private void vi(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (apd_12.getName().equalsIgnoreCase("cursor")) {
                this.uzH.z(apd_12);
                continue;
            }
            if (!apd_12.getName().equalsIgnoreCase("animatedCursor")) continue;
            this.uzH.A(apd_12);
        }
    }

    private void vj(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (!"texture".equalsIgnoreCase(apd_12.getName())) continue;
            this.uzH.B(apd_12);
        }
    }

    private void vk(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (!"tooltip".equalsIgnoreCase(apd_12.getName())) continue;
            this.uzH.v(apd_12);
        }
    }

    private void vl(String string) {
        for (apd_1 apd_12 : fhs_1.uX(string).bGT().getChildren()) {
            if (fhs_1.C(apd_12)) continue;
            this.uzH.r(apd_12);
        }
    }

    private void gBj() {
        for (File file : fhs_1.vf(this.uzI)) {
            for (apd_1 apd_12 : fhs_1.uX(uzE + file.getPath()).bGT().getChildren()) {
                if (fhs_1.C(apd_12)) continue;
                this.uzH.t(apd_12);
            }
        }
    }

    static boolean C(apd_1 apd_12) {
        return "#comment".equalsIgnoreCase(apd_12.getName()) || "#text".equalsIgnoreCase(apd_12.getName());
    }
}

