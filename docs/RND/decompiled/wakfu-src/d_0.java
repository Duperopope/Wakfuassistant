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
 * Renamed from D
 */
public final class d_0
extends GeneratedMessageV3
implements L {
    private static final long aZ = 0L;
    int ba = 0;
    Object bb;
    public static final int bc = 1;
    long bd;
    public static final int be = 2;
    public static final int bf = 3;
    public static final int bg = 4;
    private byte Y = (byte)-1;
    private static final d_0 bh = new d_0();
    static final Parser<d_0> bi = new e_0();

    d_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private d_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new d_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    d_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        this.bd = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 16: {
                        this.bb = codedInputStream.readInt64();
                        this.ba = 2;
                        continue block14;
                    }
                    case 26: {
                        Object object = codedInputStream.readStringRequireUtf8();
                        this.ba = 3;
                        this.bb = object;
                        continue block14;
                    }
                    case 34: {
                        Object object = null;
                        if (this.ba == 4) {
                            object = ((h_0)this.bb).ca();
                        }
                        this.bb = codedInputStream.readMessage(h_0.z(), extensionRegistryLite);
                        if (object != null) {
                            ((J)object).e((h_0)this.bb);
                            this.bb = ((J)object).cg();
                        }
                        this.ba = 4;
                        continue block14;
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

    public static final Descriptors.Descriptor bs() {
        return c_0.aL;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aM.ensureFieldAccessorsInitialized(d_0.class, f_0.class);
    }

    @Override
    public G bt() {
        return G.j(this.ba);
    }

    @Override
    public long bu() {
        return this.bd;
    }

    @Override
    public boolean bv() {
        return this.ba == 2;
    }

    @Override
    public long bw() {
        if (this.ba == 2) {
            return (Long)this.bb;
        }
        return 0L;
    }

    @Override
    public boolean bx() {
        return this.ba == 3;
    }

    @Override
    public String by() {
        Object object = "";
        if (this.ba == 3) {
            object = this.bb;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.ba == 3) {
            this.bb = string;
        }
        return string;
    }

    @Override
    public ByteString bz() {
        Object object = "";
        if (this.ba == 3) {
            object = this.bb;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ba == 3) {
                this.bb = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean bA() {
        return this.ba == 4;
    }

    @Override
    public h_0 bB() {
        if (this.ba == 4) {
            return (h_0)this.bb;
        }
        return h_0.cb();
    }

    @Override
    public k_0 bC() {
        if (this.ba == 4) {
            return (h_0)this.bb;
        }
        return h_0.cb();
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
        if (this.bd != 0L) {
            codedOutputStream.writeInt64(1, this.bd);
        }
        if (this.ba == 2) {
            codedOutputStream.writeInt64(2, ((Long)this.bb).longValue());
        }
        if (this.ba == 3) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bb);
        }
        if (this.ba == 4) {
            codedOutputStream.writeMessage(4, (MessageLite)((h_0)this.bb));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.bd != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.bd);
        }
        if (this.ba == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)((Long)this.bb));
        }
        if (this.ba == 3) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bb);
        }
        if (this.ba == 4) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((h_0)this.bb));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof d_0)) {
            return super.equals(object);
        }
        d_0 d_02 = (d_0)object;
        if (this.bu() != d_02.bu()) {
            return false;
        }
        if (!this.bt().equals((Object)d_02.bt())) {
            return false;
        }
        switch (this.ba) {
            case 2: {
                if (this.bw() == d_02.bw()) break;
                return false;
            }
            case 3: {
                if (this.by().equals(d_02.by())) break;
                return false;
            }
            case 4: {
                if (this.bB().equals(d_02.bB())) break;
                return false;
            }
        }
        return this.unknownFields.equals((Object)d_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + d_0.bs().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.bu());
        switch (this.ba) {
            case 2: {
                n = 37 * n + 2;
                n = 53 * n + Internal.hashLong((long)this.bw());
                break;
            }
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.by().hashCode();
                break;
            }
            case 4: {
                n = 37 * n + 4;
                n = 53 * n + this.bB().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static d_0 f(ByteBuffer byteBuffer) {
        return (d_0)bi.parseFrom(byteBuffer);
    }

    public static d_0 f(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)bi.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static d_0 v(ByteString byteString) {
        return (d_0)bi.parseFrom(byteString);
    }

    public static d_0 f(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)bi.parseFrom(byteString, extensionRegistryLite);
    }

    public static d_0 f(byte[] byArray) {
        return (d_0)bi.parseFrom(byArray);
    }

    public static d_0 f(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)bi.parseFrom(byArray, extensionRegistryLite);
    }

    public static d_0 k(InputStream inputStream) {
        return (d_0)GeneratedMessageV3.parseWithIOException(bi, (InputStream)inputStream);
    }

    public static d_0 k(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)GeneratedMessageV3.parseWithIOException(bi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static d_0 l(InputStream inputStream) {
        return (d_0)GeneratedMessageV3.parseDelimitedWithIOException(bi, (InputStream)inputStream);
    }

    public static d_0 l(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)GeneratedMessageV3.parseDelimitedWithIOException(bi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static d_0 f(CodedInputStream codedInputStream) {
        return (d_0)GeneratedMessageV3.parseWithIOException(bi, (CodedInputStream)codedInputStream);
    }

    public static d_0 p(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (d_0)GeneratedMessageV3.parseWithIOException(bi, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public f_0 bD() {
        return d_0.bE();
    }

    public static f_0 bE() {
        return bh.bF();
    }

    public static f_0 a(d_0 d_02) {
        return bh.bF().c(d_02);
    }

    public f_0 bF() {
        return this == bh ? new f_0() : new f_0().c(this);
    }

    protected f_0 f(GeneratedMessageV3.BuilderParent builderParent) {
        f_0 f_02 = new f_0(builderParent);
        return f_02;
    }

    public static d_0 bG() {
        return bh;
    }

    public static Parser<d_0> z() {
        return bi;
    }

    public Parser<d_0> getParserForType() {
        return bi;
    }

    public d_0 bH() {
        return bh;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.f(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.bF();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.bD();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.bF();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.bD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.bH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.bH();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(d_0 d_02) {
        return d_02.unknownFields;
    }

    static /* synthetic */ void p(ByteString byteString) {
        d_0.checkByteStringIsUtf8((ByteString)byteString);
    }
}

