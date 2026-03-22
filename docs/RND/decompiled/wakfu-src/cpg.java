/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class cpg
extends nr_0 {
    private long aDh;
    private long lVH;
    @Nullable
    private fhm hUO;
    private int mdL;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.lVH = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        List<fhm> list = fhj.eO(byArray2);
        this.hUO = list.isEmpty() ? null : list.get(0);
        this.mdL = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13839;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public long exc() {
        return this.lVH;
    }

    @Nullable
    @Generated
    public fhm dnO() {
        return this.hUO;
    }

    @Generated
    public int exd() {
        return this.mdL;
    }
}

