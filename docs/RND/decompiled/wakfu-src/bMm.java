/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.StreamSupport;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

public class bMm
extends bmd_1 {
    private static final Logger kwx = Logger.getLogger(bMm.class);
    private final HashMap<Long, bmx_0> kwy = new HashMap();
    private fqP<bmx_0> kwz;

    @Override
    public String[] bxk() {
        return bmd_1.kvQ;
    }

    @Override
    public Iterable<bmx_0> dkJ() {
        if (this.kwz != null) {
            return this.kwz;
        }
        if (!this.dkN()) {
            return this.kwy.values();
        }
        return this.eek();
    }

    public @Unmodifiable Iterable<bmx_0> bL(bgy bgy2) {
        return StreamSupport.stream(this.dkJ().spliterator(), false).filter(bmx_02 -> new bme_0(bgy2).f((bmt_0)bmx_02.giP())).toList();
    }

    public bmx_0 jr(long l) {
        if (this.kwz != null && this.kwz.dM(l)) {
            return (bmx_0)this.kwz.dN(l);
        }
        if (!this.dkN()) {
            return this.kwy.get(l);
        }
        return (bmx_0)this.eek().dN(l);
    }

    public void a(ArrayList<azr_1<bmt_0>> arrayList, short n, exP exP2) {
        for (azr_1<bmt_0> azr_12 : arrayList) {
            bmt_0 bmt_02 = azr_12.aHI();
            int n2 = azr_12.bTr() == -1 ? n : azr_12.bTr();
            bmx_0 bmx_02 = new bmx_0(bmt_02, (short)n2, bmt_02.d(), exP2);
            this.kwy.put(bmx_02.LV(), bmx_02);
        }
    }

    public void c(bmx_0 bmx_02) {
        this.kwy.put(bmx_02.LV(), bmx_02);
    }

    public void clear() {
        this.kwy.clear();
        this.kwz = null;
    }

    public fqP<bmx_0> ees() {
        if (this.kwz != null) {
            return this.kwz;
        }
        this.kwz = new fqP(80, null, null, false, false, false);
        for (Map.Entry<Long, bmx_0> entry : this.kwy.entrySet()) {
            try {
                ((Sg)this.kwz).b(entry.getValue());
            }
            catch (Sz | sa_0 sb_02) {
                kwx.error((Object)"Failed to add a spell in the fakeSpellInventory of a NPC", (Throwable)sb_02);
            }
        }
        return this.kwz;
    }
}

