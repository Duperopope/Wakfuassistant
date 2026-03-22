/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eTX
 */
public final class etx_0 {
    private static final Logger rra = Logger.getLogger(etx_0.class);
    private final Collection<QQ> rrb = new ArrayList<QQ>();
    private final HashMap<QQ, ArrayList<exP>> rrc = new HashMap();
    private final Collection<QQ> rrd = new ArrayList<QQ>();
    private final Collection<QQ> rre = new ArrayList<QQ>();
    private final Collection<QQ> rrf = new ArrayList<QQ>();
    private final Collection<azx_1<QQ, exP>> rrg = new ArrayList<azx_1<QQ, exP>>();
    private final Collection<azx_1<QQ, exP>> rrh = new ArrayList<azx_1<QQ, exP>>();
    private final Collection<azx_1<QQ, exP>> rri = new ArrayList<azx_1<QQ, exP>>();
    private qu_0 rrj;
    private acd_1 rrk;
    private final etu_0<? extends exP> rrl;

    public etx_0(etu_0<? extends exP> etu_02, qu_0 qu_02, acd_1 acd_12) {
        this.rrl = etu_02;
        this.u(qu_02);
        this.av(acd_12);
    }

    public void u(qu_0 qu_02) {
        if (qu_02 == null) {
            throw new IllegalArgumentException("Le mover ne doit jamais etre null");
        }
        this.rrj = qu_02;
    }

    public void av(acd_1 acd_12) {
        if (acd_12 == null) {
            throw new IllegalArgumentException("La cellule destination ne doit jamais etre null");
        }
        this.rrk = acd_12;
    }

    public void clean() {
        this.rrb.clear();
        this.rrc.clear();
        this.rrd.clear();
        this.rre.clear();
        this.rrf.clear();
        this.rrg.clear();
        this.rrh.clear();
        this.rri.clear();
    }

