/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from FY
 */
public class fy_0
implements fv_0 {
    protected static final byte[] aCv = new byte[0];
    private final URL aCw;
    private boolean aCx;
    private boolean aCy;
    private byte @Nullable [] ayE;

    fy_0(URL uRL) {
        this.aCw = uRL;
        this.aCx = false;
        this.aCy = false;
    }

    @Override
    public void aLx() {
        Preconditions.checkState((!this.aCx ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        Preconditions.checkState((!this.aCy ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        URLConnection uRLConnection = this.aCw.openConnection();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnection.getInputStream());
        this.ayE = new byte[uRLConnection.getContentLength()];
        try {
            if (((InputStream)bufferedInputStream).read(this.ayE) > 0) {
                this.aCx = true;
            } else {
                this.aCy = true;
            }
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
    }

    @Override
    public void aLz() {
        this.aCy = true;
    }

    public final boolean aLB() {
        return this.aCx;
    }

    public final boolean aLC() {
        return this.aCy;
    }

    @Override
    public final String aLy() {
        return this.aCw.getPath();
    }

    public final byte[] aLD() {
        return Optional.ofNullable(this.ayE).orElse(aCv);
    }

    public String toString() {
        return this.aCw == null ? "null" : String.valueOf(this.aCw) + " ready=" + this.aCx;
    }
}

