/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from feK
 */
public final class fek_0 {
    private static final Logger seM = Logger.getLogger(fek_0.class);

    public static void a(feh_0 feh_02, byte[] byArray, long l) {
        lo_1 lo_12;
        feh_02.clear();
        try {
            lo_12 = lo_1.bR(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            seM.error((Object)("[TempInv] Could not parse temporary inventory of " + l + " from data " + BH.de(byArray)), (Throwable)invalidProtocolBufferException);
            return;
        }
        List<kW> list = lo_12.ot();
        for (kW kW2 : list) {
            feh_02.cf(fga_0.w(kW2));
        }
    }

    public static byte[] a(feh_0 feh_02) {
        lq_0 lq_02 = lo_1.aiM();
        for (short s = 0; s < feh_02.fUH(); s = (short)(s + 1)) {
            ffV ffV2 = feh_02.eO(s);
            if (ffV2 == null) continue;
            lq_02.f(fga_0.cK(ffV2));
        }
        return lq_02.aiT().toByteArray();
    }
}

