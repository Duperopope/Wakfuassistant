/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from aHj
 */
public class ahj_2
implements ahg_2 {
    private static final Logger dOQ = Logger.getLogger(ahj_2.class);
    private final String dOR;
    private final String[] dOS;

    public ahj_2(String string, String ... stringArray) {
        this.dOR = string;
        this.dOS = stringArray;
    }

    @Override
    public ahz_1 hE(long l) {
        String string = this.dOR + l + ".";
        int n = this.dOS.length;
        for (int i = 0; i < n; ++i) {
            String string2 = string + this.dOS[i];
            fr_0.bR(string2);
            try {
                URL uRL = fo_0.bA(string2);
                if (!bl_0.a(uRL)) continue;
                return new ahh_1(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                dOQ.error((Object)("URL malform\u00e9e \u00e0 partie de l'ID sp\u00e9cifi\u00e9: result=" + string2));
            }
        }
        dOQ.error((Object)("Impossible de trouver le fichier d'id " + l + " dans le path " + this.dOR));
        return null;
    }
}

