/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHU
 */
public final class bhu_1
extends bhy_2 {
    public static final String kcT = "isSeller";
    public static final String kcU = "remainingDuration";
    public static final String kcV = "sellerNameWithLanguages";
    private final mc kcW;
    private final ffV kcX;
    private final uz_0 kcY;

    public bhu_1(mc mc2, long l) {
        this.kcW = mc2;
        this.kcY = bhu_1.B(mc2.akh(), l);
        this.kcX = fga_0.w(mc2.aaA().aem().gY(1).aer());
    }

    @NotNull
    static uz_0 B(long l, long l2) {
        long l3 = l - l2;
        return new uz_0(l3 / 1000L);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isSeller": {
                return bbs_2.xl() == this.kcW.ajW().xl();
            }
            case "remainingDuration": {
                return bhu_1.a(this.kcY);
            }
            case "sellerNameWithLanguages": {
                mo_0 mo_02 = this.kcW.ajW();
                return bsb_1.a(((bsg_1)aie_0.cfn().bmH()).enc(), mo_02.getName(), vb_0.pS(mo_02.alq()), Mv.A((byte)mo_02.alp()));
            }
        }
        return super.eu(string);
    }

    @Nullable
    static String a(uz_0 uz_02) {
        if (uz_02.bjR() > 0) {
            return aum_0.cWf().c("remainingDurationShortMonthDayHour", 0, uz_02.bjR(), uz_02.bjE());
        }
        if (uz_02.bjE() > 0) {
            return aum_0.cWf().c("remainingDurationShortMonthDayHour", 0, 0, uz_02.bjE());
        }
        if (uz_02.bjF() > 0) {
            return aum_0.cWf().c("remainingDurationMinutes", uz_02.bjF());
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])new String[]{kcT, kcU, kcV});
    }

    @Override
    public long Lx() {
        return this.kcW.Lx();
    }

    @Override
    public long akd() {
        return this.kcW.akd();
    }

    @Override
    public int oP() {
        return this.kcW.akb();
    }

    @Generated
    public mc dXb() {
        return this.kcW;
    }

    @Override
    @Generated
    public ffV getItem() {
        return this.kcX;
    }

    @Generated
    public uz_0 dXc() {
        return this.kcY;
    }
}

