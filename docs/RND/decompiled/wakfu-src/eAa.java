/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class eAa
implements evv_2 {
    private static final Logger pvr = Logger.getLogger(eAa.class);
    private final Map<Integer, eAb> pvs = new HashMap<Integer, eAb>();

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.a(l, byteBuffer, true);
    }

    public void b(long l, ByteBuffer byteBuffer) {
        this.a(l, byteBuffer, false);
    }

    private void a(long l, ByteBuffer byteBuffer, boolean bl) {
        int n = -1;
        try {
            n = byteBuffer.getInt();
            for (int i = 0; i < n; ++i) {
                eAb eAb2 = eAb.a(byteBuffer, bl);
                this.pvs.put(eAb2.azt(), eAb2);
            }
        }
        catch (Exception exception) {
            pvr.error((Object)("[Achievements] Unable to fully load account rewards of account " + l + ", only " + this.pvs.size() + " / " + n + " loaded"), (Throwable)exception);
        }
    }

    @Override
    public byte[] fej() {
        return this.lA(true);
    }

    public byte[] fnt() {
        return this.lA(false);
    }

    private byte[] lA(boolean bl) {
        azg_1 azg_12 = new azg_1(4 + eAb.b(this.pvs.values(), bl));
        azg_12.vC(this.pvs.size());
        this.pvs.values().forEach(eAb2 -> eAb2.a(azg_12, bl));
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owF;
    }

    public boolean Pp(int n) {
        return this.pvs.containsKey(n);
    }

    public void a(int n, long l, @Nullable String string) {
        ux_0 ux_02 = ue_0.bjV().bjc();
        this.a(n, l, ux_02, string);
    }

    public void a(int n, long l, ux_0 ux_02, @Nullable String string) {
        eAb eAb2 = new eAb(n, l, ux_02);
        eAb2.dm(string);
        this.pvs.put(n, eAb2);
    }

    public void a(eAb eAb2) {
        this.pvs.put(eAb2.azt(), eAb2);
    }

    public Optional<eAb> Pq(int n) {
        return Optional.ofNullable(this.pvs.get(n));
    }

    public void Pr(int n) {
        this.pvs.remove(n);
    }

    public Map<Integer, eAb> fnu() {
        return Collections.unmodifiableMap(this.pvs);
    }
}

