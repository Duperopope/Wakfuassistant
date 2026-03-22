/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFi
 */
public final class bfi_1
extends bfc_1 {
    private static final Logger jTa = Logger.getLogger(bfi_1.class);
    private long duS;

    bfi_1(int n) {
        super(n);
    }

    @Override
    public void v(String ... stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        fqo_0 fqo_02 = fqn_0.e(ffV2.LV(), bgt_02);
        if (fqo_02.gia() == fqp_0.sSM) {
            jTa.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        cvo_2.eUK().a(new bgj_2(this, fqo_02.getItem()));
        return true;
    }

    public void z(long l, long l2) {
        this.duS = l2;
        this.jU(l);
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putLong(this.duS);
        return true;
    }

    @Override
    public int DN() {
        return 8;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skW;
    }

    public static String a(fhq_0 fhq_02) {
        return switch (fhq_02) {
            default -> throw new MatchException(null, null);
            case fhq_0.sqk -> "sublimation.confirmation";
            case fhq_0.sqt -> "sublimation.confirmation.withWarning";
            case fhq_0.sqp -> "error.sublimation.unshardedItem";
            case fhq_0.sqn -> "error.sublimation.stackedItem";
            case fhq_0.sqm -> "error.sublimation.badItem";
            case fhq_0.sqq -> "error.sublimation.noMatch";
            case fhq_0.sqs -> "error.sublimation.sublimatedWithSameItem";
            case fhq_0.sqr, fhq_0.sql, fhq_0.sqo -> "error.sublimation.badSublimationItem";
            case fhq_0.squ -> "error.sublimation.noMatchRarity";
            case fhq_0.sqv -> "error.sublimation.itemWithOldRune";
        };
    }
}

