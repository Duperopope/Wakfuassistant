/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.log4j.Logger;

/*
 * Renamed from cem
 */
public class cem_0
implements aaq_2<cxy> {
    private static final Logger lSd = Logger.getLogger(cem_0.class);

    @Override
    public boolean a(cxy cxy2) {
        if (!fyw_0.gqw().to("dungeonDialog")) {
            return false;
        }
        byte[] byArray = cxy2.aKU();
        byte[] byArray2 = cxy2.eER();
        bnw_0 bnw_02 = cua_2.eRq().eRr();
        if (bnw_02.dzR() != eMN.qNx) {
            bnw_02.a(eMN.qNx);
        }
        try {
            ht_1 ht_12 = ht_1.aP(byArray2);
            bnw_02.d(ht_12);
            ht_1 ht_13 = ht_1.aP(byArray);
            bnw_02.e(ht_13);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lSd.error((Object)"Error parsing ladder result", (Throwable)invalidProtocolBufferException);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 14310;
    }
}

