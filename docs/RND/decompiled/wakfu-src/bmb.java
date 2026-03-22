/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class bmb {
    private static final int iyr = 100;
    private final Map<String, List<bmc>> iys = new HashMap<String, List<bmc>>();
    private final Map<String, Integer> iyt = new HashMap<String, Integer>();

    public void a(int n, fm_1 fm_12, ekp_0 ekp_02, @Nullable ekp_0 ekp_03) {
        bmc bmc2 = bmc.dvg().a(bme.iyG).o(fm_12).c(ekp_02).d(ekp_03).dvm();
        this.a(n, bmc2);
    }

    public void a(int n, fm_1 fm_12, ekp_0 ekp_02) {
        bmc bmc2 = bmc.dvg().a(bme.iyH).o(fm_12).d(ekp_02).dvm();
        this.a(n, bmc2);
    }

    public void b(int n, String string, String string2) {
        bmc bmc2 = bmc.dvg().a(bme.iyI).ma(string).mb(string2).dvm();
        this.a(n, bmc2);
    }

    private void a(int n, bmc bmc2) {
        String string2 = bmb.DQ(n);
        List list = this.iys.computeIfAbsent(string2, string -> new ArrayList());
        int n2 = this.iyt.getOrDefault(string2, -1);
        if (n2 < list.size() - 1) {
            list.subList(n2 + 1, list.size()).clear();
        }
        list.add(bmc2);
        if (list.size() >= 100) {
            list.remove(0);
        }
        this.iyt.put(string2, n2 + 1);
    }

    public Optional<bmc> DO(int n) {
        String string = bmb.DQ(n);
        Integer n2 = this.iyt.get(string);
        if (n2 == null || n2 < 0) {
            return Optional.empty();
        }
        bmc bmc2 = this.iys.get(string).get(n2);
        this.iyt.put(string, n2 - 1);
        return Optional.ofNullable(bmc2);
    }

    public Optional<bmc> DP(int n) {
        String string = bmb.DQ(n);
        Integer n2 = this.iyt.get(string);
        List<bmc> list = this.iys.get(string);
        if (n2 == null || list == null || n2 >= list.size() - 1) {
            return Optional.empty();
        }
        bmc bmc2 = list.get(n2 + 1);
        this.iyt.put(string, n2 + 1);
        return Optional.ofNullable(bmc2);
    }

    private static String DQ(int n) {
        return bbs_2.xl() + "." + n;
    }
}

