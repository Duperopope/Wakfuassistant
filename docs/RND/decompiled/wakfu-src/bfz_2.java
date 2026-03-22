/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;

/*
 * Renamed from bfz
 */
final class bfz_2
extends Record
implements aeL {
    private final String hUh;
    private final String hUi;

    bfz_2(String string, String string2) {
        this.hUh = string;
        this.hUi = string2;
    }

    @Override
    public void du(byte[] byArray) {
        try (apl_1 apl_12 = apl_1.a(byArray, ByteOrder.BIG_ENDIAN);
             app_1 app_12 = new app_1(apl_12);){
            BufferedImage bufferedImage = ImageIO.read(app_12);
            if (bufferedImage == null) {
                return;
            }
            try (FileOutputStream fileOutputStream = fq_0.bO(this.hUh + "/" + this.hUi);){
                ImageIO.write((RenderedImage)bufferedImage, "png", fileOutputStream);
                bfy_2.hTZ.info((Object)("Saved image = " + this.hUi));
            }
        }
        catch (IOException iOException) {
            bfy_2.hTZ.error((Object)("Error saving image " + this.hUi), (Throwable)iOException);
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bfz_2.class, "m_exportPath;m_fileName", "hUh", "hUi"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bfz_2.class, "m_exportPath;m_fileName", "hUh", "hUi"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bfz_2.class, "m_exportPath;m_fileName", "hUh", "hUi"}, this, object);
    }

    public String dgJ() {
        return this.hUh;
    }

    public String dgK() {
        return this.hUi;
    }
}

