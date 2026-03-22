/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.URLConnection;

/*
 * Renamed from aEq
 */
public class aeq_2
extends aeg_1<aeo_2> {
    private static final String dFB = "ETag";
    private static final String dFC = "Last-Modified";
    private static final String dFD = "Wakfu/1.x";
    private final String dFE;
    private String dFF;

    public aeq_2(String string) {
        this.dFE = string;
    }

    @Override
    public boolean isValid() {
        try {
            URLConnection uRLConnection = ((aeo_2)this.dEY).bZk().openConnection();
            uRLConnection.addRequestProperty("User-Agent", dFD);
            String string = null;
            int n = 0;
            while (true) {
                String string2 = uRLConnection.getHeaderFieldKey(n);
                String string3 = uRLConnection.getHeaderField(n);
                if (string2 == null && string3 == null) break;
                if (dFB.equals(string2)) {
                    string = string3;
                    break;
                }
                if (dFC.equals(string2)) {
                    string = string3;
                }
                ++n;
            }
            this.dFF = string;
            return this.dFF != null && this.dFF.equals(this.dFE);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public String bZq() {
        return this.dFE;
    }

    public String bZr() {
        return this.dFF;
    }
}

