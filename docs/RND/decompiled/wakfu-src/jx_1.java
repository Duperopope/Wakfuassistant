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
 * Renamed from jx
 */
public final class jx_1
extends GeneratedMessageV3
implements ja_1 {
    private static final long Cn = 0L;
    int an;
    public static final int Co = 1;
    long Cp;
    public static final int Cq = 2;
    long Cr;
    public static final int Cs = 4;
    boolean Ct;
    public static final int Cu = 5;
    int Cv;
    public static final int Cw = 6;
    int Cx;
    public static final int Cy = 7;
    int Cz;
    public static final int CA = 8;
    long CB;
    private byte Y = (byte)-1;
    private static final jx_1 CC = new jx_1();
    @Deprecated
    public static final Parser<jx_1> CD = new jy_1();

    jx_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jx_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jx_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jx_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block17: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block17;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Cp = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Cr = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 32: {
                        this.an |= 4;
                        this.Ct = codedInputStream.readBool();
                        continue block17;
                    }
                    case 40: {
                        this.an |= 8;
                        this.Cv = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.Cx = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 56: {
                        this.an |= 0x20;
                        this.Cz = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 64: {
                        this.an |= 0x40;
                        this.CB = codedInputStream.readInt64();
                        continue block17;
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

    public static final Descriptors.Descriptor VJ() {
        return iu_2.Aq;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ar.ensureFieldAccessorsInitialized(jx_1.class, jz_1.class);
    }

    @Override
    public boolean VK() {
        return (this.an & 1) != 0;
    }

    @Override
    public long VL() {
        return this.Cp;
    }

    @Override
    public boolean VM() {
        return (this.an & 2) != 0;
    }

    @Override
    public long VN() {
        return this.Cr;
    }

    @Override
    public boolean VO() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean VP() {
        return this.Ct;
    }

    @Override
    public boolean VQ() {
        return (this.an & 8) != 0;
    }

    @Override
    public int VR() {
        return this.Cv;
    }

    @Override
    public boolean VS() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int VT() {
        return this.Cx;
    }

    @Override
    public boolean VU() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int VV() {
        return this.Cz;
    }

    @Override
    public boolean VW() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long VX() {
        return this.CB;
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
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.Cp);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Cr);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeBool(4, this.Ct);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(5, this.Cv);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(6, this.Cx);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(7, this.Cz);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(8, this.CB);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.Cp);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Cr);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.Ct);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.Cv);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.Cx);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.Cz);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)8, (long)this.CB);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jx_1)) {
            return super.equals(object);
        }
        jx_1 jx_12 = (jx_1)object;
        if (this.VK() != jx_12.VK()) {
            return false;
        }
        if (this.VK() && this.VL() != jx_12.VL()) {
            return false;
        }
        if (this.VM() != jx_12.VM()) {
            return false;
        }
        if (this.VM() && this.VN() != jx_12.VN()) {
            return false;
        }
        if (this.VO() != jx_12.VO()) {
            return false;
        }
        if (this.VO() && this.VP() != jx_12.VP()) {
            return false;
        }
        if (this.VQ() != jx_12.VQ()) {
            return false;
        }
        if (this.VQ() && this.VR() != jx_12.VR()) {
            return false;
        }
        if (this.VS() != jx_12.VS()) {
            return false;
        }
        if (this.VS() && this.VT() != jx_12.VT()) {
            return false;
        }
        if (this.VU() != jx_12.VU()) {
            return false;
        }
        if (this.VU() && this.VV() != jx_12.VV()) {
            return false;
        }
        if (this.VW() != jx_12.VW()) {
            return false;
        }
        if (this.VW() && this.VX() != jx_12.VX()) {
            return false;
        }
        return this.unknownFields.equals((Object)jx_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jx_1.VJ().hashCode();
        if (this.VK()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.VL());
        }
        if (this.VM()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.VN());
        }
        if (this.VO()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.VP());
        }
        if (this.VQ()) {
            n = 37 * n + 5;
            n = 53 * n + this.VR();
        }
        if (this.VS()) {
            n = 37 * n + 6;
            n = 53 * n + this.VT();
        }
        if (this.VU()) {
            n = 37 * n + 7;
            n = 53 * n + this.VV();
        }
        if (this.VW()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashLong((long)this.VX());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jx_1 br(ByteBuffer byteBuffer) {
        return (jx_1)CD.parseFrom(byteBuffer);
    }

    public static jx_1 bn(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)CD.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jx_1 ck(ByteString byteString) {
        return (jx_1)CD.parseFrom(byteString);
    }

    public static jx_1 bn(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)CD.parseFrom(byteString, extensionRegistryLite);
    }

    public static jx_1 bo(byte[] byArray) {
        return (jx_1)CD.parseFrom(byArray);
    }

    public static jx_1 bn(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)CD.parseFrom(byArray, extensionRegistryLite);
    }

    public static jx_1 dA(InputStream inputStream) {
        return (jx_1)GeneratedMessageV3.parseWithIOException(CD, (InputStream)inputStream);
    }

    public static jx_1 dA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)GeneratedMessageV3.parseWithIOException(CD, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jx_1 dB(InputStream inputStream) {
        return (jx_1)GeneratedMessageV3.parseDelimitedWithIOException(CD, (InputStream)inputStream);
    }

    public static jx_1 dB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)GeneratedMessageV3.parseDelimitedWithIOException(CD, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jx_1 bn(CodedInputStream codedInputStream) {
        return (jx_1)GeneratedMessageV3.parseWithIOException(CD, (CodedInputStream)codedInputStream);
    }

    public static jx_1 fN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jx_1)GeneratedMessageV3.parseWithIOException(CD, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jz_1 VY() {
        return jx_1.VZ();
    }

    public static jz_1 VZ() {
        return CC.Wa();
    }

    public static jz_1 e(jx_1 jx_12) {
        return CC.Wa().g(jx_12);
    }

    public jz_1 Wa() {
        return this == CC ? new jz_1() : new jz_1().g(this);
    }

    protected jz_1 bn(GeneratedMessageV3.BuilderParent builderParent) {
        jz_1 jz_12 = new jz_1(builderParent);
        return jz_12;
    }

    public static jx_1 Wb() {
        return CC;
    }

    public static Parser<jx_1> z() {
        return CD;
    }

    public Parser<jx_1> getParserForType() {
        return CD;
    }

    public jx_1 Wc() {
        return CC;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bn(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Wa();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.VY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Wa();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.VY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Wc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Wc();
    }

    static /* synthetic */ boolean gb() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet f(jx_1 jx_12) {
        return jx_12.unknownFields;
    }
}

