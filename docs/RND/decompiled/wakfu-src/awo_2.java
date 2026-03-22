/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import org.apache.log4j.Logger;

/*
 * Renamed from awo
 */
public class awo_2 {
    static final Logger dlt = Logger.getLogger(awo_2.class);
    public static final awo_2 dlu = new awo_2();
    final aws_1 dlv = new aws_1(this);
    private static final int dlw = 15000;
    private int dlx = 0;
    final THashMap<Font, THashMap<String, awq_2>> dly = new THashMap();

    private awo_2() {
    }

    public GlyphVector a(char c2, Font font, FontRenderContext fontRenderContext) {
        return this.b(String.valueOf(c2), font, fontRenderContext);
    }

    public GlyphVector b(String string, Font font, FontRenderContext fontRenderContext) {
        awq_2 awq_22;
        THashMap tHashMap = (THashMap)this.dly.get((Object)font);
        if (tHashMap == null) {
            tHashMap = new THashMap();
            this.dly.put((Object)font, (Object)tHashMap);
        }
        if ((awq_22 = (awq_2)tHashMap.get((Object)string)) == null) {
            awq_22 = awq_2.a(font.createGlyphVector(fontRenderContext, string), string);
            tHashMap.put((Object)string, (Object)awq_22);
        }
        awq_22.dk(true);
        return awq_22.bOJ();
    }

    public void qF(int n) {
        this.dlx += n;
        if (this.dlx > 15000) {
            if (!this.dly.isEmpty()) {
                this.dly.forEachValue((TObjectProcedure)new awp_2(this));
            }
            this.dlx = 0;
        }
    }
}

