/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from axF
 */
public class axf_1
extends axc_1 {
    private static final Logger dqy = Logger.getLogger(axf_1.class);
    private static final short dqz = 32;

    @Override
    public axc_2 gM(String string) {
        try {
            InputStream inputStream = fo_0.bz(string);
            axc_2 axc_22 = axf_1.gX(inputStream);
            inputStream.close();
            return axc_22;
        }
        catch (IOException iOException) {
            dqy.error((Object)("IOException during loadImage(" + string + ")"), (Throwable)iOException);
            return null;
        }
    }

    private static axc_2 gX(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        byte[] byArray = axc_2.b(bufferedImage);
        axj_2 axj_22 = new axj_2(bufferedImage.getWidth(), bufferedImage.getHeight(), 32, null, ByteBuffer.wrap(byArray));
        axj_22.vh(1);
        axc_2 axc_22 = new axc_2(ayl_2.dtW, axj_22);
        axj_22.bsI();
        return axc_22;
    }

    @Override
    protected axc_2 v(apl_1 apl_12) {
        try {
            apl_12.a(ByteOrder.BIG_ENDIAN);
            return axf_1.gX(new app_1(apl_12));
        }
        catch (IOException iOException) {
            dqy.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        apl_12.a(ByteOrder.BIG_ENDIAN);
        byte[] byArray = new byte[8];
        apl_12.dx(byArray);
        if (!axf_1.dF(byArray)) {
            return null;
        }
        apl_12.tv(8);
        return new acc_1(apl_12.aIA(), apl_12.aIA());
    }

    private static boolean dF(byte[] byArray) {
        return byArray[0] == -119 && byArray[1] == 80 && byArray[2] == 78 && byArray[3] == 71 && byArray[4] == 13 && byArray[5] == 10 && byArray[6] == 26 && byArray[7] == 10;
    }

    @Override
    protected int bQU() {
        return 24;
    }
}

