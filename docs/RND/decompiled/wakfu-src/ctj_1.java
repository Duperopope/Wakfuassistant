/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.wrapper.SteamApi
 *  com.jogamp.openal.ALC
 *  com.jogamp.openal.JoalVersion
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.wakfu.client.WakfuClient;
import com.jogamp.openal.ALC;
import com.jogamp.openal.JoalVersion;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from cTJ
 */
public final class ctj_1
implements adi_1 {
    private static final Logger nKj = Logger.getLogger(ctj_1.class);
    private static final ctj_1 nKk = new ctj_1();
    static final Pattern nKl = Pattern.compile("(.*)\\.log(\\.\\d)?");
    private static BufferedImage nKm;

    public static ctj_1 eQS() {
        return nKk;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16849: {
                String string = WakfuClient.dSV.cfg();
                File file = new File(string);
                if (!file.exists()) {
                    file.mkdirs();
                }
                Date date = new Date();
                String string3 = date.getYear() + 1900 + String.valueOf(date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : Integer.valueOf(date.getMonth() + 1)) + String.valueOf(date.getDate() < 10 ? "0" + date.getDate() : Integer.valueOf(date.getDate())) + "_" + String.valueOf(date.getHours() < 10 ? "0" + date.getHours() : Integer.valueOf(date.getHours())) + String.valueOf(date.getMinutes() < 10 ? "0" + date.getMinutes() : Integer.valueOf(date.getMinutes())) + String.valueOf(date.getSeconds() < 10 ? "0" + date.getSeconds() : Integer.valueOf(date.getSeconds()));
                File file2 = new File(file, string3 = string3 + ".zip");
                if (file2.exists()) {
                    file2.delete();
                }
                if (this.k(file2)) {
                    String string4 = null;
                    try {
                        string4 = file2.getCanonicalPath();
                    }
                    catch (IOException iOException) {
                        string4 = file2.getAbsolutePath();
                    }
                    string4 = string4.replace("\\", "\\\\");
                    String string5 = aum_0.cWf().aUXX().aUR();
                    String string6 = String.format(auc_0.cVq().l("bugReport.url", ""), string5);
                    String string7 = aum_0.cWf().c("bug.report.message", "<b>" + file2.getName() + "</b>", "<b>" + string4 + "</b>", "<b>" + string6 + "</b>");
                    fiq_2.gCw().d(fik_2.gBY().vE(string7).vG(ccp_2.mRE.byf()).abQ(1).pc(true).a((n, string2) -> {
                        if (n == 400) {
                            if (bMX.kAi.blc()) {
                                SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string6);
                            } else if (!aet_1.ht(string6)) {
                                fiq_2.gCw().d(fik_2.gBZ().l("bug.report.message.error", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                            }
                        }
                    }));
                } else {
                    fiq_2.gCw().d(fik_2.gBZ().l("bug.report.message.error", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                }
                return false;
            }
        }
        return true;
    }

    private boolean k(File file) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
            zipOutputStream.putNextEntry(new ZipEntry("account.txt"));
            this.g(dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("system.txt"));
            this.i(dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
            this.a(zipOutputStream, dataOutputStream);
            if (nKm != null) {
                zipOutputStream.putNextEntry(new ZipEntry("screenshot.jpg"));
                this.h(dataOutputStream);
                dataOutputStream.flush();
                zipOutputStream.closeEntry();
            }
            dataOutputStream.close();
            zipOutputStream.close();
        }
        catch (Exception exception) {
            nKj.error((Object)("Error during creating bug report file at location: " + file.getAbsolutePath()), (Throwable)exception);
            return false;
        }
        return true;
    }

    private void g(DataOutputStream dataOutputStream) {
        String string = "";
        long l = 0L;
        String string2 = "";
        aie_0.cfn();
        aue_0 aue_02 = aie_0.cfo();
        if (aue_02 != null) {
            string = aub_0.cVb().cVp();
            aUQ aUQ2 = aue_02.cVO();
            if (aUQ2 != null) {
                l = aUQ2.xl();
                string2 = aUQ2.eGs();
            }
        }
        long l2 = 0L;
        String string3 = "";
        int n = 0;
        int n2 = 0;
        short s = 0;
        long l3 = 0L;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            l2 = bgt_02.Sn();
            string3 = bgt_02.aZk();
            n = bgt_02.bcC();
            n2 = bgt_02.bcD();
            s = bgt_02.bcE();
            l3 = bgt_02.aqZ();
        }
        Object GP = aie_0.cfn().bmH();
        String string4 = "==========================\n= Informations de compte =\n==========================\n\nCompte Ankama Games : \n\tCompte : " + l + "\n\tNom de compte : " + string2 + "\n\nCompte Wakfu : \n\tServeur : " + string + "\n\tPersonnage : " + l2 + "\n\tNom du personnage : " + string3 + "\n\tCoordonn\u00e9es : (" + n + "," + n2 + "," + s + ") @" + l3 + "\n\nClient : \n\tVersion : " + exH.pds + "\n\tResolution : " + String.valueOf(aie_0.cfn().bmB().bAI()) + "\n";
        dataOutputStream.writeBytes(string4);
    }

    private void h(DataOutputStream dataOutputStream) {
        ImageIO.write((RenderedImage)nKm, "jpeg", dataOutputStream);
        nKm = null;
    }

    private void a(ZipOutputStream zipOutputStream, DataOutputStream dataOutputStream) {
        File[] fileArray;
        File file = this.eQT();
        if (!file.exists() || !file.isDirectory()) {
            zipOutputStream.putNextEntry(new ZipEntry("logs/"));
            zipOutputStream.closeEntry();
            return;
        }
        for (File file2 : fileArray = file.listFiles(new ctk_1(this))) {
            zipOutputStream.putNextEntry(new ZipEntry("logs/" + file2.getName()));
            this.a(file2, dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
        }
    }

    private File eQT() {
        String string = WakfuClient.dSV.ceT();
        return new File(string, "logs");
    }

    private void a(File file, DataOutputStream dataOutputStream) {
        int n;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = new byte[1024];
        while ((n = fileInputStream.read(byArray)) > 0) {
            dataOutputStream.write(byArray, 0, n);
        }
        fileInputStream.close();
    }

    private void i(DataOutputStream dataOutputStream) {
        dataOutputStream.writeBytes(this.eQU());
    }

    private String eQU() {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=========================\n");
        stringBuilder.append("= Configuration systeme =\n");
        stringBuilder.append("=========================\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Carte graphique] : \n\n");
        try {
            object2 = aie_0.cfn().bmE();
            object = ((axm_1)object2).bRf();
            for (Map.Entry<String, String> entry : ((HashMap)object).entrySet()) {
                stringBuilder.append("\t").append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
            }
        }
        catch (Exception exception) {
            stringBuilder.append("\tImpossible d'envoyer la config openGL : GL non r\u00e9cup\u00e9rable\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append("[GL DUMP] : \n\n");
        stringBuilder.append(axj_1.bQY()).append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("[AL DUMP] : \n\n");
        object2 = cAY.eHc();
        JoalVersion.getALStrings((ALC)((ahu_1)object2).cdr(), (StringBuilder)stringBuilder);
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Syst\u00e8me d'exploitation] : \n\n");
        stringBuilder.append("\tArchitecture : ").append(System.getProperty("os.arch")).append("\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("os.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("os.version")).append("\n");
        stringBuilder.append("\tPatch Level : ").append(System.getProperty("sun.os.patch.level")).append("\n");
        stringBuilder.append("\n");
        object = ManagementFactory.getMemoryMXBean();
        stringBuilder.append("[M\u00e9moire Syst\u00e8me]\n\n");
        stringBuilder.append("\tTotal : ").append(Runtime.getRuntime().totalMemory()).append("\n");
        stringBuilder.append("\tMax : ").append(Runtime.getRuntime().maxMemory()).append("\n");
        stringBuilder.append("\tFree : ").append(Runtime.getRuntime().freeMemory()).append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Java Virtual Machine]\n\n");
        stringBuilder.append("\tConstructeur : ").append(System.getProperty("java.vm.vendor")).append("\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("java.vm.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("java.vm.version")).append("\n");
        stringBuilder.append("\n");
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        long l = runtimeMXBean.getUptime();
        if (l == 0L) {
            l = 1L;
        }
        stringBuilder.append("[Java Runtime]\n\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("java.runtime.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("java.runtime.version")).append("\n");
        stringBuilder.append("\n");
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] lArray = threadMXBean.getAllThreadIds();
        long l2 = 0L;
        long l3 = 0L;
        stringBuilder.append("[Runtime Threads]\n\n");
        for (long l4 : lArray) {
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(l4);
            if (threadInfo == null) continue;
            long l5 = threadMXBean.isThreadCpuTimeSupported() ? threadMXBean.getThreadUserTime(l4) : 0L;
            long l6 = threadMXBean.isThreadCpuTimeSupported() ? threadMXBean.getThreadCpuTime(l4) : -1L;
            l2 += l5;
            l3 += l3;
            stringBuilder.append("\t[[Thread ").append(l4).append("]]\n");
            stringBuilder.append("\t\tNom : ").append(threadInfo.getThreadName()).append("\n");
            stringBuilder.append("\t\tUser Time : ").append(l5).append(" (").append(l5 / (l * 10000L)).append("%)\n");
            stringBuilder.append("\t\tCPU : ").append(l6).append(" (").append(l6 / (l * 10000L)).append("%)\n");
        }
        stringBuilder.append("[Thread Total]\n");
        stringBuilder.append("\tUser Time : ").append(l2).append(" (").append(l2 / (l * 10000L)).append("%)\n");
        stringBuilder.append("\tCPU : ").append(l3).append(" (").append(l3 / (l * 10000L)).append("%)\n");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public static void bRk() {
        try {
            Rectangle rectangle = aie_0.cfn().bmB().bAB();
            Robot robot = new Robot();
            nKm = robot.createScreenCapture(rectangle);
        }
        catch (AWTException aWTException) {
            nKm = null;
        }
    }
}

