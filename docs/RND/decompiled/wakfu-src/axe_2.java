/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.TextureIO
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import org.apache.log4j.Logger;

/*
 * Renamed from axe
 */
public class axe_2 {
    protected static final Logger doN = Logger.getLogger(axe_2.class);

    public static BufferedImage a(BufferedImage bufferedImage, int n) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth() + n * 2, bufferedImage.getHeight() + n * 2, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, n, n, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static void e(BufferedImage bufferedImage) {
        if (bufferedImage != null) {
            for (int i = 0; i < bufferedImage.getHeight(); ++i) {
                int n = i + bufferedImage.getMinY();
                for (int j = 0; j < bufferedImage.getWidth(); ++j) {
                    int n2 = j + bufferedImage.getMinX();
                    int n3 = bufferedImage.getRGB(n2, n);
                    float f2 = (float)(n3 >> 24 & 0xFF) / 255.0f;
                    if (f2 == 0.0f) continue;
                    float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                    float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                    float f5 = (float)(n3 & 0xFF) / 255.0f;
                    f3 = f3 / f2 < 1.0f ? f3 / f2 : 1.0f;
                    f4 = f4 / f2 < 1.0f ? f4 / f2 : 1.0f;
                    f5 = f5 / f2 < 1.0f ? f5 / f2 : 1.0f;
                    n3 = (int)(f2 * 255.0f) << 24 | (int)(f3 * 255.0f) << 16 | (int)(f4 * 255.0f) << 8 | (int)(f5 * 255.0f);
                    bufferedImage.setRGB(n2, n, n3);
                }
            }
        }
    }

    public static void f(BufferedImage bufferedImage) {
        if (bufferedImage != null) {
            for (int i = 0; i < bufferedImage.getHeight(); ++i) {
                int n = i + bufferedImage.getMinY();
                for (int j = 0; j < bufferedImage.getWidth(); ++j) {
                    int n2 = j + bufferedImage.getMinX();
                    int n3 = bufferedImage.getRGB(n2, n);
                    float f2 = (float)(n3 >> 24 & 0xFF) / 255.0f;
                    float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f * f2;
                    float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f * f2;
                    float f5 = (float)(n3 & 0xFF) / 255.0f * f2;
                    bufferedImage.setRGB(n2, n, (int)(f2 * 255.0f) << 24 | (int)(f3 * 255.0f) << 16 | (int)(f4 * 255.0f) << 8 | (int)(f5 * 255.0f));
                }
            }
        }
    }

    public static BufferedImage g(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage h(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 3);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage gW(InputStream inputStream) {
        try {
            TextureData textureData = TextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (InputStream)inputStream, (boolean)false, (String)"tga");
            int n = textureData.getHeight();
            int n2 = textureData.getWidth();
            int n3 = 4 * n2;
            ByteBuffer byteBuffer = ByteBuffer.allocate(n3 * n);
            ByteBuffer byteBuffer2 = (ByteBuffer)textureData.getBuffer();
            byte[] byArray = new byte[n2 * 4];
            int n4 = n3 * n;
            for (int i = 0; i < n; ++i) {
                byteBuffer2.get(byArray);
                byteBuffer.position(n4 -= n3);
                byteBuffer.put(byArray);
            }
            byteBuffer.rewind();
            return axe_2.a(n2, n, byteBuffer.array(), axf_2.doQ);
        }
        catch (IOException iOException) {
            doN.error((Object)"IOException during fromTga", (Throwable)iOException);
            return null;
        }
    }

    public static BufferedImage gJ(String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream(string);
            return axe_2.gW(fileInputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            doN.error((Object)("FileNotFoundException during fromTga(" + string + ")"), (Throwable)fileNotFoundException);
            return null;
        }
    }

    public static BufferedImage b(BufferedImage bufferedImage, boolean bl) {
        if (bufferedImage == null) {
            return null;
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        bufferedImage2.getGraphics().drawImage(bufferedImage, 0, 0, n, n2, 0, 0, n, n2, null);
        if (bl) {
            AffineTransform affineTransform = AffineTransform.getScaleInstance(1.0, -1.0);
            affineTransform.translate(0.0, -bufferedImage.getHeight(null));
            AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, 1);
            bufferedImage2 = affineTransformOp.filter(bufferedImage2, null);
        }
        return bufferedImage2;
    }

