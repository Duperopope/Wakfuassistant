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
 * Renamed from gu
 */
@Deprecated
public final class gu_1
extends GeneratedMessageV3
implements gx_1 {
    private static final long sh = 0L;
    int an;
    public static final int si = 1;
    int sj;
    public static final int sk = 2;
    int lh;
    public static final int sl = 3;
    int lj;
    private byte Y = (byte)-1;
    private static final gu_1 sm = new gu_1();
    @Deprecated
    public static final Parser<gu_1> sn = new gv_1();

    gu_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gu_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gu_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gu_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.sj = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.lh = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.lj = codedInputStream.readInt32();
                        continue block13;
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

    public static final Descriptors.Descriptor DO() {
        return gt_1.sf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.sg.ensureFieldAccessorsInitialized(gu_1.class, gw_1.class);
    }

    @Override
    public boolean DP() {
        return (this.an & 1) != 0;
    }

    @Override
    public int DQ() {
        return this.sj;
    }

    @Override
    public boolean sk() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sl() {
        return this.lh;
    }

    @Override
    public boolean sm() {
        return (this.an & 4) != 0;
    }

    @Override
    public int sn() {
        return this.lj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.DP()) {
            this.Y = 0;
            return false;
        }
        if (!this.sk()) {
            this.Y = 0;
            return false;
        }
        if (!this.sm()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.sj);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.lh);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.lj);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.sj);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.lh);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.lj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gu_1)) {
            return super.equals(object);
        }
        gu_1 gu_12 = (gu_1)object;
        if (this.DP() != gu_12.DP()) {
            return false;
        }
        if (this.DP() && this.DQ() != gu_12.DQ()) {
            return false;
        }
        if (this.sk() != gu_12.sk()) {
            return false;
        }
        if (this.sk() && this.sl() != gu_12.sl()) {
            return false;
        }
        if (this.sm() != gu_12.sm()) {
            return false;
        }
        if (this.sm() && this.sn() != gu_12.sn()) {
            return false;
        }
        return this.unknownFields.equals((Object)gu_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gu_1.DO().hashCode();
        if (this.DP()) {
            n = 37 * n + 1;
            n = 53 * n + this.DQ();
        }
        if (this.sk()) {
            n = 37 * n + 2;
            n = 53 * n + this.sl();
        }
        if (this.sm()) {
            n = 37 * n + 3;
            n = 53 * n + this.sn();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gu_1 aH(ByteBuffer byteBuffer) {
        return (gu_1)sn.parseFrom(byteBuffer);
    }

    public static gu_1 aD(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)sn.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gu_1 bw(ByteString byteString) {
        return (gu_1)sn.parseFrom(byteString);
    }

    public static gu_1 aD(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)sn.parseFrom(byteString, extensionRegistryLite);
    }

    public static gu_1 aE(byte[] byArray) {
        return (gu_1)sn.parseFrom(byArray);
    }

    public static gu_1 aD(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)sn.parseFrom(byArray, extensionRegistryLite);
    }

    public static gu_1 cg(InputStream inputStream) {
        return (gu_1)GeneratedMessageV3.parseWithIOException(sn, (InputStream)inputStream);
    }

    public static gu_1 cg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)GeneratedMessageV3.parseWithIOException(sn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gu_1 ch(InputStream inputStream) {
        return (gu_1)GeneratedMessageV3.parseDelimitedWithIOException(sn, (InputStream)inputStream);
    }

    public static gu_1 ch(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)GeneratedMessageV3.parseDelimitedWithIOException(sn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gu_1 aD(CodedInputStream codedInputStream) {
        return (gu_1)GeneratedMessageV3.parseWithIOException(sn, (CodedInputStream)codedInputStream);
    }

    public static gu_1 dJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gu_1)GeneratedMessageV3.parseWithIOException(sn, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gw_1 DR() {
        return gu_1.DS();
    }

    public static gw_1 DS() {
        return sm.DT();
    }

    public static gw_1 a(gu_1 gu_12) {
        return sm.DT().c(gu_12);
    }

    public gw_1 DT() {
        return this == sm ? new gw_1() : new gw_1().c(this);
    }

    protected gw_1 aD(GeneratedMessageV3.BuilderParent builderParent) {
        gw_1 gw_12 = new gw_1(builderParent);
        return gw_12;
    }

    public static gu_1 DU() {
        return sm;
    }

    public static Parser<gu_1> z() {
        return sn;
    }

    public Parser<gu_1> getParserForType() {
        return sn;
    }

    public gu_1 DV() {
        return sm;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aD(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.DT();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.DR();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.DT();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.DR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.DV();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.DV();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gu_1 gu_12) {
        return gu_12.unknownFields;
    }
}

