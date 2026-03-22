/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from faI
 */
public final class fai_0 {
    private fai_0() {
    }

    public static byte[] aV(List<faz_0> list) {
        kc_2 kc_22 = fai_0.aW(list);
        return kc_22.aci().toByteArray();
    }

    public static ka_2 fP(ByteBuffer byteBuffer) {
        ka_2 ka_22;
        try {
            ka_22 = ka_2.bB(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize haven world list from protobuf.", invalidProtocolBufferException);
        }
        return ka_22;
    }

    private static kc_2 aW(List<faz_0> list) {
        kc_2 kc_22 = ka_2.acc();
        for (faz_0 faz_02 : list) {
            kc_22.a(fai_0.e(faz_02));
        }
        return kc_22;
    }

    private static kz_2 e(faz_0 faz_02) {
        kz_2 kz_22 = kx_2.abL();
        faa_0 faa_02 = faz_02.eqJ();
        if (faa_02 != null) {
            kz_22.aS(faa_02.Ya());
            kz_22.aT(faa_02.HP());
            kz_22.P(faa_02.HR());
        }
        return kz_22;
    }
}

