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
 * Renamed from ap
 */
public final class ap_2
extends GeneratedMessageV3
implements as_2 {
    private static final long dJ = 0L;
    public static final int dK = 1;
    int dL;
    public static final int dM = 2;
    ByteString dN;
    private byte Y = (byte)-1;
    private static final ap_2 dO = new ap_2();
    static final Parser<ap_2> dP = new aq_1();

    ap_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ap_2() {
        this.dN = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ap_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ap_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.dL = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        this.dN = codedInputStream.readBytes();
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

    public static final Descriptors.Descriptor eC() {
        return ak_1.dn;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.do.ensureFieldAccessorsInitialized(ap_2.class, ar_2.class);
    }

    @Override
    public int d() {
        return this.dL;
    }

    @Override
    public ByteString eD() {
        return this.dN;
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
        if (this.dL != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        if (!this.dN.isEmpty()) {
            codedOutputStream.writeBytes(2, this.dN);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.dL != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        if (!this.dN.isEmpty()) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.dN);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ap_2)) {
            return super.equals(object);
        }
        ap_2 ap_22 = (ap_2)object;
        if (this.d() != ap_22.d()) {
            return false;
        }
        if (!this.eD().equals((Object)ap_22.eD())) {
            return false;
        }
        return this.unknownFields.equals((Object)ap_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ap_2.eC().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.d();
        n = 37 * n + 2;
        n = 53 * n + this.eD().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ap_2 n(ByteBuffer byteBuffer) {
        return (ap_2)dP.parseFrom(byteBuffer);
    }

    public static ap_2 n(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)dP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ap_2 G(ByteString byteString) {
        return (ap_2)dP.parseFrom(byteString);
    }

    public static ap_2 n(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)dP.parseFrom(byteString, extensionRegistryLite);
    }

    public static ap_2 n(byte[] byArray) {
        return (ap_2)dP.parseFrom(byArray);
    }

    public static ap_2 n(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)dP.parseFrom(byArray, extensionRegistryLite);
    }

    public static ap_2 A(InputStream inputStream) {
        return (ap_2)GeneratedMessageV3.parseWithIOException(dP, (InputStream)inputStream);
    }

    public static ap_2 A(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)GeneratedMessageV3.parseWithIOException(dP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ap_2 B(InputStream inputStream) {
        return (ap_2)GeneratedMessageV3.parseDelimitedWithIOException(dP, (InputStream)inputStream);
    }

    public static ap_2 B(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)GeneratedMessageV3.parseDelimitedWithIOException(dP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ap_2 n(CodedInputStream codedInputStream) {
        return (ap_2)GeneratedMessageV3.parseWithIOException(dP, (CodedInputStream)codedInputStream);
    }

    public static ap_2 N(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ap_2)GeneratedMessageV3.parseWithIOException(dP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ar_2 eE() {
        return ap_2.eF();
    }

    public static ar_2 eF() {
        return dO.eG();
    }

    public static ar_2 c(ap_2 ap_22) {
        return dO.eG().e(ap_22);
    }

    public ar_2 eG() {
        return this == dO ? new ar_2() : new ar_2().e(this);
    }

    protected ar_2 n(GeneratedMessageV3.BuilderParent builderParent) {
        ar_2 ar_22 = new ar_2(builderParent);
        return ar_22;
    }

    public static ap_2 eH() {
        return dO;
    }

    public static Parser<ap_2> z() {
        return dP;
    }

    public Parser<ap_2> getParserForType() {
        return dP;
    }

    public ap_2 eI() {
        return dO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.n(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.eG();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.eE();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.eG();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.eE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.eI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.eI();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(ap_2 ap_22) {
        return ap_22.unknownFields;
    }
}

