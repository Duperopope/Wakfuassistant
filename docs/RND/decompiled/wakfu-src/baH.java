/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class baH
extends euF {
    final /* synthetic */ bag_0 hzd;

    baH(bag_0 bag_02) {
        this.hzd = bag_02;
    }

    @Override
    public void a(euN euN2) {
        Object object;
        baf_0.hyY.info((Object)(String.valueOf(euN.class) + " fetched"));
        if (euN2.Sn() != 0L) {
            object = new bsy_1(euN2.Sn());
            ((bsg_1)this.hzd.hzc.hza.bmH()).a((bsy_1)object);
            try {
                ((aeb_1)object).buq();
            }
            catch (IOException iOException) {
                baf_0.hyY.warn((Object)("Error occurred on load of " + String.valueOf(object.getClass())), (Throwable)iOException);
            }
        } else {
            baf_0.hyY.warn((Object)(String.valueOf(euN.class) + " specify a null account"));
        }
        object = euN2.fdp();
        if (!BH.aU((String)object)) {
            fse_1.gFu().f("zaap.account.nicknameWithTag", object);
        } else {
            baf_0.hyY.warn((Object)(String.valueOf(euN.class) + " specify a null/empty nickname"));
        }
        this.hzd.hzc.hza.b(this.hzd.hzb);
    }

    @Override
    public void kW(String string) {
        baf_0.hyY.warn((Object)("Error during retrieval of " + String.valueOf(euN.class) + " connection(" + string + ")"));
        this.hzd.hzc.hza.b(this.hzd.hzb);
    }
}

