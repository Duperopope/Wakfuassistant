/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEo
 */
public class aeo_2
extends aei_1 {
    private static final Logger dFr = Logger.getLogger(aeo_2.class);
    private final File dFs;
    private File dFt;
    private final boolean dFu;
    private OutputStream aBj = null;
    private final boolean dFv;

    public aeo_2(@NotNull URL uRL, File file, boolean bl, boolean bl2) {
        super(uRL);
        this.dFs = file;
        this.dFu = bl2;
        this.dFv = bl;
    }

    @Override
    OutputStream bZj() {
        if (this.dFv) {
            File file;
            try {
                File file2 = this.dFs.getParentFile();
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = File.createTempFile(new File(this.bZk().getFile()).getName(), null, file2);
                file.deleteOnExit();
            }
            catch (IOException iOException) {
                dFr.error((Object)("Unable to create temporary file for " + String.valueOf(this)));
                file = null;
            }
            this.dFt = file == null ? this.dFs : file;
        } else {
            this.dFt = this.dFs;
        }
        if (this.dFt.exists()) {
            if (!this.dFu) {
                dFr.error((Object)("Dest file already exists for " + String.valueOf(this)));
                throw new IOException("File already exists " + String.valueOf(this.dFs));
            }
        } else {
            this.dFt.getParentFile().mkdirs();
            this.dFt.createNewFile();
            if (this.dFt != this.dFs) {
                this.dFt.deleteOnExit();
            }
        }
        this.aBj = new BufferedOutputStream(new FileOutputStream(this.dFt, false));
        return this.aBj;
    }

    @Override
    boolean dH(boolean bl) {
        boolean bl2;
        if (this.aBj == null) {
            return false;
        }
        try {
            this.aBj.flush();
            this.aBj.close();
        }
        catch (IOException iOException) {
            dFr.error((Object)("Error while closing stream for download " + String.valueOf(this)));
            bl = false;
        }
        finally {
            this.aBj = null;
        }
        if (!bl) {
            if (this.dFt != this.dFs) {
                this.dFt.delete();
            }
            return false;
        }
        if (this.dFt == this.dFs) {
            return true;
        }
        if (this.dFs.exists()) {
            if (this.dFu) {
                this.dFs.delete();
            } else {
                dFr.error((Object)("Dest file already exists for " + String.valueOf(this)));
                return false;
            }
        }
        if (!(bl2 = this.dFt.renameTo(this.dFs))) {
            dFr.error((Object)("Unable to rename temporary file " + String.valueOf(this.dFt) + "as file " + String.valueOf(this.dFs) + " for " + String.valueOf(this)));
        }
        return bl2;
    }

    public File bZp() {
        return this.dFs;
    }

    @Override
    protected String bZl() {
        return this.dFs.toString();
    }
}

