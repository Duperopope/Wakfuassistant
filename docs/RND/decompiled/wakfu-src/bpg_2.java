/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.SingleReference
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.SingleReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPG
 */
public class bpg_2
extends bpt_1<String, SingleReference> {
    private final Object kSs;

    public bpg_2(String string, @Nullable String string2, String string3, String string4, String string5, Double d2, Double d3, bpa_2 bpa_22, Object object, Integer n, ArrayList<bpk_2> arrayList, List<SingleReference> list, ArrayList<bPh> arrayList2, ArrayList<bpf_2> arrayList3, uw_0 uw_02, Double d4, Double d5, bpa_2 bpa_23) {
        super(string, string2, string3, string4, string5, d2, d3, bpa_22, n, arrayList, list, arrayList2, arrayList3, uw_02, d4, d5, bpa_23);
        this.kSs = object;
    }

    public Object eiJ() {
        return this.kSs;
    }

    @Override
    @Nullable
    protected String eil() {
        return this.kPS != null && (this.kPS > 0.0 || this.kSs == ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE) ? aum_0.cWf().w(this.kPS) : null;
    }

    @Override
    public boolean a(bpx_2 bpx_22) {
        switch (bpx_22) {
            case kQR: {
                return true;
            }
            case kQQ: {
                return this.kQb.stream().anyMatch(singleReference -> singleReference.getReference().getDiscriminator() == ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE);
            }
        }
        return false;
    }
}

