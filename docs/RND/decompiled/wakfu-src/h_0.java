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
 * Renamed from H
 */
public final class h_0
extends GeneratedMessageV3
implements k_0 {
    private static final long bq = 0L;
    public static final int br = 1;
    volatile Object bs;
    public static final int bt = 2;
    volatile Object bu;
    private byte Y = (byte)-1;
    private static final h_0 bv = new h_0();
    static final Parser<h_0> bw = new I();

    h_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private h_0() {
        this.bs = "";
        this.bu = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new h_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    h_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bs = string;
                        continue block12;
                    }
                    case 18: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bu = string;
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

    public static final Descriptors.Descriptor bV() {
        return c_0.aN;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aO.ensureFieldAccessorsInitialized(h_0.class, J.class);
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

    @Override
    public String getTag() {
        Object object = this.bu;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bu = string;
        return string;
    }

    @Override
    public ByteString bX() {
        Object object = this.bu;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bu = byteString;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bu)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bu);
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bu)) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bu);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof h_0)) {
            return super.equals(object);
        }
        h_0 h_02 = (h_0)object;
        if (!this.getName().equals(h_02.getName())) {
            return false;
        }
        if (!this.getTag().equals(h_02.getTag())) {
            return false;
        }
        return this.unknownFields.equals((Object)h_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + h_0.bV().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.getName().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.getTag().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static h_0 g(ByteBuffer byteBuffer) {
        return (h_0)bw.parseFrom(byteBuffer);
    }

    public static h_0 g(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)bw.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static h_0 x(ByteString byteString) {
        return (h_0)bw.parseFrom(byteString);
    }

    public static h_0 g(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)bw.parseFrom(byteString, extensionRegistryLite);
    }

    public static h_0 g(byte[] byArray) {
        return (h_0)bw.parseFrom(byArray);
    }

    public static h_0 g(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)bw.parseFrom(byArray, extensionRegistryLite);
    }

    public static h_0 m(InputStream inputStream) {
        return (h_0)GeneratedMessageV3.parseWithIOException(bw, (InputStream)inputStream);
    }

    public static h_0 m(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)GeneratedMessageV3.parseWithIOException(bw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static h_0 n(InputStream inputStream) {
        return (h_0)GeneratedMessageV3.parseDelimitedWithIOException(bw, (InputStream)inputStream);
    }

    public static h_0 n(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)GeneratedMessageV3.parseDelimitedWithIOException(bw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static h_0 g(CodedInputStream codedInputStream) {
        return (h_0)GeneratedMessageV3.parseWithIOException(bw, (CodedInputStream)codedInputStream);
    }

    public static h_0 s(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h_0)GeneratedMessageV3.parseWithIOException(bw, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public J bY() {
        return h_0.bZ();
    }

    public static J bZ() {
        return bv.ca();
    }

    public static J c(h_0 h_02) {
        return bv.ca().e(h_02);
    }

    public J ca() {
        return this == bv ? new J() : new J().e(this);
    }

    protected J g(GeneratedMessageV3.BuilderParent builderParent) {
        J j = new J(builderParent);
        return j;
    }

    public static h_0 cb() {
        return bv;
    }

    public static Parser<h_0> z() {
        return bw;
    }

    public Parser<h_0> getParserForType() {
        return bw;
    }

    public h_0 cc() {
        return bv;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.g(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ca();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.bY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ca();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.bY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cc();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(h_0 h_02) {
        return h_02.unknownFields;
    }

    static /* synthetic */ void k(ByteString byteString) {
        h_0.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void l(ByteString byteString) {
        h_0.checkByteStringIsUtf8((ByteString)byteString);
    }
}

