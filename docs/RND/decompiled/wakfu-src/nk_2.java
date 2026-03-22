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
 * Renamed from nK
 */
public final class nk_2
extends GeneratedMessageV3
implements nn_2 {
    private static final long Po = 0L;
    int an;
    public static final int Pp = 2;
    long nW;
    private byte Y = (byte)-1;
    private static final nk_2 Pq = new nk_2();
    @Deprecated
    public static final Parser<nk_2> Pr = new nl_2();

    nk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nk_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new nk_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 16: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block11;
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

    public static final Descriptors.Descriptor asB() {
        return nj_2.Pk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Pl.ensureFieldAccessorsInitialized(nk_2.class, nm_2.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nk_2)) {
            return super.equals(object);
        }
        nk_2 nk_22 = (nk_2)object;
        if (this.xk() != nk_22.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != nk_22.xl()) {
            return false;
        }
        return this.unknownFields.equals((Object)nk_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nk_2.asB().hashCode();
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nk_2 cn(ByteBuffer byteBuffer) {
        return (nk_2)Pr.parseFrom(byteBuffer);
    }

    public static nk_2 cj(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)Pr.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nk_2 dK(ByteString byteString) {
        return (nk_2)Pr.parseFrom(byteString);
    }

    public static nk_2 cj(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)Pr.parseFrom(byteString, extensionRegistryLite);
    }

    public static nk_2 cl(byte[] byArray) {
        return (nk_2)Pr.parseFrom(byArray);
    }

    public static nk_2 cj(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)Pr.parseFrom(byArray, extensionRegistryLite);
    }

    public static nk_2 fs(InputStream inputStream) {
        return (nk_2)GeneratedMessageV3.parseWithIOException(Pr, (InputStream)inputStream);
    }

    public static nk_2 fs(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)GeneratedMessageV3.parseWithIOException(Pr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk_2 ft(InputStream inputStream) {
        return (nk_2)GeneratedMessageV3.parseDelimitedWithIOException(Pr, (InputStream)inputStream);
    }

    public static nk_2 ft(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)GeneratedMessageV3.parseDelimitedWithIOException(Pr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk_2 cj(CodedInputStream codedInputStream) {
        return (nk_2)GeneratedMessageV3.parseWithIOException(Pr, (CodedInputStream)codedInputStream);
    }

    public static nk_2 iB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_2)GeneratedMessageV3.parseWithIOException(Pr, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nm_2 asC() {
        return nk_2.asD();
    }

    public static nm_2 asD() {
        return Pq.asE();
    }

    public static nm_2 a(nk_2 nk_22) {
        return Pq.asE().c(nk_22);
    }

    public nm_2 asE() {
        return this == Pq ? new nm_2() : new nm_2().c(this);
    }

    protected nm_2 cj(GeneratedMessageV3.BuilderParent builderParent) {
        nm_2 nm_22 = new nm_2(builderParent);
        return nm_22;
    }

    public static nk_2 asF() {
        return Pq;
    }

    public static Parser<nk_2> z() {
        return Pr;
    }

    public Parser<nk_2> getParserForType() {
        return Pr;
    }

    public nk_2 asG() {
        return Pq;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cj(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.asE();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.asC();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.asE();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.asC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.asG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.asG();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nk_2 nk_22) {
        return nk_22.unknownFields;
    }
}

