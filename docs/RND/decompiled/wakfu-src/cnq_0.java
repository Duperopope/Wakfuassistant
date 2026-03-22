/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from cnQ
 */
public final class cnq_0
extends nv_0 {
    private final String mcj;
    private final String mck;
    private final long mcl;

    public cnq_0(String string, String string2, long l) {
        this.mcj = string;
        this.mck = string2;
        this.mcl = l;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] aVX() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray;
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeUTF(this.mcj);
                dataOutputStream.writeUTF(this.mck);
                dataOutputStream.writeLong(this.mcl);
                dataOutputStream.flush();
                byArray = this.a((byte)3, byteArrayOutputStream.toByteArray());
            }
            return byArray;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to write message", iOException);
        }
    }

    @Override
    public int d() {
        return 13073;
    }
}

