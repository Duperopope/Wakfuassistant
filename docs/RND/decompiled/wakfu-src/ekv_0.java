/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eKv
 */
public class ekv_0
implements evv_2 {
    private static final Logger qCn = Logger.getLogger(ekv_0.class);
    @NotNull
    private final eki_0 qCo = new eky_0();

    public ekv_0() {
    }

    public ekv_0(@NotNull eki_0 eki_02) {
        this.qCo.a(eki_02.fys(), false);
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            this.qCo.a(dt_2.Y(byArray), false);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qCn.error((Object)"[CRAFT] Failed to deserialize craft account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        dt_2 dt_22 = this.qCo.fys();
        byte[] byArray = dt_22.toByteArray();
        azg_1 azg_12 = new azg_1(4 + byArray.length);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owE;
    }

    @NotNull
    @Generated
    public eki_0 cZr() {
        return this.qCo;
    }
}

