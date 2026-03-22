/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqG
 */
public class bqg_1 {
    private static final bqg_1 jaS = new bqg_1();
    private final Map<Integer, List<bqf_1>> jaT = new HashMap<Integer, List<bqf_1>>();

    public static bqg_1 dEw() {
        return jaS;
    }

    private bqg_1() {
    }

    public void a(bqf_1 bqf_12) {
        int n2 = bqf_12.dEq();
        if (!bpm_1.dCG().EV(n2)) {
            return;
        }
        this.jaT.computeIfAbsent(n2, n -> new ArrayList()).add(bqf_12);
    }

    public boolean Fg(int n) {
        return this.jaT.containsKey(n);
    }

    @NotNull
    public List<bqf_1> Fh(int n) {
        return this.jaT.getOrDefault(n, Collections.emptyList());
    }
}

