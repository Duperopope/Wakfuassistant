/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bEx
 */
public class bex_1
implements ayp_2 {
    protected static final Logger jOA = Logger.getLogger(bex_1.class);
    private static final bex_1 jOB = new bex_1();
    private final ArrayList<Long> jOC = new ArrayList();

    public static bex_1 dSm() {
        return jOB;
    }

    public void lj(long l) {
        this.jOC.add(l);
    }

    @Override
    public long baY() {
        long l;
        if (this.jOC.isEmpty()) {
            jOA.error((Object)"Client's UID list is empty, using -1 (this can cause issues)", new Throwable());
        }
        long l2 = l = this.jOC.isEmpty() ? -1L : this.jOC.remove(0);
        if (this.jOC.isEmpty()) {
            long l3 = cvo_2.daL().Sn();
            clo clo2 = new clo(l3, 0);
            aue_0.cVJ().etu().d(clo2);
        }
        return l;
    }

    public void removeAll() {
        this.jOC.clear();
    }
}

