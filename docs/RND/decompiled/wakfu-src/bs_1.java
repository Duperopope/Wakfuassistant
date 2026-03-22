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
 * Renamed from bS
 */
public final class bs_1
extends GeneratedMessageV3
implements bv_2 {
    private static final long hr = 0L;
    public static final int hs = 1;
    long fG;
    public static final int ht = 2;
    int eb;
    private byte Y = (byte)-1;
    private static final bs_1 hu = new bs_1();
    static final Parser<bs_1> hv = new bt_1();

    bs_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bs_1() {
        this.eb = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bs_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bs_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        int n2;
                        this.eb = n2 = codedInputStream.readEnum();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
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

    public static final Descriptors.Descriptor kx() {
        return ae_1.ew;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ex.ensureFieldAccessorsInitialized(bs_1.class, bu_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public int fl() {
        return this.eb;
    }

    @Override
    public cq_2 ky() {
        cq_2 cq_22 = cq_2.af(this.eb);
        return cq_22 == null ? cq_2.iQ : cq_22;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (this.eb != cq_2.iN.getNumber()) {
            codedOutputStream.writeEnum(2, this.eb);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (this.eb != cq_2.iN.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.eb);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bs_1)) {
            return super.equals(object);
        }
        bs_1 bs_12 = (bs_1)object;
        if (this.fD() != bs_12.fD()) {
            return false;
        }
        if (this.eb != bs_12.eb) {
            return false;
        }
        return this.unknownFields.equals((Object)bs_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bs_1.kx().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.eb;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bs_1 G(ByteBuffer byteBuffer) {
        return (bs_1)hv.parseFrom(byteBuffer);
    }

    public static bs_1 G(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)hv.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bs_1 ai(ByteString byteString) {
        return (bs_1)hv.parseFrom(byteString);
    }

    public static bs_1 G(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)hv.parseFrom(byteString, extensionRegistryLite);
    }

    public static bs_1 G(byte[] byArray) {
        return (bs_1)hv.parseFrom(byArray);
    }

    public static bs_1 G(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)hv.parseFrom(byArray, extensionRegistryLite);
    }

    public static bs_1 am(InputStream inputStream) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(hv, (InputStream)inputStream);
    }

    public static bs_1 am(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(hv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bs_1 an(InputStream inputStream) {
        return (bs_1)GeneratedMessageV3.parseDelimitedWithIOException(hv, (InputStream)inputStream);
    }

    public static bs_1 an(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseDelimitedWithIOException(hv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bs_1 G(CodedInputStream codedInputStream) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(hv, (CodedInputStream)codedInputStream);
    }

    public static bs_1 aS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(hv, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bu_1 kz() {
        return bs_1.kA();
    }

    public static bu_1 kA() {
        return hu.kB();
    }

    public static bu_1 a(bs_1 bs_12) {
        return hu.kB().c(bs_12);
    }

    public bu_1 kB() {
        return this == hu ? new bu_1() : new bu_1().c(this);
    }

    protected bu_1 G(GeneratedMessageV3.BuilderParent builderParent) {
        bu_1 bu_12 = new bu_1(builderParent);
        return bu_12;
    }

    public static bs_1 kC() {
        return hu;
    }

    public static Parser<bs_1> z() {
        return hv;
    }

    public Parser<bs_1> getParserForType() {
        return hv;
    }

    public bs_1 kD() {
        return hu;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.G(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.kB();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.kz();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.kB();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.kz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kD();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bs_1 bs_12) {
        return bs_12.unknownFields;
    }
}

