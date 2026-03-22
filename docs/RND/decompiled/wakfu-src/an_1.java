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
 * Renamed from aN
 */
public final class an_1
extends GeneratedMessageV3
implements aq_2 {
    private static final long fS = 0L;
    public static final int fT = 1;
    long fG;
    public static final int fU = 2;
    long fI;
    private byte Y = (byte)-1;
    private static final an_1 fV = new an_1();
    static final Parser<an_1> fW = new ao_2();

    an_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private an_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new an_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    an_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor gl() {
        return ae_1.eS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eT.ensureFieldAccessorsInitialized(an_1.class, ap_1.class);
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
        if (!(object instanceof an_1)) {
            return super.equals(object);
        }
        an_1 an_12 = (an_1)object;
        if (this.fD() != an_12.fD()) {
            return false;
        }
        if (this.fE() != an_12.fE()) {
            return false;
        }
        return this.unknownFields.equals((Object)an_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + an_1.gl().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.fE());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static an_1 s(ByteBuffer byteBuffer) {
        return (an_1)fW.parseFrom(byteBuffer);
    }

    public static an_1 s(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)fW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static an_1 M(ByteString byteString) {
        return (an_1)fW.parseFrom(byteString);
    }

    public static an_1 s(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)fW.parseFrom(byteString, extensionRegistryLite);
    }

    public static an_1 s(byte[] byArray) {
        return (an_1)fW.parseFrom(byArray);
    }

    public static an_1 s(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)fW.parseFrom(byArray, extensionRegistryLite);
    }

    public static an_1 K(InputStream inputStream) {
        return (an_1)GeneratedMessageV3.parseWithIOException(fW, (InputStream)inputStream);
    }

    public static an_1 K(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)GeneratedMessageV3.parseWithIOException(fW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static an_1 L(InputStream inputStream) {
        return (an_1)GeneratedMessageV3.parseDelimitedWithIOException(fW, (InputStream)inputStream);
    }

    public static an_1 L(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)GeneratedMessageV3.parseDelimitedWithIOException(fW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static an_1 s(CodedInputStream codedInputStream) {
        return (an_1)GeneratedMessageV3.parseWithIOException(fW, (CodedInputStream)codedInputStream);
    }

    public static an_1 ac(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_1)GeneratedMessageV3.parseWithIOException(fW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ap_1 gm() {
        return an_1.gn();
    }

    public static ap_1 gn() {
        return fV.go();
    }

    public static ap_1 a(an_1 an_12) {
        return fV.go().c(an_12);
    }

    public ap_1 go() {
        return this == fV ? new ap_1() : new ap_1().c(this);
    }

    protected ap_1 s(GeneratedMessageV3.BuilderParent builderParent) {
        ap_1 ap_12 = new ap_1(builderParent);
        return ap_12;
    }

    public static an_1 gp() {
        return fV;
    }

    public static Parser<an_1> z() {
        return fW;
    }

    public Parser<an_1> getParserForType() {
        return fW;
    }

    public an_1 gq() {
        return fV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.s(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.go();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.gm();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.go();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.gm();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gq();
    }

    static /* synthetic */ boolean gr() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(an_1 an_12) {
        return an_12.unknownFields;
    }
}

