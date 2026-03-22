/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/*
 * Renamed from cpa
 */
public class cpa_0
extends nr_0 {
    private long lWd;
    private eia_0 mdD;
    private boolean hXv;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));){
            this.lWd = dataInputStream.readLong();
            this.mdD = eia_0.PL(dataInputStream.readByte());
            this.hXv = dataInputStream.readBoolean();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to read message of length " + byArray.length, iOException);
        }
        return true;
    }

    @Override
    public int d() {
        return 13698;
    }

    public long ewS() {
        return this.lWd;
    }

    public boolean aGv() {
        return this.hXv;
    }

    public eia_0 ewT() {
        return this.mdD;
    }
}

