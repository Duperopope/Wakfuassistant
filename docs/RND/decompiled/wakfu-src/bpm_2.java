/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from bPM
 */
public class bpm_2 {
    private static final Logger kSM = Logger.getLogger(bpm_2.class);
    public static final bpm_2 kSN = new bpm_2();
    private final aef_1 kSO = new aef_1("Shop-Downloader", -1);

    public void a(String string, aej_1 aej_12) {
        try {
            File file = bpn_2.nr(string);
            aeq_2 aeq_22 = new aeq_2(aep_2.dFy.hp(file.getName()));
            aeo_2 aeo_22 = new aeo_2(new URL(string), file, true, true);
            aeo_22.a(aeq_22);
            this.kSO.a(aeo_22, new bpz_2(aej_12));
        }
        catch (MalformedURLException malformedURLException) {
            kSM.warn((Object)malformedURLException.getMessage());
        }
    }

    public String toString() {
        return "WebShopDataDownloader}";
    }
}

