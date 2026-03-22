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

public final class k
extends GeneratedMessageV3
implements n_0 {
    private static final long ac = 0L;
    public static final int ad = 1;
    h ae;
    private byte Y = (byte)-1;
    private static final k af = new k();
    static final Parser<k> ag = new l_0();

    k(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private k() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new k();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        j_0 j_02 = null;
                        if (this.ae != null) {
                            j_02 = this.ae.x();
                        }
                        this.ae = (h)codedInputStream.readMessage(h.z(), extensionRegistryLite);
                        if (j_02 == null) continue block11;
                        j_02.c(this.ae);
                        this.ae = j_02.G();
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

    public static final Descriptors.Descriptor P() {
        return g_0.G;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.H.ensureFieldAccessorsInitialized(k.class, m_0.class);
    }

    @Override
    public boolean Q() {
        return this.ae != null;
    }

    @Override
    public h R() {
        return this.ae == null ? h.y() : this.ae;
    }

    @Override
    public s_0 S() {
        return this.R();
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
        if (this.ae != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.R());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.ae != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.R());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return super.equals(object);
        }
        k k2 = (k)object;
        if (this.Q() != k2.Q()) {
            return false;
        }
        if (this.Q() && !this.R().equals(k2.R())) {
            return false;
        }
        return this.unknownFields.equals((Object)k2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + k.P().hashCode();
        if (this.Q()) {
            n = 37 * n + 1;
            n = 53 * n + this.R().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static k b(ByteBuffer byteBuffer) {
        return (k)ag.parseFrom(byteBuffer);
    }

    public static k b(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (k)ag.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static k h(ByteString byteString) {
        return (k)ag.parseFrom(byteString);
    }

    public static k b(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (k)ag.parseFrom(byteString, extensionRegistryLite);
    }

    public static k b(byte[] byArray) {
        return (k)ag.parseFrom(byArray);
    }

    public static k b(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (k)ag.parseFrom(byArray, extensionRegistryLite);
    }

    public static k c(InputStream inputStream) {
        return (k)GeneratedMessageV3.parseWithIOException(ag, (InputStream)inputStream);
    }

    public static k c(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (k)GeneratedMessageV3.parseWithIOException(ag, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static k d(InputStream inputStream) {
        return (k)GeneratedMessageV3.parseDelimitedWithIOException(ag, (InputStream)inputStream);
    }

    public static k d(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (k)GeneratedMessageV3.parseDelimitedWithIOException(ag, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static k b(CodedInputStream codedInputStream) {
        return (k)GeneratedMessageV3.parseWithIOException(ag, (CodedInputStream)codedInputStream);
    }

    public static k d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (k)GeneratedMessageV3.parseWithIOException(ag, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public m_0 T() {
        return k.U();
    }

    public static m_0 U() {
        return af.V();
    }

    public static m_0 a(k k2) {
        return af.V().c(k2);
    }

    public m_0 V() {
        return this == af ? new m_0() : new m_0().c(this);
    }

    protected m_0 b(GeneratedMessageV3.BuilderParent builderParent) {
        m_0 m_02 = new m_0(builderParent);
        return m_02;
    }

    public static k W() {
        return af;
    }

    public static Parser<k> z() {
        return ag;
    }

    public Parser<k> getParserForType() {
        return ag;
    }

    public k X() {
        return af;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.b(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.V();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.T();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.V();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.T();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.X();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.X();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(k k2) {
        return k2.unknownFields;
    }
}

