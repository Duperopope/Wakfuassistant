/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiClient
 *  com.ankama.shopi.client.ApiClient
 *  com.ankamagames.steam.client.SteamClient
 *  com.google.inject.Guice
 *  com.google.inject.Injector
 *  com.google.inject.Module
 *  com.jogamp.opengl.Threading
 *  javax.inject.Inject
 *  org.apache.log4j.LogManager
 *  org.apache.log4j.Logger
 *  org.apache.log4j.PropertyConfigurator
 *  org.kohsuke.args4j.CmdLineException
 *  org.kohsuke.args4j.CmdLineParser
 */
package com.ankamagames.wakfu.client;

import com.ankama.haapi.client.okhttp.ApiClient;
import com.ankamagames.steam.client.SteamClient;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.jogamp.opengl.Threading;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Properties;
import javax.inject.Inject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class WakfuClient {
    public static final Logger dSU = Logger.getLogger(WakfuClient.class);
    public static WakfuClient dSV;
    private static ApiClient dSW;
    private static ApiClient dSX;
    private static com.ankama.shopi.client.ApiClient dSY;
    private long dfi;
    private String dSZ = ".";
    private String dTa = ".";
    private String dTb = ".";
    private final aio_0 dTc = new aio_0();

    @Inject
    WakfuClient() {
        dSV = this;
        this.dfi = System.nanoTime();
    }

    public String ceT() {
        return this.dSZ.endsWith("/") ? this.dSZ : this.dSZ + "/";
    }

    public void start() {
        abb_1.bVy();
        this.ceY();
    }

    public static ApiClient ceU() {
        return dSX;
    }

    public static ApiClient ceV() {
        return dSW;
    }

    public static com.ankama.shopi.client.ApiClient ceW() {
        return dSY;
    }

    public void configure() {
        this.cfa();
    }

    public boolean ceX() {
        if (!exu_0.fft().ffu()) {
            fse_1.gFu().f("steam", (Object)null);
            return false;
        }
        cCE.mAG.jJ(false);
        fse_1.gFu().f("steam", cCE.mAG);
        SteamClient steamClient = bMZ.efm();
        if (steamClient == null) {
            dSU.fatal((Object)"Impossible de cr\u00e9er le client steam.");
            return false;
        }
        boolean bl = bMZ.b(steamClient);
        if (!bl) {
            dSU.error((Object)"[Steam] Probl\u00e8me \u00e0 l'initialisation du UserContext");
        }
        bMZ.efn();
        return bl;
    }

    private void ceY() {
        this.ceZ();
        aie_0 aie_02 = aie_0.cfn();
        SwingUtilities.invokeLater(new aib_0(this, aie_02));
    }

    private void ceZ() {
        this.cfj().ifPresent(string -> {
            fho_2.gzX().uA((String)string);
            Optional.ofNullable(auc_0.cVq().l("defaultProvidedTheme", null)).ifPresent(string2 -> fho_2.gzX().aH((String)string, (String)string2));
        });
        fho_2.gzX().uA(this.cfi());
        fho_2.gzX().a(new bYP());
        fho_2.gzX().aI(this.cfi(), this.cfk());
    }

    private void cfa() {
        awm_1.bPn().dh((float)ahv.cxP.getDefaultScreenDevice().getAvailableAcceleratedMemory() / 1024.0f);
        axd_1.bQW().a("JPG", new axe_1());
        axd_1.bQW().a("PNG", new axf_1());
        axd_1.bQW().a("DDSM", new axa_1());
        axd_1.bQW().a("DDS", new axb_1());
        axd_1.bQW().a("TGA", new axh_1());
        axd_1.bQW().a("TGAM", new axg_1());
    }

    public void cfb() {
        exH.dET();
        List<String> list = ManagementFactory.getRuntimeMXBean().getInputArguments();
        for (String string : list) {
            dSU.info((Object)string);
        }
        dSU.info((Object)("java.vm.vendor = " + System.getProperty("java.vm.vendor")));
        dSU.info((Object)("java.runtime.name = " + System.getProperty("java.runtime.name")));
        dSU.info((Object)("java.vm.name = " + System.getProperty("java.vm.name")));
        dSU.info((Object)("java.vm.version = " + System.getProperty("java.vm.version")));
        dSU.info((Object)("java.runtime.version = " + System.getProperty("java.runtime.version")));
        dSU.info((Object)("os.name = " + System.getProperty("os.name")));
        dSU.info((Object)("os.arch = " + System.getProperty("os.arch")));
        dSU.info((Object)("os.version = " + System.getProperty("os.version")));
        dSU.info((Object)("sun.os.patch.level = " + System.getProperty("sun.os.patch.level")));
        dSU.info((Object)("user.language = " + System.getProperty("user.language")));
        dSU.info((Object)("user.country = " + System.getProperty("user.country")));
        dSU.trace((Object)("Locale: " + Locale.getDefault().getDisplayName()));
        Locale.setDefault(Locale.ENGLISH);
        dSU.info((Object)("log path=" + this.dSZ));
    }

    public void r(String[] stringArray) {
        Object object;
        String string;
        CmdLineParser cmdLineParser = new CmdLineParser((Object)this.dTc);
        try {
            cmdLineParser.parseArgument(Arrays.asList(stringArray));
            cmdLineParser.stopOptionParsing();
        }
        catch (CmdLineException cmdLineException) {
            JOptionPane.showMessageDialog(new JFrame(), "Une erreur a \u00e9t\u00e9 d\u00e9tect\u00e9e dans les param\u00e8tres du client. Les param\u00e8tres par d\u00e9faut ont \u00e9t\u00e9 utilis\u00e9s. \n" + cmdLineException.getLocalizedMessage());
        }
        euM.a(this.dTc);
        if (this.dTc.cfT() != null) {
            System.setProperty("wakfu.language", this.dTc.cfT());
            Locale.setDefault(Mv.cM(this.dTc.cfT()).aUJ());
        } else {
            Locale.setDefault(My.aUY().aUJ());
        }
        if (this.dTc.cfR() != null) {
            this.dSZ = string = this.dTc.cfR();
            this.dTa = string;
            if (!this.dTa.endsWith("/")) {
                this.dTa = this.dTa + "/";
            }
            this.dTa = this.dTa + "report/";
            this.dTb = string;
            if (!this.dTb.endsWith("/")) {
                this.dTb = this.dTb + "/";
            }
            this.dTb = this.dTb + "screenshots/";
            String string2 = string + "/preferences";
            new File(string2).mkdirs();
            System.setProperty("preferenceStorePath", string2);
        }
        this.cfe();
        byf_2.eoM();
        string = this.dTc.cfQ();
        boolean bl = false;
        if (string != null && (bl = auc_0.cVq().bZ(string))) {
            dSU.info((Object)("Configuration loaded from file set on command line: " + string));
        }
        if (this.dTc.cgd() != null) {
            exu_0.rM(this.dTc.cgd());
        }
        fse_1.gFu().f("partner", exu_0.fft().getName());
        fse_1.gFu().f("videoDisabled", aQd.cgp());
        byf_2.eoN();
        if (!bl) {
            object = VH.dy(this.dTc.cfU());
            bl = auc_0.cVq().bZ(((VH)((Object)object)).bkE());
            if (bl) {
                dSU.info((Object)("Configuration loaded for region " + ((Enum)object).name() + " (by country detection for " + this.dTc.cfU() + "): " + ((VH)((Object)object)).bkE()));
            }
        }
        if (!bl) {
            dSU.info((Object)"Loading configuration from default file");
        }
        if (!bl && !auc_0.cVq().cVs()) {
            dSU.fatal((Object)"Echec du chargement de la configuration, WakfuConfiguration introuvable");
            return;
        }
        if (this.dTc.cfS() != null) {
            object = this.dTc.cfS() + File.separator;
            auc_0.cVq().m("cacheDirectory", (String)object);
        }
        auc_0.cVq().e("UPDATER_COMMUNICATION_PORT", this.dTc.cgb());
        if (this.dTc.cgc() != null) {
            auc_0.cVq().m("UPDATER_INITIAL_STATE", this.dTc.cgc());
        }
        if (this.dTc.cfV()) {
            aum_2.az(true);
        }
        if (this.dTc.cfW()) {
            agr.ctK.aPg();
        }
        if (this.dTc.cfX()) {
            aeD.cnx.aPg();
        }
        if (this.dTc.cfZ()) {
            ads_0.clz = true;
            ads_0.cly = true;
        }
        if (this.dTc.cge()) {
            aie_0.cfn().ek(true);
        }
        if (this.dTc.cgj()) {
            fyw_0.gqw().ow(true);
        }
        if (true & this.dTc.cgn()) {
            fhj_2.gBa().b(Threading::isOpenGLThread);
        }
        if (this.dTc.cgk()) {
            axm_1.dqN = true;
        }
        if (this.dTc.cgl()) {
            object = this.dTc.cgm();
            try {
                File file = new File((String)object);
                if (file.exists() && file.isDirectory()) {
                    dSU.warn((Object)String.format("Unable to use specified file (%s) for trace opengl calls, file is directory...", object));
                } else {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    axm_1.dqO = new PrintStream(file);
                }
            }
            catch (IOException iOException) {
                dSU.warn((Object)String.format("Unable to use specified file (%s) for trace opengl calls", object), (Throwable)iOException);
            }
        }
        if (this.dTc.cgp()) {
            aQd.eO(true);
        }
        WakfuClient.cfd();
    }

    public static String cfc() {
        return String.format("Wakfu-client / %s", exH.pdr);
    }

    private static void cfd() {
        try {
            String string = WakfuClient.cfc();
            auc_0 auc_02 = auc_0.cVq();
            String string2 = auc_02.bS("haapiAnkamaUrl");
            dSX = new ApiClient();
            dSX.setBasePath(string2);
            dSX.setUserAgent(string);
            dSX.setVerifyingSsl(acm_2.gZ(string2));
            String string3 = auc_02.bS("haapiWakfuUrl");
            dSW = new ApiClient();
            dSW.setBasePath(string3);
            dSW.setUserAgent(string);
            dSW.setVerifyingSsl(acm_2.gZ(string3));
            String string4 = auc_02.bS("shopiUrl");
            dSY = new com.ankama.shopi.client.ApiClient();
            dSY.setBasePath(string4);
            dSY.setUserAgent(string);
            dSY.setVerifyingSsl(acm_2.gZ(string4));
        }
        catch (fu_0 fu_02) {
            JOptionPane.showMessageDialog(new JFrame(), "An error occured during configuration of API clients for Haapi and/or Shopi. Please fix your configuration");
            dSU.error((Object)"[SHOP] Error while setting up API clients for Haapi and/or Shopi", (Throwable)fu_02);
        }
    }

    private void cfe() {
        Object object;
        Properties properties = new Properties();
        try {
            object = WakfuClient.class.getResourceAsStream("log4j.properties");
            if (object == null) {
                object = new FileInputStream("log4j.properties");
            }
            properties.load((InputStream)object);
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            System.err.println("Error: Cannot load configuration file");
            iOException.printStackTrace(System.err);
        }
        if (!BH.aU(this.dSZ)) {
            object = properties.propertyNames();
            while (object.hasMoreElements()) {
                String string = (String)object.nextElement();
                if (!string.endsWith(".File")) continue;
                properties.setProperty(string, this.dSZ + "/" + properties.getProperty(string));
            }
        }
        LogManager.resetConfiguration();
        PropertyConfigurator.configure((Properties)properties);
    }

    public static void main(String[] stringArray) {
        Injector injector = Guice.createInjector((Module[])new Module[]{WakfuClient.cff()});
        FG.aLe().a(injector);
        WakfuClient wakfuClient = (WakfuClient)injector.getInstance(WakfuClient.class);
        wakfuClient.r(stringArray);
        wakfuClient.configure();
        wakfuClient.ceX();
        wakfuClient.cfb();
        aaw_1.bUq().a(new aad_2());
        wakfuClient.start();
    }

    private static Module cff() {
        return WakfuClient.cfm().a(new Module[]{new aim_0(), new hw_2()});
    }

    public String cfg() {
        return this.dTa;
    }

    public String cfh() {
        return this.dTb;
    }

    public String cfi() {
        return this.ceT() + "themes";
    }

    public Optional<String> cfj() {
        return Optional.ofNullable(this.cfl().cga()).map(string -> string + "themes");
    }

    public String cfk() {
        return this.ceT() + "themes/config.properties";
    }

    public aio_0 cfl() {
        return this.dTc;
    }

    public static FF cfm() {
        return FP.aLt();
    }
}

