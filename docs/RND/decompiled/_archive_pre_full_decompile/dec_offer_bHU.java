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

public final class bHU
extends bHY {
    public static final String kcT = "isSeller";
    public static final String kcU = "remainingDuration";
    public static final String kcV = "sellerNameWithLanguages";
    private final mc kcW;
    private final ffV kcX;
    private final Uz kcY;

    public bHU(mc mc2, long l) {
        this.kcW = mc2;
        this.kcY = bHU.B(mc2.akh(), l);
        this.kcX = fgA.w(mc2.aaA().aem().gY(1).aer());
    }

    @NotNull
    static Uz B(long l, long l2) {
        long l3 = l - l2;
        return new Uz(l3 / 1000L);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isSeller": {
                return bbS.xl() == this.kcW.ajW().xl();
            }
            case "remainingDuration": {
                return bHU.a(this.kcY);
            }
            case "sellerNameWithLanguages": {
                mo mo2 = this.kcW.ajW();
                return bSB.a(((bSG)aIe.cfn().bmH()).enc(), mo2.getName(), VB.pS(mo2.alq()), Mv.A((byte)mo2.alp()));
            }
        }
        return super.eu(string);
    }

    @Nullable
    static String a(Uz uz) {
        if (uz.bjR() > 0) {
            return aUM.cWf().c("remainingDurationShortMonthDayHour", 0, uz.bjR(), uz.bjE());
        }
        if (uz.bjE() > 0) {
            return aUM.cWf().c("remainingDurationShortMonthDayHour", 0, 0, uz.bjE());
        }
        if (uz.bjF() > 0) {
            return aUM.cWf().c("remainingDurationMinutes", uz.bjF());
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
    public Uz dXc() {
        return this.kcY;
    }
}
