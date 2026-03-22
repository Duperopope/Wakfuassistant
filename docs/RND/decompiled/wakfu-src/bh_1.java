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
 * Renamed from bh
 */
public final class bh_1
extends GeneratedMessageV3
implements bk_1 {
    private static final long gB = 0L;
    public static final int gC = 1;
    volatile Object bs;
    private byte Y = (byte)-1;
    private static final bh_1 gD = new bh_1();
    static final Parser<bh_1> gE = new bi_2();

    bh_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bh_1() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bh_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bh_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bs = string;
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

    public static final Descriptors.Descriptor hX() {
        return ae_1.fw;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fx.ensureFieldAccessorsInitialized(bh_1.class, bj_2.class);
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bs = string;
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.bs);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.bs);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bh_1)) {
            return super.equals(object);
        }
        bh_1 bh_12 = (bh_1)object;
        if (!this.getName().equals(bh_12.getName())) {
            return false;
        }
        return this.unknownFields.equals((Object)bh_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bh_1.hX().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.getName().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bh_1 x(ByteBuffer byteBuffer) {
        return (bh_1)gE.parseFrom(byteBuffer);
    }

    public static bh_1 x(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)gE.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bh_1 X(ByteString byteString) {
        return (bh_1)gE.parseFrom(byteString);
    }

    public static bh_1 x(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)gE.parseFrom(byteString, extensionRegistryLite);
    }

    public static bh_1 x(byte[] byArray) {
        return (bh_1)gE.parseFrom(byArray);
    }

    public static bh_1 x(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)gE.parseFrom(byArray, extensionRegistryLite);
    }

    public static bh_1 U(InputStream inputStream) {
        return (bh_1)GeneratedMessageV3.parseWithIOException(gE, (InputStream)inputStream);
    }

    public static bh_1 U(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)GeneratedMessageV3.parseWithIOException(gE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bh_1 V(InputStream inputStream) {
        return (bh_1)GeneratedMessageV3.parseDelimitedWithIOException(gE, (InputStream)inputStream);
    }

    public static bh_1 V(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)GeneratedMessageV3.parseDelimitedWithIOException(gE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bh_1 x(CodedInputStream codedInputStream) {
        return (bh_1)GeneratedMessageV3.parseWithIOException(gE, (CodedInputStream)codedInputStream);
    }

    public static bh_1 ar(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bh_1)GeneratedMessageV3.parseWithIOException(gE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bj_2 hY() {
        return bh_1.hZ();
    }

    public static bj_2 hZ() {
        return gD.ia();
    }

    public static bj_2 e(bh_1 bh_12) {
        return gD.ia().g(bh_12);
    }

    public bj_2 ia() {
        return this == gD ? new bj_2() : new bj_2().g(this);
    }

    protected bj_2 x(GeneratedMessageV3.BuilderParent builderParent) {
        bj_2 bj_22 = new bj_2(builderParent);
        return bj_22;
    }

    public static bh_1 ib() {
        return gD;
    }

    public static Parser<bh_1> z() {
        return gE;
    }

    public Parser<bh_1> getParserForType() {
        return gE;
    }

    public bh_1 ic() {
        return gD;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.x(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ia();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.hY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ia();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.hY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ic();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ic();
    }

    static /* synthetic */ boolean id() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet f(bh_1 bh_12) {
        return bh_12.unknownFields;
    }

    static /* synthetic */ void Y(ByteString byteString) {
        bh_1.checkByteStringIsUtf8((ByteString)byteString);
    }
}

