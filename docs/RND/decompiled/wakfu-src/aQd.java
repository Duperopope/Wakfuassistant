/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

public class aQd {
    private static final Logger eBw = Logger.getLogger(aQd.class);
    public static final aQd eBx = new aQd();
    private static boolean eBy = !ady_1.bZb();

    public static boolean cgp() {
        return eBy;
    }

    public static void eO(boolean bl) {
        eBy = bl;
    }

    protected aQd() {
    }

    public String jy(String string) {
        String string2 = String.format(auc_0.cVq().bS("videosPath"), new Object[0]);
        return String.format("zip:///%s!/%s", new File(string2).getCanonicalPath(), string);
    }

    public void jz(String string) {
        this.z(string, false);
    }

    public void e(String string, float f2) {
        this.a(string, false, f2);
    }

    public void z(String string, boolean bl) {
        this.a(string, bl, false);
    }

    public void a(String string, boolean bl, boolean bl2) {
        this.a(string, bl, bl2, 1.0f);
    }

    public void a(String string, boolean bl, float f2) {
        this.a(string, bl, false, f2);
    }

    public void a(String string, boolean bl, boolean bl2, float f2) {
        if (aQd.cgp()) {
            return;
        }
        try {
            String string2 = this.jy(string);
            if (bl) {
                cyh_2.eYs().setVideoPath(string2);
                cyh_2.eYs().setDebugMode(bl2);
                aue_0.cVJ().a(cyh_2.eYs());
                return;
            }
            ctl_2.nIA.setVideoPath(string2);
            ctl_2.nIA.setVolume(f2);
            ctl_2.nIA.setDebugMode(bl2);
            aue_0.cVJ().a(ctl_2.nIA);
            dae_0.cV((short)19095);
        }
        catch (fu_0 fu_02) {
            eBw.error((Object)"Unable to find video file path property", (Throwable)fu_02);
        }
        catch (IOException iOException) {
            eBw.error((Object)"Unable to find video file", (Throwable)iOException);
        }
    }

    public @Unmodifiable List<String> cBw() {
        try {
            String string = String.format(auc_0.cVq().bS("videosPath"), new Object[0]);
            return new JarFile(string).stream().filter(jarEntry -> !jarEntry.isDirectory()).map(ZipEntry::getName).toList();
        }
        catch (fu_0 fu_02) {
            eBw.error((Object)"Unable to find video file path property", (Throwable)fu_02);
            return Collections.emptyList();
        }
        catch (IOException iOException) {
            eBw.error((Object)"Unable to find video file", (Throwable)iOException);
            return Collections.emptyList();
        }
    }
}

