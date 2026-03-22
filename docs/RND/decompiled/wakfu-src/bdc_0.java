/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bDC
 */
public class bdc_0
implements aeh_2 {
    private static final bdc_0 jKI = new bdc_0();
    public static final String jKJ = "allItems";
    public static final String jKK = "filteredItems";
    private final List<bgv_2> jKL = new ArrayList<bgv_2>();
    private boolean jKM = true;

    public static bdc_0 dRc() {
        return jKI;
    }

    private bdc_0() {
    }

    @NotNull
    private static Map<String, bgv_2> dRd() {
        return bEm.dSb().dSa();
    }

    public void dRe() {
        if (!this.jKM) {
            return;
        }
        this.jKM = false;
        this.jKL.clear();
        this.jKL.addAll(bdc_0.dRd().values());
        this.deS();
    }

    public void mF(@Nullable String string) {
        if (string == null || string.isEmpty()) {
            this.dRe();
            return;
        }
        String string2 = BH.aT(string);
        this.a(entry -> ((String)entry.getKey()).contains(string2));
    }

    public void a(bdd_0 bdd_02) {
        this.jKL.clear();
        Map<String, bgv_2> map = bdc_0.dRd();
        for (Map.Entry<String, bgv_2> entry : map.entrySet()) {
            if (!bdd_02.accept(entry)) continue;
            this.jKL.add(entry.getValue());
        }
        this.jKM = this.jKL.size() != map.size();
        this.deS();
    }

    private void deS() {
        fse_1.gFu().a((aef_2)this, jKK);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jKJ.equals(string)) {
            return bdc_0.dRd();
        }
        if (jKK.equals(string)) {
            return this.jKL;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{jKJ, jKK};
    }
}

