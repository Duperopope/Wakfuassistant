/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import org.apache.log4j.Logger;

/*
 * Renamed from aHh
 */
public class ahh_2
implements ahg_2 {
    private static final Logger dOL = Logger.getLogger(ahh_2.class);
    private String aXF;
    private final String[] dOM;

    public ahh_2(String string, String ... stringArray) {
        this.aXF = string;
        this.dOM = stringArray;
    }

    public void ib(String string) {
        this.aXF = string;
    }

    @Override
    public ahz_1 hE(long l) {
        String string = this.aXF + l + ".";
        int n = this.dOM.length;
        for (int i = 0; i < n; ++i) {
            String string2 = string + this.dOM[i];
            fr_0.bR(string2);
            File file = new File(string2);
            if (!file.exists()) continue;
            return new aha_1(file);
        }
        dOL.error((Object)("Impossible de trouver le fichier d'id " + l + " dans le path " + this.aXF));
        return null;
    }
}

