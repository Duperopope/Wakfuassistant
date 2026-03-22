/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHg
 */
public class bhg_2
implements aeh_2 {
    private static final String jXq = "instances";
    private static final String jXr = "instance";
    private static final String jXs = "playlist";
    public static final String jXt = "currentMusicName";
    private final Map<Long, bhe_2> jXu = new HashMap<Long, bhe_2>();
    private final bhc_2 jXv;
    private bhe_2 jXw;
    private bhf_2 jXx;
    private String jXy;

    public bhg_2(bhc_2 bhc_22) {
        this.jXv = bhc_22;
    }

    @Override
    public String[] bxk() {
        return new String[]{jXq, jXs};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jXq)) {
            String string2 = BH.aT(this.jXy);
            return this.jXu.values().stream().filter(bhe_22 -> bhe_22.dUM().contains(string2)).sorted(Comparator.comparing(bhe_2::dUM)).toList();
        }
        if (string.equals(jXr)) {
            return this.jXw;
        }
        if (string.equals(jXs)) {
            return this.jXx;
        }
        if (string.equals(jXt)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bnn_1 bnn_12 = bgt_02.dnw().dyV();
            short s = bnn_12.buM();
            if (s <= 0) {
                return "-";
            }
            adD adD2 = adf_0.buP().av(s);
            long l = adD2.aqZ();
            int n = adD2.buN();
            return aum_0.cWf().a(77, l, new Object[0]) + " - " + aum_0.cWf().a(54, (long)n, new Object[0]);
        }
        return null;
    }

    public void bkZ() {
        this.jXu.clear();
        adf_0.buP().d((s, adD2) -> {
            long l = adD2.aqZ();
            if (l <= 0L) {
                return;
            }
            int n = adD2.buN();
            if (n <= 0) {
                return;
            }
            this.jXu.compute(l, (l2, bhe_22) -> {
                if (bhe_22 == null) {
                    return new bhe_2().lp(l).GJ(n);
                }
                return bhe_22.GJ(n);
            });
        });
        this.jXy = "";
        if (this.jXu.size() <= 0) {
            return;
        }
        Optional<bhe_2> optional = this.jXu.values().stream().min(Comparator.comparing(bhe_2::dUM));
        this.a(optional.get());
    }

    public void clear() {
        this.jXu.clear();
        this.jXw = null;
        this.jXy = null;
        this.jXx = null;
    }

    public void a(bhe_2 bhe_22) {
        this.jXw = bhe_22;
        fse_1.gFu().a((aef_2)this, jXr);
        if (this.jXw == null) {
            return;
        }
        List<Integer> list = this.jXw.dUL();
        if (list.size() <= 0) {
            return;
        }
        Collection<adD> collection = adf_0.buP().rW(list.get(0));
        if (collection.isEmpty()) {
            return;
        }
        this.a(new bhf_2(collection.stream().findFirst().get()));
    }

    public void a(bhf_2 bhf_22) {
        this.jXx = bhf_22;
        fse_1.gFu().a((aef_2)this, jXs);
    }

    public void E(Long l) {
        if (l == -1L) {
            this.jXv.dUK();
        }
        if (this.jXx == null) {
            return;
        }
        Optional<ahc_2> optional = this.jXx.w(l);
        if (optional.isEmpty()) {
            return;
        }
        this.jXv.a(this.jXx.dUN(), optional.get());
    }

    public void dUO() {
        Random random = new Random();
        ArrayList<bhe_2> arrayList = new ArrayList<bhe_2>(this.jXu.values());
        int n = random.nextInt(arrayList.size());
        bhe_2 bhe_22 = (bhe_2)arrayList.get(n);
        List<Integer> list = bhe_22.dUL();
        int n2 = random.nextInt(list.size());
        Integer n3 = list.get(n2);
        Collection<adD> collection = adf_0.buP().rW(n3);
        int n4 = random.nextInt(collection.size());
        adD adD2 = new ArrayList<adD>(collection).get(n4);
        List<ahc_2> list2 = adD2.buF();
        int n5 = random.nextInt(list2.size());
        ahc_2 ahc_22 = list2.get(n5);
        this.jXv.a(adD2, ahc_22);
    }

    public void mJ(String string) {
        this.jXy = string;
        fse_1.gFu().a((aef_2)this, jXq);
    }
}

