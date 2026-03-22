/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHo
 */
public final class fho_2 {
    private static final Logger uwI = Logger.getLogger(fho_2.class);
    private static final fho_2 uwJ = new fho_2();
    private fti_2 uwK;
    @NotNull
    private List<String> uwL = new ArrayList<String>();
    @Nullable
    private Bu<String, String> uwM;

    public static fho_2 gzX() {
        return uwJ;
    }

    private fho_2() {
    }

    public void a(fti_2 fti_22) {
        this.uwK = fti_22;
    }

    public void uA(String string) {
        String string2 = fho_2.uC(string);
        if (this.uwL.contains(string2)) {
            return;
        }
        this.uwL.add(string2);
    }

    public void aH(String string, String string2) {
        if (string == null || string2 == null) {
            return;
        }
        this.uwM = new Bu<String, String>(fho_2.uC(string), string2);
    }

    public int uB(@Nullable String string) {
        if (string == null) {
            return -1;
        }
        String string2 = fho_2.uC(string);
        if (!this.uwL.contains(string2)) {
            return this.uwL.size();
        }
        return this.uwL.indexOf(string2);
    }

    public String gzY() {
        return this.br(this.gzZ());
    }

    public List<fsp_2> gzZ() {
        fsp_2 fsp_22 = this.epw();
        if (this.uwL.isEmpty()) {
            return fho_2.a(fsp_22);
        }
        ArrayList<fsp_2> arrayList = new ArrayList<fsp_2>();
        for (String string2 : this.uwL) {
            String[] stringArray;
            File file2 = new File(string2);
            if (!file2.exists()) continue;
            for (String string3 : stringArray = file2.list((file, string) -> new File(file, string).isDirectory() && string.matches("^theme_[\\w-]{1,20}$"))) {
                fsp_2 fsp_23;
                aqs_2 aqs_22;
                File file3 = new File(file2, string3 + "/theme.xml");
                fsp_2 fsp_24 = new fsp_2(this.uB(string2), string2, string3, string3, string3);
                if (!file3.exists()) {
                    fhq_2.uwO.info("[THEME] Cannot find XML descriptor 'theme.xml' in theme '" + string3 + "'");
                    arrayList.add(fsp_24);
                    continue;
                }
                try {
                    aqs_22 = fyw_0.j(file3.toURI().toURL());
                }
                catch (Exception exception) {
                    uwI.error((Object)("[THEME] Error while loading and parsing theme.xml in folder '" + string3 + "'"), (Throwable)exception);
                    arrayList.add(fsp_24);
                    continue;
                }
                try {
                    String string4 = this.uwK.a(aqs_22.bGT(), string3);
                    fsp_23 = new fsp_2(this.uB(string2), string2, string3, string4, this.uwK.a(aqs_22.bGT(), "description", 300));
                }
                catch (Exception exception) {
                    uwI.error((Object)("[THEME] Error while reading theme.xml in folder '" + string3 + "'"), (Throwable)exception);
                    fsp_23 = fsp_24;
                }
                arrayList.add(fsp_23);
            }
        }
        if (arrayList.isEmpty()) {
            return fho_2.a(fsp_22);
        }
        arrayList.add(fsp_22);
        arrayList.sort(fsp_2::compareTo);
        fse_1.gFu().f("themes", arrayList);
        return arrayList;
    }

    @NotNull
    private fsp_2 epw() {
        if (this.uwK != null) {
            return this.uwK.epw();
        }
        uwI.warn((Object)"[THEME] No theme translator found, using default name");
        return new fsp_2(-1, null, null, "No theme");
    }

    private static List<fsp_2> a(fsp_2 fsp_22) {
        fse_1.gFu().f("themes", List.of(fsp_22));
        fse_1.gFu().f("selectedTheme", fsp_22);
        return List.of(fsp_22);
    }

    private String br(List<fsp_2> list) {
        fsf_1 fsf_12 = fse_1.gFu().getProperty("selectedTheme");
        if (fsf_12 == null || !(fsf_12.getValue() instanceof fsp_2)) {
            uwI.warn((Object)("[THEME] 'selectedTheme' property is null or has a value it should not have: " + String.valueOf(fsf_12)));
            return null;
        }
        fsp_2 fsp_22 = (fsp_2)fsf_12.getValue();
        if (list == null || !list.contains(fsp_22)) {
            return null;
        }
        String string = fsp_22.gFV();
        if (string == null) {
            return null;
        }
        String string2 = fsp_22.gFU();
        try {
            return new File(string2 + string + "/").toURI().toURL().toString();
        }
        catch (MalformedURLException malformedURLException) {
            uwI.warn((Object)("[THEME] Error while creating custom theme path '" + string2 + string + "/'"), (Throwable)malformedURLException);
            return "file://" + string2 + string + "/";
        }
    }

