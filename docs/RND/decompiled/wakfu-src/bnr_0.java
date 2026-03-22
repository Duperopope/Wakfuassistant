/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from bNr
 */
public class bnr_0
implements aeh_2 {
    static final Logger kCg = Logger.getLogger(bnr_0.class);
    private final fam kCh;
    public static final String kCi = "entries";
    public static final String[] kCj = new String[]{"entries"};
    final ArrayList<bno_0> kCk;

    public bnr_0(fam fam2) {
        this.kCh = fam2;
        this.kCk = new ArrayList();
        this.kCh.M(new bns_1(this));
        this.kCh.N(new bnt_1(this));
        Collections.sort(this.kCk);
    }

    @Override
    public String[] bxk() {
        return kCj;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kCi)) {
            return this.kCk;
        }
        return null;
    }
}

