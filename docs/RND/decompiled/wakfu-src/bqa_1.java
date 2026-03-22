/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqA
 */
public class bqa_1
implements aeh_2 {
    public static final String jaq = "itemName";
    public static final String jar = "instanceLoots";
    public static final String[] jas = new String[]{"itemName", "instanceLoots"};
    private final int jat;
    private final List<bqd_1> jau;

    public bqa_1(int n) {
        this.jat = n;
        this.jau = bqa_1.Ff(n);
    }

    @NotNull
    private static List<bqd_1> Ff(int n) {
        ArrayList<bqd_1> arrayList = new ArrayList<bqd_1>();
        List<bqf_1> list = bqg_1.dEw().Fh(n);
        for (bqf_1 bqf_12 : list) {
            if (bqf_12.dEt().length == 0) {
                if (bqf_12.dEu().length == 0) {
                    arrayList.add(new bqb_1(bqf_12));
                    continue;
                }
                arrayList.add(new bqc_1(bqf_12));
                continue;
            }
            for (short s : bqf_12.dEt()) {
                arrayList.add(new bqe_1(bqf_12, s));
            }
        }
        arrayList.sort(Comparator.comparingInt(bqd_1::aYs));
        return arrayList;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jaq -> bgv_2.Dm(this.jat);
            case jar -> this.jau;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return jas;
    }

    @NotNull
    static String bJ(short s) {
        return aum_0.cWf().a(77, (long)s, new Object[0]);
    }
}

