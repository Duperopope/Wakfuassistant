/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHR
 */
public class fhr_1 {
    private static final Logger uzx = Logger.getLogger(fhr_1.class);
    private final fhq_2 uzy;
    private final String uzz;
    private final fti_1 uzA;
    private fto_1 uwU;
    private ftj_1 uzB;
    private ftm_2 uzC;

    public fhr_1(fhq_2 fhq_22, String string, fti_1 fti_12) {
        this.uzy = fhq_22;
        this.uzz = string.endsWith("/") ? string : string + "/";
        this.uzA = fti_12;
    }

    public void gBg() {
        this.bkZ();
        this.uZ(this.uW("fontDefinitions.xml"));
        this.va(this.uW("fonts.xml"));
        this.vb(this.uW("colors.xml"));
        this.vc(this.uW("cursors.xml"));
        this.vd(this.uW("textures.xml"));
        this.ve(this.uW("tooltips.xml"));
        this.gBh();
        this.uzB.gHh();
        this.uwU.gHh();
        this.uzC.gHh();
    }

    private void bkZ() {
        PrintWriter printWriter = fhr_1.uV(this.uzA.gHt() + "/" + this.uzA.gHq() + ".java");
        if (printWriter == null) {
            return;
        }
        this.uzB = new ftj_1(printWriter, this.uzA.gHq(), this.uzA.gHp(), this.uzy);
        PrintWriter printWriter2 = fhr_1.uV(this.uzA.gHt() + "/" + this.uzA.gHr() + ".java");
        if (printWriter2 == null) {
            return;
        }
        this.uwU = new fto_1(printWriter2, this.uzA.gHr(), this.uzA.gHp());
        this.uzy.a(this.uwU);
        PrintWriter printWriter3 = fhr_1.uV(this.uzA.gHt() + "/" + this.uzA.gHs() + ".java");
        if (printWriter3 == null) {
            return;
        }
        this.uzC = new ftm_2(printWriter3, this.uzA.gHs(), this.uzA.gHp());
    }

    @Nullable
    private static PrintWriter uV(String string) {
        PrintWriter printWriter;
        File file = new File(string);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                uzx.error((Object)("Exception when creating file " + string), (Throwable)iOException);
            }
        }
        try {
            printWriter = new PrintWriter(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            uzx.error((Object)("Error when trying to open file " + string), (Throwable)fileNotFoundException);
            return null;
        }
        return printWriter;
    }

    @NotNull
    private String uW(String string) {
        return "file:" + this.uzz + "init/" + string;
    }

    private static aqs_2 uX(String string) {
        try {
            return fyw_0.j(new URL(string));
        }
        catch (Exception exception) {
            uzx.error((Object)("[THEME] Error while loading Xulor theme from file " + string), (Throwable)exception);
            throw new IllegalArgumentException("Error while loading Xulor theme from file " + string, exception);
        }
    }

    private void uY(String string) {
        ftk_1 ftk_12 = new ftk_1(this.uzB.gqB(), this.uzB.gHu(), string, null, false);
        this.uzB.a(ftk_12);
    }

    private void uZ(String string) {
        this.uY("initFontDefinitions");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (!"fontDefinition".equalsIgnoreCase(apd_12.getName())) continue;
            new ftt_1(apd_12).a(this.uzB);
        }
    }

    private void va(String string) {
        this.uY("initFonts");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (!"font".equalsIgnoreCase(apd_12.getName())) continue;
            new ftv_1(apd_12).a(this.uzB);
        }
    }

    private void vb(String string) {
        this.uY("initColors");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (!"color".equalsIgnoreCase(apd_12.getName())) continue;
            ftr_2 ftr_22 = new ftr_2(apd_12, this.uzA.gHs());
            ftr_22.a(this.uzB);
            ftr_22.a(this.uzC);
        }
    }

    private void vc(String string) {
        this.uY("initCursors");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (apd_12.getName().equalsIgnoreCase("cursor")) {
                new fts_2(apd_12).a(this.uzB);
                continue;
            }
            if (!apd_12.getName().equalsIgnoreCase("animatedCursor")) continue;
            new ftq_2(apd_12).a(this.uzB);
        }
    }

    private void vd(String string) {
        this.uY("initTextures");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (!"texture".equalsIgnoreCase(apd_12.getName())) continue;
            new fty_1(apd_12).a(this.uzB);
        }
    }

    private void ve(String string) {
        this.uY("initTooltips");
        for (apd_1 apd_12 : fhr_1.uX(string).bGT().getChildren()) {
            if (!"tooltip".equalsIgnoreCase(apd_12.getName())) continue;
            new ftz_1(apd_12, this.uzy).a(this.uzB);
        }
    }

    private void gBh() {
        for (File file : fhs_1.vf(this.uzz)) {
            for (apd_1 apd_12 : fhr_1.uX("file:" + file.getPath()).bGT().getChildren()) {
                if (fhs_1.C(apd_12)) continue;
                this.uzy.a(apd_12, this.uzA);
            }
        }
    }
}

