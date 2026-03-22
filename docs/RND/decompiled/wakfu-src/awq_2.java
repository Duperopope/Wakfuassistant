/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.awt.font.GlyphVector;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from awq
 */
class awq_2
implements ayz_2 {
    private static final ObjectPool dlA = new ayv_2(new awr_2());
    private boolean dlB;
    private GlyphVector dlC;
    private String axs;

    awq_2() {
    }

    public static awq_2 a(GlyphVector glyphVector, String string) {
        awq_2 awq_22;
        try {
            awq_22 = (awq_2)dlA.borrowObject();
        }
        catch (Exception exception) {
            awo_2.dlt.error((Object)"Probl\u00e8me au borrowObject.");
            awq_22 = new awq_2();
            awq_22.aVI();
        }
        awq_22.dlC = glyphVector;
        awq_22.axs = string;
        return awq_22;
    }

    public GlyphVector bOJ() {
        return this.dlC;
    }

    public void dk(boolean bl) {
        this.dlB = bl;
    }

    public boolean bOK() {
        return this.dlB;
    }

    String getValue() {
        return this.axs;
    }

    @Override
    public void aVI() {
        this.dlB = true;
    }

    @Override
    public void aVH() {
        this.dlC = null;
        this.axs = null;
    }

    @Override
    public void aZp() {
        try {
            dlA.returnObject((Object)this);
        }
        catch (Exception exception) {
            this.aVH();
        }
    }
}

