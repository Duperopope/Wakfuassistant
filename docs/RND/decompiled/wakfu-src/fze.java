/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fze
extends fkq_2
implements awh_1,
ayz_2 {
    private static final Logger tEB = Logger.getLogger(fze.class);
    public static final String TAG = "pixmap";
    private awg_1 tEC;
    private String p;
    private fzw_0 tED = fzw_0.tLg;
    private boolean tEE = false;
    private static final ObjectPool tEF = new ayv_2(new fzf(), 10000);
    public static final int tEG = -1221029593;
    public static final int tEH = 113126854;
    public static final int tEI = 120;
    public static final int tEJ = 121;
    public static final int tEK = 3373707;
    public static final int tEL = -1417816805;
    public static final int tEM = 0x2C929929;
    public static final int tEN = -40300674;
    public static final int tEO = -1344730584;
    public static final int tEP = 1582813654;

    public static fze checkOut() {
        fze fze2;
        try {
            fze2 = (fze)tEF.borrowObject();
            fze2.uth = tEF;
        }
        catch (Exception exception) {
            tEB.error((Object)"Probl\u00e8me au borrowObject.");
            fze2 = new fze();
            fze2.aVI();
        }
        return fze2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void setX(int n) {
        if (this.tEC != null) {
            this.tEC.setX(n);
            this.setNeedsToPreProcess();
        }
    }

    public int getX() {
        if (this.tEC != null) {
            return this.tEC.getX();
        }
        return 0;
    }

    public void setY(int n) {
        if (this.tEC != null) {
            this.tEC.setY(n);
            this.setNeedsToPreProcess();
        }
    }

    public int getY() {
        if (this.tEC != null) {
            return this.tEC.getY();
        }
        return 0;
    }

    public void setWidth(int n) {
        if (this.tEC == null) {
            return;
        }
        this.tEC.setWidth(n);
        this.tEE = true;
        this.setNeedsToPreProcess();
        this.tEC.dl(n == -1);
    }

    public int getWidth() {
        if (this.tEC != null) {
            return this.tEC.getWidth();
        }
        return 0;
    }

    public void setHeight(int n) {
        if (this.tEC != null) {
            this.tEC.setHeight(n);
            this.tEE = true;
            this.setNeedsToPreProcess();
            this.tEC.dl(n == -1);
        }
    }

    public int getHeight() {
        if (this.tEC != null) {
            return this.tEC.getHeight();
        }
        return 0;
    }

    public int getOrientedHeight() {
        if (this.getRotation().bKt()) {
            return this.getWidth();
        }
        return this.getHeight();
    }

    public int getOrientedWidth() {
        if (this.getRotation().bKt()) {
            return this.getHeight();
        }
        return this.getWidth();
    }

    public void setFlipHorizontaly(boolean bl) {
        if (this.tEC != null && this.tEC.bOU() != bl) {
            this.tEC.setFlipHorizontaly(bl);
            this.setNeedsToPreProcess();
        }
    }

    public void setFlipVerticaly(boolean bl) {
        if (this.tEC != null && this.tEC.bOV() != bl) {
            this.tEC.setFlipVerticaly(bl);
            this.setNeedsToPreProcess();
        }
    }

    public void setRotation(asp_1 asp_12) {
        if (this.tEC != null && this.tEC.getRotation() != asp_12) {
            this.tEC.setRotation(asp_12);
            this.setNeedsToPreProcess();
        }
    }

    public asp_1 getRotation() {
        if (this.tEC != null) {
            return this.tEC.getRotation();
        }
        return null;
    }

    public void setTexture(awk_1 awk_12) {
        if (this.tEC == null) {
            return;
        }
        if (this.tEC.bOW()) {
            awk_1 awk_13 = this.tEC.bHg();
            if (awk_12 != null || awk_13 != null) {
                if (awk_12 == null || awk_13 == null) {
                    this.tEE = true;
                } else {
                    acc_1 acc_12 = awk_12.bQs();
                    if (acc_12.bWx() != this.tEC.bOT() || acc_12.bWy() != this.tEC.bOS()) {
                        this.tEE = true;
                    }
                }
            }
        }
        this.tEC.setTexture(awk_12);
        this.setNeedsToPreProcess();
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public void setPixmap(awg_1 awg_12) {
        this.tEC = awg_12;
    }

    public void setPosition(fzw_0 fzw_02) {
        this.tED = fzw_02;
    }

    public fzw_0 getPosition() {
        return this.tED;
    }

    @Override
    public void setup(fkq_1 fkq_12) {
        if (fkq_12 instanceof fzd) {
            ((fzd)fkq_12).setPixmap(this);
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tEC != null && this.tEC.bOX()) {
            this.tEC.bOY();
        }
        if (this.tEE) {
            fzd fzd2 = this.getParentOfType(fzd.class);
            if (fzd2 instanceof fbt_1) {
                fzd2.setPixmap(this);
            }
            this.tEE = false;
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tED = null;
        if (this.tEC != null) {
            this.tEC.setTexture(null);
        }
        this.tEC = null;
        this.p = null;
    }

    @Override
    public void aVI() {
        assert (this.tEC == null);
        super.aVI();
        this.tEC = new awg_1();
        this.tED = fzw_0.tLg;
        this.tEE = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fze fze2 = (fze)fhi_22;
        super.a(fze2);
        fze2.tED = this.tED;
        fze2.setTexture(this.tEC.bHg());
        if (!this.tEC.bOW()) {
            fze2.setHeight(this.tEC.bOS());
            fze2.setWidth(this.tEC.bOT());
        }
        fze2.setX(this.tEC.getX());
        fze2.setY(this.tEC.getY());
        fze2.setFlipHorizontaly(this.tEC.bOU());
        fze2.setFlipVerticaly(this.tEC.bOV());
        fze2.setRotation(this.tEC.getRotation());
        fze2.setName(this.p);
    }

    @Override
    public void a(awg_1 awg_12) {
        this.tEE = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1417816805) {
            this.setTexture(fic_12.vp(string));
        } else if (n == -1221029593) {
            this.setHeight(Bw.m(string));
        } else if (n == 113126854) {
            this.setWidth(Bw.m(string));
        } else if (n == 120) {
            this.setX(Bw.m(string));
        } else if (n == 121) {
            this.setY(Bw.m(string));
        } else if (n == 0x2C929929) {
            this.setPosition(fzw_0.tE(string));
        } else if (n == -40300674) {
            this.setRotation(asp_1.gh(string));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Bw.aK(string));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Bw.aK(string));
        } else if (n == 3373707) {
            this.setName(string);
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1417816805) {
            this.setTexture((awk_1)object);
        } else if (n == -1221029593) {
            this.setHeight(Bw.m(object));
        } else if (n == 113126854) {
            this.setWidth(Bw.m(object));
        } else if (n == 120) {
            this.setX(Bw.m(object));
        } else if (n == 121) {
            this.setY(Bw.m(object));
        } else if (n == 0x2C929929) {
            this.setPosition((fzw_0)((Object)object));
        } else if (n == -40300674) {
            this.setRotation((asp_1)((Object)object));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Bw.l(object));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Bw.l(object));
        } else if (n == 3373707) {
            this.setName((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

