/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Sets;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public class eTp
implements evv_2 {
    private final Set<hd_0> rop = new HashSet<hd_0>();
    private static final Logger roq = Logger.getLogger(eTp.class);

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            hh_0 hh_02 = hh_0.aS(byArray);
            this.rop.clear();
            this.rop.addAll(hh_02.JU());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            roq.error((Object)"[EMOTES] Failed to deserialize emotes account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        hh_0 hh_02 = hh_0.JY().B(this.rop).Ke();
        byte[] byArray = hh_02.toByteArray();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owA;
    }

    public Set<hd_0> fJd() {
        return Sets.newHashSet(this.rop);
    }

    public boolean Ss(int n) {
        if (this.Su(n)) {
            return false;
        }
        return this.rop.add(hd_0.JJ().dL(n).JP());
    }

    public boolean St(int n) {
        return this.rop.removeIf(hd_02 -> hd_02.d() == n);
    }

    public boolean Su(int n) {
        return this.rop.stream().anyMatch(hd_02 -> hd_02.d() == n);
    }
}

