/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

public class fnu
implements evv_2 {
    private final Set<jc_2> sJe = new HashSet<jc_2>();
    private static final Logger sJf = Logger.getLogger(fnu.class);

    public boolean Xl(int n) {
        if (this.sJe.stream().anyMatch(jc_22 -> jc_22.d() == n)) {
            return false;
        }
        jc_2 jc_23 = jc_2.Wr().fE(n).Wx();
        return this.sJe.add(jc_23);
    }

    public boolean Xm(int n) {
        return this.sJe.removeIf(jc_22 -> jc_22.d() == n);
    }

    public boolean Xn(int n) {
        return this.sJe.stream().anyMatch(jc_22 -> jc_22.d() == n);
    }

    public @Unmodifiable List<Integer> gev() {
        return this.sJe.stream().map(jc_2::d).toList();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            jf_2 jf_22 = jf_2.bq(byArray);
            this.sJe.clear();
            this.sJe.addAll(jf_22.ot());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sJf.error((Object)"[EMOTES] Failed to deserialize emotes account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        jf_2 jf_22 = jf_2.WD().M(this.sJe).WJ();
        byte[] byArray = jf_22.toByteArray();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    public void removeAll() {
        this.sJe.clear();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owB;
    }

    public void bn(List<Integer> list) {
        List<jc_2> list2 = list.stream().map(n -> jc_2.Wr().fE((int)n).Wx()).toList();
        this.sJe.addAll(list2);
    }
}

