/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from fSS
 */
public class fss_1 {
    protected static final Logger veZ = Logger.getLogger(fss_1.class);

    public void aPg() {
    }

    public void gGz() {
        int n;
        int n2;
        int n3 = 512;
        int n4 = 512;
        Character.UnicodeBlock[] unicodeBlockArray = new Character.UnicodeBlock[]{Character.UnicodeBlock.BASIC_LATIN, Character.UnicodeBlock.GENERAL_PUNCTUATION, Character.UnicodeBlock.LATIN_1_SUPPLEMENT, Character.UnicodeBlock.LATIN_EXTENDED_A, Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL, Character.UnicodeBlock.LATIN_EXTENDED_B};
        BufferedImage bufferedImage = new BufferedImage(512, 512, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = Font.decode("verdana-plain-12");
        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
        graphics2D.setFont(font);
        graphics2D.setBackground(Color.BLACK);
        graphics2D.clearRect(0, 0, 512, 512);
        int n5 = 0;
        boolean bl = false;
        char[] cArray = new char[65535];
        int n6 = 0;
        for (n2 = 0; n2 < 65535; n2 = (char)(n2 + '\u0001')) {
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of((char)n2);
            for (int i = 0; i < unicodeBlockArray.length; ++i) {
                if (unicodeBlockArray[i] != unicodeBlock) continue;
                int n7 = n6;
                n6 = n6 + '\u0001';
                cArray[n7] = n2;
            }
        }
        boolean bl2 = false;
        for (n2 = 0; n2 < n6; n2 += n) {
            GlyphVector glyphVector;
            Rectangle rectangle = null;
            n = 0;
            bl2 = !bl2;
            do {
                glyphVector = font.createGlyphVector(fontRenderContext, String.valueOf(cArray, n2, ++n));
                rectangle = glyphVector.getPixelBounds(fontRenderContext, 0.0f, 0.0f);
                ((Rectangle2D)rectangle).setRect(((RectangularShape)rectangle).getX() - 1.0, ((RectangularShape)rectangle).getY() - 1.0, ((RectangularShape)rectangle).getWidth() + 2.0, ((RectangularShape)rectangle).getHeight() + 2.0);
            } while (((RectangularShape)rectangle).getWidth() < 512.0 && n2 + n < n6);
            if (((RectangularShape)rectangle).getWidth() >= 512.0) {
                glyphVector = font.createGlyphVector(fontRenderContext, String.valueOf(cArray, n2, --n));
                rectangle = glyphVector.getPixelBounds(fontRenderContext, 0.0f, 0.0f);
            }
            LineMetrics lineMetrics = font.getLineMetrics(cArray, n2, n2 + n, fontRenderContext);
            float f2 = (float)n5 + lineMetrics.getHeight();
            float f3 = f2 - lineMetrics.getLeading();
            float f4 = f3 - lineMetrics.getDescent();
            graphics2D.setColor(Color.LIGHT_GRAY);
            if (bl2) {
                graphics2D.setColor(Color.BLUE);
            } else {
                graphics2D.setColor(Color.RED);
            }
            graphics2D.setColor(Color.WHITE);
            graphics2D.drawString(String.valueOf(cArray, n2, n), 1.0f, f4 + 1.0f);
            n5 += (int)Math.ceil(((RectangularShape)rectangle).getHeight() + 1.0);
        }
        try {
            ImageIO.write((RenderedImage)bufferedImage, "png", new File("font.png"));
        }
        catch (IOException iOException) {
            veZ.error((Object)"IOException during generateTexture", (Throwable)iOException);
        }
    }

    public static void main(String[] stringArray) {
        fss_1 fss_12 = new fss_1();
        fss_12.gGz();
    }
}

