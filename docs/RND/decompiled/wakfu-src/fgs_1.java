/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from fGS
 */
public class fgs_1
implements Iterator<fgr_1> {
    private fgr_1 uvw;
    private fgr_1 uvu;
    private final TIntArrayList uvx = new TIntArrayList();
    private int cKh = -1;

    public fgs_1(fgr_1 fgr_12) {
        this.uvw = fgr_12;
        this.uvu = null;
    }

    @Override
    public boolean hasNext() {
        return this.uvw != null;
    }

    public fgr_1 gzL() {
        fgr_1 fgr_12 = this.uvw;
        this.uvw = null;
        if (fgr_12.gzJ() && fgr_12.edc()) {
            ++this.cKh;
            this.uvu = fgr_12;
            this.uvx.add(0);
            this.uvw = fgr_12.getChildren().get(0);
        } else if (this.uvu != null) {
            while (this.uvu != null) {
                ArrayList<fgr_1> arrayList = this.uvu.getChildren();
                int n = this.uvx.get(this.cKh) + 1;
                if (n == arrayList.size()) {
                    this.uvu = this.uvu.gzK();
                    this.uvx.remove(this.cKh);
                    --this.cKh;
                    continue;
                }
                this.uvw = arrayList.get(n);
                this.uvx.set(this.cKh, n);
                break;
            }
        }
        return fgr_12;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] stringArray) {
        fgp_1 fgp_12 = new fgp_1("n1");
        fgp_1 fgp_13 = new fgp_1("n1A");
        fgp_13.a(new fgp_1("n1Aa"));
        fgp_13.a(new fgp_1("n1Ab"));
        fgp_13.hW(true);
        fgp_12.a(fgp_13);
        fgp_1 fgp_14 = new fgp_1("n1B");
        fgp_1 fgp_15 = new fgp_1("n1Ba");
        fgp_1 fgp_16 = new fgp_1("n1Bb");
        fgp_14.a(fgp_15);
        fgp_14.a(fgp_16);
        fgp_14.hW(true);
        fgp_12.a(fgp_14);
        fgp_1 fgp_17 = new fgp_1("n1C");
        fgp_12.a(fgp_17);
        fgp_12.hW(true);
        fgs_1 fgs_12 = new fgs_1(fgp_12);
        while (fgs_12.hasNext()) {
            fgr_1 fgr_12 = fgs_12.gzL();
            for (int i = 0; i < fgr_12.bDN(); ++i) {
                System.out.print("\t");
            }
            System.out.println((String)fgr_12.getValue());
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.gzL();
    }
}

