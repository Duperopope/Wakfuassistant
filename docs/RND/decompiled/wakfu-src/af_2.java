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
 * Renamed from aF
 */
public final class af_2
extends GeneratedMessageV3
implements ai_1 {
    private static final long fE = 0L;
    public static final int fF = 1;
    long fG;
    public static final int fH = 2;
    long fI;
    private byte Y = (byte)-1;
    private static final af_2 fJ = new af_2();
    static final Parser<af_2> fK = new ag_1();

    af_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private af_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new af_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    af_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.fI = codedInputStream.readInt64();
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

    public static final Descriptors.Descriptor fC() {
        return ae_1.eQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eR.ensureFieldAccessorsInitialized(af_2.class, ah_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public long fE() {
        return this.fI;
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
        if (this.fI != 0L) {
            codedOutputStream.writeInt64(2, this.fI);
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
        if (this.fI != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.fI);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof af_2)) {
            return super.equals(object);
        }
        af_2 af_22 = (af_2)object;
        if (this.fD() != af_22.fD()) {
            return false;
        }
        if (this.fE() != af_22.fE()) {
            return false;
        }
        return this.unknownFields.equals((Object)af_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + af_2.fC().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.fE());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static af_2 q(ByteBuffer byteBuffer) {
        return (af_2)fK.parseFrom(byteBuffer);
    }

    public static af_2 q(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)fK.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static af_2 K(ByteString byteString) {
        return (af_2)fK.parseFrom(byteString);
    }

    public static af_2 q(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)fK.parseFrom(byteString, extensionRegistryLite);
    }

    public static af_2 q(byte[] byArray) {
        return (af_2)fK.parseFrom(byArray);
    }

    public static af_2 q(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)fK.parseFrom(byArray, extensionRegistryLite);
    }

    public static af_2 G(InputStream inputStream) {
        return (af_2)GeneratedMessageV3.parseWithIOException(fK, (InputStream)inputStream);
    }

    public static af_2 G(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)GeneratedMessageV3.parseWithIOException(fK, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static af_2 H(InputStream inputStream) {
        return (af_2)GeneratedMessageV3.parseDelimitedWithIOException(fK, (InputStream)inputStream);
    }

    public static af_2 H(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)GeneratedMessageV3.parseDelimitedWithIOException(fK, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static af_2 q(CodedInputStream codedInputStream) {
        return (af_2)GeneratedMessageV3.parseWithIOException(fK, (CodedInputStream)codedInputStream);
    }

    public static af_2 W(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_2)GeneratedMessageV3.parseWithIOException(fK, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ah_1 fF() {
        return af_2.fG();
    }

    public static ah_1 fG() {
        return fJ.fH();
    }

    public static ah_1 a(af_2 af_22) {
        return fJ.fH().c(af_22);
    }

    public ah_1 fH() {
        return this == fJ ? new ah_1() : new ah_1().c(this);
    }

    protected ah_1 q(GeneratedMessageV3.BuilderParent builderParent) {
        ah_1 ah_12 = new ah_1(builderParent);
        return ah_12;
    }

    public static af_2 fI() {
        return fJ;
    }

    public static Parser<af_2> z() {
        return fK;
    }

    public Parser<af_2> getParserForType() {
        return fK;
    }

    public af_2 fJ() {
        return fJ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.q(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.fH();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.fF();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.fH();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.fF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.fJ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.fJ();
    }

    static /* synthetic */ boolean fK() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(af_2 af_22) {
        return af_22.unknownFields;
    }
}

