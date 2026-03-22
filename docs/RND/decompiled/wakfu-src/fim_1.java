/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIm
 */
public class fim_1
implements fij_1 {
    private static final Logger uAH = Logger.getLogger(fim_1.class);
    private fbd_1 uAI = null;
    private fes_2 uAJ = null;
    private fcv_1 uAK;
    private fbd_1 uAL;
    private boolean uAM;
    private int uAN = -1;
    private Object aGT = null;

    public fim_1(fcv_1 fcv_12) {
        this.uAK = fcv_12;
    }

    @Override
    public void a(int n, int n2, fes_2 fes_22) {
        fcv_1 fcv_12;
        if (!this.uAM && this.uAI.isDragEnabled() && (n < (fcv_12 = this.uAK).getDisplayX() || n > fcv_12.getDisplayX() + fcv_12.getWidth() || n2 < fcv_12.getDisplayY() || n2 > fcv_12.getDisplayY() + fcv_12.getHeight())) {
            if (this.uAI == null || this.uAI.isUnloading()) {
                return;
            }
            this.uAL = (fbd_1)this.uAI.gAK();
            if (this.uAL == null) {
                uAH.warn((Object)"probl\u00e8me au clone du dnd container, le clone est null");
                return;
            }
            this.uAL.setCopy(true);
            this.uAL.setSize(this.uAI.getSize());
            this.uAL.setNonBlocking(true);
            this.uAL.setLayoutData(null);
            this.uAI.aX(this.aGT);
            if (this.uAL.isDisplayCopy()) {
                fbj_1.getInstance().getLayeredContainer().d(this.uAL, 30000);
            }
            this.uAM = true;
        }
        if (this.uAM && this.uAL != null) {
            this.uAL.setPosition(n - this.uAL.getWidth() / 2, n2 - this.uAL.getHeight() / 2);
            if (fes_22 != null && !(fes_22 instanceof fcv_1)) {
                fes_22 = fes_22.getParentOfType(fcv_1.class);
            }
            if (fes_22 != this.uAJ) {
                if (this.uAJ != null) {
                    this.uAI.a(((fcv_1)this.uAJ).getDragNDropable(), this.aGT);
                    this.uAJ = null;
                }
                if (fes_22 != null) {
                    this.uAJ = fes_22;
                    this.uAI.b(((fcv_1)this.uAJ).getDragNDropable(), this.aGT);
                }
            }
        }
    }

    @Override
    public void b(int n, int n2, fes_2 fes_22) {
        if (this.uAM) {
            ayx_2 ayx_22;
            fbd_1 fbd_12 = null;
            if (fes_22 != null) {
                fbd_12 = fes_22 instanceof fbd_1 ? (fbd_1)fes_22 : (fbd_1)fes_22.getParentOfType(fbb_2.class);
                if (fbd_12 == null) {
                    if (!(fes_22 instanceof fcv_1)) {
                        ayx_22 = fes_22.getParentOfType(fcv_1.class);
                        if (ayx_22 instanceof fcv_1) {
                            fbd_12 = ((fcv_1)ayx_22).getDragNDropable();
                        }
                    } else {
                        fbd_12 = ((fcv_1)fes_22).getDragNDropable();
                    }
                }
                if (fbd_12 == null) {
                    fbd_12 = fes_22.getParentOfType(fbd_1.class);
                }
            }
            if (fbd_12 != null && fbd_12.isDropValid(this.uAI, this.aGT)) {
                fbd_12.a(this.uAI, this.aGT, this.uAN);
            } else if (fbd_12 != this.uAI) {
                ayx_22 = flc_2.a(fbj_1.getInstance().getCurrentAWTMouseEvent(), this.uAI, this.aGT);
                this.uAK.h((fiq_1)ayx_22);
            }
        }
        this.clean();
    }

    @Override
    public void clean() {
        if (this.uAL != null) {
            this.uAL.gAD();
            this.uAL = null;
        }
        this.uAI = null;
        this.uAJ = null;
        this.uAN = -1;
        this.aGT = null;
    }

    @Override
    public boolean gBw() {
        boolean bl = this.uAM;
        this.clean();
        this.uAK = null;
        return bl;
    }

    @Override
    public boolean b(fes_2 fes_22, int n, int n2) {
        if (fes_22 == null) {
            return false;
        }
        if (!this.uAK.gtP()) {
            return false;
        }
        if (fes_22 != this.uAK && !fes_22.n((fhv_1)this.uAK)) {
            return false;
        }
        return this.uAK.getItem() != null;
    }

    @Override
    public void he(int n, int n2) {
        this.uAN = this.uAK.getItemValueIndex();
        this.aGT = this.uAK.getItemValue();
        this.uAI = this.uAK.getDragNDropable();
        this.uAM = false;
        this.uAJ = null;
    }

    @Override
    public Object getValue() {
        return this.aGT;
    }

    @Override
    public boolean isDragEnabled() {
        return this.uAI != null && this.uAI.isDragEnabled();
    }

    @Override
    public boolean isDropEnabled() {
        return this.uAI != null && this.uAI.isDropEnabled();
    }
}

