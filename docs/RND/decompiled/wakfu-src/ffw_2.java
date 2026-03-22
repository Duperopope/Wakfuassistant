/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fFw
 */
public class ffw_2 {
    private static final Logger upW = Logger.getLogger(ffw_2.class);
    private final ArrayList<fsn_1> upX = new ArrayList();
    private final ArrayList<EntitySprite> upY = new ArrayList();
    private final ArrayList<EntitySprite> upZ = new ArrayList();

    public void ad(ArrayList<fsn_1> arrayList) {
        this.upX.clear();
        this.upX.addAll(arrayList);
        this.gwm();
    }

    public fsn_1 aaT(int n) {
        return this.upX.get(n);
    }

    public EntitySprite aaU(int n) {
        return this.upY.get(n);
    }

    public EntitySprite aaV(int n) {
        return this.upZ.get(n);
    }

    public void i(fsn_1 fsn_12) {
        this.upX.add(fsn_12);
        this.upY.add(ffw_2.bd(this));
        this.upZ.add(ffw_2.bd(this));
        assert (this.upY.size() == this.upX.size());
    }

    public void j(fsn_1 fsn_12) {
        int n = this.upX.indexOf(fsn_12);
        if (n != -1) {
            this.upX.remove(n);
            this.upY.remove(n).bsI();
            this.upZ.remove(n).bsI();
        }
        assert (this.upY.size() == this.upX.size());
    }

    public int aVo() {
        return this.upX.size();
    }

    public void clear() {
        this.upX.clear();
        for (int i = this.upY.size() - 1; i >= 0; --i) {
            this.upY.remove(i).bsI();
        }
        this.upY.clear();
        assert (this.upY.size() == this.upX.size());
    }

    private void gwm() {
        int n = this.upX.size();
        assert (this.upY.size() == this.upZ.size());
        while (this.upY.size() > n) {
            this.upY.remove(this.upY.size() - 1).bsI();
            this.upZ.remove(this.upZ.size() - 1).bsI();
        }
        for (int i = this.upY.size(); i < n; ++i) {
            EntitySprite entitySprite = ffw_2.bd("MapOverlay");
            EntitySprite entitySprite2 = ffw_2.bd("MapOverlay");
            this.upY.add(entitySprite);
            this.upZ.add(entitySprite2);
        }
        assert (this.upY.size() == this.upX.size() && this.upY.size() == this.upZ.size());
    }

    private static EntitySprite bd(Object object) {
        EntitySprite entitySprite = (EntitySprite)EntitySprite.cXk.bSK();
        entitySprite.cWR = object;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        entitySprite.a(geometrySprite);
        geometrySprite.bsI();
        return entitySprite;
    }

    public void bJ(float f2, float f3) {
        int n = this.upY.size();
        for (int i = 0; i < n; ++i) {
            EntitySprite entitySprite = this.upY.get(i);
            entitySprite.aZ(entitySprite.aKp() - f3, entitySprite.aKq() - f2);
            EntitySprite entitySprite2 = this.upZ.get(i);
            entitySprite2.aZ(entitySprite2.aKp() - f3, entitySprite2.aKq() - f2);
        }
    }

    public ffv_2 aaW(int n) {
        if (n < 0 || n >= this.upX.size()) {
            return null;
        }
        return new ffv_2(this.upX.get(n), this.upY.get(n), this.upZ.get(n));
    }
}