    public void fJK() {
        this.aw(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void aw(acd_1 acd_12) {
        acd_1 acd_13;
        if (acd_12 == null) {
            acd_12 = this.rrj.aZw();
        }
        if ((acd_13 = this.rrj.aZw()) != acd_12) {
            this.rrj.b(acd_12);
        }
        try {
            for (QQ qQ : this.rrl.bdh()) {
                if (qQ.a(this.rrj, acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
                    this.rrb.add(qQ);
                }
                if (qQ.bcF()) continue;
                ArrayList<exP> arrayList = this.rrc.get(qQ);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.rrc.put(qQ, arrayList);
                }
                for (exP exP2 : this.rrl.fKc()) {
                    if (!qQ.a(exP2, exP2.bcC(), exP2.bcD(), exP2.bcE())) continue;
                    arrayList.add(exP2);
                }
            }
        }
        catch (Exception exception) {
            rra.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            if (acd_13 != acd_12) {
                this.rrj.b(acd_13);
            }
        }
    }

    private void fJL() {
        this.rrd.clear();
        this.rre.clear();
        this.rrg.clear();
        this.rrf.clear();
        this.rrh.clear();
    }

    public void fJM() {
        this.fJL();
        if (this.rrl.bdh().isEmpty()) {
            return;
        }
        ArrayList<QQ> arrayList = new ArrayList<QQ>(this.rrl.bdh());
        for (QQ qQ : arrayList) {
            this.E(qQ);
            if (qQ.bcF()) continue;
            this.F(qQ);
        }
    }

    public boolean fJN() {
        boolean bl;
        if (!this.fJV()) {
            return false;
        }
        acd_1 acd_12 = new acd_1(this.rrj.aZw());
        this.rrj.b(this.rrk);
        try {
            bl = this.fJQ() || this.fJR();
        }
        catch (Exception exception) {
            bl = false;
            rra.error((Object)"Exception levee", (Throwable)exception);
        }
        this.rrj.b(acd_12);
        return bl;
    }

    public boolean fJO() {
        Object object;
        if (!this.fJV()) {
            return false;
        }
        for (QQ object2 : this.rre) {
            if (!object2.oM(10002) || !object2.bdc()) continue;
            return true;
        }
        for (QQ qQ : this.rrf) {
            if (!qQ.oM(10008) || !qQ.bdc()) continue;
            return true;
        }
        for (QQ qQ : this.rrd) {
            if (!qQ.oM(10001) || !qQ.bdc()) continue;
            return true;
        }
        for (azx_1<QQ, exP> azx_12 : this.rrg) {
            object = azx_12.getFirst();
            if (!((QQ)object).oM(10001) || !((QQ)object).bdc()) continue;
            return true;
        }
        for (azx_1<QQ, exP> azx_12 : this.rri) {
            object = azx_12.getFirst();
            if (!((QQ)object).oM(10008) || !((QQ)object).bdc()) continue;
            return true;
        }
        for (azx_1<QQ, exP> azx_12 : this.rrh) {
            object = azx_12.getFirst();
            if (!((QQ)object).oM(10002) || !((QQ)object).bdc()) continue;
            return true;
        }
        return false;
    }

    public boolean fJP() {
        if (!this.fJV()) {
            return false;
        }
        for (QQ object : this.rre) {
            if (!object.oM(10002) || this.D(object)) continue;
            return true;
        }
        for (QQ qQ : this.rrf) {
            if (!qQ.oM(10008) || this.D(qQ)) continue;
            return true;
        }
        for (QQ qQ : this.rrd) {
            if (!qQ.oM(10001) || this.D(qQ)) continue;
            return true;
        }
        for (azx_1 azx_12 : this.rrg) {
            if (!((QQ)azx_12.getFirst()).oM(10001)) continue;
            return true;
        }
        for (azx_1 azx_13 : this.rri) {
            if (!((QQ)azx_13.getFirst()).oM(10008)) continue;
            return true;
        }
        for (azx_1 azx_14 : this.rrh) {
            if (!((QQ)azx_14.getFirst()).oM(10002)) continue;
            return true;
        }
        return false;
    }

    public boolean D(QQ qQ) {
        return qQ.aeV() == etm_0.rnA.aHp() && qQ.bci() == this.rrj;
    }

    private boolean fJQ() {
        for (QQ qQ : this.rre) {
            if (!qQ.a(10002, (anu_1)this.rrj)) continue;
            return true;
        }
        for (QQ qQ : this.rrf) {
            if (!qQ.a(10008, (anu_1)this.rrj)) continue;
            return true;
        }
        for (QQ qQ : this.rrd) {
            if (!qQ.a(10001, (anu_1)this.rrj)) continue;
            return true;
        }
        return false;
    }

    private boolean fJR() {
        for (azx_1<QQ, exP> azx_12 : this.rrh) {
            if (!azx_12.getFirst().a(10002, (anu_1)this.rrj)) continue;
            return true;
        }
        for (azx_1<QQ, exP> azx_12 : this.rri) {
            if (!azx_12.getFirst().a(10008, (anu_1)this.rrj)) continue;
            return true;
        }
        for (azx_1<QQ, exP> azx_12 : this.rrg) {
            if (!azx_12.getFirst().a(10001, (anu_1)this.rrj)) continue;
            return true;
        }
        return false;
    }

    public void fJS() {
        this.fJT();
        this.fJU();
    }

    private void fJT() {
        for (QQ qQ : this.rre) {
            this.a(qQ, (short)10002, this.rrj);
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            return;
        }
        for (QQ qQ : this.rrf) {
            this.a(qQ, (short)10008, this.rrj);
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            return;
        }
        for (QQ qQ : this.rrd) {
            this.a(qQ, (short)10001, this.rrj);
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            return;
        }
    }

    private void fJU() {
        for (azx_1<QQ, exP> azx_12 : this.rrh) {
            this.a(azx_12.getFirst(), (short)10002, azx_12.aHI());
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            break;
        }
        for (azx_1<QQ, exP> azx_12 : this.rri) {
            this.a(azx_12.getFirst(), (short)10008, azx_12.aHI());
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            break;
        }
        for (azx_1<QQ, exP> azx_12 : this.rrg) {
            this.a(azx_12.getFirst(), (short)10001, azx_12.aHI());
            if (!this.rrj.baI() && !this.rrj.baM()) continue;
            break;
        }
    }

    private void E(QQ qQ) {
        if (qQ.bci() == this.rrj && !qQ.bcF()) {
            return;
        }
        if (this.rrj != null && !qQ.e(this.rrj)) {
            return;
        }
        if (qQ.a(this.rrj, this.rrk.getX(), this.rrk.getY(), this.rrk.bdi())) {
            if (!this.rrb.contains(qQ)) {
                this.rrd.add(qQ);
                this.rrb.add(qQ);
            } else {
                this.rrf.add(qQ);
            }
        } else if (this.rrb.contains(qQ)) {
            this.rre.add(qQ);
            this.rrb.remove(qQ);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void F(QQ qQ) {
        ArrayList<exP> arrayList = this.rrc.get(qQ);
        if (arrayList == null) {
            return;
        }
        acd_1 acd_12 = this.rrj.aZw();
        try {
            this.rrj.b(this.rrk);
            for (exP exP2 : this.rrl.fKc()) {
                short s;
                int n;
                if (exP2 == this.rrj || this.rrj != qQ.bci() || qQ.bcF()) continue;
                int n2 = exP2.bcC();
                if (qQ.a(exP2, n2, n = exP2.bcD(), s = exP2.bcE())) {
                    if (!arrayList.contains(exP2)) {
                        this.rrg.add(new azx_1<QQ, exP>(qQ, exP2));
                        continue;
                    }
                    this.rri.add(new azx_1<QQ, exP>(qQ, exP2));
                    continue;
                }
                if (!arrayList.contains(exP2)) continue;
                this.rrh.add(new azx_1<QQ, exP>(qQ, exP2));
            }
        }
        catch (Exception exception) {
            rra.error((Object)"Exception lev\u00e9e ", (Throwable)exception);
        }
        finally {
            this.rrj.b(acd_12);
        }
    }

    private boolean fJV() {
        return !this.rrd.isEmpty() || !this.rre.isEmpty() || !this.rrf.isEmpty() || !this.rrh.isEmpty() || !this.rrg.isEmpty() || !this.rri.isEmpty();
    }

    private void a(QQ qQ, short s, anu_1 anu_12) {
        qQ.a((int)s, null, anu_12);
    }
}

