/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/*
 * Renamed from fhH
 */
public class fhh_0 {
    public static final fhh_0 spN = new fhh_0();
    private final Map<Integer, fhg_0> spO = new HashMap<Integer, fhg_0>();
    private final Map<rd_0, List<fhg_0>> spP = new EnumMap<rd_0, List<fhg_0>>(rd_0.class);

    private fhh_0() {
    }

    public void a(int n, fhg_0 fhg_02) {
        this.spO.put(n, fhg_02);
        if (!fhg_02.fYE()) {
            this.spP.computeIfAbsent(fhg_02.dBe(), rd_02 -> new ArrayList()).add(fhg_02);
            this.spP.computeIfAbsent(rd_0.bjE, rd_02 -> new ArrayList()).add(fhg_02);
        }
    }

    public fhg_0 VC(int n) {
        return this.spO.get(n);
    }

    public List<fhg_0> g(rd_0 rd_02) {
        return this.spP.get(rd_02);
    }

    public Stream<Map.Entry<Integer, fhg_0>> fYH() {
        return this.spO.entrySet().stream();
    }
}

