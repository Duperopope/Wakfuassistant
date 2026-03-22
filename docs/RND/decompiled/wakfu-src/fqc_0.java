/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fqc
 */
public final class fqc_0 {
    protected static final Logger sRS = Logger.getLogger(fqc_0.class);
    private short mgx;
    private short mgy;
    private ArrayList<fqf_0> gvU;

    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        return this.gv(byteBuffer);
    }

    public boolean gv(ByteBuffer byteBuffer) {
        this.mgx = byteBuffer.getShort();
        this.mgy = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.gvU = new ArrayList(n * 10);
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            int n2 = byteBuffer.getShort() & 0xFFFF;
            for (int j = 0; j < n2; ++j) {
                fqf_0 fqf_02 = new fqf_0(s);
                fqf_02.c(byteBuffer.getInt(), this.mgx, this.mgy);
                this.gvU.add(fqf_02);
            }
        }
        return true;
    }

    public short eAo() {
        return this.mgx;
    }

    public short eAp() {
        return this.mgy;
    }

    public ArrayList<fqf_0> cUb() {
        return this.gvU;
    }
}

