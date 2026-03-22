/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.Lists;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bYq
 */
public final class byq_2 {
    private static final int lzb = 3;
    private static final Duration lzc = Duration.ofMillis(300L);
    private static boolean lzd = false;
    private static final List<bci_1> lze = new ArrayList<bci_1>();

    private byq_2() {
    }

    public static void k(@NotNull bci_1 bci_12) {
        if (!lzd) {
            lzd = true;
            abg_2.bUP().a(() -> {
                for (List list : Lists.partition(lze, (int)3)) {
                    byr_2 byr_22 = new byr_2(list);
                    byj_1.epo().a(byr_22);
                }
                lze.clear();
                lzd = false;
            }, lzc, 1);
        }
        lze.add(bci_12);
    }
}

