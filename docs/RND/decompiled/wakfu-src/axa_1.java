/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from axA
 */
public class axa_1
extends axc_1 {
    private static final Logger dqq = Logger.getLogger(axa_1.class);

    @Override
    protected axc_2 v(apl_1 apl_12) {
        try {
            int n;
            apl_12.tv(4);
            short s = apl_12.aIz();
            short s2 = apl_12.aIz();
            int n2 = apl_12.aIA();
            int n3 = apl_12.aIA();
            int n4 = apl_12.aIA();
            axs_2 axs_22 = new axs_2();
            axs_22.t(apl_12);
            ayl_2 ayl_22 = new ayl_2(axs_22.dpE.dpH);
            if (ayl_22.bLb() == ayl_2.gR("DXT1")) {
                n = 8;
            } else if (ayl_22.bLb() == ayl_2.gR("DXT2") || ayl_22.bLb() == ayl_2.gR("DXT3") || ayl_22.bLb() == ayl_2.gR("DXT4") || ayl_22.bLb() == ayl_2.gR("DXT5")) {
                n = 16;
            } else {
                dqq.error((Object)("Unsupported format " + ayl_22.toString()));
                return null;
            }
            assert (axs_22.dpC == 1) : "DDSM file can't have mipmaps";
            int n5 = axs_22.brs;
            int n6 = axs_22.brt;
            int n7 = (n5 + 3) / 4 * ((n6 + 3) / 4) * n;
            byte[] byArray = new byte[n7];
            apl_12.dx(byArray);
            axj_2 axj_22 = new axj_2((int)s, (int)s2, 32, null, byArray);
            byte[] byArray2 = new byte[n3];
            apl_12.dx(byArray2);
            axj_22.a(byArray2, (byte)1);
            axc_2 axc_22 = new axc_2(ayl_22, axj_22);
            axj_22.bsI();
            return axc_22;
        }
        catch (IOException iOException) {
            dqq.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        apl_12.tv(4);
        return new acc_1(apl_12.aIz(), apl_12.aIz());
    }

    @Override
    protected int bQU() {
        return 8;
    }
}

