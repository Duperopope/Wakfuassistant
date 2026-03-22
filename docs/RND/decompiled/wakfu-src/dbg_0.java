/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from dbg
 */
public class dbg_0
extends dae_0 {
    private final List<ffV> odt = new ArrayList<ffV>();
    private long lXG;

    public List<ffV> exR() {
        return this.odt;
    }

    public void bf(ffV ffV2) {
        this.odt.add(ffV2);
    }

    public long exN() {
        return this.lXG;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }
}

