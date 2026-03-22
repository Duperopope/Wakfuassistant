/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from axH
 */
public class axh_1
extends axc_1 {
    private static final Logger dqA = Logger.getLogger(axh_1.class);

    @Override
    @Nullable
    protected axc_2 v(apl_1 apl_12) {
        try {
            axw_2 axw_22 = new axw_2();
            axw_22.u(apl_12);
            axk_2 axk_22 = null;
            if (axw_22.dpZ != 0) {
                if (axw_22.dqb != 4 && axw_22.dqb != 8) {
                    var4_5 = axw_22.dqa + 7 >> 3;
                    int n = axw_22.dpZ * var4_5;
                    apl_12.tv(n);
                } else {
                    axk_22 = new axk_2(axw_22.dpZ);
                    for (var4_5 = 0; var4_5 < axw_22.dpZ; ++var4_5) {
                        byte by = apl_12.aIy();
                        byte by2 = apl_12.aIy();
                        byte by3 = apl_12.aIy();
                        axk_22.a(new awx_2(-1, (int)by3, (int)by2, (int)by));
                    }
                }
            }
            byte[] byArray = this.b(apl_12, axw_22.aAv, axw_22.aAw, axw_22.dqb);
            apl_12.close();
            return axh_1.a(axw_22, axk_22, byArray);
        }
        catch (IOException iOException) {
            dqA.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    private static axc_2 a(axw_2 axw_22, axk_2 axk_22, byte[] byArray) {
        axj_2 axj_22 = new axj_2(axw_22.aAv, axw_22.aAw, axw_22.doY, axw_22.doZ, axw_22.dqb, axk_22, byArray);
        axc_2 axc_22 = new axc_2(ayl_2.dtU, axj_22);
        byte by = axj_22.bQI() >= 32 ? (byte)18 : 2;
        axj_22.aC(by);
        axj_22.bsI();
        return axc_22;
    }

    @Override
    protected int bQU() {
        return 18;
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        axw_2 axw_22 = new axw_2();
        axw_22.u(apl_12);
        return new acc_1(axw_22.aAv, axw_22.aAw);
    }
}

