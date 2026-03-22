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
 * Renamed from cen
 */
public class cen_0
implements aaq_2<cxz> {
    private static final Logger lSe = Logger.getLogger(cen_0.class);

    @Override
    public boolean a(cxz cxz2) {
        if (!fyw_0.gqw().to("dungeonDialog")) {
            return false;
        }
        byte[] byArray = cxz2.aKU();
        byte[] byArray2 = cxz2.eER();
        bnw_0 bnw_02 = cua_2.eRq().eRr();
        if (bnw_02.dzR() != eMN.qNy) {
            bnw_02.a(eMN.qNy);
        }
        try {
            ht_1 ht_12 = ht_1.aP(byArray2);
            bnw_02.d(ht_12);
            ht_1 ht_13 = ht_1.aP(byArray);
            bnw_02.e(ht_13);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lSe.error((Object)("[Ladder] Could not parse guild ranking infos of dungeon ladder: data=" + BH.de(byArray) + ", accountData=" + BH.de(byArray2)), (Throwable)invalidProtocolBufferException);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 14543;
    }
}

