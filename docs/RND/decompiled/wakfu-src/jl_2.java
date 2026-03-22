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
 * Renamed from jL
 */
public final class jl_2
extends GeneratedMessageV3
implements jo_2 {
    private static final long CY = 0L;
    int an;
    public static final int CZ = 1;
    int dL;
    public static final int Da = 2;
    long Db;
    public static final int Dc = 3;
    long Dd;
    private byte Y = (byte)-1;
    private static final jl_2 De = new jl_2();
    @Deprecated
    public static final Parser<jl_2> Df = new jm_2();

    jl_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jl_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jl_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jl_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Db = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Dd = codedInputStream.readInt64();
                        continue block13;
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

    public static final Descriptors.Descriptor WO() {
        return jk_2.CW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CX.ensureFieldAccessorsInitialized(jl_2.class, jn_2.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    @Override
    public boolean WP() {
        return (this.an & 2) != 0;
    }

    @Override
    public long WQ() {
        return this.Db;
    }

    @Override
    public boolean WR() {
        return (this.an & 4) != 0;
    }

    @Override
    public long WS() {
        return this.Dd;
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
        if (!this.WP()) {
            this.Y = 0;
            return false;
        }
        if (!this.WR()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Db);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.Dd);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Db);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Dd);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jl_2)) {
            return super.equals(object);
        }
        jl_2 jl_22 = (jl_2)object;
        if (this.oN() != jl_22.oN()) {
            return false;
        }
        if (this.oN() && this.d() != jl_22.d()) {
            return false;
        }
        if (this.WP() != jl_22.WP()) {
            return false;
        }
        if (this.WP() && this.WQ() != jl_22.WQ()) {
            return false;
        }
        if (this.WR() != jl_22.WR()) {
            return false;
        }
        if (this.WR() && this.WS() != jl_22.WS()) {
            return false;
        }
        return this.unknownFields.equals((Object)jl_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jl_2.WO().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        if (this.WP()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.WQ());
        }
        if (this.WR()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.WS());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jl_2 bu(ByteBuffer byteBuffer) {
        return (jl_2)Df.parseFrom(byteBuffer);
    }

    public static jl_2 bq(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)Df.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jl_2 cn(ByteString byteString) {
        return (jl_2)Df.parseFrom(byteString);
    }

    public static jl_2 bq(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)Df.parseFrom(byteString, extensionRegistryLite);
    }

    public static jl_2 br(byte[] byArray) {
        return (jl_2)Df.parseFrom(byArray);
    }

    public static jl_2 bq(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)Df.parseFrom(byArray, extensionRegistryLite);
    }

    public static jl_2 dG(InputStream inputStream) {
        return (jl_2)GeneratedMessageV3.parseWithIOException(Df, (InputStream)inputStream);
    }

    public static jl_2 dG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)GeneratedMessageV3.parseWithIOException(Df, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jl_2 dH(InputStream inputStream) {
        return (jl_2)GeneratedMessageV3.parseDelimitedWithIOException(Df, (InputStream)inputStream);
    }

    public static jl_2 dH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)GeneratedMessageV3.parseDelimitedWithIOException(Df, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jl_2 bq(CodedInputStream codedInputStream) {
        return (jl_2)GeneratedMessageV3.parseWithIOException(Df, (CodedInputStream)codedInputStream);
    }

    public static jl_2 fW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_2)GeneratedMessageV3.parseWithIOException(Df, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jn_2 WT() {
        return jl_2.WU();
    }

    public static jn_2 WU() {
        return De.WV();
    }

    public static jn_2 a(jl_2 jl_22) {
        return De.WV().c(jl_22);
    }

    public jn_2 WV() {
        return this == De ? new jn_2() : new jn_2().c(this);
    }

    protected jn_2 bq(GeneratedMessageV3.BuilderParent builderParent) {
        jn_2 jn_22 = new jn_2(builderParent);
        return jn_22;
    }

    public static jl_2 WW() {
        return De;
    }

    public static Parser<jl_2> z() {
        return Df;
    }

    public Parser<jl_2> getParserForType() {
        return Df;
    }

    public jl_2 WX() {
        return De;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bq(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.WV();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.WT();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.WV();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.WT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.WX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.WX();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jl_2 jl_22) {
        return jl_22.unknownFields;
    }
}

