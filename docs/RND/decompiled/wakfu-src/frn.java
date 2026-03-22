/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class frn {
    private static final Logger sXN = Logger.getLogger(frn.class);
    public static final frn sXO = new frn();
    private final ArrayList<frl> sXP = new ArrayList();

    private frn() {
    }

    public void a(frl frl2) {
        if (this.sXP.contains(frl2)) {
            sXN.error((Object)("Tentative d'ajout multiple du TaxHandler=" + String.valueOf(frl2) + " \u00e0 la liste des percepteurs de taxe globaux"));
            return;
        }
        this.sXP.add(frl2);
    }

    public double a(fgv fgv2, frk frk2) {
        int n = 1000000;
        return (double)this.b(fgv2, frk2, 1000000L) / 1000000.0;
    }

    public long b(fgv fgv2, frk frk2, long l) {
        return this.a(fgv2, frk2, l, false);
    }

    public long c(fgv fgv2, frk frk2, long l) {
        return this.a(fgv2, frk2, l, true);
    }

    private long a(fgv fgv2, frk frk2, long l, boolean bl) {
        long l2 = 0L;
        int n = this.sXP.size();
        for (int i = 0; i < n; ++i) {
            frl frl2 = this.sXP.get(i);
            if (!frl2.a(fgv2)) continue;
            long l3 = frl2.a(fgv2, frk2, l);
            if (l3 > 0L && bl) {
                frl2.a(frk2, GC.cw(l3));
            }
            l2 += l3;
        }
        if (bl) {
            fgv2.cWp().tt(l2);
        }
        return l2;
    }

    public void b(frl frl2) {
        if (this.sXP.contains(frl2)) {
            this.sXP.remove(frl2);
        } else {
            sXN.error((Object)("Tentative de suppression du TaxHandler=" + String.valueOf(frl2) + " alors qu'il n'est pas pr\u00e9sent dans la liste"));
        }
    }

    public String toString() {
        return "TaxManager{m_taxHandlers=" + this.sXP.size() + "}";
    }

    public void clear() {
        this.sXP.clear();
    }
}

