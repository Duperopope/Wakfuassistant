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

public final class nv
extends GeneratedMessageV3
implements ny {
    private static final long NK = 0L;
    int an;
    public static final int NL = 1;
    long AH;
    public static final int NM = 2;
    long nW;
    public static final int NN = 3;
    volatile Object bs;
    public static final int NO = 4;
    long Dn;
    public static final int NP = 5;
    boolean NQ;
    private byte Y = (byte)-1;
    private static final nv NR = new nv();
    @Deprecated
    public static final Parser<nv> NS = new nw();

    nv(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nv() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new nv();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.an |= 1;
                        this.AH = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 16: {
                        this.an |= 2;
                        this.nW = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.bs = byteString;
                        continue block15;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Dn = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.NQ = codedInputStream.readBool();
                        continue block15;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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

    public static final Descriptors.Descriptor aqf() {
        return nq.Nx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Ny.ensureFieldAccessorsInitialized(nv.class, nx.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
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
    public boolean Xl() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Xm() {
        return this.Dn;
    }

    @Override
    public boolean aqg() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean aqh() {
        return this.NQ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.Xl()) {
            this.Y = 0;
            return false;
        }
        if (!this.aqg()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.AH);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.Dn);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(5, this.NQ);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.AH);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.Dn);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.NQ);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nv)) {
            return super.equals(object);
        }
        nv nv2 = (nv)object;
        if (this.oN() != nv2.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != nv2.Sn()) {
            return false;
        }
        if (this.xk() != nv2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != nv2.xl()) {
            return false;
        }
        if (this.wq() != nv2.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(nv2.getName())) {
            return false;
        }
        if (this.Xl() != nv2.Xl()) {
            return false;
        }
        if (this.Xl() && this.Xm() != nv2.Xm()) {
            return false;
        }
        if (this.aqg() != nv2.aqg()) {
            return false;
        }
        if (this.aqg() && this.aqh() != nv2.aqh()) {
            return false;
        }
        return this.unknownFields.equals((Object)nv2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nv.aqf().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.wq()) {
            n = 37 * n + 3;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Xl()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.Xm());
        }
        if (this.aqg()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.aqh());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nv ck(ByteBuffer byteBuffer) {
        return (nv)NS.parseFrom(byteBuffer);
    }

    public static nv cg(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)NS.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nv dy(ByteString byteString) {
        return (nv)NS.parseFrom(byteString);
    }

    public static nv cg(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)NS.parseFrom(byteString, extensionRegistryLite);
    }

    public static nv ci(byte[] byArray) {
        return (nv)NS.parseFrom(byArray);
    }

    public static nv cg(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)NS.parseFrom(byArray, extensionRegistryLite);
    }

    public static nv fm(InputStream inputStream) {
        return (nv)GeneratedMessageV3.parseWithIOException(NS, (InputStream)inputStream);
    }

    public static nv fm(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)GeneratedMessageV3.parseWithIOException(NS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nv fn(InputStream inputStream) {
        return (nv)GeneratedMessageV3.parseDelimitedWithIOException(NS, (InputStream)inputStream);
    }

    public static nv fn(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)GeneratedMessageV3.parseDelimitedWithIOException(NS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nv cg(CodedInputStream codedInputStream) {
        return (nv)GeneratedMessageV3.parseWithIOException(NS, (CodedInputStream)codedInputStream);
    }

    public static nv is(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nv)GeneratedMessageV3.parseWithIOException(NS, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nx aqi() {
        return nv.aqj();
    }

    public static nx aqj() {
        return NR.aqk();
    }

    public static nx b(nv nv2) {
        return NR.aqk().d(nv2);
    }

    public nx aqk() {
        return this == NR ? new nx() : new nx().d(this);
    }

    protected nx cg(GeneratedMessageV3.BuilderParent builderParent) {
        nx nx2 = new nx(builderParent);
        return nx2;
    }

    public static nv aql() {
        return NR;
    }

    public static Parser<nv> z() {
        return NS;
    }

    public Parser<nv> getParserForType() {
        return NS;
    }

    public nv aqm() {
        return NR;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cg(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aqk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aqi();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aqk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aqi();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aqm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aqm();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(nv nv2) {
        return nv2.unknownFields;
    }
}

