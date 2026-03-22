/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cyW
 */
public final class cyw_0
extends nr_0 {
    private byte mmQ;
    private String aDC;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmQ = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        if (byArray2.length > 0) {
            byteBuffer.get(byArray2);
            this.aDC = BH.dc(byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 23946;
    }

    public byte evi() {
        return this.mmQ;
    }

    @Nullable
    public String aMy() {
        return this.aDC;
    }
}

