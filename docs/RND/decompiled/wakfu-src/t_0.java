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
 * Renamed from t
 */
public final class t_0
extends GeneratedMessageV3
implements w {
    private static final long ap = 0L;
    public static final int aq = 1;
    volatile Object R;
    public static final int ar = 2;
    long as;
    public static final int at = 3;
    volatile Object V;
    private byte Y = (byte)-1;
    private static final t_0 au = new t_0();
    static final Parser<t_0> av = new u();

    t_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private t_0() {
        this.R = "";
        this.V = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new t_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    t_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.R = string;
                        continue block13;
                    }
                    case 16: {
                        this.as = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 26: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.V = string;
                        continue block13;
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

    public static final Descriptors.Descriptor aC() {
        return g_0.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.D.ensureFieldAccessorsInitialized(t_0.class, v_0.class);
    }

    @Override
    public String n() {
        Object object = this.R;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.R = string;
        return string;
    }

    @Override
    public ByteString o() {
        Object object = this.R;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.R = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public long aD() {
        return this.as;
    }

    @Override
    public String q() {
        Object object = this.V;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.V = string;
        return string;
    }

    @Override
    public ByteString r() {
        Object object = this.V;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.V = byteString;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.R);
        }
        if (this.as != 0L) {
            codedOutputStream.writeInt64(2, this.as);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.V)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.V);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.R);
        }
        if (this.as != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.as);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.V)) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.V);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof t_0)) {
            return super.equals(object);
        }
        t_0 t_02 = (t_0)object;
        if (!this.n().equals(t_02.n())) {
            return false;
        }
        if (this.aD() != t_02.aD()) {
            return false;
        }
        if (!this.q().equals(t_02.q())) {
            return false;
        }
        return this.unknownFields.equals((Object)t_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + t_0.aC().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.n().hashCode();
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.aD());
        n = 37 * n + 3;
        n = 53 * n + this.q().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static t_0 d(ByteBuffer byteBuffer) {
        return (t_0)av.parseFrom(byteBuffer);
    }

    public static t_0 d(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)av.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static t_0 j(ByteString byteString) {
        return (t_0)av.parseFrom(byteString);
    }

    public static t_0 d(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)av.parseFrom(byteString, extensionRegistryLite);
    }

    public static t_0 d(byte[] byArray) {
        return (t_0)av.parseFrom(byArray);
    }

    public static t_0 d(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)av.parseFrom(byArray, extensionRegistryLite);
    }

    public static t_0 g(InputStream inputStream) {
        return (t_0)GeneratedMessageV3.parseWithIOException(av, (InputStream)inputStream);
    }

    public static t_0 g(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)GeneratedMessageV3.parseWithIOException(av, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static t_0 h(InputStream inputStream) {
        return (t_0)GeneratedMessageV3.parseDelimitedWithIOException(av, (InputStream)inputStream);
    }

    public static t_0 h(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)GeneratedMessageV3.parseDelimitedWithIOException(av, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static t_0 d(CodedInputStream codedInputStream) {
        return (t_0)GeneratedMessageV3.parseWithIOException(av, (CodedInputStream)codedInputStream);
    }

    public static t_0 j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (t_0)GeneratedMessageV3.parseWithIOException(av, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public v_0 aE() {
        return t_0.aF();
    }

    public static v_0 aF() {
        return au.aG();
    }

    public static v_0 a(t_0 t_02) {
        return au.aG().c(t_02);
    }

    public v_0 aG() {
        return this == au ? new v_0() : new v_0().c(this);
    }

    protected v_0 d(GeneratedMessageV3.BuilderParent builderParent) {
        v_0 v_02 = new v_0(builderParent);
        return v_02;
    }

    public static t_0 aH() {
        return au;
    }

    public static Parser<t_0> z() {
        return av;
    }

    public Parser<t_0> getParserForType() {
        return av;
    }

    public t_0 aI() {
        return au;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.d(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aG();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aE();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aG();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aI();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(t_0 t_02) {
        return t_02.unknownFields;
    }

    static /* synthetic */ void k(ByteString byteString) {
        t_0.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void l(ByteString byteString) {
        t_0.checkByteStringIsUtf8((ByteString)byteString);
    }
}

