/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.apache.log4j.Logger;

public class cyl
extends Nr {
    private static final Logger mmu = Logger.getLogger(cyl.class);
    private final Map<Integer, long[]> mmv = new HashMap<Integer, long[]>();

    @Override
    public boolean dn(byte[] byArray) {
        byte[] byArray2;
        try {
            byArray2 = fum.eY(byArray);
        }
        catch (IOException iOException) {
            mmu.error((Object)("[MARKET] Error while decompressing item prices data: " + Arrays.toString(byArray)), (Throwable)iOException);
            return true;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray2);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            byte by = byteBuffer.get();
            long[] lArray = new long[5];
            for (int i = 0; i < 5; ++i) {
                lArray[i] = (by & 1 << i) > 0 ? byteBuffer.getLong() : -1L;
            }
            this.mmv.put(n, lArray);
        }
        return true;
    }

    @Override
    public int d() {
        return 15313;
    }

    @Generated
    public Map<Integer, long[]> eFu() {
        return this.mmv;
    }
}