    public void aI(String string, String string2) {
        new File(string).mkdirs();
        File file = new File(string2);
        try {
            file.createNewFile();
        }
        catch (IOException iOException) {
            uwI.error((Object)("[THEME] Error while creating '" + file.getAbsolutePath() + "'"), (Throwable)iOException);
        }
        fsp_2 fsp_22 = this.epw();
        fsp_2 fsp_23 = this.uwM != null ? new fsp_2(this.uB(this.uwM.getFirst()), this.uwM.getFirst(), this.uwM.aHI(), this.uwM.aHI()) : fsp_22;
        fsp_2 fsp_24 = fsp_23;
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(file.getAbsolutePath()));
            if (properties.containsKey("useNoTheme") || properties.containsKey("selectedTheme")) {
                if (Boolean.TRUE.equals(properties.getOrDefault((Object)"useNoTheme", (Object)false))) {
                    fsp_24 = fsp_22;
                } else {
                    String string3 = properties.getProperty("selectedTheme");
                    String string4 = fho_2.uC(properties.getProperty("selectedThemeBaseDirectory", string));
                    fsp_24 = new fsp_2(this.uB(string4), string4, string3, string3);
                }
            }
        }
        catch (IOException iOException) {
            uwI.error((Object)"[THEME] Error when loading selected theme", (Throwable)iOException);
        }
        fse_1.gFu().f("selectedTheme", fsp_24);
    }

    public boolean a(String string, String string2, String string3, Locale locale) {
        String string4 = fho_2.uC(string);
        File file = new File(string4 + "theme");
        if (!file.exists() || fq_0.e(file)) {
            return false;
        }
        if (!this.a(string3, locale)) {
            Files.move(file.toPath(), new File(string4 + "theme_old").toPath(), new CopyOption[0]);
            return false;
        }
        String string5 = string3 + "theme_autoGenerated/theme";
        fq_0.a(file, new File(string5), StandardCopyOption.COPY_ATTRIBUTES);
        Files.move(file.toPath(), new File(string4 + "theme_old").toPath(), new CopyOption[0]);
        fsp_2 fsp_22 = new fsp_2(this.uB(string3), string3, "theme_autoGenerated", "theme_autoGenerated");
        fse_1.gFu().f("selectedTheme", fsp_22);
        fho_2.a(string2, fsp_22);
        return true;
    }

    private boolean a(String string, Locale locale) {
        File file = new File(string + "theme_autoGenerated");
        try {
            new File(file, "theme").mkdirs();
            File file2 = new File(file, "theme.xml");
            boolean bl = file2.createNewFile();
            if (bl) {
                this.b(file2.getAbsolutePath(), locale);
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            uwI.error((Object)"[THEME] Error when creating auto generated theme folder", (Throwable)exception);
            return false;
        }
    }

    private void b(String string, Locale locale) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqs_22.a(new aqt_2("theme", null));
        aqs_22.bGT().a(new aqt_2("name", this.uwK.epx()));
        aqs_22.bGT().a(new aqt_2("author", "WAKFU"));
        DateFormat dateFormat = DateFormat.getDateInstance(3, locale);
        dateFormat.setTimeZone(uw_0.bvG);
        aqs_22.bGT().a(new aqt_2("date", dateFormat.format(new Date(System.currentTimeMillis()))));
        aqs_22.bGT().a(new aqt_2("description", this.uwK.epy()));
        aqr_22.eD(string);
        aqr_22.a(aqs_22);
    }

    public static void a(String string, fsp_2 fsp_22) {
        try {
            Properties properties = new Properties();
            properties.setProperty("useNoTheme", Boolean.toString(fsp_22.gFV() == null));
            if (fsp_22.gFV() != null) {
                properties.setProperty("selectedThemeBaseDirectory", fsp_22.gFU());
                properties.setProperty("selectedTheme", fsp_22.gFV());
            }
            properties.store(new FileOutputStream(string), null);
            fse_1.gFu().f("selectedTheme", fsp_22);
        }
        catch (IOException iOException) {
            uwI.error((Object)"[THEME] Error while saving selected custom theme", (Throwable)iOException);
        }
    }

    @NotNull
    public static String uC(@NotNull String string) {
        return string.endsWith("/") ? string : string + "/";
    }
}

