/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from awg
 */
public class awg_2
implements aww_1 {
    @Override
    public boolean bNC() {
        return true;
    }

    @Override
    public Rectangle2D a(CharSequence charSequence, Font font, FontRenderContext fontRenderContext) {
        GlyphVector glyphVector = awo_2.dlu.b(charSequence.toString(), font, fontRenderContext);
        return this.a(glyphVector, fontRenderContext);
    }

    @Override
    public Rectangle2D a(String string, Font font, FontRenderContext fontRenderContext) {
        GlyphVector glyphVector = font.createGlyphVector(fontRenderContext, string);
        return this.a(glyphVector, fontRenderContext);
    }

    @Override
    public Rectangle2D a(GlyphVector glyphVector, FontRenderContext fontRenderContext) {
        return glyphVector.getLogicalBounds();
    }

    @Override
    public void a(Graphics2D graphics2D, GlyphVector glyphVector, int n, int n2) {
        graphics2D.drawGlyphVector(glyphVector, n, n2);
    }

    @Override
    public void a(Graphics2D graphics2D, String string, int n, int n2) {
        graphics2D.drawString(string, n, n2);
    }

    @Override
    public int bND() {
        return 0;
    }

    @Override
    public awl_2 bNj() {
        return awl_2.dkI;
    }
}

