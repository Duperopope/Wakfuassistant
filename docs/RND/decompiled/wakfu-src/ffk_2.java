/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from fFk
 */
public class ffk_2
extends asn_1 {
    public static final ffk_2 uoS = new ffk_2();
    private static final awx_2 uoT = new awx_2(new float[0]);
    private static final String uoU = "selectedZone";
    private static final String uoV = "tex0Dim";
    public static final String uoW = "nation";
    public static final String uoX = "highlight";
    private awk_1 tUq;
    private TLongByteHashMap uoY;
    private TLongObjectHashMap<axb_2> uoZ;

    private static asl_1 gvH() {
        return new asl_1(new ase_1(uoU, asf_1.cZr), new ase_1(uoV, asf_1.cZr));
    }

    private ffk_2() {
        super(fyw_0.gqw().tCv + "mappemonde.cgfx", uoW, ffk_2.gvH());
    }

    public void h(awk_1 awk_12) {
        this.tUq = awk_12;
        this.gvI();
    }

    public void a(TLongByteHashMap tLongByteHashMap) {
        this.uoY = tLongByteHashMap;
        this.gvI();
    }

    public void g(TLongObjectHashMap<axb_2> tLongObjectHashMap) {
        this.uoZ = tLongObjectHashMap;
        this.gvI();
    }

    public void aaO(int n) {
        this.cZG.c(uoU, n);
    }

    public void aaP(int n) {
        this.cZG.c(uoV, n);
    }

    private void gvI() {
        if (this.tUq == null || this.uoY == null || this.uoZ == null) {
            return;
        }
        axj_2 axj_22 = this.tUq.ve(0);
        if (axj_22 == null) {
            return;
        }
        TLongObjectIterator tLongObjectIterator = this.uoZ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            tLongObjectIterator.key();
            byte by = this.uoY.get(tLongObjectIterator.key());
            axb_2 axb_22 = (axb_2)tLongObjectIterator.value();
            if (axb_22 == null || uoX.equals(this.cZk)) {
                uoT.v(1.0f, 1.0f, 1.0f, 1.0f);
            } else {
                uoT.v(1.0f, axb_22.aIU(), axb_22.aIV(), axb_22.aIW());
            }
            axj_22.a(by, 0, uoT);
        }
        this.tUq.bQv();
    }

    @Override
    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.bJY(), this.bJZ(), this.bJT());
        entitySprite.b(this.tUq);
    }

    public asl_1 bJT() {
        if (!avh_2.dhF.bMU()) {
            this.cZG.c("gColorScale", asa_1.cZh.bX("gColorScale"));
        }
        return this.cZG;
    }

    public String toString() {
        return "MapShader{m_maskTexture=" + (this.tUq != null ? this.tUq.bPc() : "null") + "}";
    }
}

