/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGq
 */
public abstract class bgq_1
implements aeh_2 {
    public static final String jVp = "newItems";
    public static final String[] jVq = new String[]{"newItems"};
    private static final bgp_1[] jVr = new bgp_1[4];
    private final Map<ffS, bgp_1> jVs = new EnumMap<ffS, bgp_1>(ffS.class);
    private final List<bgp_1> jVt = new ArrayList<bgp_1>();

    public abstract boolean jW(long var1);

    void dTR() {
        this.jVt.clear();
        this.jVt.add(this.jVs.get(ffS.sgB));
        Collections.addAll(this.jVt, jVr);
        this.jVt.add(this.jVs.get(ffS.sgO));
        this.jVt.add(this.jVs.get(ffS.sgF));
        Collections.addAll(this.jVt, jVr);
        this.jVt.add(this.jVs.get(ffS.sgE));
        this.jVt.add(this.jVs.get(ffS.sgG));
        Collections.addAll(this.jVt, jVr);
        this.jVt.add(this.jVs.get(ffS.sgL));
        this.jVt.add(this.jVs.get(ffS.sgI));
        Collections.addAll(this.jVt, jVr);
        this.jVt.add(this.jVs.get(ffS.sgJ));
        this.jVt.add(this.jVs.get(ffS.sgN));
        this.jVt.add(this.jVs.get(ffS.sgR));
        this.jVt.add(this.jVs.get(ffS.sgQ));
        this.jVt.add(this.jVs.get(ffS.sgS));
        this.jVt.add(this.jVs.get(ffS.sgZ));
        this.jVt.add(this.jVs.get(ffS.sgX));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "newItems": {
                return this.jVt;
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return jVq;
    }

    protected void a(ffS ffS2, bgp_1 bgp_12) {
        this.jVs.put(ffS2, bgp_12);
    }

    public bgp_1 g(ffS ffS2) {
        return this.jVs.get(ffS2);
    }

    public Map<ffS, bgp_1> dTS() {
        return this.jVs;
    }

    public void dTT() {
    }
}

