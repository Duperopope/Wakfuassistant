/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ftJ
implements Iterable<ftH> {
    private static final Logger tgr = Logger.getLogger(ftJ.class);
    final TLongObjectHashMap<ftH> tgs = new TLongObjectHashMap();

    public ftJ() {
    }

    public ftJ(ftH ... ftHArray) {
        this();
        for (ftH ftH2 : ftHArray) {
            this.tgs.put(ftH2.aXb(), (Object)ftH2);
        }
    }

    public void a(long l, ftO ftO2) {
        this.tgs.put(l, (Object)new ftH(l, ftO2));
    }

    public int aVo() {
        return this.tgs.size();
    }

    public ftH uQ(long l) {
        return (ftH)this.tgs.get(l);
    }

    @Override
    @NotNull
    public Iterator<ftH> iterator() {
        return new ftK(this);
    }

    public int DN() {
        int[] nArray = new int[]{1};
        this.tgs.forEachValue((TObjectProcedure)new ftL(this, nArray));
        return nArray[0];
    }

    public void gD(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)this.tgs.size());
        this.tgs.forEachValue((TObjectProcedure)new ftM(this, byteBuffer));
    }

    public static ftJ gG(ByteBuffer byteBuffer) {
        return new ftJ().gH(byteBuffer);
    }

    private ftJ gH(ByteBuffer byteBuffer) {
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            ftH ftH2 = ftH.gE(byteBuffer);
            this.tgs.put(ftH2.aXb(), (Object)ftH2);
        }
        return this;
    }

    static ftO gI(ByteBuffer byteBuffer) {
        ftO ftO2 = new ftO(byteBuffer.getLong(), byteBuffer.getShort());
        return ftO2;
    }

    static void a(ftO ftO2, ByteBuffer byteBuffer) {
        byteBuffer.putLong(ftO2.gmx());
        byteBuffer.putShort(ftO2.gmw());
    }
}

