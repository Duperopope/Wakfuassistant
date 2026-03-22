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
 * Renamed from cS
 */
public final class cs_1
extends GeneratedMessageV3
implements cv_1 {
    private static final long iY = 0L;
    public static final int iZ = 1;
    long fG;
    public static final int ja = 2;
    int eb;
    private byte Y = (byte)-1;
    private static final cs_1 jb = new cs_1();
    static final Parser<cs_1> jc = new ct_1();

    cs_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cs_1() {
        this.eb = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cs_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cs_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor oe() {
        return ae_1.eW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eX.ensureFieldAccessorsInitialized(cs_1.class, cu_2.class);
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
        if (!(object instanceof cs_1)) {
            return super.equals(object);
        }
        cs_1 cs_12 = (cs_1)object;
        if (this.fD() != cs_12.fD()) {
            return false;
        }
        if (this.eb != cs_12.eb) {
            return false;
        }
        return this.unknownFields.equals((Object)cs_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cs_1.oe().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.eb;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cs_1 S(ByteBuffer byteBuffer) {
        return (cs_1)jc.parseFrom(byteBuffer);
    }

    public static cs_1 S(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)jc.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cs_1 aA(ByteString byteString) {
        return (cs_1)jc.parseFrom(byteString);
    }

    public static cs_1 S(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)jc.parseFrom(byteString, extensionRegistryLite);
    }

    public static cs_1 S(byte[] byArray) {
        return (cs_1)jc.parseFrom(byArray);
    }

    public static cs_1 S(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)jc.parseFrom(byArray, extensionRegistryLite);
    }

    public static cs_1 aK(InputStream inputStream) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(jc, (InputStream)inputStream);
    }

    public static cs_1 aK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(jc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cs_1 aL(InputStream inputStream) {
        return (cs_1)GeneratedMessageV3.parseDelimitedWithIOException(jc, (InputStream)inputStream);
    }

    public static cs_1 aL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseDelimitedWithIOException(jc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cs_1 S(CodedInputStream codedInputStream) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(jc, (CodedInputStream)codedInputStream);
    }

    public static cs_1 bC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(jc, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cu_2 of() {
        return cs_1.og();
    }

    public static cu_2 og() {
        return jb.oh();
    }

    public static cu_2 a(cs_1 cs_12) {
        return jb.oh().c(cs_12);
    }

    public cu_2 oh() {
        return this == jb ? new cu_2() : new cu_2().c(this);
    }

    protected cu_2 S(GeneratedMessageV3.BuilderParent builderParent) {
        cu_2 cu_22 = new cu_2(builderParent);
        return cu_22;
    }

    public static cs_1 oi() {
        return jb;
    }

    public static Parser<cs_1> z() {
        return jc;
    }

    public Parser<cs_1> getParserForType() {
        return jc;
    }

    public cs_1 oj() {
        return jb;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.S(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.oh();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.of();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.oh();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.of();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oj();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oj();
    }

    static /* synthetic */ boolean ok() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cs_1 cs_12) {
        return cs_12.unknownFields;
    }
}

