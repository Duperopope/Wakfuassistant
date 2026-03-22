/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from asf
 */
public class asf_2 {
    private Geometry cXe;
    private awk_1 bXx;
    private Material bVn;
    private boolean cXf;

    public asf_2(Geometry geometry, awk_1 awk_12, Material material) {
        this.setTexture(awk_12);
        if (geometry != null) {
            geometry.bGY();
        }
        this.cXe = geometry;
        this.a(material);
    }

    public final void bJh() {
        if (this.bXx != null) {
            this.bXx.bsI();
            this.bXx = null;
        }
        if (this.cXe != null) {
            this.cXe.bsI();
            this.cXe = null;
        }
        if (this.bVn != null) {
            this.bVn.bsI();
            this.bVn = null;
        }
    }

    public Geometry bJi() {
        return this.cXe;
    }

    public awk_1 bHg() {
        return this.bXx;
    }

    public void setTexture(awk_1 awk_12) {
        if (awk_12 == this.bXx) {
            return;
        }
        if (awk_12 != null) {
            awk_12.bGY();
        }
        if (this.bXx != null) {
            this.bXx.bsI();
        }
        this.bXx = awk_12;
    }

    public Material bpt() {
        return this.bVn;
    }

    void a(Material material) {
        if (this.bVn == material) {
            return;
        }
        if (material != null) {
            material.bGY();
        }
        if (this.bVn != null) {
            this.bVn.bsI();
        }
        this.bVn = material;
        this.cXf = true;
    }

    public void bJj() {
        this.cXf = true;
    }

    public final void a(atg_2 atg_22, boolean bl) {
        if (this.bXx != null && !this.bXx.bPe()) {
            return;
        }
        if (this.cXe == null) {
            return;
        }
        GL2 gL2 = atg_22.bIq();
        ava_2 ava_22 = ava_2.bMH();
        ava_22.a((GL)gL2, (ati_2)this.bXx);
        if (this.bVn != null) {
            ava_22.a(gL2, this.bVn);
            if (this.cXf && bl) {
                this.cXf = false;
                this.cXe.d(this.bVn);
            }
        }
        this.cXe.b(atg_22);
    }
}

