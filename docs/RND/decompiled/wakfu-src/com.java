/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class com
extends nr_0 {
    private byte[] mcH;
    private byte[] mcL;
    private byte[] mcM;
    private long[] mcN;

    public byte[] evZ() {
        return this.mcL;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        Short s = byteBuffer.getShort();
        this.mcN = new long[s.shortValue()];
        for (int i = 0; i < s; ++i) {
            this.mcN[i] = byteBuffer.getLong();
        }
        this.mcH = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcH);
        this.mcL = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcL);
        this.mcM = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcM);
        return true;
    }

    @Override
    public int d() {
        return 12292;
    }

    public byte[] evU() {
        return ArrayUtils.clone((byte[])this.mcH);
    }

    public byte[] ewa() {
        return this.mcM;
    }

    public long[] ewb() {
        return ArrayUtils.clone((long[])this.mcN);
    }

    @Override
    public String toString() {
        return "CharacterInformationMessage{m_serializedCharacterInfo=" + Arrays.toString(this.mcH) + ", m_reservedIds=" + Arrays.toString(this.mcN) + "}";
    }
}

