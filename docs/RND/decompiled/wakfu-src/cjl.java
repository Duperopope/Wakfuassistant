/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cjl
extends nv_0 {
    private final long lWd;
    private final long lWe;

    public cjl(long l, long l2) {
        this.lWd = l;
        this.lWe = l2;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] aVX() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray;
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeLong(this.lWd);
                dataOutputStream.writeLong(this.lWe);
                dataOutputStream.flush();
                byArray = this.a((byte)3, byteArrayOutputStream.toByteArray());
            }
            return byArray;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to write message for token " + this.lWd, iOException);
        }
    }

    @Override
    public int d() {
        return 13712;
    }
}

