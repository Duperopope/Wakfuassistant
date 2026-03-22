/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bNL
implements aeh_2 {
    protected static final Logger kIy = Logger.getLogger(bNL.class);
    public static final String kIz = "currentName";
    public static final String kIA = "linksByIsland";
    public static final String kIB = "iconUrl";
    public static final String kIC = "transportType";
    public static final String kID = "gfxId";
    private final aah_1<bNK> kIE = new aah_1();
    private long kIF;
    private int eig;
    public static String kIG;

    public boolean a(long l, bco_0 bco_02) {
        this.kIE.clear();
        this.kIF = l;
        Object Info2 = frb_0.sYO.a(fre_0.sZc, l);
        this.eig = ((frk_0)Info2).clx();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        frb_0.sYO.ab(new bNM(this, l, bgt_02, bco_02));
        return true;
    }

    void a(frg_0 frg_02, long l, bgt_0 bgt_02, bco_0 bco_02) {
        List<Long> list;
        evd_2 evd_22;
        frf_0 frf_02;
        int n;
        if ((long)frg_02.gkn() != l && (long)frg_02.gko() != l) {
            return;
        }
        int n2 = n = (long)frg_02.gkn() == l ? frg_02.gko() : frg_02.gkn();
        if (!frg_02.b(bgt_02, bco_02)) {
            return;
        }
        TByteHashSet tByteHashSet = new TByteHashSet();
        boolean bl = true;
        if (!frg_02.a(bgt_02, bco_02)) {
            bl = false;
            tByteHashSet.add((byte)1);
        }
        if ((frf_02 = (frf_0)frb_0.sYO.a(fre_0.sZc, n)) == null) {
            return;
        }
        int n3 = frf_02.clw();
        evx_1 evx_12 = evy_1.oxK.a(n3, (evd_22 = bgt_02.dpL()).fdL());
        if (evx_12 == evx_1.oxH && !evd_22.b(evv_1.oxr)) {
            bl = false;
            tByteHashSet.add((byte)3);
        }
        if ((list = ewo_0.oBF.o(ewr_0.oBV)).contains(n3)) {
            return;
        }
        bNK bNK2 = this.kIE.vK(n3);
        if (bNK2 == null) {
            bNK2 = new bNK(n3);
            this.kIE.b(n3, bNK2);
        }
        bNK2.a(new bNJ(frg_02, this.kIF, bl, tByteHashSet));
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kIA)) {
            return this.egr();
        }
        if (string.equals(kIz)) {
            return this.egs();
        }
        if (string.equals(kIB)) {
            return auc_0.cVq().a("zaapTypeIconPath", "defaultIconPath", this.aVt());
        }
        if (string.equals(kIC)) {
            return bNN.kIM.egt();
        }
        if (string.equals(kID)) {
            return this.aVt();
        }
        return null;
    }

    @Nullable
    public List<bNK> egr() {
        if (this.kIE.bTT()) {
            return null;
        }
        ArrayList<bNK> arrayList = new ArrayList<bNK>();
        for (bNK bNK2 : this.kIE) {
            if (bNK2.egq().isEmpty()) continue;
            arrayList.add(bNK2);
        }
        return arrayList;
    }

    public void ke(String string) {
        kIG = string;
        fse_1.gFu().a((aef_2)this, kIA);
    }

    private String egs() {
        return aum_0.cWf().a(83, (long)((int)this.kIF), new Object[0]);
    }

    private int aVt() {
        return this.eig == -1 ? bNN.kIM.egt() : this.eig;
    }

    public String getDescription() {
        ahv_2 ahv_22 = new ahv_2();
        if (this.kIE.bTR() != 0) {
            boolean bl = true;
            for (bNK bNK2 : this.kIE) {
                ArrayList<bNJ> arrayList = bNK2.egp();
                String string = bNK2.ego();
                int n = arrayList.size();
                for (int i = 0; i < n; ++i) {
                    if (bl) {
                        bl = false;
                    } else {
                        ahv_22.ceH();
                    }
                    bNJ bNJ2 = arrayList.get(i);
                    ahv_22.c(bNJ2.getName()).c(" (").c(string).c(")");
                }
            }
        } else {
            ahv_22.c(aum_0.cWf().c("boat.noDestinationsAvailable", new Object[0]));
        }
        return ahv_22.ceL();
    }
}

