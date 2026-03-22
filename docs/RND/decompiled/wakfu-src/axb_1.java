/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from axB
 */
public class axb_1
extends axc_1 {
    private static final Logger dqs = Logger.getLogger(axb_1.class);

    @Override
    protected axc_2 v(apl_1 apl_12) {
        try {
            int n;
            apl_12.tv(4);
            axs_2 axs_22 = new axs_2();
            axs_22.t(apl_12);
            ayl_2 ayl_22 = new ayl_2(axs_22.dpE.dpH);
            if (ayl_22.bLb() == ayl_2.gR("DXT1")) {
                n = 8;
            } else if (ayl_22.bLb() == ayl_2.gR("DXT2") || ayl_22.bLb() == ayl_2.gR("DXT3") || ayl_22.bLb() == ayl_2.gR("DXT4") || ayl_22.bLb() == ayl_2.gR("DXT5")) {
                n = 16;
            } else {
                dqs.error((Object)("Unsupported format " + ayl_22.toString()));
                return null;
            }
            axj_2[] axj_2Array = new axj_2[axs_22.dpC];
            int n2 = axs_22.brs;
            int n3 = axs_22.brt;
            for (int i = 0; i < axs_22.dpC; ++i) {
                int n4 = (n2 + 3) / 4 * ((n3 + 3) / 4) * n;
                byte[] byArray = new byte[n4];
                apl_12.dx(byArray);
                axj_2Array[i] = new axj_2(n2, n3, 32, null, byArray);
                n3 /= 2;
                if ((n2 /= 2) == 0) {
                    n2 = 1;
                }
                if (n3 != 0) continue;
                n3 = 1;
            }
            axc_2 axc_22 = new axc_2(ayl_22, axj_2Array);
            for (axj_2 axj_22 : axj_2Array) {
                axj_22.bsI();
            }
            return axc_22;
        }
        catch (IOException iOException) {
            dqs.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        apl_12.tv(4);
        axs_2 axs_22 = new axs_2();
        axs_22.t(apl_12);
        return new acc_1(axs_22.brs, axs_22.brt);
    }

    @Override
    protected int bQU() {
        return 128;
    }
}

