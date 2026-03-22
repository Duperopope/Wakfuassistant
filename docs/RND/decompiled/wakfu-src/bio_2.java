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
 * Renamed from bIO
 */
public class bio_2
extends biq_1 {
    private final long kii;

    public bio_2(int n, long l) {
        super(n, null, null, null);
        this.kii = l;
    }

    public long aqZ() {
        return this.kii;
    }

    public int clk() {
        return (int)this.Sn();
    }

    @Override
    public String dYr() {
        try {
            String string = String.format(auc_0.kG("fullSubMapPath"), this.aqZ(), this.clk() / 100);
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
        return tLongObjectHashMap.valueCollection().stream().filter(bJM.class::isInstance).map(bJM.class::cast).filter(bJM2 -> bJM2.aqZ() == this.kii).toList();
    }

    @Override
    public void a(bip_2 bip_22) {
        bJJ.kmp.lD(this.kii);
        TLongArrayList tLongArrayList = new TLongArrayList();
        tLongArrayList.add(this.kii);
        bip_22.dYi().c(tLongArrayList);
    }

    @Override
    public boolean dYs() {
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(this.kii);
        return bzq_22 != null && bzq_22.lEH;
    }

    @Override
    public boolean dXU() {
        return false;
    }

    @Override
    public void b(bip_2 bip_22) {
    }

    @Override
    public String dYn() {
        bJK bJK2 = (bJK)fpk.sNF.Yn(this.clk());
        if (bJK2 == null) {
            return null;
        }
        short s = bJK2.aVf();
        short s2 = bJK2.aVe();
        if (s == -1 || s2 == -1) {
            return null;
        }
        return aum_0.cWf().c("recommended.level", s, s2);
    }

    @Override
    public String dZs() {
        return aum_0.cWf().a(66, (long)this.clk(), new Object[0]);
    }
}

