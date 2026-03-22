/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.transaction.SteamTransactionListener
 *  com.ankamagames.steam.wrapper.MicroTxnAuthorizationResponse_t
 *  com.google.common.primitives.UnsignedLong
 */
import com.ankamagames.steam.client.transaction.SteamTransactionListener;
import com.ankamagames.steam.wrapper.MicroTxnAuthorizationResponse_t;
import com.google.common.primitives.UnsignedLong;
import java.math.BigInteger;

class bMY
implements SteamTransactionListener {
    bMY(bMX bMX2) {
    }

    public void onMicroTxnAuthorizationResponse(MicroTxnAuthorizationResponse_t microTxnAuthorizationResponse_t) {
        UnsignedLong unsignedLong = UnsignedLong.valueOf((BigInteger)microTxnAuthorizationResponse_t.getM_ulOrderID());
        long l = unsignedLong.longValue();
        boolean bl = microTxnAuthorizationResponse_t.getM_bAuthorized() != 0;
        cyr_2.eYA().C((int)l, bl);
    }
}

