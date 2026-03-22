/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from axr
 */
public class axr_2
implements fv_0 {
    private final axc_1 dpx;
    private final String dpy;
    private boolean aCx;
    private boolean aCy;
    @Nullable
    private axc_2 dpz;

    public axr_2(axc_1 axc_12, String string) {
        this.dpx = axc_12;
        this.dpy = string;
        this.aCx = false;
        this.aCy = false;
    }

    @Override
    public void aLx() {
        Preconditions.checkState((!this.aCx ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        Preconditions.checkState((!this.aCy ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        this.dpz = this.dpx.gM(this.dpy);
        if (this.dpz != null) {
            this.aCx = true;
            return;
        }
        this.aCy = true;
    }

    @Override
    public void aLz() {
        this.aCy = true;
    }

    public final boolean bQR() {
        return this.aCx;
    }

    public final boolean bQS() {
        return this.aCy;
    }

    @Override
    public final String aLy() {
        return this.dpy;
    }

    public final axc_2 bQT() {
        return this.dpz;
    }

    public String toString() {
        return this.dpy == null ? "null" : this.dpy + " ready=" + this.aCx;
    }
}

