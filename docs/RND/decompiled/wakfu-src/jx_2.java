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
 * Renamed from jX
 */
public final class jx_2
extends GeneratedMessageV3
implements ka_1 {
    private static final long En = 0L;
    int an;
    public static final int Eo = 1;
    long AH;
    public static final int Ep = 2;
    volatile Object bs;
    public static final int Eq = 3;
    long Er;
    public static final int Es = 4;
    int ws;
    private byte Y = (byte)-1;
    private static final jx_2 Et = new jx_2();
    @Deprecated
    public static final Parser<jx_2> Eu = new jy_2();

    jx_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jx_2() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jx_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jx_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.AH = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Er = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.ws = codedInputStream.readInt32();
                        continue block14;
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

    public static final Descriptors.Descriptor Zj() {
        return jk_2.CS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CT.ensureFieldAccessorsInitialized(jx_2.class, jz_2.class);
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
    public boolean wq() {
        return (this.an & 2) != 0;
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
    public boolean Zk() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Zl() {
        return this.Er;
    }

    @Override
    public boolean Ly() {
        return (this.an & 8) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
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
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.Zk()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ly()) {
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
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.Er);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.ws);
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
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Er);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.ws);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jx_2)) {
            return super.equals(object);
        }
        jx_2 jx_22 = (jx_2)object;
        if (this.oN() != jx_22.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != jx_22.Sn()) {
            return false;
        }
        if (this.wq() != jx_22.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(jx_22.getName())) {
            return false;
        }
        if (this.Zk() != jx_22.Zk()) {
            return false;
        }
        if (this.Zk() && this.Zl() != jx_22.Zl()) {
            return false;
        }
        if (this.Ly() != jx_22.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != jx_22.Lz()) {
            return false;
        }
        return this.unknownFields.equals((Object)jx_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jx_2.Zj().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Zk()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.Zl());
        }
        if (this.Ly()) {
            n = 37 * n + 4;
            n = 53 * n + this.Lz();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jx_2 bx(ByteBuffer byteBuffer) {
        return (jx_2)Eu.parseFrom(byteBuffer);
    }

    public static jx_2 bt(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)Eu.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jx_2 cy(ByteString byteString) {
        return (jx_2)Eu.parseFrom(byteString);
    }

    public static jx_2 bt(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)Eu.parseFrom(byteString, extensionRegistryLite);
    }

    public static jx_2 bu(byte[] byArray) {
        return (jx_2)Eu.parseFrom(byArray);
    }

    public static jx_2 bt(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)Eu.parseFrom(byArray, extensionRegistryLite);
    }

    public static jx_2 dM(InputStream inputStream) {
        return (jx_2)GeneratedMessageV3.parseWithIOException(Eu, (InputStream)inputStream);
    }

    public static jx_2 dM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)GeneratedMessageV3.parseWithIOException(Eu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jx_2 dN(InputStream inputStream) {
        return (jx_2)GeneratedMessageV3.parseDelimitedWithIOException(Eu, (InputStream)inputStream);
    }

    public static jx_2 dN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)GeneratedMessageV3.parseDelimitedWithIOException(Eu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jx_2 bt(CodedInputStream codedInputStream) {
        return (jx_2)GeneratedMessageV3.parseWithIOException(Eu, (CodedInputStream)codedInputStream);
    }

    public static jx_2 gf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_2)GeneratedMessageV3.parseWithIOException(Eu, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jz_2 Zm() {
        return jx_2.Zn();
    }

    public static jz_2 Zn() {
        return Et.Zo();
    }

    public static jz_2 b(jx_2 jx_22) {
        return Et.Zo().d(jx_22);
    }

    public jz_2 Zo() {
        return this == Et ? new jz_2() : new jz_2().d(this);
    }

    protected jz_2 bt(GeneratedMessageV3.BuilderParent builderParent) {
        jz_2 jz_22 = new jz_2(builderParent);
        return jz_22;
    }

    public static jx_2 Zp() {
        return Et;
    }

    public static Parser<jx_2> z() {
        return Eu;
    }

    public Parser<jx_2> getParserForType() {
        return Eu;
    }

    public jx_2 Zq() {
        return Et;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bt(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Zo();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Zm();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Zo();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Zm();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Zq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Zq();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(jx_2 jx_22) {
        return jx_22.unknownFields;
    }
}

