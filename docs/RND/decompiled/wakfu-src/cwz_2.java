/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;

/*
 * Renamed from cWz
 */
public class cwz_2
implements adi_1,
Runnable {
    private static final cwz_2 nSM = new cwz_2();
    private static final String nSN = "ankamagames.wakfu.mixDebuggerDirectory";
    static final Logger nSO = Logger.getLogger(cwz_2.class);
    private static final long nSP = 5000L;
    private cwf_1 nSQ;
    private alx_2 ikv;

    public static cwz_2 eVW() {
        return nSM;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18809: {
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void bVm() {
        this.nSQ.bVm();
    }

    public void ccE() {
        this.nSQ.ccE();
    }

    public void eVX() {
        int n;
        String string = Preferences.userRoot().get(nSN, null);
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Choisissez le r\u00e9pertoire de sauvegarde des logs.");
        jFileChooser.setFileSelectionMode(1);
        jFileChooser.setFileFilter(new cwc_2());
        if (string != null) {
            jFileChooser.setSelectedFile(new File(string));
        }
        if ((n = jFileChooser.showOpenDialog(null)) == 0) {
            File file = jFileChooser.getSelectedFile();
            try {
                Preferences.userRoot().put(nSN, file.getCanonicalPath());
            }
            catch (IOException iOException) {
                nSO.warn((Object)("Probl\u00e8me \u00e0 la s\u00e9lection du r\u00e9pertoire : " + file.getAbsolutePath()));
            }
        }
    }

    public void eVY() {
        PrintWriter printWriter;
        String string = Preferences.userRoot().get(nSN, null);
        ux_0 ux_02 = ue_0.bjV().bjc();
        StringBuilder stringBuilder = new StringBuilder();
        int n = ux_02.bjG();
        int n2 = ux_02.bjD();
        int n3 = ux_02.bjE();
        int n4 = ux_02.bjF();
        int n5 = ux_02.bjH();
        if (string != null) {
            stringBuilder.append(string).append("\\");
        } else {
            stringBuilder.append(".\\");
        }
        stringBuilder.append("mixDebugger-");
        stringBuilder.append(ux_02.bjI()).append(n < 10 ? "0" : "").append(n).append(n2 < 10 ? "0" : "").append(n2);
        stringBuilder.append("-").append(n3 < 10 ? "0" : "").append(n3).append(n4 < 10 ? "0" : "").append(n4).append(n5 < 10 ? "0" : "").append(n5);
        stringBuilder.append(".txt");
        String string2 = stringBuilder.toString();
        try {
            printWriter = new PrintWriter(fq_0.bO(string2));
        }
        catch (IOException iOException) {
            nSO.warn((Object)"Probl\u00e8me \u00e0 la sauvegarde des logs");
            return;
        }
        printWriter.println("---=== Crit\u00e8res ===---");
        printWriter.println();
        printWriter.println(this.nSQ.kE(false));
        printWriter.println();
        printWriter.println("---=== Ev\u00e8nements ===---");
        printWriter.println();
        printWriter.println(this.nSQ.kF(false));
        printWriter.println("---=== Logs ===---");
        printWriter.println();
        printWriter.println(this.nSQ.kD(false));
        printWriter.flush();
        printWriter.close();
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwa_1(this);
            fyw_0.gqw().a(this.ikv);
            this.nSQ = new cwf_1(this);
            fse_1.gFu().f("mixDebugger", this.nSQ);
            ccj_2.pd("mixDebuggerDialog");
            abg_2.bUP().a((Runnable)this, 5000L, -1);
            fyw_0.gqw().d("wakfu.mixDebugger", cfu_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            ahw_1.t(cwf_1.class);
            this.nSQ.bmX();
            this.nSQ = null;
            abg_2.bUP().h(this);
            fse_1.gFu().vX("mixDebugger");
            fyw_0.gqw().tl("mixDebuggerDialog");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.mixDebugger");
        }
    }

    @Override
    public void run() {
        this.kC(false);
    }

    public void kC(boolean bl) {
        if (bl || this.nSQ.eWc()) {
            fse_1.gFu().a((aef_2)this.nSQ, "cache", "memoryCache", "sourcesTotalSize");
        }
    }

    public cwf_1 eVZ() {
        return this.nSQ;
    }
}

