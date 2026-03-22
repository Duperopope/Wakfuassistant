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

public final class V
extends GeneratedMessageV3
implements Y {
    private static final long bZ = 0L;
    public static final int ca = 1;
    S cb;
    private byte Y = (byte)-1;
    private static final V cc = new V();
    static final Parser<V> cd = new w_0();

    V(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private V() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new V();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    V(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        u_0 u_02 = null;
                        if (this.cb != null) {
                            u_02 = this.cb.cN();
                        }
                        this.cb = (S)codedInputStream.readMessage(S.z(), extensionRegistryLite);
                        if (u_02 == null) continue block11;
                        u_02.c(this.cb);
                        this.cb = u_02.cU();
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

    public static final Descriptors.Descriptor dc() {
        return c_0.aR;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aS.ensureFieldAccessorsInitialized(V.class, x_0.class);
    }

    @Override
    public boolean dd() {
        return this.cb != null;
    }

    @Override
    public S de() {
        return this.cb == null ? S.cO() : this.cb;
    }

    @Override
    public ah_2 df() {
        return this.de();
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
        if (this.cb != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.de());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.cb != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.de());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof V)) {
            return super.equals(object);
        }
        V v = (V)object;
        if (this.dd() != v.dd()) {
            return false;
        }
        if (this.dd() && !this.de().equals(v.de())) {
            return false;
        }
        return this.unknownFields.equals((Object)v.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + V.dc().hashCode();
        if (this.dd()) {
            n = 37 * n + 1;
            n = 53 * n + this.de().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static V j(ByteBuffer byteBuffer) {
        return (V)cd.parseFrom(byteBuffer);
    }

    public static V j(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (V)cd.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static V C(ByteString byteString) {
        return (V)cd.parseFrom(byteString);
    }

    public static V j(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (V)cd.parseFrom(byteString, extensionRegistryLite);
    }

    public static V j(byte[] byArray) {
        return (V)cd.parseFrom(byArray);
    }

    public static V j(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (V)cd.parseFrom(byArray, extensionRegistryLite);
    }

    public static V s(InputStream inputStream) {
        return (V)GeneratedMessageV3.parseWithIOException(cd, (InputStream)inputStream);
    }

    public static V s(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (V)GeneratedMessageV3.parseWithIOException(cd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static V t(InputStream inputStream) {
        return (V)GeneratedMessageV3.parseDelimitedWithIOException(cd, (InputStream)inputStream);
    }

    public static V t(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (V)GeneratedMessageV3.parseDelimitedWithIOException(cd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static V j(CodedInputStream codedInputStream) {
        return (V)GeneratedMessageV3.parseWithIOException(cd, (CodedInputStream)codedInputStream);
    }

    public static V B(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (V)GeneratedMessageV3.parseWithIOException(cd, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public x_0 dg() {
        return V.dh();
    }

    public static x_0 dh() {
        return cc.di();
    }

    public static x_0 a(V v) {
        return cc.di().c(v);
    }

    public x_0 di() {
        return this == cc ? new x_0() : new x_0().c(this);
    }

    protected x_0 j(GeneratedMessageV3.BuilderParent builderParent) {
        x_0 x_02 = new x_0(builderParent);
        return x_02;
    }

    public static V dj() {
        return cc;
    }

    public static Parser<V> z() {
        return cd;
    }

    public Parser<V> getParserForType() {
        return cd;
    }

    public V dk() {
        return cc;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.j(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.di();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.dg();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.di();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.dg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dk();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dk();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(V v) {
        return v.unknownFields;
    }
}

