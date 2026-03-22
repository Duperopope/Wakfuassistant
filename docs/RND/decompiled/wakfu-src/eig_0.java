/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eIG
 */
public class eig_0
implements evv_2 {
    private static final Logger qwU = Logger.getLogger(eig_0.class);
    public static final String qwV = "newPlayer_32";
    public static final String qwW = "newPlayer_41";
    public static final String qwX = "newPlayer_64";
    private final HashMap<Long, Short> qwY = new HashMap();
    private short aWK = 0;

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        this.aWK = 0;
        this.qwY.clear();
        for (int i = 0; i < n; ++i) {
            long l2 = byteBuffer.getLong();
            short s = byteBuffer.getShort();
            this.qwY.put(l2, s);
            if (s <= this.aWK) continue;
            this.aWK = s;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public byte[] fej() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeInt(this.qwY.size());
                for (Map.Entry<Long, Short> entry : this.qwY.entrySet()) {
                    dataOutputStream.writeLong(entry.getKey());
                    dataOutputStream.writeShort(entry.getValue().shortValue());
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            qwU.error((Object)"Serialization exception", (Throwable)iOException);
            return new byte[]{0, 0, 0, 0};
        }
    }

    public void g(long l, short s) {
        this.qwY.put(l, s);
        if (s > this.aWK) {
            this.aWK = s;
        }
    }

    public void m(long l, short s) {
        short s2 = (short)(this.qwY.get(l) + s);
        this.qwY.put(l, s2);
        if (s2 > this.aWK) {
            this.aWK = s2;
        }
    }

    public void jt(long l) {
        Short s = this.qwY.remove(l);
        if (s == null) {
            return;
        }
        if (s >= this.aWK) {
            this.aWK = this.qwY.values().stream().max(Short::compareTo).orElse((short)0);
        }
    }

    public Optional<Short> fwJ() {
        return this.qwY.isEmpty() ? Optional.empty() : Optional.of(this.aWK);
    }

    public Collection<Short> fwK() {
        return this.qwY.values();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owq;
    }
}

