/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from Qn
 */
public abstract class qn_0<FX extends Qj>
implements qm_0<FX>,
qv_0,
ano_2<qu_0> {
    private qq_0 bfq;
    protected final qu_0 bfr;
    private qg_0<FX> bfs;
    private final List<qu_0> bft = new ArrayList<qu_0>(1);
    private long bfu = -1L;

    public qn_0(qu_0 qu_02) {
        this.bfr = qu_02;
        this.bft.add(qu_02);
    }

    @Override
    public qv_0 bah() {
        return this;
    }

    @Override
    public ano_2<qu_0> bae() {
        return this;
    }

    @Override
    public qg_0<FX> bac() {
        return this.bfs;
    }

    public void a(qg_0<FX> qg_02) {
        this.bfs = qg_02;
    }

    public void a(qq_0 qq_02) {
        this.bfq = qq_02;
    }

    @Override
    public qq_0 bad() {
        return this.bfq;
    }

    @Override
    public TA baf() {
        return null;
    }

    @Override
    public QR bai() {
        return null;
    }

    @Override
    public qu_0 dg(long l) {
        if (l == this.bfr.Sn()) {
            return this.bfr;
        }
        return null;
    }

    @Override
    public long bam() {
        return this.bfu++;
    }

    @Override
    public Iterator<qu_0> ban() {
        return this.bft.iterator();
    }

    @Override
    public List<qu_0> a(acd_1 acd_12) {
        return this.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    public List<qu_0> b(int n, int n2, int n3) {
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        Iterator<qu_0> iterator = this.ban();
        while (iterator.hasNext()) {
            qu_0 qu_02 = iterator.next();
            if (amf_1.a(qu_02, n, n2) != 0) continue;
            arrayList.add(qu_02);
        }
        return arrayList;
    }

    public byte aFW() {
        return 0;
    }
}

