/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from axI
 */
public class axi_1 {
    protected static final Logger dqB = Logger.getLogger(axi_1.class);

    public void a(fs_0 fs_02, axc_2 axc_22) {
        axw_2 axw_22 = new axw_2();
        axv_2 axv_22 = new axv_2();
        axj_2 axj_22 = axc_22.ve(0);
        axw_22.dqb = (byte)axj_22.bQI();
        axw_22.aAw = (short)axj_22.getHeight();
        axw_22.aAv = (short)axj_22.getWidth();
        axw_22.dqa = 0;
        axw_22.dpZ = 0;
        axw_22.dpY = 0;
        axw_22.dpW = 0;
        axw_22.doY = 0;
        axw_22.doZ = 0;
        axw_22.dpX = (byte)2;
        axw_22.dqc = 0;
        axw_22.dpV = 0;
        axv_22.dpS = 0;
        axv_22.dpR = 0;
        String string = "TRUEVISION-XFILE";
        byte[] byArray = "TRUEVISION-XFILE".getBytes();
        System.arraycopy(byArray, 0, axv_22.dpT, 0, byArray.length);
        try {
            axw_22.d(fs_02);
            fs_02.di(axj_22.aKU());
            axv_22.d(fs_02);
        }
        catch (IOException iOException) {
            dqB.error((Object)"IOException during ToStream", (Throwable)iOException);
        }
    }
}

