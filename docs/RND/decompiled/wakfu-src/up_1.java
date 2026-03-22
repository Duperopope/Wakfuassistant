/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uP
 */
public class up_1
implements gs_0 {
    public short aec = 0;
    public short aed = 0;
    public short aee = 0;
    public short aef = 0;
    public short aeg = 0;
    public short aeh = 0;
    public static final int aei = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.aec);
        byteBuffer.putShort(this.aed);
        byteBuffer.putShort(this.aee);
        byteBuffer.putShort(this.aef);
        byteBuffer.putShort(this.aeg);
        byteBuffer.putShort(this.aeh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aec = byteBuffer.getShort();
        this.aed = byteBuffer.getShort();
        this.aee = byteBuffer.getShort();
        this.aef = byteBuffer.getShort();
        this.aeg = byteBuffer.getShort();
        this.aeh = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.aec = 0;
        this.aed = 0;
        this.aee = 0;
        this.aef = 0;
        this.aeg = 0;
        this.aeh = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cs(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cs(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("partitionX=").append(this.aec).append('\n');
        stringBuilder.append(string).append("partitionY=").append(this.aed).append('\n');
        stringBuilder.append(string).append("topLeftPatch=").append(this.aee).append('\n');
        stringBuilder.append(string).append("topRightPatch=").append(this.aef).append('\n');
        stringBuilder.append(string).append("bottomLeftPatch=").append(this.aeg).append('\n');
        stringBuilder.append(string).append("bottomRightPatch=").append(this.aeh).append('\n');
    }
}

