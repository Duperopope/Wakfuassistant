/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.net.MalformedURLException;
import org.apache.log4j.Logger;

/*
 * Renamed from bPN
 */
public class bpn_2 {
    private static final Logger kSP = Logger.getLogger(bpn_2.class);

    private bpn_2() {
    }

    public static String i(File file) {
        try {
            return file.toURI().toURL().toString();
        }
        catch (MalformedURLException malformedURLException) {
            kSP.warn((Object)malformedURLException.getMessage());
            return null;
        }
    }

    public static File nr(String string) {
        String string2 = fq_0.bL(string);
        String string3 = fq_0.bL(string2);
        String string4 = fq_0.bM(string3);
        String string5 = fq_0.bM(string2);
        String string6 = fq_0.bJ(string);
        String string7 = fq_0.bI(string);
        String string8 = string4 + string5 + string6 + "." + string7;
        String string9 = auc_0.cVq().kF("webShop");
        return new File(string9 + File.separator + string8);
    }
}

