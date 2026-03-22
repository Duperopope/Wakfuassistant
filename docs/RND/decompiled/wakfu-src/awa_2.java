/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from awa
 */
class awa_2 {
    private final String djv;
    private final awb_2 djw;
    private float djx;
    private GlyphVector djy;
    private Rect djz;
    private boolean djA;
    final /* synthetic */ avu_2 djB;

    public awa_2(avu_2 avu_22, String string, GlyphVector glyphVector, awb_2 awb_22) {
        this.djB = avu_22;
        this.djv = string;
        for (int i = 0; i < glyphVector.getNumGlyphs(); ++i) {
            this.djx += glyphVector.getGlyphMetrics(i).getAdvance();
        }
        this.djy = glyphVector;
        this.djw = awb_22;
    }

    public String bNN() {
        return this.djv;
    }

    public float bNO() {
        return this.djx;
    }

    public float r(float f2, float f3, float f4, float f5) {
        if (this.djz == null) {
            this.bNP();
        }
        try {
            TextureRenderer textureRenderer = this.djB.bNF();
            TextureCoords textureCoords = textureRenderer.getTexture().getImageTexCoords();
            float f6 = textureCoords.right();
            float f7 = textureCoords.bottom();
            Rect rect = this.djz;
            awf_1 awf_12 = (awf_1)rect.getUserData();
            awf_12.bOb();
            Rectangle2D rectangle2D = awf_12.bNZ();
            float f8 = f2 - f5 * (float)(awf_12.bNX() - this.djB.diS.getDeltaX());
            float f9 = f3 - f5 * ((float)rectangle2D.getHeight() - (float)awf_12.bNY() - (float)this.djB.diS.getDeltaY());
            int n = rect.x() + awf_12.bNW().x - awf_12.bNX();
            int n2 = textureRenderer.getHeight() - rect.y() - (int)rectangle2D.getHeight() - (awf_12.bNW().y - awf_12.bNY());
            int n3 = (int)rectangle2D.getWidth();
            int n4 = (int)rectangle2D.getHeight();
            float f10 = f6 * (float)n / (float)textureRenderer.getWidth();
            float f11 = f7 * (1.0f - (float)n2 / (float)textureRenderer.getHeight());
            float f12 = f6 * (float)(n + n3) / (float)textureRenderer.getWidth();
            float f13 = f7 * (1.0f - (float)(n2 + n4) / (float)textureRenderer.getHeight());
            avu_2.djk.a(f8, f9, f10, f11, avu_2.djl);
            avu_2.djk.a(f8 + (float)n3 * f5, f9, f12, f11, avu_2.djl);
            avu_2.djk.a(f8 + (float)n3 * f5, f9 + (float)n4 * f5, f12, f13, avu_2.djl);
            avu_2.djk.a(f8, f9 + (float)n4 * f5, f10, f13, avu_2.djl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return this.djx;
    }

    public void clear() {
        this.djz = null;
    }

    private void bNP() {
        GlyphVector glyphVector = this.bNQ();
        Rectangle2D rectangle2D = avu_2.a(this.djB.diW.a(this.djv, this.djB.diM, this.djB.bNE()));
        Rectangle2D rectangle2D2 = this.djB.b(rectangle2D);
        Point point = new Point((int)(-rectangle2D2.getMinX()), (int)(-rectangle2D2.getMinY()));
        Rect rect = new Rect(0, 0, (int)rectangle2D2.getWidth(), (int)rectangle2D2.getHeight(), (Object)new awf_1(this.djB, this.djv, point, rectangle2D));
        this.djB.diU.add(rect);
        this.djz = rect;
        Graphics2D graphics2D = this.djB.bNG();
        int n = rect.x() + point.x;
        int n2 = rect.y() + point.y;
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(rect.x(), rect.y(), rect.w(), rect.h());
        graphics2D.setComposite(AlphaComposite.Src);
        this.djB.diW.a(graphics2D, glyphVector, n, n2);
        this.djB.bNF().markDirty(rect.x(), rect.y(), rect.w(), rect.h());
    }

    private GlyphVector bNQ() {
        if (this.djy != null) {
            GlyphVector glyphVector = this.djy;
            this.djy = null;
            return glyphVector;
        }
        return awo_2.dlu.b(this.djv, this.djB.diM, this.djB.bNE());
    }
}

