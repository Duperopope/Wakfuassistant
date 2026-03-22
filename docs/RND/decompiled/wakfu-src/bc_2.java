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
 * Renamed from bC
 */
public final class bc_2
extends GeneratedMessageV3
implements bf_2 {
    private static final long gV = 0L;
    public static final int gW = 1;
    long fG;
    private byte Y = (byte)-1;
    private static final bc_2 gX = new bc_2();
    static final Parser<bc_2> gY = new bd_2();

    bc_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bc_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bc_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bc_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block11;
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

    public static final Descriptors.Descriptor jo() {
        return ae_1.eE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eF.ensureFieldAccessorsInitialized(bc_2.class, be_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
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
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bc_2)) {
            return super.equals(object);
        }
        bc_2 bc_22 = (bc_2)object;
        if (this.fD() != bc_22.fD()) {
            return false;
        }
        return this.unknownFields.equals((Object)bc_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bc_2.jo().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bc_2 C(ByteBuffer byteBuffer) {
        return (bc_2)gY.parseFrom(byteBuffer);
    }

    public static bc_2 C(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)gY.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bc_2 ae(ByteString byteString) {
        return (bc_2)gY.parseFrom(byteString);
    }

    public static bc_2 C(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)gY.parseFrom(byteString, extensionRegistryLite);
    }

    public static bc_2 C(byte[] byArray) {
        return (bc_2)gY.parseFrom(byArray);
    }

    public static bc_2 C(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)gY.parseFrom(byArray, extensionRegistryLite);
    }

    public static bc_2 ae(InputStream inputStream) {
        return (bc_2)GeneratedMessageV3.parseWithIOException(gY, (InputStream)inputStream);
    }

    public static bc_2 ae(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)GeneratedMessageV3.parseWithIOException(gY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_2 af(InputStream inputStream) {
        return (bc_2)GeneratedMessageV3.parseDelimitedWithIOException(gY, (InputStream)inputStream);
    }

    public static bc_2 af(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)GeneratedMessageV3.parseDelimitedWithIOException(gY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_2 C(CodedInputStream codedInputStream) {
        return (bc_2)GeneratedMessageV3.parseWithIOException(gY, (CodedInputStream)codedInputStream);
    }

    public static bc_2 aG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_2)GeneratedMessageV3.parseWithIOException(gY, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public be_1 jp() {
        return bc_2.jq();
    }

    public static be_1 jq() {
        return gX.jr();
    }

    public static be_1 a(bc_2 bc_22) {
        return gX.jr().c(bc_22);
    }

    public be_1 jr() {
        return this == gX ? new be_1() : new be_1().c(this);
    }

    protected be_1 C(GeneratedMessageV3.BuilderParent builderParent) {
        be_1 be_12 = new be_1(builderParent);
        return be_12;
    }

    public static bc_2 js() {
        return gX;
    }

    public static Parser<bc_2> z() {
        return gY;
    }

    public Parser<bc_2> getParserForType() {
        return gY;
    }

    public bc_2 jt() {
        return gX;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.C(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.jr();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.jp();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.jr();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.jp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jt();
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bc_2 bc_22) {
        return bc_22.unknownFields;
    }
}

