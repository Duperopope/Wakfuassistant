/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKG
 */
public class bkg_0
implements aeh_2 {
    public static final String kpF = "buildingCategories";
    private final List<bkf_0> kpG = new ArrayList<bkf_0>();

    public void buq() {
        this.kpG.clear();
        bkd_0.ebG().ebH().forEach(bkc_02 -> {
            List<ftq_0> list = bkd_0.ebG().c((bkc_0)bkc_02);
            if (list.isEmpty()) {
                return;
            }
            List<bkh_0> list2 = list.stream().map(bkh_0::new).toList();
            this.kpG.add(new bkf_0((bkc_0)bkc_02, list2));
        });
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (kpF.equals(string)) {
            return this.kpG;
        }
        return null;
    }

    public void mq(@Nullable String string) {
        this.kpG.forEach(bkf_02 -> bkf_02.mq(string));
    }

    @Override
    public String[] bxk() {
        return new String[]{kpF};
    }
}

