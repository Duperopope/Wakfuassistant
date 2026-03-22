/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;

public class aKu
extends ake_0
implements aKs {
    private static final String ees = "AreaZoneEffect";
    private static final String eet = "AreaZoneAdditionalEffect";
    private static final aKu eeu = new aKu();

    public static aKu ciN() {
        return eeu;
    }

    private aKu() {
        super(null, null, ees, aid_0.dUU, eet, aid_0.dUV, null, null, null, null, null, null);
    }

    public void a(eSS eSS2, bgy bgy2) {
        this.b(Collections.singletonList(eSS2), bgy2, new acd_1(eSS2.bcC(), eSS2.bcD(), eSS2.bcE()));
    }

    public void a(eSS eSS2, bgy bgy2, acd_1 acd_12) {
        this.b(Collections.singletonList(eSS2), bgy2, acd_12);
    }

    @Override
    protected akf_0 a(acd_1 acd_12, bgy bgy2) {
        return akf_0.efi;
    }

    @Override
    public void aPc() {
    }
}

