/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from ezS
 */
public final class ezs_0
extends Record {
    private final @Unmodifiable Map<Integer, Short> puT;

    public ezs_0(Map<Integer, Short> map) {
        this.puT = Collections.unmodifiableMap(map);
    }

    public int getSerializedSize() {
        return 1 + 6 * this.puT.size();
    }

    public void e(azg_1 azg_12) {
        azg_12.aF((byte)this.puT.size());
        this.puT.forEach((n, s) -> {
            azg_12.vC((int)n);
            azg_12.aG((short)s);
        });
    }

    public static ezs_0 fm(ByteBuffer byteBuffer) {
        int n = byteBuffer.get();
        HashMap<Integer, Short> hashMap = new HashMap<Integer, Short>(n);
        for (int i = 0; i < n; ++i) {
            hashMap.put(byteBuffer.getInt(), byteBuffer.getShort());
        }
        return new ezs_0(hashMap);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ezs_0.class, "countByServer", "puT"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ezs_0.class, "countByServer", "puT"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ezs_0.class, "countByServer", "puT"}, this, object);
    }

    public @Unmodifiable Map<Integer, Short> fnf() {
        return this.puT;
    }
}

