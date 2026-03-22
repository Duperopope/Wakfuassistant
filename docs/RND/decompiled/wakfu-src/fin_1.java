/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

/*
 * Renamed from fIn
 */
public class fin_1
implements fij_1 {
    private static final Logger uAO = Logger.getLogger(fin_1.class);
    private fbb_2 uAP;
    private fes_2 uAJ;
    private fbt_1 uAQ;
    private boolean uAM;
    private fsn_1 upS;
    private EntitySprite upT;
    private int bpd;
    private int bpe;

    public fin_1(fbb_2 fbb_22) {
        this.uAP = fbb_22;
    }

    @Override
    public void a(int n, int n2, fes_2 fes_22) {
        if (!(this.uAM || n >= this.bpd - 20 && n <= this.bpd + 20 && n2 >= this.bpe - 20 && n2 <= this.bpe + 20)) {
            fze fze2 = new fze();
            fze2.aVI();
            fze2.setPixmap(new awg_1(this.upT.bHg()));
            this.uAQ = new fbt_1();
            this.uAQ.aVI();
            this.uAQ.d(fze2);
            this.uAQ.setSize(this.upT.getWidth(), this.upT.getHeight());
            this.uAQ.setNonBlocking(true);
            this.uAQ.setLayoutData(null);
            this.uAP.aX(this.upS);
            fbj_1.getInstance().getLayeredContainer().d(this.uAQ, 30000);
            this.uAM = true;
        }
        if (this.uAM && this.uAQ != null) {
            this.uAQ.setPosition(n - this.uAQ.getWidth() / 2, n2 - this.uAQ.getHeight() / 2);
            if (fes_22 != this.uAJ) {
                if (this.uAJ != null) {
                    this.uAP.a((fbd_1)null, this.upS);
                    this.uAJ = null;
                }
                if (fes_22 != null) {
                    this.uAJ = fes_22;
                    this.uAP.b(null, this.upS);
                }
            }
        }
    }

    @Override
    public void b(int n, int n2, fes_2 fes_22) {
        if (this.uAM) {
            ayx_2 ayx_22;
            fbd_1 fbd_12 = null;
            if (fes_22 != null && (fbd_12 = fes_22 instanceof fbd_1 ? (fbd_1)fes_22 : (fbd_1)fes_22.getParentOfType(fbb_2.class)) == null) {
                if (!(fes_22 instanceof fcv_1)) {
                    ayx_22 = fes_22.getParentOfType(fcv_1.class);
                    if (ayx_22 instanceof fcv_1) {
                        fbd_12 = ((fcv_1)ayx_22).getDragNDropable();
                    }
                } else {
                    fbd_12 = ((fcv_1)fes_22).getDragNDropable();
                }
            }
            if (fbd_12 != null && fbd_12.isDropValid(this.uAP, this.upS)) {
                fbd_12.a(fbd_12, this.upS, -1);
            } else {
                ayx_22 = flc_2.a(fbj_1.getInstance().getCurrentAWTMouseEvent(), (fbd_1)this.uAP, (Object)this.upS);
                this.uAP.h((fiq_1)ayx_22);
            }
        }
        this.clean();
    }

    @Override
    public void clean() {
        if (this.uAQ != null) {
            this.uAQ.gAD();
            this.uAQ = null;
        }
        this.upS = null;
        this.upT = null;
        this.uAJ = null;
    }

    @Override
    public boolean gBw() {
        boolean bl = this.uAM;
        this.clean();
        this.uAP = null;
        return bl;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isDragEnabled() {
        return true;
    }

    @Override
    public boolean isDropEnabled() {
        return true;
    }

    @Override
    public boolean b(fes_2 fes_22, int n, int n2) {
        if (fes_22 == null) {
            return false;
        }
        if (fes_22 == this.uAP || fes_22.n((fhv_1)this.uAP)) {
            fsn_1 fsn_12 = this.uAP.getOverItem();
            return this.uAP.isDragEnabled() && fsn_12 != null && fsn_12.gGo() && (!fsn_12.isEditable() || !fsn_12.gGp());
        }
        return false;
    }

    @Override
    public void he(int n, int n2) {
        this.bpd = n;
        this.bpe = n2;
        this.upS = this.uAP.getOverItem();
        this.upT = this.uAP.getOverMesh();
        this.uAM = false;
        this.uAJ = null;
    }
}

