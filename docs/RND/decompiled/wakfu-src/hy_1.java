/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from hy
 */
public final class hy_1
extends GeneratedMessageV3
implements hb_1 {
    private static final long uS = 0L;
    int an;
    public static final int uT = 1;
    int uU;
    public static final int uV = 2;
    int uW;
    public static final int uX = 3;
    long uY;
    public static final int uZ = 4;
    int va;
    public static final int vb = 5;
    long vc;
    public static final int vd = 6;
    int ve;
    public static final int vf = 7;
    int vg;
    public static final int vh = 8;
    hi_1 vi;
    public static final int vj = 9;
    long vk;
    public static final int vl = 10;
    int vm;
    public static final int vn = 11;
    int vo;
    private byte Y = (byte)-1;
    private static final hy_1 vp = new hy_1();
    @Deprecated
    public static final Parser<hy_1> vq = new hz_1();

    hy_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hy_1() {
        this.uW = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hy_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hy_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block21: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block21;
                    }
                    case 8: {
                        this.an |= 1;
                        this.uU = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        hr_1 hr_12 = hr_1.dw(n2);
                        if (hr_12 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block21;
                        }
                        this.an |= 2;
                        this.uW = n2;
                        continue block21;
                    }
                    case 24: {
                        this.an |= 4;
                        this.uY = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 32: {
                        this.an |= 8;
                        this.va = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.vc = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.ve = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.vg = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 66: {
                        hk_1 hk_12 = null;
                        if ((this.an & 0x80) != 0) {
                            hk_12 = this.vi.HA();
                        }
                        this.vi = (hi_1)codedInputStream.readMessage(hi_1.ui, extensionRegistryLite);
                        if (hk_12 != null) {
                            hk_12.c(this.vi);
                            this.vi = hk_12.HG();
                        }
                        this.an |= 0x80;
                        continue block21;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.vk = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.vm = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.vo = codedInputStream.readInt32();
                        continue block21;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor IM() {
        return hh_1.tS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tT.ensureFieldAccessorsInitialized(hy_1.class, ha_1.class);
    }

    @Override
    public boolean IN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int IO() {
        return this.uU;
    }

    @Override
    public boolean IP() {
        return (this.an & 2) != 0;
    }

    @Override
    public hr_1 IQ() {
        hr_1 hr_12 = hr_1.dw(this.uW);
        return hr_12 == null ? hr_1.uw : hr_12;
    }

    @Override
    public boolean IR() {
        return (this.an & 4) != 0;
    }

    @Override
    public long IS() {
        return this.uY;
    }

    @Override
    public boolean IT() {
        return (this.an & 8) != 0;
    }

    @Override
    public int IU() {
        return this.va;
    }

    @Override
    public boolean IV() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long IW() {
        return this.vc;
    }

    @Override
    public boolean IX() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int IY() {
        return this.ve;
    }

    @Override
    public boolean IZ() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int Ja() {
        return this.vg;
    }

    @Override
    public boolean Jb() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public hi_1 Jc() {
        return this.vi == null ? hi_1.HB() : this.vi;
    }

    @Override
    public hq_1 Jd() {
        return this.vi == null ? hi_1.HB() : this.vi;
    }

    @Override
    public boolean Je() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long Jf() {
        return this.vk;
    }

    @Override
    public boolean Jg() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Jh() {
        return this.vm;
    }

    @Override
    public boolean Ji() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int Jj() {
        return this.vo;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.IN()) {
            this.Y = 0;
            return false;
        }
        if (this.Jb() && !this.Jc().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.uU);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeEnum(2, this.uW);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.uY);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.va);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(5, this.vc);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(6, this.ve);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(7, this.vg);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeMessage(8, (MessageLite)this.Jc());
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt64(9, this.vk);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(10, this.vm);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.vo);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.uU);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.uW);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.uY);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.va);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.vc);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.ve);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.vg);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.Jc());
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.vk);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.vm);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.vo);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hy_1)) {
            return super.equals(object);
        }
        hy_1 hy_12 = (hy_1)object;
        if (this.IN() != hy_12.IN()) {
            return false;
        }
        if (this.IN() && this.IO() != hy_12.IO()) {
            return false;
        }
        if (this.IP() != hy_12.IP()) {
            return false;
        }
        if (this.IP() && this.uW != hy_12.uW) {
            return false;
        }
        if (this.IR() != hy_12.IR()) {
            return false;
        }
        if (this.IR() && this.IS() != hy_12.IS()) {
            return false;
        }
        if (this.IT() != hy_12.IT()) {
            return false;
        }
        if (this.IT() && this.IU() != hy_12.IU()) {
            return false;
        }
        if (this.IV() != hy_12.IV()) {
            return false;
        }
        if (this.IV() && this.IW() != hy_12.IW()) {
            return false;
        }
        if (this.IX() != hy_12.IX()) {
            return false;
        }
        if (this.IX() && this.IY() != hy_12.IY()) {
            return false;
        }
        if (this.IZ() != hy_12.IZ()) {
            return false;
        }
        if (this.IZ() && this.Ja() != hy_12.Ja()) {
            return false;
        }
        if (this.Jb() != hy_12.Jb()) {
            return false;
        }
        if (this.Jb() && !this.Jc().equals(hy_12.Jc())) {
            return false;
        }
        if (this.Je() != hy_12.Je()) {
            return false;
        }
        if (this.Je() && this.Jf() != hy_12.Jf()) {
            return false;
        }
        if (this.Jg() != hy_12.Jg()) {
            return false;
        }
        if (this.Jg() && this.Jh() != hy_12.Jh()) {
            return false;
        }
        if (this.Ji() != hy_12.Ji()) {
            return false;
        }
        if (this.Ji() && this.Jj() != hy_12.Jj()) {
            return false;
        }
        return this.unknownFields.equals((Object)hy_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hy_1.IM().hashCode();
        if (this.IN()) {
            n = 37 * n + 1;
            n = 53 * n + this.IO();
        }
        if (this.IP()) {
            n = 37 * n + 2;
            n = 53 * n + this.uW;
        }
        if (this.IR()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.IS());
        }
        if (this.IT()) {
            n = 37 * n + 4;
            n = 53 * n + this.IU();
        }
        if (this.IV()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.IW());
        }
        if (this.IX()) {
            n = 37 * n + 6;
            n = 53 * n + this.IY();
        }
        if (this.IZ()) {
            n = 37 * n + 7;
            n = 53 * n + this.Ja();
        }
        if (this.Jb()) {
            n = 37 * n + 8;
            n = 53 * n + this.Jc().hashCode();
        }
        if (this.Je()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.Jf());
        }
        if (this.Jg()) {
            n = 37 * n + 10;
            n = 53 * n + this.Jh();
        }
        if (this.Ji()) {
            n = 37 * n + 11;
            n = 53 * n + this.Jj();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hy_1 aT(ByteBuffer byteBuffer) {
        return (hy_1)vq.parseFrom(byteBuffer);
    }

    public static hy_1 aP(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)vq.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hy_1 bK(ByteString byteString) {
        return (hy_1)vq.parseFrom(byteString);
    }

    public static hy_1 aP(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)vq.parseFrom(byteString, extensionRegistryLite);
    }

    public static hy_1 aQ(byte[] byArray) {
        return (hy_1)vq.parseFrom(byArray);
    }

    public static hy_1 aP(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)vq.parseFrom(byArray, extensionRegistryLite);
    }

    public static hy_1 cE(InputStream inputStream) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(vq, (InputStream)inputStream);
    }

    public static hy_1 cE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(vq, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hy_1 cF(InputStream inputStream) {
        return (hy_1)GeneratedMessageV3.parseDelimitedWithIOException(vq, (InputStream)inputStream);
    }

    public static hy_1 cF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseDelimitedWithIOException(vq, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hy_1 aP(CodedInputStream codedInputStream) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(vq, (CodedInputStream)codedInputStream);
    }

    public static hy_1 et(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(vq, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ha_1 Jk() {
        return hy_1.Jl();
    }

    public static ha_1 Jl() {
        return vp.Jm();
    }

    public static ha_1 a(hy_1 hy_12) {
        return vp.Jm().c(hy_12);
    }

    public ha_1 Jm() {
        return this == vp ? new ha_1() : new ha_1().c(this);
    }

    protected ha_1 aP(GeneratedMessageV3.BuilderParent builderParent) {
        ha_1 ha_12 = new ha_1(builderParent);
        return ha_12;
    }

    public static hy_1 Jn() {
        return vp;
    }

    public static Parser<hy_1> z() {
        return vq;
    }

    public Parser<hy_1> getParserForType() {
        return vq;
    }

    public hy_1 Jo() {
        return vp;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aP(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Jm();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Jk();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Jm();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Jk();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Jo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Jo();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hy_1 hy_12) {
        return hy_12.unknownFields;
    }
}

