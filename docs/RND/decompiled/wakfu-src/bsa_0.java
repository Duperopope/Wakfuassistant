/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bsA
 */
public class bsa_0
implements aeh_2 {
    public static final String jhn = "name";
    public static final String jho = "id";
    public static final String jhp = "description";
    public static final String jhq = "contentList";
    public static final String jhr = "containsLearnableItems";
    public static final String jhs = "listFilter";
    public static final String jht = "usable";
    public static final String jhu = "isAffordableFiltered";
    public static final String jhv = "isLearnableFiltered";
    public static final String jhw = "listType";
    public static final String jhx = "typeSelected";
    public static final String jhy = "accountWideCurrencies";
    private static final String[] jhz = new String[]{"name", "id", "description", "contentList", "containsLearnableItems", "usable", "isAffordableFiltered", "isLearnableFiltered", "listType", "typeSelected", "accountWideCurrencies"};
    private final long jhA;
    private final String jhB;
    private final String jhC;
    private final boolean jhD;
    private final ArrayList<bsu_0> jhE = new ArrayList();
    private final ArrayList<bsu_0> jhF = new ArrayList();
    private final ArrayList<bse_0> jhG = new ArrayList();
    private bse_0 jhH = bse_0.jhU;
    private final ffl jhI = new bsd_0(this);
    private final Sp jhJ = new bsc_0(this);
    private final int jhK;
    private final fez_1 jhL;
    private boolean jhM = false;
    private boolean jhN = false;
    private final ewV jhO;

    public bsa_0(long l, String string, String string2, boolean bl, int n, ArrayList<bsu_0> arrayList, ewV ewV2) {
        this.jhA = l;
        this.jhB = string;
        this.jhC = string2;
        this.jhD = bl;
        this.jhK = n;
        this.jhL = new fez_1();
        this.jhF.addAll(arrayList);
        this.jhO = ewV2;
        this.jhE.addAll(this.jhF);
        this.dGa();
        this.jhG.add(bse_0.jhU);
        for (bsu_0 bsu_02 : this.jhE) {
            bse_0 bse_02 = bse_0.c(bsu_02.dFZ());
            if (this.jhG.contains(bse_02)) continue;
            this.jhG.add(bse_02);
        }
    }

    private void dGa() {
        switch (this.jhO) {
            case oSj: {
                this.jhE.sort(bsr_0.jgB);
                break;
            }
            default: {
                this.jhE.sort(bsr_0.jgC);
            }
        }
    }

    public void dGb() {
        if (!this.jhM && !this.jhN && this.jhH.dGh() == null) {
            this.jhE.clear();
            this.jhE.addAll(this.jhF);
        } else {
            this.jhE.removeIf(bsu_02 -> {
                if (this.jhM && !bsu_02.dFS()) {
                    return true;
                }
                if (this.jhN && !bsu_02.dFU()) {
                    return true;
                }
                return this.jhH.dGh() != null && bsu_02.dFZ() != this.jhH.dGh();
            });
            this.jhE.addAll(this.jhF.stream().filter(bsu_02 -> {
                if (this.jhE.contains(bsu_02)) {
                    return false;
                }
                if (this.jhM && !bsu_02.dFS()) {
                    return false;
                }
                if (this.jhN && !bsu_02.dFU()) {
                    return false;
                }
                return this.jhH.dGh() == null || bsu_02.dFZ() == this.jhH.dGh();
            }).toList());
        }
        this.dGa();
        fse_1.gFu().a((aef_2)this, jhq);
    }

    public void dGc() {
        this.jhM = !this.jhM;
        this.dGb();
        fse_1.gFu().a((aef_2)this, jhu);
    }

    public void dGd() {
        this.jhN = !this.jhN;
        this.dGb();
        fse_1.gFu().a((aef_2)this, jhv);
    }

    public void a(bse_0 bse_02) {
        this.jhH = bse_02;
        this.dGb();
        fse_1.gFu().a((aef_2)this, jhx);
    }

    public void v(bgt_0 bgt_02) {
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        fec_02.a(this.jhI);
        TLongObjectIterator<ffs_0> tLongObjectIterator = bgt_02.dno().fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            ffs_02.a(this.jhJ);
        }
        fse_1.gFu().a((aef_2)this, jht, jhq);
    }

    public void dGe() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        fec_02.b(this.jhI);
        TLongObjectIterator<ffs_0> tLongObjectIterator = bgt_02.dno().fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            ffs_02.b(this.jhJ);
        }
    }

    @Override
    public String[] bxk() {
        return jhz;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jhq)) {
            return this.jhE;
        }
        if (string.equals(jhr)) {
            return this.jhE.stream().anyMatch(bsu_0::dFV);
        }
        if (jhs.equals(string)) {
            return this.jhL;
        }
        if (string.equals(jhn)) {
            boolean bl = fse_1.gFu().dp("isAdmin");
            return bl ? this.jhB + String.format(" (%s)", this.jhA) : this.jhB;
        }
        if (jho.equals(string)) {
            return String.format("(%s)", this.jhA);
        }
        if (jhp.equals(string)) {
            return this.jhC;
        }
        if (string.equals(jht)) {
            return this.jhD;
        }
        if (jhu.equals(string)) {
            return this.jhM;
        }
        if (jhv.equals(string)) {
            return this.jhN;
        }
        if (jhw.equals(string)) {
            return this.jhG;
        }
        if (jhx.equals(string)) {
            return this.jhH;
        }
        if (jhy.equals(string)) {
            return cus_2.eRQ().eRT();
        }
        return null;
    }

    public long dGf() {
        return this.jhA;
    }

    public int dGg() {
        return this.jhK;
    }
}

