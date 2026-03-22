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
 * Renamed from ceo
 */
public class ceo_0
implements aaq_2<cxA> {
    private static final Logger lSf = Logger.getLogger(ceo_0.class);

    @Override
    public boolean a(cxA cxA2) {
        if (!fyw_0.gqw().to("dungeonDialog")) {
            return false;
        }
        long l = cxA2.KU();
        byte[] byArray = cxA2.aKU();
        byte[] byArray2 = cxA2.eER();
        bnw_0 bnw_02 = cua_2.eRq().eRr();
        if (bnw_02.dzR() != eMN.qNx) {
            bnw_02.a(eMN.qNx);
        }
        try {
            ht_1 ht_12 = ht_1.aP(byArray2);
            bnw_02.d(ht_12);
            ht_1 ht_13 = ht_1.aP(byArray);
            bnw_02.a(ht_13, l);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lSf.error((Object)("[Ladder] Could not parse player ranking infos of dungeon ladder: data=" + BH.de(byArray) + ", accountData=" + BH.de(byArray2)), (Throwable)invalidProtocolBufferException);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 14939;
    }
}

