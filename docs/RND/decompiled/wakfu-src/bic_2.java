/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bIC
 */
public class bic_2
extends biq_1 {
    private int kgK = -1;
    private boolean kgL;

    public bic_2(long l, boolean bl) {
        super(l, null, null, null);
        if (bl) {
            this.dYv();
        }
    }

    @Override
    public String dYr() {
        try {
            String string = auc_0.i("fullMapPath", this.Sn());
            try {
                return apr_1.bA(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return null;
            }
        }
        catch (fu_0 fu_02) {
            return null;
        }
    }

    public long aqZ() {
        return this.Sn();
    }

    public boolean dYu() {
        return this.kgL;
    }

    public void dYv() {
        int[] nArray = fpk.sNF.ggk();
        long l = this.aqZ();
        for (int n : nArray) {
            bJK bJK2 = (bJK)fpk.sNF.Yn(n);
            if (bJK2.aqZ() != l) continue;
            biq_1 biq_12 = big_2.y(bJK2.d(), l);
            if (biq_12 != null) {
                biq_12.b(this);
            }
            this.kgK = bJK2.d();
        }
        this.kgL = true;
    }

    @Override
    public List<ffq_2> bFA() {
        return Collections.emptyList();
    }

    @Override
    public @Unmodifiable Collection<? extends ffp_2> dYw() {
        TLongObjectHashMap<biq_1> tLongObjectHashMap = bih_2.dZf().b(bii_2.khB);
        if (tLongObjectHashMap == null) {
            return Collections.emptyList();
        }
        return tLongObjectHashMap.valueCollection().stream().filter(bJM.class::isInstance).map(bJM.class::cast).filter(bJM2 -> bJM2.aqZ() == this.aqZ()).toList();
    }

    @Override
    public void a(bip_2 bip_22) {
        long l = this.aqZ();
        bJJ.kmp.lD(l);
        TLongArrayList tLongArrayList = new TLongArrayList();
        tLongArrayList.add(l);
        bip_22.dYi().c(tLongArrayList);
    }

    @Override
    public boolean dYs() {
        long l = this.aqZ();
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(l);
        return bzq_22 != null && bzq_22.lEH;
    }

    @Override
    public boolean dXU() {
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khC, this.dYx());
        if (biq_12 == null) {
            return false;
        }
        long l = this.aqZ();
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(l);
        return bzq_22.lEI;
    }

    @Override
    public void b(bip_2 bip_22) {
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khC, this.dYx());
        if (biq_12 != null) {
            bip_22.a(biq_12);
        }
    }

    public long dYx() {
        bJK bJK2;
        int n = this.kgK;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.aqZ() == this.aqZ() && (bJK2 = bJJ.kmp.dN(bgt_02.bcC(), bgt_02.bcD())) != null) {
            n = bJK2.d();
        }
        return n;
    }

    @Override
    public String dYn() {
        return big_2.lA(this.Sn());
    }
}

