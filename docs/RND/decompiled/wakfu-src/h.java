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

public final class h
extends GeneratedMessageV3
implements s_0 {
    private static final long N = 0L;
    public static final int O = 1;
    volatile Object P;
    public static final int Q = 2;
    volatile Object R;
    public static final int S = 3;
    long T;
    public static final int U = 4;
    volatile Object V;
    public static final int W = 5;
    bw_2 X;
    private byte Y = (byte)-1;
    private static final h Z = new h();
    static final Parser<h> aa = new i_0();

    h(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private h() {
        this.P = "";
        this.R = "";
        this.V = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new h();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    h(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block15: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block15;
                    }
                    case 10: {
                        Object object;
                        this.P = object = codedInputStream.readStringRequireUtf8();
                        continue block15;
                    }
                    case 18: {
                        Object object;
                        this.R = object = codedInputStream.readStringRequireUtf8();
                        continue block15;
                    }
                    case 24: {
                        this.T = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 34: {
                        Object object;
                        this.V = object = codedInputStream.readStringRequireUtf8();
                        continue block15;
                    }
                    case 42: {
                        Object object = null;
                        if (this.X != null) {
                            object = this.X.kO();
                        }
                        this.X = (bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite);
                        if (object == null) continue block15;
                        ((by_1)object).k(this.X);
                        this.X = ((by_1)object).kV();
                        continue block15;
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

    public static final Descriptors.Descriptor k() {
        return g_0.I;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.J.ensureFieldAccessorsInitialized(h.class, j_0.class);
    }

    @Override
    public String l() {
        Object object = this.P;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.P = string;
        return string;
    }

    @Override
    public ByteString m() {
        Object object = this.P;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.P = byteString;
            return byteString;
        }
        return (ByteString)object;
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
    public long p() {
        return this.T;
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

    @Override
    public boolean s() {
        return this.X != null;
    }

    @Override
    public bw_2 t() {
        return this.X == null ? bw_2.kP() : this.X;
    }

    @Override
    public cj_2 u() {
        return this.t();
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.P)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.P);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.R);
        }
        if (this.T != 0L) {
            codedOutputStream.writeInt64(3, this.T);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.V)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.V);
        }
        if (this.X != null) {
            codedOutputStream.writeMessage(5, (MessageLite)this.t());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!GeneratedMessageV3.isStringEmpty((Object)this.P)) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.P);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.R);
        }
        if (this.T != 0L) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.T);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.V)) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.V);
        }
        if (this.X != null) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.t());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof h)) {
            return super.equals(object);
        }
        h h2 = (h)object;
        if (!this.l().equals(h2.l())) {
            return false;
        }
        if (!this.n().equals(h2.n())) {
            return false;
        }
        if (this.p() != h2.p()) {
            return false;
        }
        if (!this.q().equals(h2.q())) {
            return false;
        }
        if (this.s() != h2.s()) {
            return false;
        }
        if (this.s() && !this.t().equals(h2.t())) {
            return false;
        }
        return this.unknownFields.equals((Object)h2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + h.k().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.l().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.n().hashCode();
        n = 37 * n + 3;
        n = 53 * n + Internal.hashLong((long)this.p());
        n = 37 * n + 4;
        n = 53 * n + this.q().hashCode();
        if (this.s()) {
            n = 37 * n + 5;
            n = 53 * n + this.t().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static h a(ByteBuffer byteBuffer) {
        return (h)aa.parseFrom(byteBuffer);
    }

    public static h a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (h)aa.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static h a(ByteString byteString) {
        return (h)aa.parseFrom(byteString);
    }

    public static h a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (h)aa.parseFrom(byteString, extensionRegistryLite);
    }

    public static h a(byte[] byArray) {
        return (h)aa.parseFrom(byArray);
    }

    public static h a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (h)aa.parseFrom(byArray, extensionRegistryLite);
    }

    public static h a(InputStream inputStream) {
        return (h)GeneratedMessageV3.parseWithIOException(aa, (InputStream)inputStream);
    }

    public static h a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h)GeneratedMessageV3.parseWithIOException(aa, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static h b(InputStream inputStream) {
        return (h)GeneratedMessageV3.parseDelimitedWithIOException(aa, (InputStream)inputStream);
    }

    public static h b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h)GeneratedMessageV3.parseDelimitedWithIOException(aa, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static h a(CodedInputStream codedInputStream) {
        return (h)GeneratedMessageV3.parseWithIOException(aa, (CodedInputStream)codedInputStream);
    }

    public static h a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (h)GeneratedMessageV3.parseWithIOException(aa, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public j_0 v() {
        return h.w();
    }

    public static j_0 w() {
        return Z.x();
    }

    public static j_0 a(h h2) {
        return Z.x().c(h2);
    }

    public j_0 x() {
        return this == Z ? new j_0() : new j_0().c(this);
    }

    protected j_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        j_0 j_02 = new j_0(builderParent);
        return j_02;
    }

    public static h y() {
        return Z;
    }

    public static Parser<h> z() {
        return aa;
    }

    public Parser<h> getParserForType() {
        return aa;
    }

    public h A() {
        return Z;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.x();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.v();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.x();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.v();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.A();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.A();
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(h h2) {
        return h2.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        h.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        h.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void d(ByteString byteString) {
        h.checkByteStringIsUtf8((ByteString)byteString);
    }
}

