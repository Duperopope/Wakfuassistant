/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import lombok.Generated;
import org.apache.log4j.Logger;

/*
 * Renamed from frQ
 */
public class frq_0
implements evv_2 {
    private static final Logger taf = Logger.getLogger(frq_0.class);
    private final Set<Integer> tag = new HashSet<Integer>();
    private final Set<Integer> tah = new HashSet<Integer>();

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.tag.clear();
        this.tah.clear();
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            zo_2 zo_22 = zo_2.cF(byArray);
            this.tag.addAll(zo_22.aAx());
            this.tah.addAll(zo_22.aAz());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            taf.error((Object)("[TUTORIAL] Failed to parse tutorial account data for account " + l), (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        byte[] byArray = zo_2.aAC().ay(this.tag).az(this.tah).aAJ().toByteArray();
        azg_1 azg_12 = new azg_1(4 + byArray.length);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owD;
    }

    @Generated
    public Set<Integer> gkw() {
        return this.tag;
    }

    @Generated
    public Set<Integer> gkx() {
        return this.tah;
    }
}

