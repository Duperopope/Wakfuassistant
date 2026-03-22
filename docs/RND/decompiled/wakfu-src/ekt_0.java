/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Renamed from eKt
 */
public final class ekt_0 {
    private ekt_0() {
    }

    public static ekp_0 g(fb_2 fb_22) {
        Integer n = fb_22.AL() ? Integer.valueOf(fb_22.AM()) : null;
        Integer n2 = fb_22.AN() ? Integer.valueOf(fb_22.AO()) : null;
        return new ekp_0(fb_22.AK(), n, n2);
    }

    public static fb_2 f(ekp_0 ekp_02) {
        fd_2 fd_22 = fb_2.AQ();
        fd_22.cv(ekp_02.AK());
        ekp_02.fxV().ifPresent(fd_22::cw);
        ekp_02.fxW().ifPresent(fd_22::cx);
        return fd_22.AW();
    }

    public static fo_2 aI(List<ekp_0> list) {
        fq_1 fq_12 = fo_2.zC();
        list.forEach(ekp_02 -> fq_12.a(ekt_0.f(ekp_02)));
        return fq_12.zI();
    }

    public static List<ekp_0> d(fo_2 fo_22) {
        ArrayList<ekp_0> arrayList = new ArrayList<ekp_0>();
        List<fb_2> list = fo_22.zy();
        list.forEach(fb_22 -> arrayList.add(ekt_0.g(fb_22)));
        return arrayList;
    }

    public static fp_1 f(eks_0 eks_02) {
        fr_1 fr_12 = fp_1.BY();
        Map<Integer, fo_2> map = eks_02.fye().entrySet().stream().map(entry -> new AbstractMap.SimpleEntry<Integer, fo_2>(((fm_1)((Object)((Object)entry.getKey()))).getNumber(), ekt_0.aI((List)entry.getValue()))).collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
        fr_12.i(map);
        fr_12.cE(eks_02.BJ());
        fr_12.cF(eks_02.BL());
        fr_12.E(eks_02.getName());
        fr_12.N(eks_02.fyd().bjB());
        fr_12.j(eks_02.dva());
        return fr_12.Ce();
    }

    public static eks_0 f(fp_1 fp_12) {
        int n2 = fp_12.BJ();
        String string = fp_12.BN();
        HashMap<fm_1, List<ekp_0>> hashMap = new HashMap<fm_1, List<ekp_0>>();
        fp_12.BU().forEach((n, fo_22) -> hashMap.put(fm_1.ce(n), ekt_0.d(fo_22)));
        return new eks_0(n2, fp_12.BL(), string, hashMap, uw_0.fn(fp_12.BQ()), fp_12.BW());
    }
}

