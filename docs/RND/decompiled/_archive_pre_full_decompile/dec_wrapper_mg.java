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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class mg
extends GeneratedMessageV3
implements mj {
    private static final long Kn = 0L;
    int an;
    public static final int Ko = 1;
    mk Kp;
    public static final int Kq = 2;
    List<mc> Ce;
    public static final int Kr = 3;
    long Ks;
    private byte Y = (byte)-1;
    private static final mg Kt = new mg();
    @Deprecated
    public static final Parser<mg> Ku = new mh();

    mg(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mg() {
        this.Ce = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mg();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        mm mm2 = null;
                        if ((this.an & 1) != 0) {
                            mm2 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm2 != null) {
                            mm2.e(this.Kp);
                            this.Kp = mm2.alj();
                        }
                        this.an |= 1;
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.Ce = new ArrayList<mc>();
                            n |= 2;
                        }
                        this.Ce.add((mc)codedInputStream.readMessage(mc.Kl, extensionRegistryLite));
                        continue block13;
                    }
                    case 24: {
                        this.an |= 2;
                        this.Ks = codedInputStream.readInt64();
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if ((n & 2) != 0) {
                this.Ce = Collections.unmodifiableList(this.Ce);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor akC() {
        return mb.JN;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb.JO.ensureFieldAccessorsInitialized(mg.class, mi.class);
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public mn akF() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public List<mc> Ve() {
        return this.Ce;
    }

    @Override
    public List<? extends mf> Vf() {
        return this.Ce;
    }

    @Override
    public int Vg() {
        return this.Ce.size();
    }

    @Override
    public mc hW(int n) {
        return this.Ce.get(n);
    }

    @Override
    public mf hX(int n) {
        return this.Ce.get(n);
    }

    @Override
    public boolean akG() {
        return (this.an & 2) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.akD()) {
            this.Y = 0;
            return false;
        }
        if (!this.akG()) {
            this.Y = 0;
            return false;
        }
        if (!this.akE().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.hW(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Ce.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.Ce.get(i));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(3, this.Ks);
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Ce.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.Ce.get(i)));
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Ks);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mg)) {
            return super.equals(object);
        }
        mg mg2 = (mg)object;
        if (this.akD() != mg2.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(mg2.akE())) {
            return false;
        }
        if (!this.Ve().equals(mg2.Ve())) {
            return false;
        }
        if (this.akG() != mg2.akG()) {
            return false;
        }
        if (this.akG() && this.akH() != mg2.akH()) {
            return false;
        }
        return this.unknownFields.equals((Object)mg2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mg.akC().hashCode();
        if (this.akD()) {
            n = 37 * n + 1;
            n = 53 * n + this.akE().hashCode();
        }
        if (this.Vg() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.Ve().hashCode();
        }
        if (this.akG()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.akH());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mg bY(ByteBuffer byteBuffer) {
        return (mg)Ku.parseFrom(byteBuffer);
    }

    public static mg bU(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)Ku.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mg dh(ByteString byteString) {
        return (mg)Ku.parseFrom(byteString);
    }

    public static mg bU(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)Ku.parseFrom(byteString, extensionRegistryLite);
    }

    public static mg bV(byte[] byArray) {
        return (mg)Ku.parseFrom(byArray);
    }

    public static mg bU(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)Ku.parseFrom(byArray, extensionRegistryLite);
    }

    public static mg eO(InputStream inputStream) {
        return (mg)GeneratedMessageV3.parseWithIOException(Ku, (InputStream)inputStream);
    }

    public static mg eO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)GeneratedMessageV3.parseWithIOException(Ku, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mg eP(InputStream inputStream) {
        return (mg)GeneratedMessageV3.parseDelimitedWithIOException(Ku, (InputStream)inputStream);
    }

    public static mg eP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)GeneratedMessageV3.parseDelimitedWithIOException(Ku, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mg bU(CodedInputStream codedInputStream) {
        return (mg)GeneratedMessageV3.parseWithIOException(Ku, (CodedInputStream)codedInputStream);
    }

    public static mg hI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg)GeneratedMessageV3.parseWithIOException(Ku, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mi akI() {
        return mg.akJ();
    }

    public static mi akJ() {
        return Kt.akK();
    }

    public static mi a(mg mg2) {
        return Kt.akK().c(mg2);
    }

    public mi akK() {
        return this == Kt ? new mi() : new mi().c(this);
    }

    protected mi bU(GeneratedMessageV3.BuilderParent builderParent) {
        mi mi2 = new mi(builderParent);
        return mi2;
    }

    public static mg akL() {
        return Kt;
    }

    public static Parser<mg> z() {
        return Ku;
    }

    public Parser<mg> getParserForType() {
        return Ku;
    }

    public mg akM() {
        return Kt;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bU(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.akK();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.akI();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.akK();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.akI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.akM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.akM();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mg mg2) {
        return mg2.unknownFields;
    }
}
