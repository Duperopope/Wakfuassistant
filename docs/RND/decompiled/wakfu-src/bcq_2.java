/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Ordering
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcq
 */
public class bcq_2
implements aeh_2 {
    public static final String hEf = "achievements";
    public static final String hEg = "filters";
    public static final String hEh = "selectedFilter";
    private final int hEi;
    private final Collection<bci_1> hEj = new ArrayList<bci_1>();
    private final List<bci_1> hEk = new ArrayList<bci_1>();
    private final List<bct_2> hEl = new ArrayList<bct_2>();
    private static final Ordering<bci_1> hEm = Ordering.natural().onResultOf((Function)new bcr_2());
    private bci_1 hEn;
    private bct_2 hEo;

    public bcq_2(int n) {
        this.hEi = n;
        this.hEn = null;
        this.bkZ();
    }

    private void bkZ() {
        for (bcs_2 bcs_22 : bcs_2.values()) {
            this.hEl.add(bct_2.a(bcs_22));
        }
        this.hEo = this.hEl.get(0);
        bch_2 bch_22 = (bch_2)bcm_1.hIK.u(aue_0.cVJ().cVK().Sn(), this.hEi);
        this.hEj.addAll(bch_22.aYz());
        this.dbc();
    }

    private void dbc() {
        this.hEk.clear();
        for (bci_1 bci_12 : this.hEj) {
            if (!this.hEo.dbg().Bj(bci_12.d())) continue;
            this.hEk.add(bci_12);
        }
        this.hEk.sort((Comparator<bci_1>)hEm);
        fse_1.gFu().a((aef_2)this, hEf);
        if (!this.hEk.contains(this.hEn)) {
            this.b(this.hEk.isEmpty() ? null : this.hEk.get(0));
        }
    }

    public void dbd() {
        if (this.hEn == null) {
            return;
        }
        cjg_0 cjg_02 = new cjg_0(this.hEn.d(), -1L, true);
        aue_0.cVJ().etu().d(cjg_02);
    }

    public void b(bci_1 bci_12) {
        if (this.hEn == bci_12) {
            return;
        }
        this.hEn = bci_12;
        if (fyw_0.gqw().to("mercenaryDialog")) {
            fse_1.gFu().b("displayedAchievement", this.hEn, "mercenaryDialog");
        }
    }

    public bci_1 dbe() {
        return this.hEn;
    }

    public void a(bct_2 bct_22) {
        if (this.hEo == bct_22) {
            return;
        }
        this.hEo = bct_22;
        this.dbc();
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hEf)) {
            return ImmutableList.copyOf(this.hEk);
        }
        if (string.equals(hEg)) {
            return ImmutableList.copyOf(this.hEl);
        }
        if (string.equals(hEh)) {
            return this.hEo;
        }
        return null;
    }

    public String toString() {
        return "MercenariesView{m_achievementCategoryId=" + this.hEi + ", m_views=" + String.valueOf(this.hEj) + ", m_filteredViews=" + String.valueOf(this.hEk) + ", m_filters=" + String.valueOf(this.hEl) + ", m_selectedAchievement=" + String.valueOf(this.hEn) + ", m_selectedFilter=" + String.valueOf(this.hEo) + "}";
    }
}

