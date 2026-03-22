/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/*
 * Renamed from ayY
 */
public abstract class ayy_2 {
    private static final Logger duK = Logger.getLogger(ayy_2.class);
    public static final String duL = "Using an item with a reference counter < 0 is forbidden";
    private static final short duM = 10;
    private static final int duN = 0x7FFFFFFE;
    private int duO = 0;

    public final boolean bSV() {
        return this.duO >= 0;
    }

    public void bGY() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        assert (this.duO < Integer.MAX_VALUE) : "Too many references added";
        if (this.duO >= 0x7FFFFFFE) {
            if (this.duO == 0x7FFFFFFE) {
                duK.fatal((Object)("Too many references added " + this.getClass().getName()), (Throwable)new Exception());
                JOptionPane.showMessageDialog(null, "Fatal error: Too many references added " + this.getClass().getName());
                ++this.duO;
            }
        } else {
            ++this.duO;
        }
    }

    public void bsI() {
        if (--this.duO == -1) {
            this.bPl();
        }
        if (this.duO == -2) {
            duK.warn((Object)("on enl\u00e8ve encore une reference " + this.getClass().getSimpleName()));
        }
    }

    public final int bSW() {
        return this.duO;
    }

    protected void bLe() {
    }

    protected void bPl() {
        this.bLe();
    }

    final void bSX() {
        this.duO = 0;
    }
}

