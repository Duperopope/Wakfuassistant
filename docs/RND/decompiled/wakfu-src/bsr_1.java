/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from bSR
 */
public class bsr_1
implements bss_1 {
    private static final Logger llh = Logger.getLogger(bsr_1.class);

    @Override
    public void l(apd_1 apd_12) {
    }

    @Override
    public bss_1 eni() {
        return new bsr_1();
    }

    public void a(aez_0 aez_02, aeb_1 aeb_12) {
        bsr_1.j(new File(aub_0.cVb().cVn()));
    }

    private static void j(File file) {
        try {
            boolean bl;
            String string = file.getCanonicalPath() + File.separatorChar + "chat.xml";
            File file2 = new File(string);
            if (file2.exists() && !(bl = file2.delete())) {
                llh.warn((Object)("Impossible de supprimer " + string));
            }
        }
        catch (IOException iOException) {
            llh.warn((Object)"Probl\u00e8me \u00e0 la suppression d'un fichier de chat", (Throwable)iOException);
        }
    }
}

