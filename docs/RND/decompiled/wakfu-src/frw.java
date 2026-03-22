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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import lombok.Generated;
import org.apache.log4j.Logger;

public class frw
implements evv_2 {
    private static final Logger sYv = Logger.getLogger(frw.class);
    private final Set<Integer> sYw = new HashSet<Integer>();
    private final Set<Integer> sYx = new HashSet<Integer>();

    public Set<Integer> b(zd_2 zd_22) {
        switch (zd_22) {
            case aoC: {
                return this.sYx;
            }
            case aoD: {
                return this.sYw;
            }
        }
        return Collections.emptySet();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.sYw.clear();
        this.sYx.clear();
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            zf_2 zf_22 = zf_2.cD(byArray);
            zf_22.azN().forEach(this::e);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sYv.error((Object)("[TRANSPORT] Failed to parse transports for account " + l));
        }
    }

    @Override
    public byte[] fej() {
        zj_1 zj_12 = zj_1.aAk().a(zd_2.aoC).ax(this.sYx).aAq();
        zj_1 zj_13 = zj_1.aAk().a(zd_2.aoD).ax(this.sYw).aAq();
        zf_2 zf_22 = zf_2.azR().a(zj_13).a(zj_12).azX();
        byte[] byArray = zf_22.toByteArray();
        azg_1 azg_12 = new azg_1(4 + byArray.length);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    public void e(zj_1 zj_12) {
        switch (zj_12.aAg()) {
            case aoC: {
                this.sYx.addAll(zj_12.aAh());
                break;
            }
            case aoD: {
                this.sYw.addAll(zj_12.aAh());
                break;
            }
            default: {
                sYv.info((Object)("[TRANSPORT] Unknown travel type " + String.valueOf((Object)zj_12.aAg())));
            }
        }
    }

    @Override
    public eva_1 fek() {
        return eva_1.owC;
    }

    @Generated
    public Set<Integer> gkf() {
        return this.sYw;
    }

    @Generated
    public Set<Integer> gkg() {
        return this.sYx;
    }
}

