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

public final class eF
extends GeneratedMessageV3
implements eI {
    private static final long nr = 0L;
    int an;
    public static final int ns = 1;
    int nt;
    public static final int nu = 2;
    volatile Object bs;
    public static final int nv = 3;
    int mj;
    public static final int nw = 7;
    int nx;
    public static final int ny = 8;
    boolean nz;
    private byte Y = (byte)-1;
    private static final eF nA = new eF();
    @Deprecated
    public static final Parser<eF> nB = new eG();

    eF(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eF() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eF();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.nt = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block15;
                    }
                    case 24: {
                        this.an |= 4;
                        this.mj = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 56: {
                        this.an |= 8;
                        this.nx = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 64: {
                        this.an |= 0x10;
                        this.nz = codedInputStream.readBool();
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

    public static final Descriptors.Descriptor wn() {
        return eE.np;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eE.nq.ensureFieldAccessorsInitialized(eF.class, eH.class);
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
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
    public boolean tK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public boolean wr() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ws() {
        return this.nx;
    }

    @Override
    public boolean wt() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean wu() {
        return this.nz;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.wo()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.tK()) {
            this.Y = 0;
            return false;
        }
        if (!this.wr()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.nt);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.mj);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(7, this.nx);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(8, this.nz);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.nt);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.mj);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.nx);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)8, (boolean)this.nz);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eF)) {
            return super.equals(object);
        }
        eF eF2 = (eF)object;
        if (this.wo() != eF2.wo()) {
            return false;
        }
        if (this.wo() && this.wp() != eF2.wp()) {
            return false;
        }
        if (this.wq() != eF2.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(eF2.getName())) {
            return false;
        }
        if (this.tK() != eF2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != eF2.tL()) {
            return false;
        }
        if (this.wr() != eF2.wr()) {
            return false;
        }
        if (this.wr() && this.ws() != eF2.ws()) {
            return false;
        }
        if (this.wt() != eF2.wt()) {
            return false;
        }
        if (this.wt() && this.wu() != eF2.wu()) {
            return false;
        }
        return this.unknownFields.equals((Object)eF2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eF.wn().hashCode();
        if (this.wo()) {
            n = 37 * n + 1;
            n = 53 * n + this.wp();
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.tK()) {
            n = 37 * n + 3;
            n = 53 * n + this.tL();
        }
        if (this.wr()) {
            n = 37 * n + 7;
            n = 53 * n + this.ws();
        }
        if (this.wt()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashBoolean((boolean)this.wu());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eF am(ByteBuffer byteBuffer) {
        return (eF)nB.parseFrom(byteBuffer);
    }

    public static eF am(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)nB.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eF aX(ByteString byteString) {
        return (eF)nB.parseFrom(byteString);
    }

    public static eF am(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)nB.parseFrom(byteString, extensionRegistryLite);
    }

    public static eF am(byte[] byArray) {
        return (eF)nB.parseFrom(byArray);
    }

    public static eF am(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)nB.parseFrom(byArray, extensionRegistryLite);
    }

    public static eF by(InputStream inputStream) {
        return (eF)GeneratedMessageV3.parseWithIOException(nB, (InputStream)inputStream);
    }

    public static eF by(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)GeneratedMessageV3.parseWithIOException(nB, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eF bz(InputStream inputStream) {
        return (eF)GeneratedMessageV3.parseDelimitedWithIOException(nB, (InputStream)inputStream);
    }

    public static eF bz(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)GeneratedMessageV3.parseDelimitedWithIOException(nB, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eF am(CodedInputStream codedInputStream) {
        return (eF)GeneratedMessageV3.parseWithIOException(nB, (CodedInputStream)codedInputStream);
    }

    public static eF cK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eF)GeneratedMessageV3.parseWithIOException(nB, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eH wv() {
        return eF.ww();
    }

    public static eH ww() {
        return nA.wx();
    }

    public static eH a(eF eF2) {
        return nA.wx().c(eF2);
    }

    public eH wx() {
        return this == nA ? new eH() : new eH().c(this);
    }

    protected eH am(GeneratedMessageV3.BuilderParent builderParent) {
        eH eH2 = new eH(builderParent);
        return eH2;
    }

    public static eF wy() {
        return nA;
    }

    public static Parser<eF> z() {
        return nB;
    }

    public Parser<eF> getParserForType() {
        return nB;
    }

    public eF wz() {
        return nA;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.am(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.wx();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.wv();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.wx();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.wv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wz();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eF eF2) {
        return eF2.unknownFields;
    }
}

