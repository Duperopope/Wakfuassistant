/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Strings
 */
import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import java.nio.ByteBuffer;

/*
 * Renamed from cyV
 */
public final class cyv_0
extends nr_0 {
    private long aDh;
    private long mmG;
    private String mmH;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mmG = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.mmH = new String(byArray2, Charsets.UTF_8);
        return true;
    }

    @Override
    public int d() {
        return 22621;
    }

    public long KU() {
        return this.aDh;
    }

    public String eFO() {
        return Strings.emptyToNull((String)this.mmH);
    }

    public long eFP() {
        return this.mmG;
    }
}

