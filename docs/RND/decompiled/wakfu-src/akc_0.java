/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from aKC
 */
public class akc_0
extends ake_0
implements aKs {
    private static final String eeR = "MovementInformationRangeEffect";
    private static final String eeS = "MovementInformationWhenLocked";
    private static final st_0 eeT = new st_0();
    private static final wz_0 eeU = new wz_0();
    private final ewd_2 eeV = new ewd_2();

    public akc_0() {
        super(eeR, aid_0.dUR, null, null, null, null, eeS, aid_0.dUS, null, null, null, null);
        akc_0.eeT.bqN = 100;
    }

    public boolean j(bgy bgy2) {
        if (bgy2 != null && !bgy2.dlw() && !bgy2.i(exe_1.rEu)) {
            this.k(bgy2);
            aKr aKr2 = bgy2.dlt();
            if (aKr2 != null) {
                aKr2.a(bgy2, this.eeY, this.efa, this.eeZ);
            }
            return true;
        }
        return false;
    }

    @Override
    protected akf_0 a(acd_1 acd_12, bgy bgy2) {
        Object object;
        int n;
        if (bgy2 == null) {
            return akf_0.efi;
        }
        acd_1 acd_13 = bgy2.aZw();
        if (bgy2.a(exe_1.rEh) && (bgy2 = bgy2.djY()) == null) {
            return akf_0.efi;
        }
        if (bgy2.a(exe_1.rDe) || bgy2.a(exe_1.rEJ)) {
            return akf_0.efi;
        }
        int n2 = bgy2.c((pt_0)exx_2.rGk);
        if (bgy2.a(exe_1.rDK)) {
            n2 /= 2;
        }
        if (bgy2.a(exe_1.rDJ)) {
            n2 /= 2;
        }
        if ((n = Math.abs(acd_13.getX() - acd_12.getX()) + Math.abs(acd_13.getY() - acd_12.getY())) > n2) {
            return akf_0.efi;
        }
        sr_0 sr_02 = sr_0.bgd();
        if (sr_02 != null) {
            akc_0.eeT.bqO = n2;
            wa_0.a(acd_13.getX(), acd_13.getY(), acd_12.getX(), acd_12.getY(), eeU);
            object = bgy2.ddI();
            sr_02.m(acd_12);
            sr_02.l(acd_13);
            sr_02.a((int)((bdj_2)object).aKu(), ((bdj_2)object).bcO(), ((bdj_2)object).bvy());
            sr_02.a(eeT);
            sr_02.b(eeU);
            int n3 = sr_02.bgj();
            sr_02.aZp();
            if (n3 == -1) {
                return akf_0.efi;
            }
        }
        this.eeV.a(bgy2);
        object = bgy2.dkZ();
        Collection collection = ((ety_0)object).aJ(bgy2);
        int n4 = this.eeV.a(collection, acd_13).fNL();
        if (n2 - n4 < n) {
            return akf_0.efh;
        }
        int n5 = this.eeV.a(collection, acd_12).fNL();
        if (n5 > 0) {
            return akf_0.efh;
        }
        if (Math.abs(acd_13.bdi() - acd_12.bdi()) > bgy2.bvy()) {
            return akf_0.efe;
        }
        return akf_0.efe;
    }

    @Override
    public void aPc() {
    }
}

