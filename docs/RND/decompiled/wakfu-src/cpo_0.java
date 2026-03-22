/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpO
 */
public class cpo_0
extends nr_0 {
    private long aDg;
    private gj_1 mek;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDg = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        try {
            this.mek = gj_1.aD(byArray2);
            return true;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dwV.error((Object)"Error unserializing secureCraft informations", (Throwable)invalidProtocolBufferException);
            return false;
        }
    }

    @Override
    public int d() {
        return 13807;
    }

    @Generated
    public long xl() {
        return this.aDg;
    }

    @Generated
    public gj_1 exG() {
        return this.mek;
    }
}

