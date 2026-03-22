/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Optional;
import javax.swing.JFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cCM
 */
public class ccm_2
implements aba_1 {
    private static final int mRl = 3;
    @NotNull
    private final JFrame mRm;
    @NotNull
    private final Dimension mRn;
    @NotNull
    private final Insets mRo;
    private boolean cHn = true;
    @NotNull
    private Point mRp;
    @NotNull
    private Dimension mRq;
    @Nullable
    private ccn_2 mRr;
    private boolean mRs = false;

    public ccm_2(@NotNull JFrame jFrame, @NotNull Dimension dimension, @NotNull Insets insets) {
        this.mRm = jFrame;
        this.mRn = dimension;
        this.mRo = insets;
        this.mRq = jFrame.getSize();
        this.mRp = new Point();
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        Optional<ccn_2> optional = this.k(mouseEvent);
        if (optional.isEmpty()) {
            return false;
        }
        this.mRr = optional.get();
        this.mRq = this.mRm.getSize();
        this.mRp = new Point(mouseEvent.getX(), mouseEvent.getY());
        fhn_1.gzT().a(ccm_2.a(this.mRr));
        return true;
    }

    private static fzo_0 a(ccn_2 ccn_22) {
        if (ccn_22.mRt && ccn_22.mRu) {
            return fzo_0.tHX;
        }
        if (ccn_22.mRt) {
            return fzo_0.tHV;
        }
        if (ccn_22.mRu) {
            return fzo_0.tHW;
        }
        return fzo_0.tHq;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        if (this.mRr == null) {
            return false;
        }
        int n = mouseEvent.getX() - this.mRp.x;
        int n2 = mouseEvent.getY() - this.mRp.y;
        int n3 = this.mRq.width;
        if (this.mRr.mRt) {
            n3 += n;
        }
        n3 = Math.max(n3, this.mRn.width);
        int n4 = this.mRq.height;
        if (this.mRr.mRu) {
            n4 += n2;
        }
        n4 = Math.max(n4, this.mRn.height);
        this.mRm.setSize(n3, n4);
        this.mRm.setVisible(true);
        return true;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        if (this.mRr != null) {
            this.mRr = null;
            fhn_1.gzT().bYz();
            return true;
        }
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        Optional<ccn_2> optional = this.k(mouseEvent);
        if (optional.isPresent()) {
            fhn_1.gzT().a(ccm_2.a(optional.get()));
            this.mRs = true;
            return true;
        }
        if (this.mRs) {
            fhn_1.gzT().a(fzo_0.tHq);
            this.mRs = false;
        }
        return false;
    }

    private Optional<ccn_2> k(MouseEvent mouseEvent) {
        if (!this.cHn) {
            return Optional.empty();
        }
        if (!this.mRm.isResizable()) {
            return Optional.empty();
        }
        if (this.mRm.getExtendedState() == 6) {
            return Optional.empty();
        }
        if (aie_0.cfn().bmB().bAI().bzU() != ahn_0.cwO) {
            return Optional.empty();
        }
        int n = this.mRm.getWidth();
        int n2 = this.mRm.getHeight();
        float f2 = aie_0.cfn().bmB().bmE().bRb();
        float f3 = aie_0.cfn().bmB().bmE().bRc();
        ccn_2 ccn_22 = new ccn_2((float)mouseEvent.getX() >= f2 * (float)(n - 3 - this.mRo.left), (float)mouseEvent.getY() >= f3 * (float)(n2 - 3 - this.mRo.top));
        if (!ccn_22.mRt && !ccn_22.mRu) {
            return Optional.empty();
        }
        return Optional.of(ccn_22);
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }
}

