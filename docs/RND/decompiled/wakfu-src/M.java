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

public final class M
extends GeneratedMessageV3
implements R {
    private static final long bx = 0L;
    public static final int by = 1;
    long bd;
    public static final int bz = 2;
    long bA;
    public static final int bB = 3;
    int bC;
    private byte Y = (byte)-1;
    private static final M bD = new M();
    static final Parser<M> bE = new N();

    M(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private M() {
        this.bC = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new M();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    M(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.bd = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 16: {
                        this.bA = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 24: {
                        int n2;
                        this.bC = n2 = codedInputStream.readEnum();
                        continue block13;
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

    public static final Descriptors.Descriptor ck() {
        return c_0.aP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aQ.ensureFieldAccessorsInitialized(M.class, o_0.class);
    }

    @Override
    public long bu() {
        return this.bd;
    }

    @Override
    public long bw() {
        return this.bA;
    }

    @Override
    public int cl() {
        return this.bC;
    }

    @Override
    public p_0 cm() {
        p_0 p_02 = p_0.l(this.bC);
        return p_02 == null ? p_0.bI : p_02;
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
        if (this.bd != 0L) {
            codedOutputStream.writeInt64(1, this.bd);
        }
        if (this.bA != 0L) {
            codedOutputStream.writeInt64(2, this.bA);
        }
        if (this.bC != p_0.bF.getNumber()) {
            codedOutputStream.writeEnum(3, this.bC);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.bd != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.bd);
        }
        if (this.bA != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.bA);
        }
        if (this.bC != p_0.bF.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)3, (int)this.bC);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof M)) {
            return super.equals(object);
        }
        M m = (M)object;
        if (this.bu() != m.bu()) {
            return false;
        }
        if (this.bw() != m.bw()) {
            return false;
        }
        if (this.bC != m.bC) {
            return false;
        }
        return this.unknownFields.equals((Object)m.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + M.ck().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.bu());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.bw());
        n = 37 * n + 3;
        n = 53 * n + this.bC;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static M h(ByteBuffer byteBuffer) {
        return (M)bE.parseFrom(byteBuffer);
    }

    public static M h(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (M)bE.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static M A(ByteString byteString) {
        return (M)bE.parseFrom(byteString);
    }

    public static M h(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (M)bE.parseFrom(byteString, extensionRegistryLite);
    }

    public static M h(byte[] byArray) {
        return (M)bE.parseFrom(byArray);
    }

    public static M h(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (M)bE.parseFrom(byArray, extensionRegistryLite);
    }

    public static M o(InputStream inputStream) {
        return (M)GeneratedMessageV3.parseWithIOException(bE, (InputStream)inputStream);
    }

    public static M o(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (M)GeneratedMessageV3.parseWithIOException(bE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static M p(InputStream inputStream) {
        return (M)GeneratedMessageV3.parseDelimitedWithIOException(bE, (InputStream)inputStream);
    }

    public static M p(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (M)GeneratedMessageV3.parseDelimitedWithIOException(bE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static M h(CodedInputStream codedInputStream) {
        return (M)GeneratedMessageV3.parseWithIOException(bE, (CodedInputStream)codedInputStream);
    }

    public static M v(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (M)GeneratedMessageV3.parseWithIOException(bE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public o_0 cn() {
        return M.co();
    }

    public static o_0 co() {
        return bD.cp();
    }

    public static o_0 a(M m) {
        return bD.cp().c(m);
    }

    public o_0 cp() {
        return this == bD ? new o_0() : new o_0().c(this);
    }

    protected o_0 h(GeneratedMessageV3.BuilderParent builderParent) {
        o_0 o_02 = new o_0(builderParent);
        return o_02;
    }

    public static M cq() {
        return bD;
    }

    public static Parser<M> z() {
        return bE;
    }

    public Parser<M> getParserForType() {
        return bE;
    }

    public M cr() {
        return bD;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.h(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.cp();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.cn();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.cp();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.cn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cr();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(M m) {
        return m.unknownFields;
    }
}

