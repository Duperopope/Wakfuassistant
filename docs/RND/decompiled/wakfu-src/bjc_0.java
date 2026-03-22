/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from bJc
 */
public class bjc_0
implements Sp {
    private final bgt_0 kki;
    private final Collection<bjd_0> kkj = new ArrayList<bjd_0>();

    public bjc_0(bgt_0 bgt_02) {
        this.kki = bgt_02;
    }

    @Override
    public void b(Sl sl) {
        Sm sm = sl.bfB();
        if (sm == Sm.bnZ || sm == Sm.boa) {
            fnq_0 fnq_02 = (fnq_0)((Object)((Sn)sl).bfD());
            if (!fnq_02.adO()) {
                return;
            }
            ffS ffS2 = this.kki.dmL().tz(fnq_02.LV());
            fnl_0 fnl_02 = fnq_02.ead();
            bjd_0 bjd_02 = new bjd_0(this.kki, ffS2);
            this.kkj.add(bjd_02);
            fnl_02.a(bjd_02);
        } else if (sm == Sm.bob || sm == Sm.boc) {
            fnq_0 fnq_03 = (fnq_0)((Object)((Sn)sl).bfD());
            if (!fnq_03.adO()) {
                return;
            }
            fnl_0 fnl_03 = fnq_03.ead();
            Iterator<bjd_0> iterator = this.kkj.iterator();
            while (iterator.hasNext()) {
                if (!fnl_03.b(iterator.next())) continue;
                iterator.remove();
            }
        }
    }
}

