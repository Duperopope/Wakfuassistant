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
 * Renamed from cep
 */
public class cep_0
implements aaq_2<cxB> {
    private static final Logger lSg = Logger.getLogger(cep_0.class);

    @Override
    public boolean a(cxB cxB2) {
        int n = cxB2.eES();
        dcd dcd2 = new dcd(aum_0.cWf().c("dungeon.ladder.ranking.title", new Object[0]), aum_0.cWf().c("dungeon.ladder.ranking.text", n + 1), biu_1.kiB);
        aaw_1.bUq().h(dcd2);
        try {
            cep_0.b(cxB2);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lSg.error((Object)("[Ladder] Could not parse " + BH.de(cxB2.aKU()) + " into a TeamInfo object"), (Throwable)invalidProtocolBufferException);
        }
        return false;
    }

    private static void b(cxB cxB2) {
        hy_1 hy_12 = hy_1.aQ(cxB2.aKU());
        for (Long l : hy_12.Jc().Hx().keySet()) {
            if (!fcL.rUh.sv(l)) continue;
            bob_0.dAs().z(l, hy_12.IO());
        }
    }

    @Override
    public int bkq() {
        return 14801;
    }
}

