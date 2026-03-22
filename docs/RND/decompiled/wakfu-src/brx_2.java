/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bRx
 */
public class brx_2
implements fkB {
    public static final brx_2 laQ = new brx_2();
    private int laR = -1;
    private final ArrayList<Long> laS = new ArrayList();

    private brx_2() {
    }

    @Override
    public void f(fjo_0 fjo_02) {
        int n = fjo_02.Xt();
        boolean bl = this.laR == -1 || this.laR != n;
        this.laR = n;
        if (bl) {
            this.laS.clear();
        }
        flB flB2 = fjo_02.gbo();
        TLongObjectIterator<flv_0> tLongObjectIterator = flB2.gdq();
        while (tLongObjectIterator.hasNext()) {
            dcd dcd2;
            String string;
            String string2;
            String string3;
            String string4;
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            if (flB2.uo(l)) {
                if (this.laS.contains(l)) continue;
                this.laS.add(l);
                if (bl) continue;
                string4 = aum_0.cWf().a(39, (long)n, new Object[0]);
                string3 = aum_0.cWf().a(97, (long)((int)l), new Object[0]);
                string2 = aum_0.cWf().c("notification.lawAddedTitle", new Object[0]);
                string = cfh_2.createLink(aum_0.cWf().c("notification.lawAddedText", string4, string3), biu_1.kiz, "2");
                dcd2 = new dcd(string2, string, biu_1.kiz, 600132);
                aaw_1.bUq().h(dcd2);
                continue;
            }
            if (bl || !this.laS.contains(l)) continue;
            this.laS.remove(l);
            string4 = aum_0.cWf().a(39, (long)n, new Object[0]);
            string3 = aum_0.cWf().a(97, (long)((int)l), new Object[0]);
            string2 = aum_0.cWf().c("notification.lawRemovedTitle", new Object[0]);
            string = cfh_2.createLink(aum_0.cWf().c("notification.lawRemovedText", string4, string3), biu_1.kiz, "2");
            dcd2 = new dcd(string2, string, biu_1.kiz, 600132);
            aaw_1.bUq().h(dcd2);
        }
        fse_1.gFu().a((aef_2)bTj.eno(), "nation");
    }

    public void clean() {
        this.laS.clear();
        this.laR = -1;
    }
}