    public static aci_1 b(BufferedImage bufferedImage, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = bufferedImage.getWidth();
        int n7 = n5 = bufferedImage.getHeight();
        int n8 = -1;
        int n9 = n6;
        int n10 = -1;
        block0: for (n4 = 0; n4 < n5; ++n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = (bufferedImage.getRGB(n3, n4) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n8 = n4;
                break block0;
            }
        }
        block2: for (n4 = n5 - 1; n4 >= 0; --n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = (bufferedImage.getRGB(n3, n4) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n7 = n4;
                break block2;
            }
        }
        block4: for (n4 = 0; n4 < n6; ++n4) {
            for (n3 = 0; n3 < n5; ++n3) {
                n2 = (bufferedImage.getRGB(n4, n3) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n10 = n4;
                break block4;
            }
        }
        block6: for (n4 = n6 - 1; n4 >= 0; --n4) {
            for (n3 = 0; n3 < n5; ++n3) {
                n2 = (bufferedImage.getRGB(n4, n3) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n9 = n4;
                break block6;
            }
        }
        if (n10 == -1 || n8 == -1) {
            return new aci_1(0, 0, 0, 0);
        }
        return new aci_1(n10, n9, n8, n7);
    }

    public static BufferedImage a(int n, int n2, byte[] byArray, axf_2 axf_22) {
        return axe_2.a(n, n2, byArray, axf_22, false);
    }

    public static BufferedImage a(int n, int n2, byte[] byArray, axf_2 axf_22, boolean bl) {
        if (n == 0 || n2 == 0) {
            return null;
        }
        DataBufferByte dataBufferByte = new DataBufferByte(byArray, n * n2);
        int n3 = 4;
        int n4 = 4 * n;
        WritableRaster writableRaster = Raster.createInterleavedRaster(dataBufferByte, n, n2, n4, 4, axf_22.bQC(), null);
        ColorSpace colorSpace = ColorSpace.getInstance(1000);
        boolean bl2 = true;
        int n5 = 3;
        boolean bl3 = false;
        ComponentColorModel componentColorModel = new ComponentColorModel(colorSpace, true, bl, 3, 0);
        return new BufferedImage(componentColorModel, writableRaster, bl, null);
    }

    public static void a(BufferedImage bufferedImage, OutputStream outputStream, float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        Iterator<ImageWriter> iterator = ImageIO.getImageWritersByFormatName("jpeg");
        ImageWriter imageWriter = iterator.next();
        ImageWriteParam imageWriteParam = imageWriter.getDefaultWriteParam();
        imageWriteParam.setCompressionMode(2);
        imageWriteParam.setCompressionQuality(f2);
        imageWriter.setOutput(new MemoryCacheImageOutputStream(outputStream));
        imageWriter.write(null, new IIOImage(bufferedImage, null, null), imageWriteParam);
        imageWriter.dispose();
    }

    public static void a(BufferedImage bufferedImage, String string) {
        ComponentColorModel componentColorModel = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 8}, true, true, 3, 0);
        WritableRaster writableRaster = ((ColorModel)componentColorModel).createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight());
        BufferedImage bufferedImage2 = new BufferedImage(componentColorModel, writableRaster, bufferedImage.isAlphaPremultiplied(), null);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        DataBufferByte dataBufferByte = (DataBufferByte)bufferedImage2.getRaster().getDataBuffer();
        ByteBuffer byteBuffer = ByteBuffer.wrap(dataBufferByte.getData());
        axj_2 axj_22 = new axj_2(bufferedImage.getWidth(), bufferedImage.getHeight(), 32, null, byteBuffer);
        axi_1 axi_12 = new axi_1();
        axj_22.vh(0);
        axc_2.c(axj_22.aKU(), axj_22.bQI());
        axc_2.d(axj_22.aKU(), axj_22.getWidth() * 4);
        FileOutputStream fileOutputStream = fq_0.bO(string);
        fs_0 fs_02 = new fs_0(fileOutputStream);
        axi_12.a(fs_02, new axc_2(ayl_2.dtU, axj_22));
        axj_22.bsI();
        fs_02.close();
    }
}

