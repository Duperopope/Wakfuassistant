/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from bSn
 */
public class bsn_2
implements aeh_2 {
    public static final String lfy = "laws";
    public static final String lfz = "rights";
    public static final String lfA = "currentLawPoints";
    public static final String lfB = "nation";
    public final String[] lfC = new String[]{"laws", "rights", "currentLawPoints", "nation"};
    ArrayList<brs_2> lfD;
    ArrayList<brs_2> lfE;
    private final fjo_0 lfF;
    final /* synthetic */ brx_1 lfG;

    public bsn_2(brx_1 brx_12, fjo_0 fjo_02) {
        this.lfG = brx_12;
        this.lfF = fjo_02;
    }

    private ArrayList<brs_2> emB() {
        if (this.lfD == null) {
            this.lfD = new ArrayList();
            flB flB2 = this.lfF.gbo();
            TLongObjectIterator<flv_0> tLongObjectIterator = flB2.gdq();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                flv_0 flv_02 = (flv_0)tLongObjectIterator.value();
                boolean bl = flB2.uo(flv_02.Sn());
                if (flv_02.csT() >= 0 || !((flv_0)tLongObjectIterator.value()).bfb() && !bl && (!this.lfG.elR() || this.lfF != brx_1.elI().ems())) continue;
                this.lfD.add(new brs_2(flv_02));
            }
            Collections.sort(this.lfD);
        }
        return this.lfD;
    }

    private ArrayList<brs_2> emC() {
        if (this.lfE == null) {
            this.lfE = new ArrayList();
            flB flB2 = this.lfF.gbo();
            TLongObjectIterator<flv_0> tLongObjectIterator = flB2.gdq();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                boolean bl = flB2.uo(((flv_0)tLongObjectIterator.value()).Sn());
                if (((flv_0)tLongObjectIterator.value()).csT() <= 0 || !((flv_0)tLongObjectIterator.value()).bfb() && !bl && (!this.lfG.elR() || this.lfF != brx_1.elI().ems())) continue;
                this.lfE.add(new brs_2((flv_0)tLongObjectIterator.value()));
            }
            Collections.sort(this.lfE);
            Collections.reverse(this.lfE);
        }
        return this.lfE;
    }

    @Override
    public String[] bxk() {
        return this.lfC;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lfy)) {
            return this.emB();
        }
        if (string.equals(lfz)) {
            return this.emC();
        }
        if (string.equals(lfA)) {
            return 50 - this.elT();
        }
        if (string.equals(lfB)) {
            return new bso_2(this.lfF.Xt());
        }
        return null;
    }

    int elT() {
        int n = 0;
        if (this.lfG.leQ == null) {
            return n;
        }
        for (brs_2 brs_22 : this.lfG.leQ.lfD) {
            if (!brs_22.elE()) continue;
            n += brs_22.elD().csV();
        }
        for (brs_2 brs_22 : this.lfG.leQ.lfE) {
            if (!brs_22.elE()) continue;
            n += brs_22.elD().csV();
        }
        return n;
    }

    public fjo_0 emD() {
        return this.lfF;
    }
}

