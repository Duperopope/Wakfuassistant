/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.awt.AWTTextureIO
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from axE
 */
public class axe_1
extends axc_1 {
    private static final Logger dqx = Logger.getLogger(axe_1.class);

    @Override
    public axc_2 gM(String string) {
        BufferedImage bufferedImage = null;
        try {
            InputStream inputStream = fo_0.bz(string);
            bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
        }
        catch (IOException iOException) {
            dqx.error((Object)("Exception during loadImage(" + string + ")"), (Throwable)iOException);
        }
        if (bufferedImage == null) {
            return null;
        }
        return axc_2.a(bufferedImage);
    }

    private static axc_2 gX(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        TextureData textureData = AWTTextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (BufferedImage)bufferedImage, (int)6407, (int)6407, (boolean)false);
        Buffer buffer = textureData.getBuffer();
        axj_2 axj_22 = new axj_2(textureData.getWidth(), textureData.getHeight(), 24, null, (ByteBuffer)buffer);
        axj_22.aC((byte)1);
        axc_2.c(axj_22.aKU(), axj_22.bQI());
        axc_2 axc_22 = new axc_2(ayl_2.dtY, axj_22);
        axj_22.bsI();
        return axc_22;
    }

    @Override
    protected axc_2 v(apl_1 apl_12) {
        try {
            apl_12.a(ByteOrder.BIG_ENDIAN);
            return axe_1.gX(new app_1(apl_12));
        }
        catch (IOException iOException) {
            dqx.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        apl_12.a(ByteOrder.BIG_ENDIAN);
        byte by = apl_12.aIy();
        byte by2 = apl_12.aIy();
        if (by != -1 || by2 != -40) {
            return new acc_1(0, 0);
        }
        while (true) {
            short s;
            int n = 0;
            byte by3 = apl_12.aIy();
            while (by3 != -1) {
                ++n;
                by3 = apl_12.aIy();
            }
            while ((by3 = apl_12.aIy()) == -1) {
            }
            if (n != 0) {
                return new acc_1(0, 0);
            }
            switch (by3) {
                case -64: 
                case -63: 
                case -62: 
                case -61: 
                case -59: 
                case -58: 
                case -57: 
                case -55: 
                case -54: 
                case -53: 
                case -51: 
                case -50: 
                case -49: {
                    apl_12.tv(3);
                    s = apl_12.aIz();
                    short s2 = apl_12.aIz();
                    return new acc_1(s2, s);
                }
                case -39: 
                case -38: {
                    return new acc_1(0, 0);
                }
            }
            s = apl_12.aIz();
            if (s < 2) {
                return new acc_1(0, 0);
            }
            apl_12.tv(s - 2);
        }
    }

    @Override
    protected int bQU() {
        return Integer.MAX_VALUE;
    }
}

