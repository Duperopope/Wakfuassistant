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

public final class mc
extends GeneratedMessageV3
implements mf {
    private static final long JV = 0L;
    int an;
    public static final int JW = 1;
    long wq;
    public static final int JX = 2;
    kW Fc;
    public static final int JY = 3;
    mo JZ;
    public static final int Ka = 5;
    int Kb;
    public static final int Kc = 6;
    int Kd;
    public static final int Ke = 7;
    long Kf;
    public static final int Kg = 8;
    int Kh;
    public static final int Ki = 9;
    long Kj;
    private byte Y = (byte)-1;
    private static final mc Kk = new mc();
    @Deprecated
    public static final Parser<mc> Kl = new md();

    mc(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mc() {
        this.wq = -1L;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mc();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block18: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block18;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wq = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 18: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 2) != 0) {
                            builder2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.h(this.Fc);
                            this.Fc = builder2.aes();
                        }
                        this.an |= 2;
                        continue block18;
                    }
                    case 26: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 4) != 0) {
                            builder2 = this.JZ.alt();
                        }
                        this.JZ = (mo)codedInputStream.readMessage(mo.KL, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.JZ);
                            this.JZ = builder2.alz();
                        }
                        this.an |= 4;
                        continue block18;
                    }
                    case 40: {
                        this.an |= 8;
                        this.Kb = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.Kd = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 56: {
                        this.an |= 0x20;
                        this.Kf = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 64: {
                        this.an |= 0x40;
                        this.Kh = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 72: {
                        this.an |= 0x80;
                        this.Kj = codedInputStream.readInt64();
                        continue block18;
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

    public static final Descriptors.Descriptor ajU() {
        return mb.JR;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb.JS.ensureFieldAccessorsInitialized(mc.class, me.class);
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    @Override
    public boolean aaz() {
        return (this.an & 2) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean ajV() {
        return (this.an & 4) != 0;
    }

    @Override
    public mo ajW() {
        return this.JZ == null ? mo.alu() : this.JZ;
    }

    @Override
    public mr ajX() {
        return this.JZ == null ? mo.alu() : this.JZ;
    }

    @Override
    public boolean ajY() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ajZ() {
        return this.Kb;
    }

    @Override
    public boolean aka() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int akb() {
        return this.Kd;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    @Override
    public boolean ake() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int akf() {
        return this.Kh;
    }

    @Override
    public boolean akg() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public long akh() {
        return this.Kj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ajV()) {
            this.Y = 0;
            return false;
        }
        if (!this.ajY()) {
            this.Y = 0;
            return false;
        }
        if (!this.aka()) {
            this.Y = 0;
            return false;
        }
        if (!this.akc()) {
            this.Y = 0;
            return false;
        }
        if (!this.ake()) {
            this.Y = 0;
            return false;
        }
        if (this.aaz() && !this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (!this.ajW().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wq);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aaA());
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeMessage(3, (MessageLite)this.ajW());
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(5, this.Kb);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(6, this.Kd);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(7, this.Kf);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(8, this.Kh);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt64(9, this.Kj);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wq);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aaA());
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.ajW());
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.Kb);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.Kd);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.Kf);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.Kh);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.Kj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mc)) {
            return super.equals(object);
        }
        mc mc2 = (mc)object;
        if (this.Lw() != mc2.Lw()) {
            return false;
        }
        if (this.Lw() && this.Lx() != mc2.Lx()) {
            return false;
        }
        if (this.aaz() != mc2.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(mc2.aaA())) {
            return false;
        }
        if (this.ajV() != mc2.ajV()) {
            return false;
        }
        if (this.ajV() && !this.ajW().equals(mc2.ajW())) {
            return false;
        }
        if (this.ajY() != mc2.ajY()) {
            return false;
        }
        if (this.ajY() && this.ajZ() != mc2.ajZ()) {
            return false;
        }
        if (this.aka() != mc2.aka()) {
            return false;
        }
        if (this.aka() && this.akb() != mc2.akb()) {
            return false;
        }
        if (this.akc() != mc2.akc()) {
            return false;
        }
        if (this.akc() && this.akd() != mc2.akd()) {
            return false;
        }
        if (this.ake() != mc2.ake()) {
            return false;
        }
        if (this.ake() && this.akf() != mc2.akf()) {
            return false;
        }
        if (this.akg() != mc2.akg()) {
            return false;
        }
        if (this.akg() && this.akh() != mc2.akh()) {
            return false;
        }
        return this.unknownFields.equals((Object)mc2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mc.ajU().hashCode();
        if (this.Lw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Lx());
        }
        if (this.aaz()) {
            n = 37 * n + 2;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.ajV()) {
            n = 37 * n + 3;
            n = 53 * n + this.ajW().hashCode();
        }
        if (this.ajY()) {
            n = 37 * n + 5;
            n = 53 * n + this.ajZ();
        }
        if (this.aka()) {
            n = 37 * n + 6;
            n = 53 * n + this.akb();
        }
        if (this.akc()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.akd());
        }
        if (this.ake()) {
            n = 37 * n + 8;
            n = 53 * n + this.akf();
        }
        if (this.akg()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.akh());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mc bX(ByteBuffer byteBuffer) {
        return (mc)Kl.parseFrom(byteBuffer);
    }

    public static mc bT(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)Kl.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mc dg(ByteString byteString) {
        return (mc)Kl.parseFrom(byteString);
    }

    public static mc bT(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)Kl.parseFrom(byteString, extensionRegistryLite);
    }

    public static mc bU(byte[] byArray) {
        return (mc)Kl.parseFrom(byArray);
    }

    public static mc bT(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)Kl.parseFrom(byArray, extensionRegistryLite);
    }

    public static mc eM(InputStream inputStream) {
        return (mc)GeneratedMessageV3.parseWithIOException(Kl, (InputStream)inputStream);
    }

    public static mc eM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)GeneratedMessageV3.parseWithIOException(Kl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mc eN(InputStream inputStream) {
        return (mc)GeneratedMessageV3.parseDelimitedWithIOException(Kl, (InputStream)inputStream);
    }

    public static mc eN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)GeneratedMessageV3.parseDelimitedWithIOException(Kl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mc bT(CodedInputStream codedInputStream) {
        return (mc)GeneratedMessageV3.parseWithIOException(Kl, (CodedInputStream)codedInputStream);
    }

    public static mc hF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mc)GeneratedMessageV3.parseWithIOException(Kl, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public me aki() {
        return mc.akj();
    }

    public static me akj() {
        return Kk.akk();
    }

    public static me a(mc mc2) {
        return Kk.akk().c(mc2);
    }

    public me akk() {
        return this == Kk ? new me() : new me().c(this);
    }

    protected me bT(GeneratedMessageV3.BuilderParent builderParent) {
        me me2 = new me(builderParent);
        return me2;
    }

    public static mc akl() {
        return Kk;
    }

    public static Parser<mc> z() {
        return Kl;
    }

    public Parser<mc> getParserForType() {
        return Kl;
    }

    public mc akm() {
        return Kk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bT(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.akk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aki();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.akk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aki();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.akm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.akm();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mc mc2) {
        return mc2.unknownFields;
    }
}
