/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

/*
 * Renamed from Xg
 */
public class xg_0 {
    private anz_1 bRe = null;
    private int bRf;
    private int bRg;
    private final EntityText bRh = (EntityText)EntityText.djS.bSK();

    public xg_0(awh_2 awh_22, String string) {
        this(awh_22, false, string);
    }

    public xg_0(awh_2 awh_22, boolean bl, String string) {
        GeometryBackground geometryBackground = (GeometryBackground)GLGeometryBackground.dbH.bSK();
        GeometryText geometryText = (GeometryText)GLGeometryText.dbI.bSK();
        this.bRh.a(geometryBackground);
        this.bRh.a(geometryText);
        this.bRh.a(awh_22);
        this.bRh.gt(string);
        geometryBackground.bsI();
        geometryText.bsI();
    }

    public anz_1 bnp() {
        return this.bRe;
    }

    public void a(anz_1 anz_12) {
        this.bRe = anz_12;
    }

    public int getXOffset() {
        return this.bRf;
    }

    public void setXOffset(int n) {
        this.bRf = n;
    }

    public int getYOffset() {
        return this.bRg;
    }

    public void setYOffset(int n) {
        this.bRg = n;
    }

    public float getWorldX() {
        if (this.bRe != null) {
            return this.bRe.getWorldX();
        }
        return 0.0f;
    }

    public float getWorldY() {
        if (this.bRe != null) {
            return this.bRe.getWorldY();
        }
        return 0.0f;
    }

    public float getAltitude() {
        if (this.bRe != null) {
            return this.bRe.getAltitude();
        }
        return 0.0f;
    }

    public EntityText bny() {
        return this.bRh;
    }

    public void setText(String string) {
        this.bRh.gt(string);
    }

    public void setVisible(boolean bl) {
        this.bRh.setVisible(bl);
    }

    public boolean isVisible() {
        return this.bRh.isVisible();
    }

    public boolean bnr() {
        return false;
    }

    public void aZp() {
        this.bRh.bsI();
        this.bRe = null;
    }
}

