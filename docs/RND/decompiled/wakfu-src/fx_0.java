/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from FX
 */
class fx_0
implements Runnable {
    private final fv_0 aCu;

    fx_0(fv_0 fv_02) {
        this.aCu = fv_02;
    }

    @Override
    public void run() {
        try {
            this.aCu.aLx();
        }
        catch (IOException iOException) {
            fw_0.aCr.warn((Object)("Unable to read " + this.aCu.aLy() + " : " + iOException.getMessage()));
            this.aCu.aLz();
        }
    }

    public String toString() {
        return "LoadUrl{m_url=" + String.valueOf(this.aCu) + "}";
    }
}

