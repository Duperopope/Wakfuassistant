/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from axn
 */
public class axn_2 {
    private static final Logger dpi = Logger.getLogger(axn_2.class);
    private final TIntObjectHashMap<axp_2> dpj = new TIntObjectHashMap();
    private final HashMap<String, Integer> dpk = new HashMap();
    private final ArrayList<axq_2> dpl = new ArrayList();
    public static final String dpm = ".tga";

    public void dJ(String string) {
        File[] fileArray;
        File file = new File(string);
        assert (file.exists() && file.isDirectory()) : "Chemin rentr\u00e9 invalide : " + string;
        try {
            fileArray = file.toURI().toURL();
        }
        catch (MalformedURLException malformedURLException) {
            dpi.error((Object)("url invalide : " + string));
        }
        fileArray = file.listFiles(axo_2.dpo);
        String[] stringArray = new String[fileArray.length];
        for (int i = 0; i < fileArray.length; ++i) {
            stringArray[i] = fq_0.bJ(fileArray[i].getAbsolutePath());
        }
        this.a(file, stringArray);
    }

    public void a(File file, String[] stringArray) {
        for (String string : stringArray) {
            this.g(new File(file, string + ".crd"));
            this.h(new File(file, string + ".ref"));
        }
    }

    public axp_2 vj(int n) {
        return (axp_2)this.dpj.get(n);
    }

    public int gK(String string) {
        Integer n = this.dpk.get(string);
        if (n != null) {
            return n;
        }
        return 0;
    }

    public ArrayList<axq_2> bQQ() {
        return this.dpl;
    }

    private void g(File file) {
        apl_1 apl_12;
        try {
            apl_12 = apl_1.dw(fq_0.c(file));
        }
        catch (IOException iOException) {
            dpi.warn((Object)("Impossible de trouver le fichier " + String.valueOf(file)));
            return;
        }
        String string = fq_0.bJ(file.toString());
        String string2 = string + dpm;
        this.dpl.add(new axq_2(string2, string));
        try {
            int n = apl_12.aIA();
            for (int i = 0; i < n; ++i) {
                int n2 = apl_12.aIA();
                this.dpj.put(n2, (Object)new axp_2(n2, apl_12.aIz(), apl_12.aIz(), apl_12.aIz(), apl_12.aIz(), string2));
            }
        }
        catch (Exception exception) {
            dpi.error((Object)"Exception during loadSection", (Throwable)exception);
        }
    }

    private void h(File file) {
        apl_1 apl_12;
        try {
            apl_12 = apl_1.dw(fq_0.c(file));
        }
        catch (IOException iOException) {
            dpi.warn((Object)("Impossible de trouver le fichier " + String.valueOf(file)));
            return;
        }
        try {
            int n = apl_12.aIA();
            for (int i = 0; i < n; ++i) {
                String string = apl_12.aIC();
                int n2 = apl_12.aIA();
                this.dpk.put(new File(string).getCanonicalPath(), n2);
            }
        }
        catch (IOException iOException) {
            dpi.error((Object)"IOException during loadPixmapCorrelation", (Throwable)iOException);
        }
    }
}

