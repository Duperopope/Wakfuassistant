/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReference
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPB
 */
public class bpb_2
extends bpt_1<Integer, ShopReference> {
    public bpb_2(Integer n, @Nullable String string, String string2, String string3, String string4, Float f2, Float f3, bpa_2 bpa_22, Integer n2, ArrayList<bpk_2> arrayList, List<ShopReference> list, ArrayList<bPh> arrayList2, ArrayList<bpf_2> arrayList3, uw_0 uw_02, Float f4, Float f5, bpa_2 bpa_23) {
        super(n, string, string2, string3, string4, f2 != null ? Double.valueOf(f2.doubleValue()) : null, f3 != null ? Double.valueOf(f3.doubleValue()) : null, bpa_22, n2, arrayList, list, arrayList2, arrayList3, uw_02, f4 != null ? Double.valueOf(f4.doubleValue()) : null, f5 != null ? Double.valueOf(f5.doubleValue()) : null, bpa_23);
    }

    @Override
    public boolean a(bpx_2 bpx_22) {
        return this.kQb.stream().anyMatch(shopReference -> shopReference.getType().equals(bpx_22.getName()));
    }
}

